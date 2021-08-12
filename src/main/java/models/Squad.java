package models;

import java.util.ArrayList;
import java.util.List;


public class Squad {
    private String squadName;
    private int squadID;
    private static List<Squad> squadList = new ArrayList<>();
    private list<Hero> heroMembers = new ArrayList<>();
    private String cause;
    private boolean isSquadFull = false;
    private static boolean isRegisteredHero = false;

    public Squad(String name, String cause, Hero hero) {
        this.squadName = name.trim();
        this.cause = cause.trim();

// Cross cheking hero

        crossCheckHero(hero.getHeroID());

        if (isRegisteredHero) {
            hero.setSquadFighters(squadName);
            heroMembers.add(hero);
            squadList.add(this);
            this.squadID = squadList.size();

        } else {
            System.out.println("Here is not registered!");

        }

    public String getName() {
            return squadName;
        }

    public int getSquadId() {
            return squadId;
        }

// Squad size
    public void addMembers(Hero hero) {
            if (heroMembers.size() >=3 ) {
                isSquadFull = true;

            } else {
                heroMembers.add(hero);
            }
        }
//  Full Squad

    public boolean getSquadFull() {
            return isSquadFull;

        }





    }


