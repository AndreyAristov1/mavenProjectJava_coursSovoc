package addressbook;

import org.junit.Assert;
import org.junit.Test;
import sandbox.Equation;


public class EquationTest {
    @Test
   public void test0() {
       Equation e = new Equation(1.0, 1.0, 1.0);
       Assert.assertEquals(e.rootNumber(),0);
   }

    @Test
    public void test1() {
        Equation e = new Equation(1.0, 2.0, 1.0);
        Assert.assertEquals(e.rootNumber(),1);
    }
    @Test
    public void test2() {
        Equation e = new Equation(1.0, 5.0, 6.0);
        Assert.assertEquals(e.rootNumber(),2);
    }

    @Test
    public void testLinear() {
        Equation e = new Equation(0.0, 1.0, 1.0);
        Assert.assertEquals(e.rootNumber(),1);
    }

    @Test
    public void testConstant() {
        Equation e = new Equation(0.0, 0.0, 1.0);
        Assert.assertEquals(e.rootNumber(),0);
    }

    @Test
    public void testZero() {
        Equation e = new Equation(0.0, 0.0, 0.0);
        Assert.assertEquals(e.rootNumber(),-1);
    }
}
