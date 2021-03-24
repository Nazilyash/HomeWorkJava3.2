package ru.netology.domain;

public class SharesCount {
    private String id;
    private int countOfShares;
    private boolean youShared;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCountOfShares() {
        return countOfShares;
    }

    public void setCountOfShares(int countOfShares) {
        this.countOfShares = countOfShares;
    }

    public boolean isYouShared() {
        return youShared;
    }

    public void setYouShared(boolean youShared) {
        this.youShared = youShared;
    }
}
