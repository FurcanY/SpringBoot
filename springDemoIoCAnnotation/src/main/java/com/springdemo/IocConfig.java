package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //konfigure dosyasi xml yerine artik bu olacak
@ComponentScan("com.springdemo") // xml dosyasindaki component scan islemin bu yapar
@PropertySource("classpath:application.properties")
// class config
// bu config dosyasi icerisinde bean tanimi yapilir.
public class IocConfig {

    @Bean // bunu yaparak implement yapmis olan classlarimiz ( mssqlcustomer, mysqlcustomer)
    // ustunde component anotasyonu yazmamis oluyoruz.
    // yani bu metot xmldeki bagimliligini buradan yapiyoruz.
    public ICustomerDal database(){
        return new MySqlCustomerDal();
    }

    @Bean
    public ICustomerService service(){
        return new CustomerManager(database());// parametre olarak icustomerdal verilmelidir.
        // bunu da bir ustteki bean metodu ile gerceklestiririz.
    }



}
