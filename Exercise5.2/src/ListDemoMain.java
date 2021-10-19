import java.util.List;

public class ListDemoMain {

	public static void main(String[] args) {
		List<AlbumDetails> albums = ListDemo.retrieveAlbums();
		System.out.println(albums);
		
		try {
			List<AlbumDetails> found = AlbumDetails.searchAlbum(albums, 18);
			System.out.println(found);
		} catch (AlbumNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
