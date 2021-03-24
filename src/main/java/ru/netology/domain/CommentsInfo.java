package ru.netology.domain;

public class CommentsInfo {
    private String id;
    private Author author;
    private DateAndTime dateAndTime;
    private boolean edited;
    private String textOfComment;
    private ReplyToComment repliesToComment;
    private int commentCount;
    private LikesCount likesCount;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
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

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public boolean isOnlyFriend() {
        return onlyFriend;
    }

    public void setOnlyFriend(boolean onlyFriend) {
        this.onlyFriend = onlyFriend;
    }
}
