public class SurveyDrone extends Drone {
    private String cameraResolution;

    public SurveyDrone(String droneId, double batteryLevel, String cameraResolution) {
        super(droneId, batteryLevel);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public void displaySpecs() {
        System.out.println("[Survey]  ID: " + droneId + " | Battery: " + batteryLevel + "% | Camera: " + cameraResolution + " | Available: " + isAvailable);
    }

    @Override
    public void executeMission(String targetCoordinates) {
        System.out.println("Survey Drone " + droneId + " navigating to " + targetCoordinates + " for crop mapping.");
        this.batteryLevel -= 8.0; 
        TelemetryLogger.logMission("Mapping complete at " + targetCoordinates + " by " + droneId);
    }

    @Override
    public void returnToBase() {
        System.out.println("Survey Drone " + droneId + " returning to base to offload image data.");
    }
}