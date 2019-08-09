public class Timer {
    public static int counter = 0;
    private int id;
    private int hour;
    private int minute;
    private int second;

///////////////////////////////////////////// Constructors

    public Timer() {
        this(0, 0, 0);
    }

    public Timer(int h) {
        this(h, 0, 0);
    }

    public Timer(int h, int m) {
        this(h, m, 0);
    }

    public Timer(int h, int m, int s) {
        this.id = ++counter;
        setTime(h, m, s);
    }

    ///////////////////////////////////////////// Setters

    public void setHour(int h) {
        hour = (h >= 0 && h < 24) ? h : 0;
    }

    public void setMinute(int m) {
        minute = (m >= 0 && m < 60) ? m : 0;
    }

    public void setSecond(int s) {
        second = (s >= 0 && s < 60) ? s : 0;
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    ///////////////////////////////////////////// Getters

    public String getHour() {
        return String.format("Hours at timer %d: %02d", id, hour);
    }

    public String getMinute() {
        return String.format("Minutes at timer %d: %02d", id, minute);
    }

    public String getSecond() {
        return String.format("Seconds at timer %d: %02d", id, second);
    }

    private int getHourInteger() {
        return hour;
    }

    private int getMinuteInteger() {
        return minute;
    }

    private int getSecondInteger() {
        return second;
    }

    public String getTime() {
        return String.format("Time at timer %d: %02d:%02d:%02d", id, getHourInteger(), getMinuteInteger(), getSecondInteger());
    }
}