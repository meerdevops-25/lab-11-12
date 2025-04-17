public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Wishes", "Abdul Hannan"));
        playlist.addSong(new Song("Pasoori", "Ali Sethi & Shae Gill"));
        playlist.addSong(new Song("Blockbuster", "Young Stunners ft. Talhah Yunus & Talha Anjum"));

        System.out.println("Forward Iteration:");
        SongIterator forwardIterator = playlist.iterator();
        while (forwardIterator.hasNext()) {
            Song song = forwardIterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

        System.out.println("\nReverse Iteration:");
        SongIterator reverseIterator = playlist.reverseIterator();
        while (reverseIterator.hasNext()) {
            Song song = reverseIterator.next();
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
    }
}
