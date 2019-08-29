package ru.stqa.pft.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.second.Rectangle;

public class AutoRect {
    @Test
    public void testArea () {
        Rectangle r = new Rectangle(3,4);

        assert r.area() == 11;
    }
}
