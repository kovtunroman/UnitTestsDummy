import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.*;

public class RectangleTNG {

    Random random = new Random();
    double length = random.nextDouble();
    double width = random.nextDouble();

    @Test
    public void testRectungleConstructor() {
        Rectangle rectangle = new Rectangle(length, width);
        assertNotNull(rectangle);
        assertEquals(length, rectangle.length, 0);
        assertEquals(width, rectangle.width, 0);
    }

    @Test
    public void testGetLength() {
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(length, rectangle.getLength(), 0);
    }

    @Test
    public void testSetLength() {
        Rectangle rectangle = new Rectangle(length, width);
        double newLength = random.nextDouble();
        rectangle.setLength(newLength);
        assertEquals(newLength, rectangle.length, 0);
    }

    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(width, rectangle.getWidth(), 0);
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(length, width);
        double newWidth = random.nextDouble();
        rectangle.setWidth(newWidth);
        assertEquals(newWidth, rectangle.width, 0);
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(length * width, rectangle.getArea(), 0);
    }
}
