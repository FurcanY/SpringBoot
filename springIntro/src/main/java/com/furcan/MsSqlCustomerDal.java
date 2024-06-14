package com.springdemo;

public class MsSqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        // dependency injection class 3 ( implement interface)
        System.out.println( "MsSql veritabanina eklendi");
    }
}
