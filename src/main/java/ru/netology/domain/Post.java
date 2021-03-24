package ru.netology.domain;

public class Post {
    private String id;
    private String postponedId;
    private boolean pinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private boolean edited;
    private String wallOwnerId;
    private String adminId;
    private String groupUserId;
    private Author author;
    private String replyOwnerId;
    private String replyPostId;
    private DateAndTime dateAndTime;
    private String postType;
    private PostSource postSource;
    private String textOfPost;
    private CommentsInfo commentsInfo;
    private Geo geo;
    private Donut donut;
    private Copyright copyright;
    private LikesCount likesCount;
    private SharesCount sharesCount;
    private ViewingsCount viewingsCount;
    private boolean onlyFriend;
    private boolean canPin;
    private boolean canEdit;
    private boolean canDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(String postponedId) {
        this.postponedId = postponedId;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public String getWallOwnerId() {
        return wallOwnerId;
    }

    public void setWallOwnerId(String wallOwnerId) {
        this.wallOwnerId = wallOwnerId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getGroupUserId() {
        return groupUserId;
    }

    public void setGroupUserId(String groupUserId) {
        this.groupUserId = groupUserId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(String replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public String getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(String replyPostId) {
        this.replyPostId = replyPostId;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public String getTextOfPost() {
        return textOfPost;
    }

    public void setTextOfPost(String textOfPost) {
        this.textOfPost = textOfPost;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
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

    public boolean isOnlyFriend() {
        return onlyFriend;
    }

    public void setOnlyFriend(boolean onlyFriend) {
        this.onlyFriend = onlyFriend;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }
}
