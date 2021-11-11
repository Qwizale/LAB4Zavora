package sample;

public class Plane {
    private final String arrivalTime;
    private final String departureTime;
    private final int flightNumber;
    private final PlaneStatus status;

    public Plane(String arrivalTime, String departureTime, int flightNumber, PlaneStatus status) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.flightNumber = flightNumber;
        this.status = status;
    }

    public String getPlaneArrivalTime() {
        return this.arrivalTime;
    }

    public String getPlaneDepartureTime() {
        return this.departureTime;
    }

    public int getPlaneFlightNumber() {
        return this.flightNumber;
    }

    public PlaneStatus getPlaneStatus() {
        return this.status;
    }

    public Plane sendRequest() {
        return this;
    }
}