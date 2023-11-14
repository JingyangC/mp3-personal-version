package cpen221.mp3.event;

public interface Event {
    
    double getTimeStamp();

    int getClientId();

    int getEntityId();

    String getEntityType();

    double getValueDouble();

    boolean getValueBoolean();
}
