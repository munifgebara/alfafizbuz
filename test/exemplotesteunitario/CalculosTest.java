/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplotesteunitario;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author munif
 */
public class CalculosTest {
    
    private Calculos calculos;
    
    public CalculosTest() {
        calculos=new Calculos();
    }

    @Test
    public void testParOuImpar1() {
        assertEquals(ParOuImpar.IMPAR, calculos.parOuImpar(1));
    }
    @Test
    public void testParOuImpar2() {
        assertEquals(ParOuImpar.PAR, calculos.parOuImpar(2));
    }
    @Test
    public void testParOuImpar3() {
        assertEquals(ParOuImpar.PAR, calculos.parOuImpar(4));
    }
    @Test
    public void testParOuImpar0() {
        assertEquals(ParOuImpar.ZERO, calculos.parOuImpar(0));
    }
    
}
