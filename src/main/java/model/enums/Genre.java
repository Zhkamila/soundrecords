package model.enums;

public enum Genre {
    CLASSICAL("Classical"),
    HIPHOP("Hip-hop"),
    INDIEROCK("Indie rock"),
    KPOP("K-pop"),
    RAP("Rap"),
    POP("Pop"),
    ROCK("Rock");

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}