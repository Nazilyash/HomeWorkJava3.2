package ru.netology.domain.attachment;

import ru.netology.domain.attachment.document.Picture;

public class Sticker {
    private String id;
    private String setId;
    private Picture[] pictures;
    private CopySize[] imagesWithBackground;
    private String animationLink;
    private boolean isAllowed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public Picture[] getPictures() {
        return pictures;
    }

    public void setPictures(Picture[] pictures) {
        this.pictures = pictures;
    }

    public CopySize[] getImagesWithBackground() {
        return imagesWithBackground;
    }

    public void setImagesWithBackground(CopySize[] imagesWithBackground) {
        this.imagesWithBackground = imagesWithBackground;
    }

    public String getAnimationLink() {
        return animationLink;
    }

    public void setAnimationLink(String animationLink) {
        this.animationLink = animationLink;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean allowed) {
        isAllowed = allowed;
    }
}
