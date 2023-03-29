package eu.garudaacademy.ci.cd.deployment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    private HelloService helloService = new HelloService();

    @Test
    public void testHelloService() {
        assertEquals("Hello World", helloService.getHello());
    }

}
