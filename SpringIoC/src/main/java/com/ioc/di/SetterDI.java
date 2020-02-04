package com.ioc.di;

public class SetterDI {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SetterDI{" +
                "description='" + description + '\'' +
                '}';
    }
}
