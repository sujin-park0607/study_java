class Song{
	String title;
	String artist;
	int year;
	String country;
	
	Song(){
		
	}
	
	public Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year + "��" +country + "������" + artist + "�� �θ� " + title);
	}
}
public class SongTest {

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "������");
		song.show();

	}
}