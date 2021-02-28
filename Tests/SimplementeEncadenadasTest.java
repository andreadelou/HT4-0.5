/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sebas
 */
public class SimplementeEncadenadasTest {
    
    public SimplementeEncadenadasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

 
    /**
     * Test of empty method, of class SimplementeEncadenadas.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        SimplementeEncadenadas instance = new SimplementeEncadenadas();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);

        if(expResult != result){
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of size method, of class SimplementeEncadenadas.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SimplementeEncadenadas instance = new SimplementeEncadenadas();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
        if(expResult != result){
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }


    /**
     * Test of push method, of class SimplementeEncadenadas.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object num = null;
        SimplementeEncadenadas instance = new SimplementeEncadenadas();
        instance.push(num);
        
        if(num != null){
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }
    
}
