package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("database")    bu islemi artik config class icerisinde yapariz.
public class MySqlCustomerDal implements ICustomerDal{
    @Value("${database.connectionString}")
    String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void add() {
        // dependency injection class 2 ( implement interface)
        System.out.println(this.connectionString);
        System.out.println("MySql veritabanina eklendi");
    }
}
