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
public class DobleEncadenadasTest {
    
    public DobleEncadenadasTest() {
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
     * Test of empty method, of class DobleEncadenadas.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        DobleEncadenadas instance = new DobleEncadenadas();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        
        if(expResult != result){
             // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of peek method, of class DobleEncadenadas.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        DobleEncadenadas instance = new DobleEncadenadas();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);

         if(expResult == result){
         
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
         }
    }

    /**
     * Test of push method, of class DobleEncadenadas.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object num = null;
        DobleEncadenadas instance = new DobleEncadenadas();
        instance.push(num);
        
        if(num != null){
        
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }
    
}
