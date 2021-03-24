package ru.netology.domain.attachment;

public class PhotosList {
    private String id;
    private String[] photoIds;
    private Photo[] photos;
    private int maxPhotoNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getPhotoIds() {
        return photoIds;
    }

    public void setPhotoIds(String[] photoIds) {
        this.photoIds = photoIds;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public int getMaxPhotoNumber() {
        return maxPhotoNumber;
    }

    public void setMaxPhotoNumber(int maxPhotoNumber) {
        this.maxPhotoNumber = maxPhotoNumber;
    }
}
