package ru.netology.domain.attachment.video;

import ru.netology.domain.DateAndTime;
import ru.netology.domain.LikesCount;
import ru.netology.domain.SharesCount;
import ru.netology.domain.ViewingsCount;

public class Video {
    private String id;
    private String type;
    private String ownerId;
    private String userId;
    private String title;
    private String description;
    private int duration;
    private int width;
    private int height;
    private CoverImage[] coverImages;
    private FirstFrame[] firstFrames;
    private String playerLink;
    private String platformNameOfExternalVideo;
    private int dateOfCreating;
    private DateAndTime dateAndTime;
    private int allViewingsCount;
    private ViewingsCount viewingsCount;
    private int commentCount;
    private boolean canAddToAlbum;
    private boolean canLike;
    private boolean canSubscribe;
    private boolean canAddToFaves;
    private boolean canComment;
    private boolean canShare;
    private boolean canEdit;
    private boolean canAttachLink;
    private boolean processing;
    private boolean converting;
    private boolean repeat;
    private String liveStatus;
    private boolean live;
    private boolean upcoming;
    private boolean isPrivate;
    private String accessKey;
    private boolean isFavorite;
    private boolean addedToAlbum;
    private boolean isSubscribed;
    private int DonutBalance;
    private int spectatorCount;
    private LikesCount likesCount;
    private SharesCount sharesCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public CoverImage[] getCoverImages() {
        return coverImages;
    }

    public void setCoverImages(CoverImage[] coverImages) {
        this.coverImages = coverImages;
    }

    public FirstFrame[] getFirstFrames() {
        return firstFrames;
    }

    public void setFirstFrames(FirstFrame[] firstFrames) {
        this.firstFrames = firstFrames;
    }

    public String getPlayerLink() {
        return playerLink;
    }

    public void setPlayerLink(String playerLink) {
        this.playerLink = playerLink;
    }

    public String getPlatformNameOfExternalVideo() {
        return platformNameOfExternalVideo;
    }

    public void setPlatformNameOfExternalVideo(String platformNameOfExternalVideo) {
        this.platformNameOfExternalVideo = platformNameOfExternalVideo;
    }

    public int getDateOfCreating() {
        return dateOfCreating;
    }

    public void setDateOfCreating(int dateOfCreating) {
        this.dateOfCreating = dateOfCreating;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public int getAllViewingsCount() {
        return allViewingsCount;
    }

    public void setAllViewingsCount(int allViewingsCount) {
        this.allViewingsCount = allViewingsCount;
    }

    public ViewingsCount getViewingsCount() {
        return viewingsCount;
    }

    public void setViewingsCount(ViewingsCount viewingsCount) {
        this.viewingsCount = viewingsCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isCanAddToAlbum() {
        return canAddToAlbum;
    }

    public void setCanAddToAlbum(boolean canAddToAlbum) {
        this.canAddToAlbum = canAddToAlbum;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(boolean canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public boolean isCanAddToFaves() {
        return canAddToFaves;
    }

    public void setCanAddToFaves(boolean canAddToFaves) {
        this.canAddToFaves = canAddToFaves;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanAttachLink() {
        return canAttachLink;
    }

    public void setCanAttachLink(boolean canAttachLink) {
        this.canAttachLink = canAttachLink;
    }

    public boolean isProcessing() {
        return processing;
    }

    public void setProcessing(boolean processing) {
        this.processing = processing;
    }

    public boolean isConverting() {
        return converting;
    }

    public void setConverting(boolean converting) {
        this.converting = converting;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isAddedToAlbum() {
        return addedToAlbum;
    }

    public void setAddedToAlbum(boolean addedToAlbum) {
        this.addedToAlbum = addedToAlbum;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public int getDonutBalance() {
        return DonutBalance;
    }

    public void setDonutBalance(int donutBalance) {
        DonutBalance = donutBalance;
    }

    public int getSpectatorCount() {
        return spectatorCount;
    }

    public void setSpectatorCount(int spectatorCount) {
        this.spectatorCount = spectatorCount;
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
}
