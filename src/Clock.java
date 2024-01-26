import java.util.Random;

class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock() {
        Random random = new Random();

        hour = 1 + random.nextInt(24);
        minute = random.nextInt(60);
        second = random.nextInt(60);
    }

    public void addSeconds(int secondsToAdd) {
        if (secondsToAdd < 0) {
            System.out.println("Clock cannot be turned back!");
            return;
        }

        addMinutes((second + secondsToAdd) / 60);
        second = (second + secondsToAdd) % 60;
    }

    private void addMinutes(int minutesToAdd) {
        addHours((minute + minutesToAdd) / 60);
        minute = (minute + minutesToAdd) % 60;
    }

    private void addHours(int hoursToAdd) {
        hour = (hour + hoursToAdd) % 24;
    }

    public String toString() {
        return "Clock: " + hour + ":" + minute + ":" + second;
    }
}