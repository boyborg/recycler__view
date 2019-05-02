package com.example.recycler__view;

public class PlayerStat {

   private String name,cLass,skill;
    private int exp,hp,energy;

    public PlayerStat(String name,String cLass,String skill){
        this.name=name;
        this.cLass=cLass;
        this.skill=skill;

    }

    public String getName(){
        return name;
    }

    public String getcLass(){
        return cLass;
    }

    public String getskill(){
        return skill;
    }
    public int getexp(){
        return exp;
    }
    public int getenergy(){
        return energy;
    }
    public int gethp(){
        return hp;
    }
    public void  setName(String name){
        this.name=name;
    }
    public void  setSkill(String skill){
        this.skill=skill;
    }
    public void setcLass(String cLass){
        this.cLass=cLass;
    }

    public void setExp(int exp){
        this.exp=exp;
    }
    public void setHp(int hp){
        this.hp=hp;
    }
    public void setEnergy(int energy){
        this.energy=energy;
    }

}
