package ru.netology.domain;

public class ViewingsCount {
    private String id;
    private int countOfViewings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCountOfViewings() {
        return countOfViewings;
    }

    public void setCountOfViewings(int countOfViewings) {
        this.countOfViewings = countOfViewings;
    }
}
