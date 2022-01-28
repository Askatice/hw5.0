package com.company;

public class Main {

    public static void main(String[] args) {
        boss();
        createHero();

    }

    public static void boss() {
        Boss all = new Boss(1000, 70, "");

        System.out.println("Health: " + all.getHealth());
        System.out.println("Damage: " + all.getDamage());
        System.out.println("DefenceType: " + all.getDefenceType());
    }

    public static hero[] createHero() {
        hero Archer = new hero(400, 60, "Crossbow", "Archer");
        hero Barbarian = new hero(450, 30, "Sword", "Barbarian", "Fury");
        hero Giant = new hero(600, 20, "Fist", "Giant");
        hero[] heroes =new hero[] {Archer, Barbarian, Giant} ;
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
        return heroes;
    }
}
