package com.furcan;

public class CustomerManager implements ICustomerService {
    // eger bir class implement veya extends gormuyorsa bagimlilik sorunu yasayacaktir.


    private ICustomerDal customerDal;

    // setter injection ( applicationContext.xml property )
    public void setCustomerDal(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

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
