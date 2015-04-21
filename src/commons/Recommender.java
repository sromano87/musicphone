package commons;


import java.util.List;

import commons.dataClasses.Destination;
import commons.dataClasses.Recommendation;
import commons.interfaces.IConnector;
import commons.interfaces.IGps;
import commons.interfaces.IPlayer;
import commons.interfaces.IRecommender;




public class Recommender implements IRecommender {
	
	private IConnector connector;
	
	public Recommender(IConnector connector) {
		this.connector = connector;
	}
	
	public Recommender(){
		this.connector = null;
	}

	@Override
	public IConnector getConnector() {
		return this.connector;
	}

	@Override
	public void setConnector(IConnector connector) {
		this.connector = connector;

	}

	@Override
	public List<Recommendation> getRecommendations() throws Exception {
		List<Recommendation> results = null;

		return results;
	}

	@Override
	public List<Destination> getDestinationsForArtists(String artist) {
		try {
			throw new SQATException("You need to implement this!");
		} catch (SQATException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Destination> buildItineraryForArtists(List<String> artists) throws SQATException  {
		throw new SQATException("You need to implement this!");
	}
	
	public  IPlayer getPlayer(){
		return DeviceManager.getInstance().getPlayer();
	}
	
	public  IGps getGps(){
		return DeviceManager.getInstance().getGps();
	}

}
