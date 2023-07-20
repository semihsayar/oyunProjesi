package gameProje;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer(1, "Semih", "Sayar", LocalDate.of(2003, 1, 6));
		Game game1 = new Game(1, "God of War");
		Campaing campaing1 = new Campaing(1, "Yaz Kampanyasi");

		
		GameManager gameManager = new GameManager();
		CampaingManager campaingManager = new CampaingManager();
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		
		gameManager.add(game1);
		campaingManager.add(campaing1);
		gamerManager.add(gamer1);
		System.out.println("----------");
		gameManager.sales(game1,campaing1, gamer1);
		System.out.println("----------");
	

	}

}
