package com.project.Business;


import com.project.DataAcces.ICityDal;
import com.project.Entities.City;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service // bu bir is katmanidir.
public class CityManager implements ICityService {


    private ICityDal cityDal;

    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDal.getAll();
        // dataaccess katmanindan classi DI yaparak oradaki metodu cagirdik.
    }

    @Override
    @Transactional
    public void add(City city) {
        //peki bu katman dataacces katmanini kopyalayan bir katman mi
        // hayir bu katmanda bi lojik kontroller yapariz. business is kurallari

        this.cityDal.add(city);
    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.update(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
        this.cityDal.delete(city);
    }

    @Override
    @Transactional
    public City getById(int id) {
       return this.cityDal.getById(id);
    }
}
