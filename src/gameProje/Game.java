package gameProje;

public class Game implements Entity {

	private int id;
	private String ad;

	public Game() {

	}

	public Game(int id, String ad) {
		this();
		this.id = id;
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

}
