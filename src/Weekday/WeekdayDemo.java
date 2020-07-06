package Weekday;

public class WeekdayDemo {

    public static void main(String[] args) {

        System.out.println(Weekday.Friday.isWeekday());
        System.out.println(Weekday.Saturday.isHoliday());
        Weekday.Tuesday.whichIsGreater(Weekday.Sunday);

    }
}
