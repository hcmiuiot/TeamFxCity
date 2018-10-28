package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void connect2DB() {
        Controller controller = new Controller();
        assertTrue(controller.connect2DB());
    }
}