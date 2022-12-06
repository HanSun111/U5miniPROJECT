public class ClockRunner {
    public static void main(String[] args) {
        Time time1 = new Time(23, 59, 59);
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
    }
}
