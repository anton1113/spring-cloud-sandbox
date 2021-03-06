package com.arash.edu.serviceb.controllers;

import com.arash.edu.api.DummyControllerApi;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DummyController implements DummyControllerApi {

    private static final Random RANDOM = new Random();

    @Override
    public String methodA() {
        randomDelay();
        return "service-b-method-a";
    }

    @Override
    public String methodB() {
        randomDelay();
        return "service-b-method-b";
    }

    @Override
    public String methodC() {
        randomDelay();
        return "service-b-method-c";
    }

    @Override
    public String methodD() {
        randomDelay();
        return "service-b-method-d";
    }

    private static void randomDelay() {
        long sleepMillis = RANDOM.nextInt(2_000);
        try {
            Thread.sleep(sleepMillis);
        } catch (InterruptedException e) {
            // ignore yet
        }
    }
}
