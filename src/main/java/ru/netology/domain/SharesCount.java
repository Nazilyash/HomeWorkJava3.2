package ru.netology.domain;

public class SharesCount {
    private String id;
    private int countOfShares;
    private boolean registeredUser;
    private boolean blockedUser;
    private boolean onlyFriend;

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

    public boolean isRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(boolean registeredUser) {
        this.registeredUser = registeredUser;
    }

    public boolean isBlockedUser() {
        return blockedUser;
    }

    public void setBlockedUser(boolean blockedUser) {
        this.blockedUser = blockedUser;
    }

    public boolean isOnlyFriend() {
        return onlyFriend;
    }

    public void setOnlyFriend(boolean onlyFriend) {
        this.onlyFriend = onlyFriend;
    }
}
