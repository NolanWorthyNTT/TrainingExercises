import java.util.List;

public class AlbumDetails {
	private int id;
	private String title;
	private String artist;
	private double price;
	
	public AlbumDetails(int id, String title, String artist, double price) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public static List<AlbumDetails> searchAlbum(List<AlbumDetails> details, double limit) throws AlbumNotFoundException {
		List<AlbumDetails> result = details.stream()
				.filter(a -> a.getPrice() < limit)
				.toList();
		if(result.isEmpty()) {
			throw new AlbumNotFoundException("No albums found in price range: less than " + limit);
		} else {
			return result;
		}
	}
	
	@Override
	public String toString() {
		return "ID: " + id
						+ "\nTitle: " + title
						+ "\nArtist: " + artist
						+ "\nPrice: " + price + "\n";
	}
}
