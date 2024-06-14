package com.springdemo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // DEPENDENCY INJECTION  burada kullanilir.
    CustomerManager manager = new CustomerManager(new MsSqlCustomerDal());


    ICustomerService customerService = manager;
    customerService.add();
    // bu yapi ic ice bagimliliktir. biz bunu su anda manuel olarak yapiyoruz.


    }

    // IoC  Inversion of Control = Birbirinin alternatifi olan isleri yonetme
    // Dependency Injection
    // SOLID


    /*
    *    OZET
    *   dependency injecton business katmanindaki islemleri class uretmeden yani spagetti kod yazmadan
    *   yapmamizi saglayan bir durumdur.
    *   IOC ise dependency injection yazilim patterni'ni spring boot'un yapmasi demektir.
    *
    *   IOC container'da kullanilan class' lara bean denir.
    *
    *   bu beanler ile dependency islemleri bean etiketi icerisinde verilen attribute ile yapiyoruz
    *
    *   bunun diger bir yontemi ise annotation kullanmaktir.
    * */
}