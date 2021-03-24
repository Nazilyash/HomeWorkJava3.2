package ru.netology.domain;

public class CommentsInfo {
    private String id;
    private Author author;
    private DateAndTime dateAndTime;
    private boolean edited;
    private String textOfComment;
    private AttachmentsInfo attachmentsInfo;
    private ReplyToComment repliesToComment;
    private int commentCount;
    private LikesCount likesCount;
    private boolean registeredUser;
    private boolean blockedUser;
    private boolean onlyFriend;

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

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public String getTextOfComment() {
        return textOfComment;
    }

    public void setTextOfComment(String textOfComment) {
        this.textOfComment = textOfComment;
    }

    public AttachmentsInfo getAttachmentsInfo() {
        return attachmentsInfo;
    }

    public void setAttachmentsInfo(AttachmentsInfo attachmentsInfo) {
        this.attachmentsInfo = attachmentsInfo;
    }

    public ReplyToComment getRepliesToComment() {
        return repliesToComment;
    }

    public void setRepliesToComment(ReplyToComment repliesToComment) {
        this.repliesToComment = repliesToComment;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public LikesCount getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(LikesCount likesCount) {
        this.likesCount = likesCount;
    }

    public boolean isRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(boolean registeredUser) {
        this.registeredUser = registeredUser;
    }

    public boolean isBlockedUser() {
        return blockedUser;
    }

    public void setBlockedUser(boolean blockedUser) {
        this.blockedUser = blockedUser;
    }

    public boolean isOnlyFriend() {
        return onlyFriend;
    }

    public void setOnlyFriend(boolean onlyFriend) {
        this.onlyFriend = onlyFriend;
    }
}
