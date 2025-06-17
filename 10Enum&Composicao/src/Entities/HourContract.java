package Entities;

import java.util.Date;

public class HourContract {

    // Atributos
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    // Constructors
    public HourContract(){

    }

    public HourContract(Date date, Integer hours, Double valueHour){
        this.date = date;
        this.hours = hours;
        this.valuePerHour = valueHour;
    }

    // Getters and setters
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Double getValuePerHour(){
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours(){
        return hours;
    }

    public void setHours(Integer hours){
        this.hours = hours;
    }

    // Functions

    public Double totalValue(){
        return valuePerHour * hours;
    }


}
