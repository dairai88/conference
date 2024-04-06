package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);

        System.out.println(service.findAll().getFirst().getFirstName());
        System.out.println(service.findAll().getFirst().getSeedNum());

        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service2);

        System.out.println(service2.findAll().getFirst().getFirstName());
    }
}
