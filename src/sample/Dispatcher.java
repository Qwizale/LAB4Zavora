package sample;

public class Dispatcher {
    private final Airport airport;

    public Dispatcher(Airport airport) {
        this.airport = airport;
    }

    public void processPlane(Plane plane) {
        String answer = "all runways are busy";
        int freeRunway = this.airport.getFreeRunwayIndex();
        if (freeRunway == -1) {
            Tableau.printToTableau(plane, answer);
        } else {
            this.airport.takeRunway(freeRunway);
            int flightNumber;
            if (plane.getPlaneStatus() == PlaneStatus.ON_FLIGHT) {
                flightNumber = plane.getPlaneFlightNumber();
                answer = "Flight number: " + flightNumber + " Landing runway " + freeRunway;
            }

            if (plane.getPlaneStatus() == PlaneStatus.ON_LAND) {
                flightNumber = plane.getPlaneFlightNumber();
                answer = "Flight number: " + flightNumber + " Take off runway " + freeRunway;
            }


            Tableau.printToTableau(plane, answer);
        }
    }
}