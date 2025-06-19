package com.equipo.transchile;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testSumar() {
        assertEquals(5, App.sumar(2, 3));
    }
}