import java.util.ArrayList;
import java.util.List;

public class FleetManager {
    private List<Drone> fleet = new ArrayList<>();

    public void addDrone(Drone drone) {
        fleet.add(drone);
        System.out.println("Successfully added " + drone.getDroneId() + " to the fleet.");
    }

    public void viewFleet() {
        if (fleet.isEmpty()) {
            System.out.println("The fleet is currently empty.");
            return;
        }
        System.out.println("\n--- Active Fleet ---");
        for (Drone d : fleet) {
            d.displaySpecs();
        }
        System.out.println("--------------------\n");
    }

    public Drone getAvailableDrone(String type) {
        for (Drone d : fleet) {
            if (d.isAvailable()) {
                if (type.equals("spray") && d instanceof SprayingDrone) return d;
                if (type.equals("survey") && d instanceof SurveyDrone) return d;
            }
        }
        return null; // No available drone of that type
    }
}