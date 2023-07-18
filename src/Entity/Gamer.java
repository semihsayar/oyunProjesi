package Entity;

import java.time.LocalDate;

import Abstract.Entity;

public class Gamer implements Entity {

	private int id;
	private String ad;
	private String soyad;
	private LocalDate dogumYili;
	
	public Gamer() {
		
	}

	public Gamer(int id, String ad, String soyad, LocalDate dogumYili) {
		this();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumYili = dogumYili;
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

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public LocalDate getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(LocalDate dogumYili) {
		this.dogumYili = dogumYili;
	}

}
