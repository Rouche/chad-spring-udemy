package com.resolutech.app.beans;

import org.springframework.stereotype.Component;

@Component
public class Wife implements Stranger {

    public Wife() {
    }

    @Override
    public String introduce() {
        return "Maria";
    }
}
