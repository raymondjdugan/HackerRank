package InterviewPrep;

public class TimeConversion {
    private static String timeConversion(String s) {
        String timeOfDay = s.substring(s.length() - 2);
        int hour = Integer.parseInt(s.substring(0,2));
        String minSec = s.substring(3, s.length() - 2);
        if (timeOfDay.equals("AM") && hour == 12) {
            return String.format("%s:%s", "00", minSec);
        } else if (timeOfDay.equals("AM") || (timeOfDay.equals("PM") && hour == 12)) {
            return s.substring(0, s.length() - 2);
        } else {
            return String.format("%d:%s", hour + 12, minSec);
        }
    }

    public static void main(String[] args) {
        String time = "12:45:54PM";
        System.out.println(timeConversion(time));
    }
}
