package cpen221.mp3.server;

enum NotificationChannel {
    SOCKET,
    EMAIL
}

public class Server {
    private Client client;
    private double maxWaitTime = 2; // in seconds

    // you may need to add additional private fields

    public Server(Client client) {
        // implementation of Server constructor
    }

    public void setActuatorStateIf(Filter filter, Actuator actuator) {
        // implementation of actuateIf method
    }
    
    public void toggleActuatorStateIf(Filter filter, Actuator actuator) {
        // implementation of actuateIf method
    }

    /**
     * Notifies the client if the given filter is satisfied by the latest event
     * of the client's.
     *
     * @param filter the filter to check
     * @param notificationChannel the channel to use for notification
     * @return true if the client was notified, false otherwise
     */
    public boolean notifyIf(Filter filter, NotificationChannel notificationChannel) {
        // implementation of notifyIf method
    }

    /**
     * List all the events of the client that occurred in the given time window.
     * Here the timestamp of an event is the time at which the event occurred, not 
     * the time at which the event was received by the server.
     * If no events occurred in the given time window, then this method should return an empty list.
     *
     * @param timeWindow the time window of events, inclusive of the start and end times
     * @return list of the events for the client in the given time window
     */
    public List<Event> eventsInTimeWindow(TimeWindow timeWindow) {
        // implement this method

        return null;
    }

    /**
     * List the latest n events of the client.
     * Here the order is based on the original timestamp of the events, not the time at which the events were received by the server.
     * If the client has fewer than n events, then this method should return all the events of the client.
     * If no events exist for the client, then this method should return an empty list.
     *
     * @param n the max number of events to list
     * @return list of the latest n events of the client
     */
    public List<Event> lantNEvents(int n) {
        // implement this method

        return null;
    }

    public void updateMaxWaitTime(double maxWaitTime) {
        // here, the maxWaitTime field which controls the quality of service for the client
        // should be updated to the given value
        // note that it may not be as simple as just updating the field 
        // further handling of your implementation may be needed
    }
}
