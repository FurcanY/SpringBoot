package com.furcan.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // bir oturum factory olusturduk
        // unit of work tasarim deseni
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(City.class)
                .buildSessionFactory();
        //bir adet oturum olusturduk
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            // transaction ,islemin bitmesini saglayan bir durumdur. yani bir islem yarida kesilirse rollback yapilir.
            //sorgu ( select * from city where countryCode='TUR' MySql default server)
            //HQL   Hibernate Query Language
//            List<City> cities = session.createQuery("from City c where c.countryCode='TUR' or c.countryCode='USA'").getResultList();
//
//            for (City city : cities) {
//                System.out.println(city.getName());
//            }

            // insert islemi
//            City city = new City();
//            city.setName("Ankara");
//            city.setCountryCode("TUR");
//            city.setDistrict("Ic Anadolu");
//            city.setPopulation(10000);
//            session.save(city);

            //update islemi
//            City city=session.get(City.class, 4085); // 4085 id'li kayiti getirir.
//            System.out.println(city.getName());
//            city.setPopulation(31111);
//            session.save(city);

            //delete islemi
//            City city= session.get(City.class, 4085);
//            session.delete(city);



            session.getTransaction().commit();
        }
        finally{
            factory.close();
        }
    }
}
