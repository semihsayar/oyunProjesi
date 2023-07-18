package Concrete;

import Abstract.GameService;
import Entity.Campaing;
import Entity.Game;
import Entity.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getAd());
		
	}

	@Override
	public void sales(Game game,Campaing campaing, Gamer gamer) {
		System.out.println("SATIS BASARILI \n" + "Oyun ismi: "  + game.getAd() + "\nKampanya ismi: " +  campaing.getAd() +  "\nKullanici ismi: " +  gamer.getAd());
		
	}

}
