package cpen221.mp3.filter;

enum Operator {
    EQUALS,
    GREATER_THAN,
    LESS_THAN,
    GREATER_THAN_OR_EQUALS,
    LESS_THAN_OR_EQUALS
}

public class Filter {

    /**
     * Constructs a filter that matches boolean events with the given boolean value.
     * For non-boolean events, the satisfies method should return false.
     *
     * @param value the boolean value to match
     */
    public Filter(boolean value) {
        // constructor
    }

    /**
     * Constructs a filter that matches double events with the given double value.
     * It uses the given operator to compare the double value of the event with the given value.
     * An Operator can be one of the following:
     * 
     * Operator.EQUALS
     * Operator.GREATER_THAN
     * Operator.LESS_THAN
     * Operator.GREATER_THAN_OR_EQUALS
     * Operator.LESS_THAN_OR_EQUALS
     * 
     * For non-double (boolean) value events, the satisfies method should return false.
     *
     * @param value the double value to match
     * @param operator the operator to use to compare the event value with the given value
     */
    public Filter(double value, Operator operator) {
        // constructor
    }

    /**
     * Constructs a filter that comapres event TimeStamp with the given TimeStamp.
     *
     * @param TimeStamp the TimeStamp to compare with
     * @param operator the operator to use for comparison
     */
    public Filter(double TimeStamp, Operator operator) {
        // constructor
    }
    
    /**
     * Constructs a complex filter composed of other filters.
     *
     * @param filters the list of filters to use in the composition
     */
    public Filter(List<Filter> filters) {
        // a filter can be composed of other filters
        // in this case, the filter should satisfy all the filters in the list
    }

    /**
     * Returns true if the given event satisfies the filter criteria.
     *
     * @param event the event to check
     * @return true if the event satisfies the filter criteria, false otherwise
     */
    public boolean satisfies(Event event) {
        // implement this method
        return false;
    }

    /**
     * Returns true if the given list of events satisfies the filter criteria.
     *
     * @param events the list of events to check
     * @return true if every event in the list satisfies the filter criteria, false otherwise
     */
    public boolean satisfies(List<Event> events) {
        // implement this method
        return false;
    }

    /**
     * Returns a new event if it satisfies the filter criteria.
     * If the given event does not satisfy the filter criteria, then this method should return null.
     *
     * @param event the event to sift
     * @return a new event if it satisfies the filter criteria, null otherwise
     */
    public Event sift(Event event) {
        // implement this method
        return null;
    }

    /**
     * Returns a list of events that contains only the events in the given list that satisfy the filter criteria.
     * If no events in the given list satisfy the filter criteria, then this method should return an empty list.
     *
     * @param events the list of events to sift
     * @return a list of events that contains only the events in the given list that satisfy the filter criteria
     *        or an empty list if no events in the given list satisfy the filter criteria
     */
    public List<Event> sift(List<Event> events) {
        // implement this method
        return null;
    }
}
