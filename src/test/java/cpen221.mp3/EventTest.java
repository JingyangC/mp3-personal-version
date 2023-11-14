package cpen221.mp3;

import cpen221.mp3.event.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest{
    @Test
    public void testCreateSingleEvent() {
        Event event = new SensorEvent(1, "TempSensor", 24.0);
        assertEquals(1, event.getEntityId());
        assertEquals("TempSensor", event.getEntityType());
        assertEquals(1.0, event.getValueDouble());
    }

}
