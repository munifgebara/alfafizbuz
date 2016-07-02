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
public class FizBuzTest {
    private FizBuz fizbuz;
    
    public FizBuzTest() {
        fizbuz = new FizBuz();
        
    }

    @Test
    public void testFizBuz() {
        assertEquals("fiz", fizbuz.fizBuz(2));
    }
    
    @Test
    public void testFizBuz2() {
        assertEquals("buz", fizbuz.fizBuz(3));
    }
    
    @Test
    public void testFizBuz3() {
        assertEquals("fizbuz", fizbuz.fizBuz(6));
    }
    
     @Test
    public void testFizBuz4() {
        assertEquals("", fizbuz.fizBuz(7));
    }
    
         @Test
    public void testFizBuz5() {
        assertEquals("", fizbuz.fizBuz(11));
    }
    
         @Test
    public void testFizBuz6() {
        assertEquals("fiz", fizbuz.fizBuz(8));
    }
    @Test
    public void testFizBuz7() {
        assertEquals("fizbuz", fizbuz.fizBuz(0));
    }
}
