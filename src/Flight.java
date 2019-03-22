
public class Flight {
	private Time departureTime;
	private Time arrivalTime;
	
	public Flight(int departure, int arrival) {
		Time time = new Time(departure, 0);
	}
	
	public Time getDeparturetime() {
		return departureTime;
	}
	
	public Time getArrivalTime() {
		return arrivalTime;
	}
}
