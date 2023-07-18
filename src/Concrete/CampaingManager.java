package Concrete;

import Abstract.CampaingService;
import Entity.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		System.out.println("Kampanya eklendi: " + campaing.getAd());
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println("Kampanya silindi: " + campaing.getAd());
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println("Kampanya guncellendi: " + campaing.getAd());
		
	}



}
