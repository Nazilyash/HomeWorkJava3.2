package ru.netology.domain;

public class Author {
    private String id;
    private String linkOfIcon;
    private String nameOfAuthor;
    private String linkOfAuthor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLinkOfIcon() {
        return linkOfIcon;
    }

    public void setLinkOfIcon(String linkOfIcon) {
        this.linkOfIcon = linkOfIcon;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public String getLinkOfAuthor() {
        return linkOfAuthor;
    }

    public void setLinkOfAuthor(String linkOfAuthor) {
        this.linkOfAuthor = linkOfAuthor;
    }
}
