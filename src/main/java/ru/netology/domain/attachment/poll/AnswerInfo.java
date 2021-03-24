package ru.netology.domain.attachment.poll;

public class AnswerInfo {
    private String id;
    private String text;
    private int votesInfo;
    private int rate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getVotesInfo() {
        return votesInfo;
    }

    public void setVotesInfo(int votesInfo) {
        this.votesInfo = votesInfo;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
