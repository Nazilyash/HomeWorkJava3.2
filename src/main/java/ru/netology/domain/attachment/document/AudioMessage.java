package ru.netology.domain.attachment.document;

public class AudioMessage {
    private String id;
    private int duration;
    private Waveform[] waveform;
    private String linkOgg;
    private String linkMp3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Waveform[] getWaveform() {
        return waveform;
    }

    public void setWaveform(Waveform[] waveform) {
        this.waveform = waveform;
    }

    public String getLinkOgg() {
        return linkOgg;
    }

    public void setLinkOgg(String linkOgg) {
        this.linkOgg = linkOgg;
    }

    public String getLinkMp3() {
        return linkMp3;
    }

    public void setLinkMp3(String linkMp3) {
        this.linkMp3 = linkMp3;
    }
}
