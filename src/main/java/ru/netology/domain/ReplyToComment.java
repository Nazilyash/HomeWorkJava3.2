package ru.netology.domain;

public class ReplyToComment {
    private String id;
    private Author author;
    private boolean edited;
    private DateAndTime dateAndTime;
    private String textOfComment;
    private LikesCount likesCount;
    private int repliesCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getTextOfComment() {
        return textOfComment;
    }

    public void setTextOfComment(String textOfComment) {
        this.textOfComment = textOfComment;
    }

    public LikesCount getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(LikesCount likesCount) {
        this.likesCount = likesCount;
    }

    public int getRepliesCount() {
        return repliesCount;
    }

    public void setRepliesCount(int repliesCount) {
        this.repliesCount = repliesCount;
    }
}
