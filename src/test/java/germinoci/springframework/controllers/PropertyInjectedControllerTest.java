package germinoci.springframework.controllers;

import germinoci.springframework.services.ContructorGreatingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new PropertyInjectedController();
        controller.greetingService = new ContructorGreatingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}