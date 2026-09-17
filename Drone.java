public abstract class Drone implements Mission {
    protected String droneId;
    protected double batteryLevel;
    protected boolean isAvailable;

    public Drone(String droneId, double batteryLevel) {
        this.droneId = droneId;
        this.batteryLevel = batteryLevel;
        this.isAvailable = true;
    }

    public String getDroneId() { return droneId; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    // Abstract method to be implemented by subclasses
    public abstract void displaySpecs();
}