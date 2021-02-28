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
public class StackListTest {
    
    public StackListTest() {
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
     * Test of push method, of class StackList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object num = null;
        StackList instance = new StackList();
        instance.push(num);
        
        if(num != null){
             // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of pop method, of class StackList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackList instance = new StackList();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        
        if(expResult != result){
             // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of peek method, of class StackList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackList instance = new StackList();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        
        if(expResult != result){
            
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of addF method, of class StackList.
     */
    @Test
    public void testAddF() {
        System.out.println("addF");
        Object num = null;
        StackList instance = new StackList();
        instance.addF(num);
        
        if(num != null){
            
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of addL method, of class StackList.
     */
    @Test
    public void testAddL() {
        System.out.println("addL");
        Object num = null;
        StackList instance = new StackList();
        instance.addL(num);
        
        if(num != null){
           // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of delF method, of class StackList.
     */
    @Test
    public void testDelF() {
        System.out.println("delF");
        StackList instance = new StackList();
        Object expResult = null;
        Object result = instance.delF();
        assertEquals(expResult, result);
        
        if(result != expResult){
        
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of delL method, of class StackList.
     */
    @Test
    public void testDelL() {
        System.out.println("delL");
        StackList instance = new StackList();
        Object expResult = null;
        Object result = instance.delL();
        assertEquals(expResult, result);
        
        if(expResult != result){
            
           // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of empty method, of class StackList.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackList instance = new StackList();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        
        if(expResult != result){
        
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of size method, of class StackList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackList instance = new StackList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
        if(expResult != result){
           
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }
    
}
