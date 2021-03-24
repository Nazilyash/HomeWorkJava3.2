package ru.netology.domain.attachment.document;

public class Preview {
    private String id;
    private Picture picture;
    private Graffiti graffiti;
    private AudioMessage audioMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Graffiti getGraffiti() {
        return graffiti;
    }

    public void setGraffiti(Graffiti graffiti) {
        this.graffiti = graffiti;
    }

    public AudioMessage getAudioMessage() {
        return audioMessage;
    }

    public void setAudioMessage(AudioMessage audioMessage) {
        this.audioMessage = audioMessage;
    }
}
