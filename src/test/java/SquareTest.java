import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(),25);
    }
}
