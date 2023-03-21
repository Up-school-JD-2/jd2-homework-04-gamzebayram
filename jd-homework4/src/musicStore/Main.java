package musicStore;

public class Main {

	public static void main(String[] args) {
		
		Album album = new Album("Endless Summer Vacation", "Miley Cyrus", "10.03.2023", 200);
        Album album2 = new Album("Tragic Kingdom", "No Doubt", "10.10.1995", 100);
        Album album3 = new Album("Gangsta's Paradise", "Coolio", "01.09.1995", 170);
        Album album4 = new Album("The Marshall Mathers LP", "Eminem", "23.05.2000", 100);

        Song song = new Song("Flowers", album, "3:21", 20);
        Song song2 = new Song("Don't Speak", album2, "5:00", 10);
        Song song3 = new Song("Gangsta's Paradise", album3, "4:14", 20);
        Song song4 = new Song("Stan", album4, "8:08", 15);
        Song song5 = new Song("The Real Slim Shady", album4, "4:28", 10);

        User user = new User("Ahmet","ahmetgltkn@","Ankara");
        User user2 = new User("Asım","asımkilic@","Antalya");
        User user3 = new User("Gamze","gamzebayram@","İstanbul");

        SongStoreSystem songStoreSystem = new SongStoreSystem();
        
        songStoreSystem.addSong(song);
        songStoreSystem.addSong(song2);
        songStoreSystem.addSong(song3);
        songStoreSystem.addSong(song4);
        songStoreSystem.addSong(song5);
        
        songStoreSystem.removeSong(song2);
        songStoreSystem.removeSong(song5);
        
        songStoreSystem.addAlbum(album);
        songStoreSystem.addAlbum(album2);
        songStoreSystem.addAlbum(album3);
        songStoreSystem.addAlbum(album4);
        
        songStoreSystem.removeAlbum(album3);
        
        songStoreSystem.addUser(user);
        songStoreSystem.addUser(user2);
        songStoreSystem.addUser(user3);   
        
        songStoreSystem.removeUser(user2);
                
        songStoreSystem.listSongs();
        
        songStoreSystem.searchSongs(song2);

        songStoreSystem.listAlbums();
        
        songStoreSystem.searchAlbums(album4);
        
        songStoreSystem.listUsers();
        

	}

}
