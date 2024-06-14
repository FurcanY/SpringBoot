package com.furcan;

public class CustomerDal  implements ICustomerDal {

    public void  add(){
        // dependency injection class 1 ( implement interface)
        System.out.println("Oracle veritabanina eklendi");
    }
}
