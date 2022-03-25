package am.training.beans;

public class Horse {
    private String bread;
    private int raceNumber;
    private String rider;

    public Horse(String bread, int raceNumber, String rider) {
        this.bread = bread;
        this.raceNumber = raceNumber;
        this.rider = rider;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(int raceNumber) {
        this.raceNumber = raceNumber;
    }

    public String getRider() {
        return rider;
    }

    public void setRider(String rider) {
        this.rider = rider;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "bread='" + bread + '\'' +
                ", raceNumber=" + raceNumber +
                ", rider='" + rider + '\'' +
                '}';
    }
}
