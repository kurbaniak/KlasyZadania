package Playlist;

public class PlaylIstApp {

    public static void main(String[] args) {

        Playlist playlist = new Playlist("My favourite");
        playlist.setPlaylistType(PlaylistType.RANDOM);

        playlist.add(new Song("1 Rolling Stones", "Brown Sugar"));
        playlist.add(new Movie("2 Casablanca"));
        playlist.add(new Movie("3 Star Wars"));
        playlist.add(new Movie("4 Ojciec Chrzestny"));
        playlist.add(new Movie("5 Killer"));
        playlist.add(new Movie("6 Chyłka"));



       // playlist.play();

        Playlist secondPlaylist = new Playlist("To see");
       secondPlaylist.setPlaylistType(PlaylistType.LOOP);

        secondPlaylist.add(new Movie("Chlopaki nie płaczą"));

       // playlist.add(secondPlaylist);
        playlist.play();

    }
}
