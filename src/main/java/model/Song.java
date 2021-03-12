package model;

import model.enums.Genre;

public class Song {
    private String title;
    private Artist artist;
    private int length;
    private Genre genre;
    private int releaseYear;

    public Song(String title, Artist artist, int length, Genre genre, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public Song(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist=" + artist +
                ", length=" + length +
                ", genre=" + genre +
                ", releaseYear=" + releaseYear +
                '}';
    }


}
