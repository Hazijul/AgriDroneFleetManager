import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FleetManager fleetManager = new FleetManager();
        MissionPlanner planner = new MissionPlanner();
        boolean running = true;

        System.out.println("Welcome to the Agri-Drone Fleet Manager");

        while (running) {
            System.out.println("\n1. Add Spraying Drone");
            System.out.println("2. Add Survey Drone");
            System.out.println("3. View Fleet");
            System.out.println("4. Dispatch Mission");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Drone ID: ");
                        String spId = scanner.nextLine();
                        System.out.print("Enter Tank Capacity (L): ");
                        double capacity = scanner.nextDouble();
                        fleetManager.addDrone(new SprayingDrone(spId, 100.0, capacity));
                        break;
                    case 2:
                        System.out.print("Enter Drone ID: ");
                        String svId = scanner.nextLine();
                        System.out.print("Enter Camera Resolution (e.g., 4K, 1080p): ");
                        String res = scanner.nextLine();
                        fleetManager.addDrone(new SurveyDrone(svId, 100.0, res));
                        break;
                    case 3:
                        fleetManager.viewFleet();
                        break;
                    case 4:
                        System.out.print("Enter Mission Type (spray/survey): ");
                        String type = scanner.nextLine().toLowerCase();
                        System.out.print("Enter Target Coordinates (e.g., Lat: 45.0, Lon: -90.0): ");
                        String coords = scanner.nextLine();
                        planner.dispatchMission(fleetManager, type, coords);
                        break;
                    case 5:
                        running = false;
                        System.out.println("Shutting down Fleet Manager...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input detected. Please enter numerical values where expected.");
                scanner.nextLine(); // Clear the bad input
            }
        }
        scanner.close();
    }
}