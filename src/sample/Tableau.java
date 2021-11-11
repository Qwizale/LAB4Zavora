package sample;

public class Tableau {
    public Tableau() {
    }

    public static void printToTableau(Plane plane, String answer) {
        System.out.println("_________________________________");
        System.out.println(plane.getPlaneDepartureTime());
        System.out.println(plane.getPlaneArrivalTime());
        System.out.println(plane.getPlaneStatus());
        System.out.println(answer);
    }
}