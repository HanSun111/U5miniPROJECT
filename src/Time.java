public class Time {
    private int h;
    private int m;
    private int s;

    public Time(int hours, int mins, int secs){
        h = hours;
        m = mins;
        s = secs;
    }

    public void addToTime(Time add){
        this.s += add.s;
        this.m += add.m;
        this.h += add.h;
    }
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
    public String hourLogic() {
        if(h < 10){
            return "0" + h;
        } return "" + h;
    }

    public String minuteLogic() {
        if(m < 10){
            return "0" + m;
        } return "" + m;

    }

    public String secondLogic() {
        if(s < 10){
            return "0" + s;
        } return "" + s;
    }

    public String toString(){
        return hourLogic() + ":" + minuteLogic() + ":" + secondLogic();
    }
}
