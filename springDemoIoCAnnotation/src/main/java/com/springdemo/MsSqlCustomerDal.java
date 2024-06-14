package com.springdemo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("database")
// anotasyon bazli injection yapimi (component adlarina dikkat edilmeli. ayni olanlarda sorunlar cikar)
public class MsSqlCustomerDal implements ICustomerDal{

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
        // dependency injection class 3 ( implement interface)
        System.out.println(this.connectionString);
        System.out.println( "MsSql veritabanina eklendi");
    }
}
