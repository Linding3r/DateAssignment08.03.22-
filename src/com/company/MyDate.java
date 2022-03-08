package com.company;

public class MyDate {
  private int day;
  private int month;
  private int year;

  public boolean longMonth(int month){
    int[] longMonth = {1,3,5,7,8,10,12};
    for (int x : longMonth){
      if (x == month){
        return true;
      }
    }return false;
  }

  public boolean LeapYear(int year) {
    if (year % 4 != 0) {
      return false;
    } else if (year % 400 == 0) {
      return true;
    } else if (year % 100 == 0) {
      return false;
    } else {
      return true;
    }
  }

  public void setToNextDay() {
    day++;
    if (day > 31 && month == 12) {
      newYear();
    }if (longMonth(month) == true) {
      if (day > 31) {
        newMonth();
      }
    }else if (month == 2) {
      if (LeapYear(year) == true) {
        if (day > 29) {
          newMonth();
        }
      }else if (day > 28) {
        newMonth();
      }
    }else {
      if (day < 30) {
        newMonth();
        }
      }
    }
  public void newMonth(){
    day = 1;
    month++;
  }

  public void newYear(){
    day = 1;
    month = 1;
    year++;
  }

  public void MyDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String toString(){
    return day + "." + month + "." + year;
  }
}
