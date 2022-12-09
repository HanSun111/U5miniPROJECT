/**
 * Time class represents a digital clock, the clock has hours, minutes and seconds which is defined as integer variables
 */
public class Time {
    private int h;
    private int m;
    private int s;

    /**
     * constructor for the Time class
     * @param hours the hour of the time
     * @param mins the min of the time
     * @param secs the second of the time
     */
    public Time(int hours, int mins, int secs){
        h = hours;
        m = mins;
        s = secs;
    }

    /**
     * void method of the Time class which uses a time instance to add to the current instance.
     * @param add uses an instance to increase the time of the current instance class
     */
    public void addToTime(Time add){
        this.s += add.s;
        this.m += add.m;
        this.h += add.h;
    }

    /**
     * void method tick sets up the logic of the Time class which also adds one second every time it is used
     * will add to min if the second is equal to 60, the bigger than is just in case someone wants to input more than 59 seconds
     * same idea with the min logic, add 1 to h if min is equal to 60
     * hour resets if it hits 24.
     */
    public void tick(){
        s ++;
        if(s >= 60){
            m++;
            s -= 60;
        }
        if(m >= 60){
            h ++;
            m -= 60;
        }
        if(h >= 24){
            h -= 24;
        }

    }

    /**
     * String method for time class that does the indentation for hour if the hour is just a single digit.
     * @return the current hour as a string rather than a int to add the zero in front of the hour
     */
    public String hourLogic() {
        if(h < 10){
            return "0" + h;
        } return "" + h;
    }

    /**
     * String method for the time class that indents the minute if it is less than 10, same idea as hourLogic
     * @return the current minute as a string rather than a int to add the zero in front of the hour
     */
    public String minuteLogic() {
        if(m < 10){
            return "0" + m;
        } return "" + m;

    }

    /**
     * String method for the time class that indents the second if it is less than 10, same idea as hourLogic
     * @return the current minute as a string rather than a int to add the zero in front of the hour
     */
    public String secondLogic() {
        if(s < 10){
            return "0" + s;
        } return "" + s;
    }

    /**
     * toString method of the Time class which combines the hour and the minute and the second to do correctly assembles and indent them
     * @return a string that indicates the time that uses the logic above to correctly indent the timer.
     */
    public String toString(){
        return hourLogic() + ":" + minuteLogic() + ":" + secondLogic();
    }
}
