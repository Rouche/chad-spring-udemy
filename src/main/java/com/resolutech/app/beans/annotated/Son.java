package com.resolutech.app.beans.annotated;

import com.resolutech.app.beans.Skill;
import com.resolutech.app.beans.Stranger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Son implements Stranger {

    private Skill skill;

    @Override
    public String introduce() {
        return "Im a Son and i indocuce myself : Mouhaaaaaaaaaaaaaaaaaaaaaaaaa!";
    }

    public Skill getSkill() {
        return skill;
    }

    @Autowired
    @Qualifier(value = "randomSkill")
    public void setSkill(Skill skill) {
        System.out.println("Son: Skill Autowired on set : " + skill.execute());
        this.skill = skill;
    }
}
