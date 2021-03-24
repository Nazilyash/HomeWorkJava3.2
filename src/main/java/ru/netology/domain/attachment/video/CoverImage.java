package ru.netology.domain.attachment.video;

public class CoverImage {
    private String id;
    private boolean withPadding;
    private String link;
    private int width;
    private int height;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isWithPadding() {
        return withPadding;
    }

    public void setWithPadding(boolean withPadding) {
        this.withPadding = withPadding;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
