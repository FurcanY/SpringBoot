package com.project.Entities;


import jakarta.persistence.*;

@Entity // veritabani nesnei oldugunu soylememiz gerekir
@Table(name = "city") // bu nesnenin bir veritabani tablosuna karsilik geldigi soylenir
public class City {

    @Id
    @Column(name = "ID")// bu fieldin veritabaninda hangi colum'a geldigi soylenmeli
    @GeneratedValue(strategy = GenerationType.IDENTITY)// bu fieldin otomatik arttirma yapmasini soyleriz
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "countrycode")
    private String countryCode;
    @Column(name = "district")
    private String district;
    @Column(name = "population")
    private int population;

    public City() {

    }

    public City(int id, String name, String countryCode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
