package questionTwo;

public class Venue 
{
	String id;
	int noRows;
	int noCols;
	Ticket[][] tickets;
	int numOfTickets;
	int numOfseatsOccupied;
	
	public Venue(String id)
	{
		this.id=id;
		if(id.charAt(1)=='E')
		{
			noRows=7;
			noCols=7;
			
		}
		else if(id.charAt(1)=='W')
		{
			noRows=5;
			noCols=7;
			
		}
		else if(id.charAt(1)=='N')
		{
			noRows=7;
			noCols=5;
			
		}
		else if(id.charAt(1)=='S')
		{
			noRows=9;
			noCols=9;
			
		}
		else 
		{
			System.out.println("Venue ID "+id+" is not available");
		}
		numOfTickets=noRows*noCols;
		numOfseatsOccupied=0;
		tickets=new Ticket[noRows][noCols];
		for(int i=0; i<noRows;i++)
		{
			for(int j=0; j<noCols;j++) 
			{
				tickets[i][j]=new Ticket(i,j, false);
			}
		}
	}
	public String getId()
	{
		return id;
	}
	public int getNoRows()
	{
		return noRows;
	}
	public int getNoCols()
	{
		return noCols;
	}
	public void bookASeat(int rowIdx, int seatNo) 
	{
		 Ticket ticketBook= tickets[rowIdx][seatNo-1];
		 ticketBook.setIsOccupied(true);
		 numOfseatsOccupied++;
		 System.out.println("Seat "+ticketBook+" is booked!");
		
	}
	public boolean checkOccupied(int rowIdx, int seatNo)
	{
		return tickets[rowIdx][seatNo-1].getIsOccupied();
	}
	public String seatVenueDisplay()
	{
		String showSeats="";
		for(Ticket[] ticketLoop:tickets)
		{
			for(Ticket t: ticketLoop)
			{
				if(t.getIsOccupied())
				{
					showSeats+=" {++} ";//special feature: displaying booked seats
				}
				else
				{
					showSeats+=" {"+t.getRowLetter()+t.getSeatNo()+"} ";
				}
			}
			showSeats += "\n";
		}
		return showSeats;
	}
	public boolean checkifVenueisFull()
	{
		if(numOfseatsOccupied==numOfTickets)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	// Note: this static method is given
	// Converts row letter (char) to index number (int)
	public static int rowLetter2Idx(char letter) 
	{
		return (int) (letter) - 65;
	}

	// Note: this static method is given
	// Converts index number (int) to row letter (char)
	public static char rowIndex2Letter(int idx) 
	{
		return (char) (idx + 'A');
	}
	public String toString()
	{
		return getId();
	}
}