const HID = require("node-hid");

async function connectToDevice() {
  const VENDOR_ID = 0x6a3; // 0x6a3
  const PRODUCT_ID = 0x5041; // 0x5041

  try {
    // Find all instances of this device
    const devices = HID.devices().filter(
      (d) => d.vendorId === VENDOR_ID && d.productId === PRODUCT_ID
    );

    console.log(`Found ${devices.length} matching devices`);

    for (const device of devices) {
      console.log("\nTrying device:", {
        path: device.path,
        interface: device.interface,
        usage: device.usage,
        usagePage: device.usagePage,
      });

      try {
        const hidDevice = new HID.HID(device.path);
        console.log("Connected successfully!");

        // Set up data handler
        hidDevice.on("data", (data) => {
          console.log("Received data:", {
            hex: Buffer.from(data).toString("hex"),
            array: Array.from(data),
          });
        });

        // Handle errors without crashing
        hidDevice.on("error", (error) => {
          console.log("Error event:", error.message);
        });

        // Try different common battery report commands
        const commands = [
          [0x02, 0x01], // Common battery status request
          [0x06, 0x01], // Alternative battery status request
          [0x08, 0x00], // Another common format
          [0x11, 0x00], // Yet another format
        ];

        for (const command of commands) {
          try {
            console.log(`Trying command: [${command.join(", ")}]`);
            hidDevice.write(command);
            await new Promise((resolve) => setTimeout(resolve, 500));
          } catch (writeError) {
            console.log(`Command failed:`, writeError.message);
          }
        }

        // Keep connection open briefly to receive any responses
        await new Promise((resolve) => setTimeout(resolve, 2000));

        // Cleanup
        try {
          hidDevice.close();
          console.log("Device closed successfully");
        } catch (closeError) {
          console.log("Error closing device:", closeError.message);
        }
      } catch (deviceError) {
        console.log("Device connection/usage failed:", deviceError.message);
      }
    }
  } catch (error) {
    console.log("Main error:", error.message);
  }
}

// Run the connection attempt
connectToDevice().catch(console.error);
