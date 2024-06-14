package com.furcan;

public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        // dependency injection class 2 ( implement interface)

        System.out.println("MySql veritabanina eklendi");
    }
}
