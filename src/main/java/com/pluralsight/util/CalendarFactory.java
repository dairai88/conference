package com.pluralsight.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalendarFactory implements FactoryBean<Calendar> {

    private Calendar instance = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        System.out.println("CalendarFactory getObject");
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return instance.getClass();
    }

    public void addDay(int num) {
        System.out.println("CalendarFactory.addDay");
        instance.add(Calendar.DAY_OF_YEAR, num);
    }
}
