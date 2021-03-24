package ru.netology.domain;

public class LikesCount {
    private String id;
    private int countOfLikes;
    private boolean youLiked;
    private boolean registeredUser;
    private boolean blockedUser;
    private boolean onlyFriend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCountOfLikes() {
        return countOfLikes;
    }

    public void setCountOfLikes(int countOfLikes) {
        this.countOfLikes = countOfLikes;
    }

    public boolean isYouLiked() {
        return youLiked;
    }

    public void setYouLiked(boolean youLiked) {
        this.youLiked = youLiked;
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
