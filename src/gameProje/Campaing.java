package gameProje;

public class Campaing implements Entity {
	private int id;
	private String ad;

	public Campaing() {

	}

	public Campaing(int id, String ad) {
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

	public void setAd(String name) {
		this.ad = name;
	}

}
