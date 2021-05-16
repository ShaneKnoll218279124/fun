package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
   private Car c1;
   private Car c2;

    @BeforeEach
    void setUp() {
        c1= new Car();
        c2 = new Car();
    }
     @Test
     void testEquality()
     {
         assertEquals(c1,c1);

     }
    @Test
    void testIdentity(){

        assertSame(c2,c2);
    }
    @Test
    public void testFailing(){
        System.out.print("Test for failing");
        String make= "BMW";
        Car c3 = new Car();
        c3.setMake(make);
        fail("This test will fail");

    }

    @Test
    @Disabled("Disable because expected c1 and actual c2 are are not identicle")
    void testDisable(){

        assertNotSame(c2,c1);
    }


}