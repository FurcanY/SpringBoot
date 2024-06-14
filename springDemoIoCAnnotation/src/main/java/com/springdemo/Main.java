package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(IocConfig.class);
        // anotasyon olarak config olan dosyaya gider ve islemleri artik o dosya ile yurutur.

    /*
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    // application context dosyasini cagiririz
    */
    ICustomerService customerService =context.getBean("service", ICustomerService.class);
    customerService.add();
    // uc katmanli bir mimari olusturuldu. customerService ile customer manager cagirilir.
        // customer manage icerisinde customerDal intrefacei cagirilir. DI
            //customerDal ile de istenilen implement class cagirilir ( mssql veya mysql )
    // bean xml etiketi sayesinde dependency injection islemini spring bizim icin yapar


    }
}