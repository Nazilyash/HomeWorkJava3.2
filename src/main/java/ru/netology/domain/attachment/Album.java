package ru.netology.domain.attachment;

import ru.netology.domain.DateAndTime;

public class Album {
    private String id;
    private String ownerId;
    private Photo photo;
    private String title;
    private String description;
    private int size;
    private DateAndTime dateAndTime;
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

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public int getEditedDate() {
        return editedDate;
    }

    public void setEditedDate(int editedDate) {
        this.editedDate = editedDate;
    }
}
