package ru.netology.domain.attachment.poll;

import ru.netology.domain.Author;
import ru.netology.domain.DateAndTime;
import ru.netology.domain.attachment.Photo;

public class Poll {
    private String id;
    private String ownerId;
    private Author author;
    private int[] friendsIds;
    private DateAndTime dateAndTime;
    private int endDate;
    private String question;
    private int votesInfo;
    private AnswerInfo[] answersInfo;
    private UserAnswersId[] UserAnswersIds;
    private Photo photo;
    private Background background;
    private boolean multiple;
    private boolean anonymous;
    private boolean isBoard;
    private boolean closed;
    private boolean canEdit;
    private boolean canVote;
    private boolean canReport;
    private boolean canShare;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int[] getFriendsIds() {
        return friendsIds;
    }

    public void setFriendsIds(int[] friendsIds) {
        this.friendsIds = friendsIds;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getVotesInfo() {
        return votesInfo;
    }

    public void setVotesInfo(int votesInfo) {
        this.votesInfo = votesInfo;
    }

    public AnswerInfo[] getAnswersInfo() {
        return answersInfo;
    }

    public void setAnswersInfo(AnswerInfo[] answersInfo) {
        this.answersInfo = answersInfo;
    }

    public UserAnswersId[] getUserAnswersIds() {
        return UserAnswersIds;
    }

    public void setUserAnswersIds(UserAnswersId[] userAnswersIds) {
        UserAnswersIds = userAnswersIds;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public boolean isBoard() {
        return isBoard;
    }

    public void setBoard(boolean board) {
        isBoard = board;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanVote() {
        return canVote;
    }

    public void setCanVote(boolean canVote) {
        this.canVote = canVote;
    }

    public boolean isCanReport() {
        return canReport;
    }

    public void setCanReport(boolean canReport) {
        this.canReport = canReport;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }
}
