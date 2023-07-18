package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entity.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {

		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Oyuncu eklendi: " + gamer.getAd());
		} else {
			System.out.println("Oyuncu dogrulanamadi");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi: " + gamer.getAd());

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu guncellendi: " + gamer.getAd());

	}

}
