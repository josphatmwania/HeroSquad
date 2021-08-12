package models;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;


public class HeroTest {

    @Before
    public  void setUp() throws Exception {

    }

    private Hero setUpNewHero(){
        return new Hero("Bazu", 15, "Thriller", "Scary");
    }

    private  Hero setUpNewHero2(){
        return new Hero("Batman", 35, "Monster", "Beast");
    }

    @Test
    public  void heroInstacePerfect() {
        Hero newHero = setUpNewHero();
        assertTrue(newHero instanceof Hero);
    }
// Name test
    @Test
    public  void  getHeroName_true() {
        Hero newHero = setUpNewHero();
        assertTrue(newHero.getName() instanceof String);
    }
// Test for Power
    @Test
    public void get_Hero_Power_true(){
        Hero newHero = setUpNewHero();
        assertTrue(newHero.getPower() instanceof String);
    }
// Test method for age

    @Test
    public  void get_Hero_Age_true() {
        Hero newHero = setUpNewHero();
        assertEquals(15, newHero.getAge());
    }
// Test method for Hero Weakness
    @Test
    public void get_Hero_Weaksness_true() {
        Hero newHero = setUpNewHero();
        assertTrue(newHero.getWeakness() instanceof String);
    }

    @Test
    public  void get_Hero_ID_true(){
        Hero newHero = setUpNewHero();
        assertEquals();
    }




}
