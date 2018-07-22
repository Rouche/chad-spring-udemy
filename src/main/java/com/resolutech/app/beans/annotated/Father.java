package com.resolutech.app.beans.annotated;

import com.resolutech.app.beans.Skill;
import com.resolutech.app.beans.Stranger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Father implements Stranger {

    private final Skill skill;

    @Autowired
    @Qualifier("freeStyleSkill")
    private Skill drinker;

    @Autowired
    public Father(@Qualifier("cook") Skill skill) {
        System.out.println("Constructor Qualified injection");
        this.skill = skill;
    }


    @Override
    public String introduce() {
        return "Im a Father and i indocuce myself : Boooooo!";
    }

    public Skill getSkill() {
        return skill;
    }

    public Skill getDrinker() {
        return drinker;
    }

}
