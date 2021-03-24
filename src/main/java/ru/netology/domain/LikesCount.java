package ru.netology.domain;

public class LikesCount {
    private String id;
    private int countOfLikes;
    private boolean youLiked;
    private boolean canLike;
    private boolean canShare;

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

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }
}
