package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private static List<Hero> heroRegistry = new ArrayList<>();
    private int heroID;
    private String squadAlliance;
    private static boolean duplicate = false;

    public Hero(String name, int age, String power, String weakness) {
        this.name = name.trim();
        this.age = age;
        this.power = power.trim();
        this.weakness = weakness.trim();
        findDuplicateHero(this);

        if (duplicate) {
            System.out.println("Duplicate Hero!!");
        } else {
            heroRegistry.add(this);
            this.heroID = heroRegistry.size();
            this.squadAlliance = "";
        }

    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public void setSquadAlliance(String squadAlliance) {
        this.squadAlliance = squadAlliance;
    }

    public String getSquadAlliance() {
        return squadAlliance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    public int getHeroID() {
        return heroID;
    }

    public static List<Hero> getHeroRegistry() {
        return heroRegistry;
    }

    public static Hero findHero(int searchID) {
        return heroRegistry.get(searchID - 1);
    }

    private static void findDuplicateHero(Hero newInsertion) {
        for (Hero hero : heroRegistry) {
            if (newInsertion.name.equalsIgnoreCase(hero.name) &&
                    newInsertion.power.equalsIgnoreCase(hero.power) &&
                    newInsertion.weakness.equalsIgnoreCase(hero.weakness)) {
                duplicate = true;
                break;
            } else if (newInsertion.name.equalsIgnoreCase(hero.name)) {
                duplicate = true;
                break;
            }
        }
    }

    public void updateSquad(String newSquad) {
        this.squadAlliance = newSquad;
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateAge(int newAge) {
        this.age = newAge;
    }

    public void updatePower(String newPower) {
        this.power = newPower;
    }

    public void updateWeakness(String newWeakness) {
        this.weakness = newWeakness;
    }

    public static void deleteHero(int searchID) {
        Hero heroToDelete = findHero(searchID);
        if (!heroToDelete.getSquadAlliance().equals("")) {
            // IF this hero is in a squad, remove him from squad first
            Squad currentSquad = null;
            String currentSquadName = heroToDelete.getSquadAlliance();
            for (Squad squad : Squad.getAllSquads()) {
                if (squad.getName().equalsIgnoreCase(currentSquadName)) {
                    currentSquad = squad;
                    break;
                }
            }
            assert currentSquad != null;
            currentSquad.removeMember(heroToDelete);
        }
        heroRegistry.remove(searchID - 1);
    }

    public static void clearHeroRegistry(){
        heroRegistry.clear();
    }

}