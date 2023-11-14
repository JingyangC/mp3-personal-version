package cpen221.mp3.event;

public class SensorEvent implements Event {
    // TODO: Implement this class
    // you can add private fields and methods to this class

    public SensorEvent(double TimeStamp,
                        int ClientId,
                        int EntityId, 
                        String EntityType, 
                        double Value) {
        // Implement this constructor
    }

    public double getTimeStamp() {
        // Implement this method
        return 0;
    }

    public int getClientId() {
        // Implement this method
        return 0;
    }

    public int getEntityId() {
        // Implement this method
        return 0;
    }

    public String getEntityType() {
        // Implement this method
        return null;
    }

    public double getValueDouble() {
        // Implement this method
        return 0;
    }

    // Sensor events do not have a boolean value
    // no need to implement this method
    public boolean getValueBoolean() {
        return false;
    }
}
