package com.resolutech.app.beans;

public class Kid implements Stranger {

    private Skill skill;

    private String name;

    private String team;

    public Kid() {
    }

    @Override
    public String introduce() {
        return "Momy i luv j00z!";
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        System.out.println("Skill set in Kid: " + skill.execute());
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("My name is: " + name);
        this.name = name;
    }

    private void creation() {
        System.out.println("Coui coui coui coui coui");
    }

    private void interrupt() {
        System.out.println("NOooooooo");
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
