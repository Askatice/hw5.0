package com.company;

public class hero {
    private int health,damage ;
    private String attackType, heroName, superAbility;

    public hero(int health, int damage, String attackType, String heroName, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.attackType = attackType;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public hero(int health, int damage, String attackType, String heroName) {
        this.health = health;
        this.damage = damage;
        this.attackType = attackType;
        this.heroName = heroName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    @Override
    public String toString() {
        return  "Name: " + heroName +
                ", Health:" + health +
                ", Damage:" + damage +
                ", AttackType:" + attackType +
                ", SuperAbility: " + superAbility;
    }

}