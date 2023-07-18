package Abstract;

import Entity.Campaing;
import Entity.Game;
import Entity.Gamer;

public interface GameService {

	void add(Game game);
	void sales(Game game,Campaing campaing,Gamer gamer);
	
}
