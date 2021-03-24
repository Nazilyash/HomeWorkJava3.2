package ru.netology.domain.attachment.document;


import ru.netology.domain.attachment.CopySize;

public class Picture {
    private String id;
    private CopySize[] copySizes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CopySize[] getCopySizes() {
        return copySizes;
    }

    public void setCopySizes(CopySize[] copySizes) {
        this.copySizes = copySizes;
    }
}
