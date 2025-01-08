public class Checker {
    public boolean isDayOfWeek(String input) {
        return input.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public boolean allVowels(String input) {
        return input.matches("[aeiuo]*");
    }

    public boolean timeOfDay(String input) {
        // return
        // input.matches("0{1}\\d[0-9]|[12-23]:0{1}\\d[0-9]|[10-59]:0{1}\\d[0-9]|[10-59]");
        // return input.matches("0{1}\\d|[12-23]{1}");
        String hours = "(0{1}\\d|1{1}\\d|2{1}[0-3])";
        String minutes = "(0{1}\\d|[1234]\\d|5\\d)";
        String seconds = "(0{1}\\d|[1234]\\d|5\\d)";
        // System.out.println(hours + ":" + minutes + ":" + seconds);
        return input.matches(hours + ":" + minutes + ":" + seconds);
    }
}
