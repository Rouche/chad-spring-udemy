package com.resolutech.app.beans.annotated;

import com.resolutech.app.beans.Skill;
import org.springframework.stereotype.Component;

@Component
public class Eater implements Skill {

    @Override
    public String execute() {
        return "Crunch crunch!";
    }
}
