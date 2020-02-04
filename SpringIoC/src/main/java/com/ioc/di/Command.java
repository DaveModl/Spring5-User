package com.ioc.di;

import java.util.Map;

public class Command {
    private Map<Object,Object> State;

    public Map<Object, Object> getState() {
        return State;
    }

    public void setState(Map<Object, Object> state) {
        State = state;
    }

    public Object execute() {
        return getState().hashCode();
    }

    @Override
    public String toString() {
        return "Command{" +
                "State=" + State +
                '}';
    }
}
