package lmsHomeWorkEnam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вид транспорта для поездки: ♥1♥ - (Bus 0,5$) ♥2♥ - (Car 0,1) ♥3♥ - (Track 0,2) - за километр : ");
        int num = scanner.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("Сколька километр :");
                double poezdka = scanner.nextDouble();
                System.out.print("\"C вас : \"" + TransportType.BUS.calculateTravelCost(poezdka) + "$ " + "за :" + poezdka + "км");
            }
            case 2 -> {
                System.out.println("Сколька километр :");
                double poezdka = scanner.nextDouble();
                System.out.println("\"C вас : \"" + TransportType.CAR.calculateTravelCost(poezdka) + "$ " + "за :" + poezdka + "км");
            }
            case 3 -> {
                System.out.println("Сколька километр :");
                double poezdka = scanner.nextDouble();
                System.out.println("\"C вас : \"" + TransportType.TRUCK.calculateTravelCost(poezdka) + "$ " + "за :" + poezdka + "км");
            }
            default -> {
                System.out.println("Not transopt");
            }
        }

    }
}
