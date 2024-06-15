package com.project.restApi;

import com.project.Business.CityManager;
import com.project.Business.ICityService;
import com.project.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// bu class bir controller katmanidir.
@RestController
@RequestMapping("/api")
public class CityController {

    private ICityService cityService; // business (service) katmanindan bir nesne olusturulur.

    @Autowired // DI islemini yapar Controller Injection
    public CityController(ICityService cityService, CityManager cityManager) {
        this.cityService = cityService;

    }
    @GetMapping("/cities")
    public List<City> get(){
        return cityService.getAll();
    }

    @GetMapping("/cities/{id}")
    public City getById(@PathVariable int id){
        return cityService.getById(id);
    }
    // ekleme silme ve silme islemleri post metotlaridir. parametreyi urlden almali
    @PostMapping("/add")
    public  void add(@RequestBody City city){
        cityService.add(city);
    }
    @PostMapping("/update")
    public  void update(@RequestBody City city){
        cityService.update(city);
    }
    @PostMapping("/delete")
    public  void delete(@RequestBody City city){
        cityService.delete(city);
    }
}
