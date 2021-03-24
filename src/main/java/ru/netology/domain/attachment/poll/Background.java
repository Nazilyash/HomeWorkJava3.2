package ru.netology.domain.attachment.poll;

import ru.netology.domain.attachment.document.Picture;

public class Background {
    private String id;
    private String type;
    private int angle;
    private String color;
    private int width;
    private int height;
    private Picture[] pictures;
    private PointsInfo[] pointsInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public Picture[] getPictures() {
        return pictures;
    }

    public void setPictures(Picture[] pictures) {
        this.pictures = pictures;
    }

    public PointsInfo[] getPointsInfo() {
        return pointsInfo;
    }

    public void setPointsInfo(PointsInfo[] pointsInfo) {
        this.pointsInfo = pointsInfo;
    }
}
