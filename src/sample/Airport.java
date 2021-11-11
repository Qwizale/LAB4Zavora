package sample;

public class Airport {
    private final boolean[] runways = new boolean[]{true, false, false, false, false};

    public Airport() {
    }

    public int getFreeRunwayIndex() {
        int i;
        for(i = 0; i < this.runways.length; ++i) {
            if (!this.runways[i]) {
                return i;
            }
        }

        for(i = 0; i < this.runways.length; ++i) {
            this.runways[i] = false;
        }

        return -1;
    }

    public void takeRunway(int freeRunwayIndex) {
        this.runways[freeRunwayIndex] = true;
    }
}