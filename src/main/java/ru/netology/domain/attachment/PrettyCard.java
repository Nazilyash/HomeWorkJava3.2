package ru.netology.domain.attachment;

import ru.netology.domain.attachment.document.Picture;
import ru.netology.domain.attachment.link.Button;
import ru.netology.domain.attachment.link.Price;

public class PrettyCard {
    private String id;
    private String link;
    private String title;
    private Picture[] pictures;
    private Button button;
    private Price price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Picture[] getPictures() {
        return pictures;
    }

    public void setPictures(Picture[] pictures) {
        this.pictures = pictures;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
