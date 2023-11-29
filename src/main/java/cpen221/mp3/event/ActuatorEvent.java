package cpen221.mp3.event;

public class ActuatorEvent implements Event {
    // TODO: Implement this class
    // you can add private fields and methods to this class

    private double TimeStamp;
    private int ClientId;
    private int EntityId;
    private String EntityType;  //potential make final
    private boolean Value;

    public ActuatorEvent(double TimeStamp, 
                        int ClientId,
                        int EntityId, 
                        String EntityType, 
                        boolean Value) {
        // Implement this constructor
        this.TimeStamp = TimeStamp;
        this.ClientId = ClientId;
        this.EntityId = EntityId;
        this.EntityType = new String(EntityType);
        this.Value = Value;
    }

    public double getTimeStamp() {
        // Implement this method
        return TimeStamp;
    }

    public int getClientId() {
        // Implement this method
        return ClientId;
    }

    public int getEntityId() {
        // Implement this method
        return EntityId;
    }

    public String getEntityType() {
        // Implement this method
        return new String(EntityType);
    }

    public boolean getValueBoolean() {
        // Implement this method
        return Value;
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
