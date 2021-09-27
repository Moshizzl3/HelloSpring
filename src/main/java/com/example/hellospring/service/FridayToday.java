package com.example.hellospring.service;

import java.time.LocalDate;

public class FridayToday {

  private LocalDate date = LocalDate.now();

  private int h;
  private int q = date.getDayOfMonth();
  private int m = date.getMonthValue();
  private int j = date.getYear()/100;
  private int k = date.getYear()%100;

  public int getDay(){
    int day;

    this.h = (q +(13*(m+1)/5) + k + (k/4) + (j/4) -2*j)%7;
    day = ((h + 5)%7) + 1;

    return day;
  }

  public String isItFriday(){
    if (getDay() == 5){
      return "Yes";
    }
    else return "No";
  }
}
