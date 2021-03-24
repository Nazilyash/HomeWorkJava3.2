package ru.netology.domain;

public class Post {
    private String id;
    private boolean pinned;
    private Author author;
    private DateAndTime dateAndTime;
    private String textOfPost;
    private AttachmentsInfo attachmentsInfo;
    private LikesCount likesCount;
    private SharesCount sharesCount;
    private ViewingsCount  viewingsCount;
    private boolean registeredUser;
    private boolean blockedUser;
    private boolean onlyFriend;
    private boolean edited;
    private CommentsInfo commentsInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
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

    public String getTextOfPost() {
        return textOfPost;
    }

    public void setTextOfPost(String textOfPost) {
        this.textOfPost = textOfPost;
    }

    public AttachmentsInfo getAttachmentsInfo() {
        return attachmentsInfo;
    }

    public void setAttachmentsInfo(AttachmentsInfo attachmentsInfo) {
        this.attachmentsInfo = attachmentsInfo;
    }

    public LikesCount getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(LikesCount likesCount) {
        this.likesCount = likesCount;
    }

    public SharesCount getSharesCount() {
        return sharesCount;
    }

    public void setSharesCount(SharesCount sharesCount) {
        this.sharesCount = sharesCount;
    }

    public ViewingsCount getViewingsCount() {
        return viewingsCount;
    }

    public void setViewingsCount(ViewingsCount viewingsCount) {
        this.viewingsCount = viewingsCount;
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

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}
