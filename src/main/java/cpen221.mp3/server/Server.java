package cpen221.mp3.server;

import cpen221.mp3.entity.Actuator;
import cpen221.mp3.client.Client;
import cpen221.mp3.event.Event;
import cpen221.mp3.filter.Filter;
import cpen221.mp3.request.Request;

import java.util.List;

enum NotificationChannel {
    SOCKET,
    EMAIL
}

public class Server {
    private Client client;
    private double maxWaitTime = 2; // in seconds

    // you may need to add additional private fields

    public Server(Client client) {
        // implement the Server constructor
    }

    /**
     * Set the actuator state if the given filter is satisfied by the latest event.
     * Here the latest event is the event with the latest timestamp not the event 
     * that was received by the server the latest.
     *
     * @param filter the filter to check
     * @param actuator the actuator to set the state of as true
     */
    public void setActuatorStateIf(Filter filter, Actuator actuator) {
        // implement this method
    }
    
    /**
     * Toggle the actuator state if the given filter is satisfied by the latest event.
     * Here the latest event is the event with the latest timestamp not the event 
     * that was received by the server the latest.
     *
     * @param filter the filter to check
     * @param actuator the actuator to toggle the state of (true -> false, false -> true)
     */
    public void toggleActuatorStateIf(Filter filter, Actuator actuator) {
        // implement this method
    }

    /**
     * Notifies the client if the given filter is satisfied by the latest event
     * of the client's. Here the latest event is the event with the latest timestamp 
     * not the event that was received by the server the latest.
     *
     * @param filter the filter to check
     * @param notificationChannel the channel to use for notification
     * @return true if the client was notified, false otherwise
     */
    public boolean notifyIf(Filter filter, NotificationChannel notificationChannel) {
        // implement this method
        return false;
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
     * Returns a set of IDs for all the entities of the client for which 
     * we have received events so far.
     * Returns an empty list if no events have been received for the client.
     * 
     * @return list of all the entities of the client for which we have received events so far
     */
    public List<Integer> getAllEntities() {
        // implement this method
        return null;
    }

    /**
     * List the latest n events of the client.
     * Here the order is based on the original timestamp of the events, not the time at which the events were received by the server.
     * If the client has fewer than n events, then this method should return all the events of the client.
     * If no events exist for the client, then this method should return an empty list.
     * If there are multiple events with the same timestamp in the boundary,
     * the ones with largest EntityId should be included in the list.
     *
     * @param n the max number of events to list
     * @return list of the latest n events of the client
     */
    public List<Event> lastNEvents(int n) {
        // implement this method
        return null;
    }

    /**
     * returns the ID corresponding to the most active entity of the client
     * in terms of the number of events it has generated.
     *
     * If there was a tie, then this method should return the largest ID.
     * 
     * @return the most active entity ID of the client
     */
    public int mostActiveEntity() {
        // implement this method
        return -1;
    }

    /**
     * Update the max wait time for the client.
     * The max wait time is the maximum amount of time 
     * that the server can wait for before starting to process each event of the client:
     * It is the difference between the time the message was received on the server 
     * (not the event timeStamp from above) and the time it started to be processed.
     * 
     * @param maxWaitTime the new max wait time
     */
    public void updateMaxWaitTime(double maxWaitTime) {
        // implement this method

        // Important note: updating maxWaitTime may not be as simple
        // as just updating the field. You may need to do some additional
        // work to ensure that events currently being processed are not
        // dropped or ignored by the change in maxWaitTime.
    }

    void processIncomingEvent(Event event) {
        // implement this method
    }

    void processIncomingRequest(Request request) {
        // implement this method
    }
}
