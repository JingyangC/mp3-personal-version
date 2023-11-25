package cpen221.mp3.event;

public class ActuatorEvent implements Event {
    // TODO: Implement this class
    // you can add private fields and methods to this class

    public ActuatorEvent(double TimeStamp, 
                        int ClientId,
                        int EntityId, 
                        String EntityType, 
                        boolean Value) {
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

    public boolean getValueBoolean() {
        // Implement this method
        return false;
    }

    // Actuator events do not have a double value
    // no need to implement this method
    public double getValueDouble() {
        return -1;
    }

    @Override
    public String toString() {
        return "ActuatorEvent{" +
                "TimeStamp=" + getTimeStamp() +
                ",ClientId=" + getClientId() +
                ",EntityId=" + getEntityId() +
                ",EntityType=" + getEntityType() +
                ",Value=" + getValueBoolean() +
                '}';
    }
}
