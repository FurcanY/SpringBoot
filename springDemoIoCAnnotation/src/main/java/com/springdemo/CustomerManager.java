package com.springdemo;



public class CustomerManager implements ICustomerService {


    private ICustomerDal customerDal;


    // constructor injection ( sektorde kullanilir, constructor arg )
    public CustomerManager(ICustomerDal customerDal) {
        //referans type ( bu interface implement eden herhangi bir classi implement edebilirsin.)
        this.customerDal = customerDal;
    }

    public void add(){
        // is kurallari saglaniyorsa
        //CustomerDal customerDal = new CustomerDal();
        // is kodu grubu bir class'i newlememelidir.
        customerDal.add();

    }
}
