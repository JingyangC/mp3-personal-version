package cpen221.mp3.entity;

public interface Entity {
    // returns the id of the entity
    int getId();

    // returns the type of the entity
    String getType();

    // returns true if the entity is an actuator
    boolean isActuator();
}