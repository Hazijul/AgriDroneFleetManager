public class MissionPlanner {
    public void dispatchMission(FleetManager fleet, String type, String coordinates) {
        Drone assignedDrone = fleet.getAvailableDrone(type);
        
        if (assignedDrone == null) {
            System.out.println("Error: No available drones of type '" + type + "' ready for deployment.");
            return;
        }

        assignedDrone.setAvailable(false);
        assignedDrone.executeMission(coordinates);
        assignedDrone.returnToBase();
        assignedDrone.setAvailable(true); // Ready for next mission
    }
}