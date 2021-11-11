package sample;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Plane[] planes = new Plane[100];
        PlaneGenerator planeGenerator = new PlaneGenerator();
        Airport airport = new Airport();
        Dispatcher dispatcher = new Dispatcher(airport);
        Scanner in = new Scanner(System.in);
        int menu = 188;
        int i = -1;

        while(menu != 1488) {
            System.out.println("============================");
            System.out.println("choice option:");
            System.out.println("1. Generate plane");
            System.out.println("2. Show info");
            System.out.println("3. request");
            System.out.println("============================");
            menu = in.nextInt();
            switch(menu) {
                case 0:
                    return;
                case 1:
                    ++i;
                    planes[i] = planeGenerator.generateOnePlane();
                    break;
                case 2:
                    System.out.println(planes[i].getPlaneStatus());
                    System.out.println(planes[i].getPlaneFlightNumber());
                    System.out.println(planes[i].getPlaneDepartureTime());
                    System.out.println(planes[i].getPlaneArrivalTime());
                    break;
                case 3:
                    dispatcher.processPlane(planes[i].sendRequest());
                    break;
                default:
                    System.out.println("Incorrect");
            }
        }

    }
}