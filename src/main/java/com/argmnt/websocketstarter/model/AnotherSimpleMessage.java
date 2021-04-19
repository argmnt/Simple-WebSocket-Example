package com.argmnt.websocketstarter.model;

import java.io.Serializable;

public class AnotherSimpleMessage implements Serializable {
    private String name;

    public AnotherSimpleMessage() {
    }

    public AnotherSimpleMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
