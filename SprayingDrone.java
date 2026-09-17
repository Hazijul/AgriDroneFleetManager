public class SprayingDrone extends Drone {
    private double chemicalTankCapacity; // in liters

    public SprayingDrone(String droneId, double batteryLevel, double chemicalTankCapacity) {
        super(droneId, batteryLevel);
        this.chemicalTankCapacity = chemicalTankCapacity;
    }

    @Override
    public void displaySpecs() {
        System.out.println("[Sprayer] ID: " + droneId + " | Battery: " + batteryLevel + "% | Tank: " + chemicalTankCapacity + "L | Available: " + isAvailable);
    }

    @Override
    public void executeMission(String targetCoordinates) {
        System.out.println("Spraying Drone " + droneId + " navigating to " + targetCoordinates + " for chemical dispersal.");
        this.batteryLevel -= 15.5; // Simulate battery drain
        TelemetryLogger.logMission("Spraying complete at " + targetCoordinates + " by " + droneId);
    }

    @Override
    public void returnToBase() {
        System.out.println("Spraying Drone " + droneId + " returning to base to refill tank.");
    }
}