package com.dep;

import com.resolutech.app.beans.Skill;
import org.springframework.stereotype.Component;

@Component
public class FreeStyleSkill implements Skill {


    @Override
    public String execute() {
        return "Immm FREEEEEE";
    }
}
