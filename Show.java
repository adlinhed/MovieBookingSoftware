package questionTwo;

public class Show 
{
	Film filmName;
	Venue venueID;
	
	public Show(String venueID, Film filmName)
	{
		this.filmName=filmName;
		this.venueID=new Venue(venueID);
	}
	public void buyTicket(char row, int seatNo)
	{
		int rowIdx=Venue.rowLetter2Idx(row);
		venueID.bookASeat(rowIdx, seatNo);
		
	}
	public boolean seatCheckAvailability(char row, int seatNo)
	{
		int rowIdx=Venue.rowIndex2Letter(row);
		return venueID.checkOccupied(rowIdx, seatNo);
	}
	public void printHall()
	{
		System.out.println("VENUE: "+venueID.getId());
		System.out.println(venueID.seatVenueDisplay());
	}
	public void printAvailability()
	{
		if(venueID.checkifVenueisFull()) 
		{
			System.out.println("Venue "+ venueID.getId()+" is full");
		}
		else
		{
			System.out.println("Seats in the venue "+venueID.getId()+" are still available.");
		}
		
	}
	public String locationInfo()
	{
		return "ID: "+venueID.getId()+"\n"+filmName.toString();
	}
	public String toString()
	{
		return venueID.toString();
	}

}