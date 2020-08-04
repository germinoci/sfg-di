package germinoci.springframework.controllers;

import germinoci.springframework.services.ContructorGreatingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ContructorGreatingService() {
        });
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}