public class Clock {
    private int hours, minutes, seconds;


    //główny
    public Clock(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("BŁĄD");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //12:0:0
    public Clock(){
        this(12, 0, 0);
    }

    //sekundy na normalne
    public Clock(int secondsOnly){
        if (secondsOnly < 0 || secondsOnly >= 86400) {
            throw new IllegalArgumentException("BŁĄD");
        }
        this.hours = secondsOnly / 3600;
        this.minutes = (secondsOnly - this.hours * 3600)/60;
        this.seconds = (secondsOnly - this.hours * 3600 - this.minutes * 60);
    }

    //getty i setty
    public void setHours(int hours){
        if (hours < 0 || hours > 23){
            throw new IllegalArgumentException("BŁĄD");
        }
        this.hours = hours;
    }
    public void setMinutes(int minutes){
        if (minutes < 0 || minutes > 23){
            throw new IllegalArgumentException("BŁĄD");
        }
        this.minutes = minutes;
    }
    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 23){
            throw new IllegalArgumentException("BŁĄD");
        }
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }

    //ticki
    void tick() {
        if (this.seconds == 59) {
            this.seconds = 0;
            if (this.minutes == 59) {
                this.minutes = 0;
                if (this.hours == 23) {
                    this.hours = 0;
                } else {
                    this.hours++;
                }
            } else {
                this.minutes++;
            }
        } else {
            this.seconds++;
        }
    }

    void tickDown(){
        if (this.seconds == 0) {
            this.seconds = 59;
            if (this.minutes == 0) {
                this.minutes = 59;
                if (this.hours == 0) {
                    this.hours = 23;
                } else {
                    this.hours --;
                }
            } else {
                this.minutes --;
            }
        } else {
            this.seconds --;
        }
    }

    @Override
    public String toString() {
        return String.format("[%02d:%02d:%02d]", this.hours, this.minutes, this.seconds);
    }
}
