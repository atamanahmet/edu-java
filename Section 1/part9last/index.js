const usb = require("usb");
const HID = require("node-hid");

// Function to find the USB device
function findDevice() {
  const devices = usb.getDeviceList();
  const wirelessDongle = devices.find((device) => {
    const deviceDescriptor = device.deviceDescriptor;
    // Customize the vendorId and productId based on your dongle
    const vendorId = 0x1234; // Replace with your dongle's vendorId
    const productId = 0x5678; // Replace with your dongle's productId
    return (
      deviceDescriptor.idVendor === vendorId &&
      deviceDescriptor.idProduct === productId
    );
  });

  if (!wirelessDongle) {
    console.error("Wireless dongle not found.");
    return null;
  }
  return wirelessDongle;
}

// Function to get battery status (HID example)
function getBatteryInfo(hidPath) {
  try {
    const device = new HID.HID(hidPath);
    // Specific report ID or data structure might vary
    const reportId = 0x01; // Example report ID
    device.write([reportId]);

    device.on("data", (data) => {
      console.log("Battery Info Received:", data);
      // Parse battery level (specific parsing depends on device protocol)
      const batteryLevel = data[0]; // Example: battery level is in the first byte
      console.log(`Battery Level: ${batteryLevel}%`);
      device.close();
    });

    device.on("error", (err) => {
      console.error("Error reading data:", err);
    });
  } catch (err) {
    console.error("Failed to open HID device:", err);
  }
}

// Main execution
const dongle = findDevice();

if (dongle) {
  dongle.open();
  const interface = dongle.interfaces.find(
    (iface) => iface.descriptor.bInterfaceClass === 3
  ); // HID class
  if (interface) {
    const hidDevices = HID.devices();
    const targetHIDDevice = hidDevices.find(
      (d) =>
        d.vendorId === dongle.deviceDescriptor.idVendor &&
        d.productId === dongle.deviceDescriptor.idProduct
    );

    if (targetHIDDevice) {
      console.log("Target HID Device Found:", targetHIDDevice);
      getBatteryInfo(targetHIDDevice.path);
    } else {
      console.error("HID device not found for the dongle.");
    }
  } else {
    console.error("No HID interface found for the dongle.");
  }
  dongle.close();
} else {
  console.error("Exiting. Wireless dongle not connected.");
}
