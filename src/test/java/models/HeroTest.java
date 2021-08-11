package models;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;


@SuppressWarnings("ALL")
public class HeroTest {

    @Before
    public  void setUp() throws Exception {

    }

    private Hero setUpNewHero(){
        return new Hero("Bazu", 45, "Thriller", "Scary");
    }

    private  Hero setUpNewHero2(){
        return new Hero("Batman", 35, "Monster", "Beast");
    }

    @Test
    public  void heroInstacePerfect() {
        Hero newHero = setUpNewHero();
        assertTrue(newHero instanceof Hero);
    }

}
