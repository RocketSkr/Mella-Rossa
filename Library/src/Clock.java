public class Clock <H,M>{
    private H Hour;
    private M Minute;

    public H getHour() {
        return Hour;
    }

    public M getMinute() {
        return Minute;
    }

    public Clock (H hour, M minute){
        this.Hour = hour;
        this.Minute = minute;
    }
}


