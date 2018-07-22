package com.resolutech.app.beans.annotated;

import com.resolutech.app.beans.Skill;
import org.springframework.stereotype.Component;

@Component
public class Drinker implements Skill {

    @Override
    public String execute() {
        return "Glou glou glou!";
    }
}
