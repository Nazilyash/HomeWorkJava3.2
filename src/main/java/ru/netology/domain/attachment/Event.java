package ru.netology.domain.attachment;

public class Event {
    private int id;
    private int timeOfBeginning;
    private int userStatus;
    private boolean isFavorite;
    private String address;
    private String text;
    private String buttonTitle;
    private int[] friendsIds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeOfBeginning() {
        return timeOfBeginning;
    }

    public void setTimeOfBeginning(int timeOfBeginning) {
        this.timeOfBeginning = timeOfBeginning;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getButtonTitle() {
        return buttonTitle;
    }

    public void setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
    }

    public int[] getFriendsIds() {
        return friendsIds;
    }

    public void setFriendsIds(int[] friendsIds) {
        this.friendsIds = friendsIds;
    }
}
