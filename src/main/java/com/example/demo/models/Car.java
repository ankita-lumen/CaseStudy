package com.example.demo.models;

 

import org.springframework.stereotype.Component;

 

@Component
public class Car {
    
    
    private String carmodelname;
    private int year;
    private int kilometer;
    private String status;
    public Car() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Car(String carmodelname, int year, int kilometer, String status) {
        super();
        this.carmodelname = carmodelname;
        this.year = year;
        this.kilometer = kilometer;
        this.status = status;
    }
    public String getCarmodelname() {
        return carmodelname;
    }
    public void setCarmodelname(String carmodelname) {
        this.carmodelname = carmodelname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getKilometer() {
        return kilometer;
    }
    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Car [carmodelname=" + carmodelname + ", year=" + year + ", kilometer=" + kilometer + ", status=" + status
                + "]";
    }
    

 

 

 

}