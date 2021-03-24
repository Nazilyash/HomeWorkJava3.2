package ru.netology.domain;

public class DateAndTime {
    private String id;
    private int date;
    private int time;
    private boolean dateIsToday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isDateIsToday() {
        return dateIsToday;
    }

    public void setDateIsToday(boolean dateIsToday) {
        this.dateIsToday = dateIsToday;
    }
}
