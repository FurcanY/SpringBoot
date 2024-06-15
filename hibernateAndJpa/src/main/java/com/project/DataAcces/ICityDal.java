package com.project.DataAcces;

import com.project.Entities.City;

import java.util.List;

public interface ICityDal // interface city data access layer
{
    List<City> getAll(); //tum city veritabani nesnelerini getiren bir metot tanimlamasi
    void add (City city);
    void update (City city);
    void delete (City city);
    City getById(int id);
}
