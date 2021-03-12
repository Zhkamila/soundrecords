import model.Album;
import model.Artist;
import model.Song;
import model.enums.AlbumType;
import model.enums.Genre;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Artist artist = new Artist("Marshall", "Mathers", "Eminem", 1972, "Missouri", "Aftermath");
        Song song = new Song("Lose yourself", artist, 5, Genre.HIPHOP, 2002);
        List<Song> songs = new ArrayList<>();
        songs.add(song);
        Album album = new Album("Lose Yourself", songs, 2002, AlbumType.SINGLE);
        System.out.println(album.toString());
    }
}
