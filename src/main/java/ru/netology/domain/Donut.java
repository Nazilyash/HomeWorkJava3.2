package ru.netology.domain;

public class Donut {
    private boolean isDonut;
    private boolean canPublishFreeCopy;
    private int paidDuration;
    private PlaceHolder placeHolder;
    private String editMode;

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public PlaceHolder getPlaceholder() {
        return placeHolder;
    }

    public void setPlaceholder(PlaceHolder placeholder) {
        this.placeHolder = placeholder;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
