package ru.netology.domain.attachment;

import ru.netology.domain.Author;
import ru.netology.domain.DateAndTime;
import ru.netology.domain.ViewingsCount;

public class WikiPage {
    private String id;
    private String groupId;
    private Author author;
    private int lastEditorId;
    private String title;
    private String parentName;
    private String parent2Name;
    private String textWiki;
    private String textHtml;
    private String link;
    private int editedDate;
    private DateAndTime dateAndTime;
    private ViewingsCount viewingsCount;
    private boolean canEdit;
    private boolean canEditAccess;
    private String whoCanView;
    private boolean whoCanEdit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getLastEditorId() {
        return lastEditorId;
    }

    public void setLastEditorId(int lastEditorId) {
        this.lastEditorId = lastEditorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParent2Name() {
        return parent2Name;
    }

    public void setParent2Name(String parent2Name) {
        this.parent2Name = parent2Name;
    }

    public String getTextWiki() {
        return textWiki;
    }

    public void setTextWiki(String textWiki) {
        this.textWiki = textWiki;
    }

    public String getTextHtml() {
        return textHtml;
    }

    public void setTextHtml(String textHtml) {
        this.textHtml = textHtml;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getEditedDate() {
        return editedDate;
    }

    public void setEditedDate(int editedDate) {
        this.editedDate = editedDate;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public ViewingsCount getViewingsCount() {
        return viewingsCount;
    }

    public void setViewingsCount(ViewingsCount viewingsCount) {
        this.viewingsCount = viewingsCount;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanEditAccess() {
        return canEditAccess;
    }

    public void setCanEditAccess(boolean canEditAccess) {
        this.canEditAccess = canEditAccess;
    }

    public String getWhoCanView() {
        return whoCanView;
    }

    public void setWhoCanView(String whoCanView) {
        this.whoCanView = whoCanView;
    }

    public boolean isWhoCanEdit() {
        return whoCanEdit;
    }

    public void setWhoCanEdit(boolean whoCanEdit) {
        this.whoCanEdit = whoCanEdit;
    }
}
