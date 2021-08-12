package models;

import static org.junit.Assert.;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;


@SuppressWarnings("ALL")

public class SquadTest {
    @Before
    public void setUp() throws Exception{

    }


// Testting a New Hero

    private Hero setNewHero(){
        return new Hero("Bazu", 15, "Thriller", "Scary" );
    }

    private Hero setUpHero2(){
        return new Hero("Batman", 35, "Monster", "Beast");

    }


// Tests for Squad

//    @Test
//    public void squadInstaciatedPerfect() {
//        Squad squad = setUpNewSquad(setUpNewHero());
//        assertTrue(squad instanceof Squad);
//
//    }
    @Test
    public void getSquadName(){
        Squad squad = setupNewSquad(setNewHero());
        assertTrue(squad.getName() instanceof String);
    }







}
