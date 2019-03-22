import java.util.ArrayList;
import java.util.List;

public class Trip {
	private ArrayList<Flight> flights = new ArrayList<Flight>();
	Flight flight1 = new Flight(1, 2);
	Flight flight2 = new Flight(3, 4);
	Flight flight3 = new Flight(4, 6);
	Flight flight4 = new Flight(7, 10);
	
	public Trip() {
		
	}

	public int getDuration() {
		return 0;
		

	}

	public int getShortestLayover() {
		if (flights.size()< 2) {
			return -1;
		}
		else {
			int smallestDiff = flights.get(1).getArrivalTime().minutesUntil(flights.get(2).getDeparturetime());
			for (int i=1; i<flights.size()-2; i++) {
				if (flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDeparturetime()) < smallestDiff) {
					smallestDiff = flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDeparturetime());
				}
			}
			return smallestDiff;
		}
	}
}
