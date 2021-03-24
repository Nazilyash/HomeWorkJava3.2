package ru.netology.domain.attachment;

import ru.netology.domain.DateAndTime;

public class Audio {
    private String id;
    private String ownerId;
    private String artist;
    private String title;
    private String genreId;
    private String lyricsId;
    private String albumId;
    private int duration;
    private String link;
    private DateAndTime dateAndTime;
    private boolean noSearch;
    private boolean isHq;

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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenreId() {
        return genreId;
    }

    public void setGenreId(String genreId) {
        this.genreId = genreId;
    }

    public String getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(String lyricsId) {
        this.lyricsId = lyricsId;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public boolean isNoSearch() {
        return noSearch;
    }

    public void setNoSearch(boolean noSearch) {
        this.noSearch = noSearch;
    }

    public boolean isHq() {
        return isHq;
    }

    public void setHq(boolean hq) {
        isHq = hq;
    }
}
