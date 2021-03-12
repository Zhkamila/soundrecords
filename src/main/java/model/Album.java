package model;

import model.enums.AlbumType;

import java.util.List;

public class Album {
    private String title;
    private List<Song> songs;
    private int releaseYear;
    private AlbumType type;

    public Album(String title, List<Song> songs, int releaseYear, AlbumType type) {
        this.title = title;
        this.songs = songs;
        this.releaseYear = releaseYear;
        this.type = type;
    }

    public Album(String title, int releaseYear, AlbumType type) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public AlbumType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                ", releaseYear=" + releaseYear +
                ", type=" + type +
                '}';
    }
}
