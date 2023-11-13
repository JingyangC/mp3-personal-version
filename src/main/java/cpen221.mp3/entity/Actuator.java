package cpen221.mp3.entity;

public class Sensor implements Actuator {
    private int id;
    private String type;
    private boolean state;

    public Actuator(int id, String type, boolean init_state) {
        this.id = id;
        this.type = type;
        this.state = init_state;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean new_state) {
        this.state = new_state;
    }
}