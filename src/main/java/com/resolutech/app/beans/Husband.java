package com.resolutech.app.beans;

public class Husband implements Stranger {

    private final Skill skill;
    private final Wife wife;

    public Husband(Skill skill, Wife wife) {
        this.skill = skill;
        this.wife = wife;
    }

    @Override
    public String introduce() {
        return "I am joe, here is my wife " + wife.introduce() + ", you smell honey!";
    }

    public Skill getSkill() {
        return skill;
    }
}
