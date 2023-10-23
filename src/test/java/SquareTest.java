import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testArea() {
        Square s = new Square(5);
        assert s.area() == 25;//более простая схема сравнения
        Assert.assertEquals(s.area(),25);
    }
}
