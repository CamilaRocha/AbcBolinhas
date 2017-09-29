/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila
 */
public class ImpostoTest {
    
    public ImpostoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcula method, of class Imposto.
     */
    @Test
    public void testCalcula() {
        Orcamento orcamento = new Orcamento(100.0);
        Imposto imposto = new Imposto();
        // valor esperado, valor obtido
        assertEquals(10.0, imposto.calcula(orcamento), Double.MIN_VALUE);
    }
    
}
