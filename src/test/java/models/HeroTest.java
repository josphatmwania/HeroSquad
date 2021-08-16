package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("ALL")
public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    private Hero setupNewHero(){
        return new Hero ("Batman",45,"Money","Loneliness");
    }

    private Hero setupHero2() {
        return new Hero("Superman", 180, "Almost everything", "Kryptonite");
    }

    @Test
    public void heroInstantiatesCorrectly() {
        Hero newHero = setupNewHero();
        assertTrue(newHero instanceof Hero);
    }

    @Test
    public void getHeroName_true() {
        Hero newHero = setupNewHero();
        assertTrue(newHero.getName() instanceof String);
    }

    @Test
    public void getHeroAge_int() {
        Hero newHero = setupNewHero();
        assertEquals(45, newHero.getAge());
    }

    @Test
    public void getHeroPower_true() {
        Hero newHero = setupNewHero();
        assertTrue(newHero.getPower() instanceof String);
    }

    @Test
    public void getHeroWeakness_true() {
        Hero newHero = setupNewHero();
        assertTrue(newHero.getWeakness() instanceof String);
    }

    @Test
    public void getHeroList_storeTwoHeroes_true() {
        Hero newHero = setupNewHero();
        Hero anotherNewHero = setupHero2();
        assertTrue(Hero.getHeroRegistry().contains(newHero));
        assertTrue(Hero.getHeroRegistry().contains(anotherNewHero));
    }

    @Test
    public void findHero_searchForHeroById_String() {
        Hero newHero = setupNewHero();
        Hero anotherNewHero = setupHero2();
        assertEquals("Batman", Hero.findHero(newHero.getHeroID()).getName());
    }

    @Test
    public void deleteSingleHero() {
        Hero newHero = setupNewHero();
        Hero anotherNewHero = setupHero2();
        Hero thirdHero = new Hero("Iron Man", 35, "Money", "Ego");
        Hero.deleteHero(anotherNewHero.getHeroID());
        assertFalse(Hero.getHeroRegistry().contains(anotherNewHero));
        assertEquals(3, Hero.getHeroRegistry().get(1).getHeroID());
    }

    @After
    public void tearDown() throws Exception {
        Hero.clearHeroRegistry();
    }
}