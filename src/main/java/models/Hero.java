package models;

import  java.util.List;
import java.util.ArrayList;

// Hero object with Name, age & power
public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private  static List<Hero> heroRegistry = new ArrayList<>();
    private  int heroID;
    private String squadFighters;
//    private static boolean duplicate = false;


    public Hero(String name, int age, String power, String weakness) {
        this.name = name.trim();
        this.age = age;
        this.power = power.trim();
        this.weakness = weakness.trim();
    }

    public static void clearHeroRegistry() {
        heroRegistry.clear();

    }

    // defining hero power

    public  void setPower(String power) {
        this.power = power;
    }

    // defining weakness

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public  void setSquadFighters(String squadFighters) {
        this.squadFighters = squadFighters;
    }

    public String getSquadFighters() {
        return squadFighters;

    }

    public  String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public  String getPower() {
        return power;

    }

    public  String getWeakness() {
        return weakness;

    }
    public  int getHeroID() {
        return heroID;

    }
    public  static  Hero findHero(int searchID){
        return heroRegistry.get(searchID -1);
    }
    public  static  List<Hero> getHeroRegistry() {

        return heroRegistry;
    }

// Updating the Squad

    public void updateSquad(String newSquad){
        this.squadFighters = newSquad;
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateWeakness(String newWeakness) {
        this.weakness = newWeakness;
    }

    public void updateAge(int newAge) {
        this.age = newAge;
    }
    public void updatePower(String newPower) {
        this.power = newPower;
    }





}
