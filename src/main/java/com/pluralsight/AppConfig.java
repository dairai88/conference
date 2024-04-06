package com.pluralsight;

import com.pluralsight.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDay(2);
        return calendarFactory;
    }
}
