package cpen221.mp3.client;

enum RequestType {
    CONFIG,
    CONTROL,
    ANALYSIS
}

enum RequestCommand {
    CONFIG_UPDATE_MAX_WAIT_TIME,
    CONTROL_SET_ACTUATOR_STATE,
    CONTROL_TOGGLE_ACTUATOR_STATE,
    CONTROL_NOTIFY,
    ANALYSIS_GET_EVENTS_IN_WINDOW,
    ANALYSIS_GET_ALL_ENTITIES,
    ANALYSIS_GET_LATEST_EVENTS,
    ANALYSIS_GET_MOST_ACTIVE_ENTITY,
}

public class Request {
    private final double timeStamp;
    private final RequestType requestType;
    private final RequestCommand requestCommand;
    private final String requestData;

    public Request(RequestType requestType, RequestCommand requestCommand, String requestData) {
        this.timeStamp = System.currentTimeMillis();
        this.requestType = requestType;
        this.requestCommand = requestCommand;
        this.requestData = requestData;
    }

    public double getTimeStamp() {
        return timeStamp;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public RequestCommand getRequestCommand() {
        return requestCommand;
    }

    public String getRequestData() {
        return requestData;
    }
}
