package com.project.DataAcces;

import com.project.Entities.City;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
// hibernate teknolojisi kullanarak yapilan implement class
//jpa orm gibi veri erisim teknigidir. JPA esnek sekilde hibernate islemlerini daha kolay yapmayi saglar.
@Repository //bu bir veritabani erisim katmanidir.
public class HibernateCityDal implements ICityDal {


    private  EntityManager entityManager; // jpa session'a karsilik gelen classdir.

    @Autowired // injection islemi yapar
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional // aspect oritanted programming // transaction islemini yapar
    public List<City> getAll() {
        Session session= entityManager.unwrap(Session.class); // hibernate ile olan tum enjeksiyonlari yapar
        List<City> cities = session.createQuery("from City",City.class).getResultList();
        return cities;
    }

    @Override
    @Transactional
    public void add(City city) {
        Session session= entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    @Transactional
    public void update(City city) {
        Session session= entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
        Session session= entityManager.unwrap(Session.class);
        //session.delete(city);
        City cityToDelete = session.get(City.class,city.getId());
        session.remove(cityToDelete);
    }

    @Override
    public City getById(int id) {
        Session session= entityManager.unwrap(Session.class);
        City city = session.get(City.class,id);
        return city;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
