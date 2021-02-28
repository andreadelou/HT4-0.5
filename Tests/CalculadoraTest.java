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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of CalculoSE method, of class Calculadora.
     */
    @Test
    public void testCalculoSE() {
        System.out.println("CalculoSE");
        String a = "12+9*";
        Calculadora instance = new Calculadora();
        String expResult = "27";
        String result = instance.CalculoSE(a);
        assertEquals(expResult, result);
        
        if(expResult == result){ 
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
            
            System.out.println("Sí funcionó");
            
        }
    }

    /**
     * Test of CalculoDE method, of class Calculadora.
     */
    @Test
    public void testCalculoDE() {
        System.out.println("CalculoDE");
        String a = "12+9*";
        Calculadora instance = new Calculadora();
        String expResult = "27";
        String result = instance.CalculoDE(a);
        assertEquals(expResult, result);
        
        if(expResult == result){
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        
            System.out.println("Sí funcionó");
        }
    }

    /**
     * Test of CalculoV method, of class Calculadora.
     */
    @Test
    public void testCalculoV() {
        System.out.println("CalculoV");
        String a = "12+9*";
        Calculadora instance = new Calculadora();
        String expResult = "27";
        String result = instance.CalculoV(a);
        assertEquals(expResult, result);
        
        if(expResult == result){
        
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
            
            System.out.println("Sí funcionó");
        }
    }

    /**
     * Test of CalculoL method, of class Calculadora.
     */
    @Test
    public void testCalculoL() {
        System.out.println("CalculoL");
        String a = "12+9*";
        Calculadora instance = new Calculadora();
        String expResult = "27";
        String result = instance.CalculoL(a);
        assertEquals(expResult, result);

          if(expResult == result){
            
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
          
            System.out.println("Sí funcionó");
          }
    }
    
}