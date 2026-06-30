import java.util.LinkedList;

class MusicPlaylist {

    private LinkedList<String> recentlyPlayed;

    public MusicPlaylist() {
        recentlyPlayed = new LinkedList<>();
    }

    // Play a song
    public void playSong(String song) {

        // Add song at the beginning
        recentlyPlayed.addFirst(song);

        // Keep only latest 10 songs
        if (recentlyPlayed.size() > 10) {
            String removedSong = recentlyPlayed.removeLast();
            System.out.println("Removed oldest song: " + removedSong);
        }

        System.out.println(song + " is now playing.");
    }

    // Search for a song
    public void searchSong(String song) {
        if (recentlyPlayed.contains(song)) {
            System.out.println(song + " is present in Recently Played.");
        } else {
            System.out.println(song + " is not found in Recently Played.");
        }
    }

    // Display recently played songs
    public void displayRecentlyPlayed() {

        System.out.println("\nRecently Played Songs:");

        if (recentlyPlayed.isEmpty()) {
            System.out.println("No songs played yet.");
            return;
        }

        for (String song : recentlyPlayed) {
            System.out.println(song);
        }
    }
}

public class Music {
    public static void main(String[] args) {

        MusicPlaylist playlist = new MusicPlaylist();

        // Play songs
        playlist.playSong("Shape of You");
        playlist.playSong("Believer");
        playlist.playSong("Perfect");
        playlist.playSong("Senorita");
        playlist.playSong("Levitating");
        playlist.playSong("Blinding Lights");
        playlist.playSong("Closer");
        playlist.playSong("Attention");
        playlist.playSong("Thunder");
        playlist.playSong("Faded");
        playlist.playSong("Hymn for the Weekend"); // Removes oldest

        // Search songs
        playlist.searchSong("Believer");
        playlist.searchSong("Shape of You");

        // Display playlist
        playlist.displayRecentlyPlayed();
    }
}