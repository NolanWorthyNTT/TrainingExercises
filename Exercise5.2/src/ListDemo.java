import java.util.Arrays;
import java.util.List;

public class ListDemo {
	// initializes a list and returns it to be used for testing
	public static List<AlbumDetails> retrieveAlbums() {
		List<AlbumDetails> albums = Arrays.asList(new AlbumDetails(1, "Thriller", "Michael Jackson", 19.99),
													new AlbumDetails(2, "Back in Black", "AC/DC", 15.00),
													new AlbumDetails(3, "The Bodyguard", "Whitney Houston", 10.00),
													new AlbumDetails(4, "Greatest Hits", "The Eagles", 20.00),
													new AlbumDetails(5, "The Dark Side of the Moon", "Pink Floyd", 12.99));
		return albums;
	}
}
