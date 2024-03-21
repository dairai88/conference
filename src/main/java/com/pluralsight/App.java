package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class App {
    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().getFirst().getFirstName());
    }
}
