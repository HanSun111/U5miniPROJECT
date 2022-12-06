public class ClockRunner {
    public static void main(String[] args) {
        Time time1 = new Time(23, 59, 59);
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        Time time2 = new Time(1, 1, 1 );
        time1.addToTime(time2);
        System.out.println(time1);
    }
}
