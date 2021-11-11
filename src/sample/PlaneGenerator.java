package sample;

public class PlaneGenerator {
    public PlaneGenerator() {
    }

    public Plane generateOnePlane() {
        int depHours = (int)(Math.random() * 24.0D);
        int depMinutes = (int)(Math.random() * 60.0D);
        String departureTime = depHours + ":" + depMinutes;
        if (depMinutes < 10) {
            departureTime = depHours + ":0" + depMinutes;
        }

        int hoursInFlight = (int)(Math.random() * 19.0D);
        int minutesInFlight = (int)(Math.random() * 60.0D);
        int arrHours = depHours + hoursInFlight;
        int arrMinutes = depMinutes + minutesInFlight;
        if (arrHours > 23) {
            arrHours -= 24;
        }

        if (arrMinutes > 59) {
            arrMinutes -= 60;
        }

        String arrivalTime = arrHours + ":" + arrMinutes;
        if (arrMinutes < 10) {
            arrivalTime = arrHours + ":0" + arrMinutes;
        }

        int flightNumber = (int)(Math.random() * 1000.0D);
        int temp = (int)(Math.random() * 2.0D);
        PlaneStatus status;
        if (temp == 1) {
            status = PlaneStatus.ON_LAND;
        } else {
            status = PlaneStatus.ON_FLIGHT;
        }

        return new Plane(arrivalTime, departureTime, flightNumber, status);
    }
}