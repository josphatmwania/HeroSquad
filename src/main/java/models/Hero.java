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
    private static boolean duplicate = false;


    public Hero(String name, int age, String power, String weakness) {
        this.name = name.trim();
        this.age = age;
        this.power = power.trim();
        this.weakness = weakness.trim();
        findDuplicateHero(this);

        if (duplicate) {
            System.out.println("This is a Duplicate Hero!!");
        } else {
            heroRegistry.add(this);
            this.heroID = heroRegistry.size();
            this.squadAlliance = "";
        }
    }

}
