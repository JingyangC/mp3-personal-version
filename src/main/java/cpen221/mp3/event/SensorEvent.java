package cpen221.mp3.event;

public class SensorEvent implements Event {
    // TODO: Implement this class
    // you can add private fields and methods to this class

    private double TimeStamp;
    private int ClientId;
    private int EntityId;
    private String EntityType;  //potential make final
    private double Value;

    public SensorEvent(double TimeStamp,
                        int ClientId,
                        int EntityId, 
                        String EntityType, 
                        double Value) {
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

    public double getValueDouble() {
        // Implement this method
        return Value;
    }

    // Sensor events do not have a boolean value
    // no need to implement this method
    public boolean getValueBoolean() {
        return false;
    }

    @Override
    public String toString() {
        return "SensorEvent{" +
               "TimeStamp=" + getTimeStamp() +
               ",ClientId=" + getClientId() + 
               ",EntityId=" + getEntityId() +
               ",EntityType=" + getEntityType() + 
               ",Value=" + getValueDouble() + 
               '}';
    }
}
