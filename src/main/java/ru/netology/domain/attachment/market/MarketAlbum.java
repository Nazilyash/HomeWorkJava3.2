package ru.netology.domain.attachment.market;

import ru.netology.domain.attachment.Photo;

public class MarketAlbum {
    private String id;
    private String ownerId;
    private String title;
    private Photo photo;
    private int count;
    private int editedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getEditedDate() {
        return editedDate;
    }

    public void setEditedDate(int editedDate) {
        this.editedDate = editedDate;
    }
}
