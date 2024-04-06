package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Bryan");
        speaker.setLastName("Hansen");
        speaker.setSeedNum(seedNum);

        System.out.println("cal: " + calendar.getTime());

        speakers.add(speaker);

        return speakers;
    }
}
