package questionTwo;

public class Ticket 
{
	char rowLetter;
	int seatNo;
	boolean isOccupied;
	
	public Ticket(int rowIdx, int colIdx, boolean isOccupied)
	{
		char[] rowElement= {'A','B','C','D','E', 'F', 'G','H','I'};
		this.seatNo=colIdx;
		this.rowLetter=rowElement[rowIdx];
		this.isOccupied=isOccupied;
	}
	public char getRowLetter()
	{
		return rowLetter;
	}
	public int getSeatNo()
	{
		return seatNo;
	}
	public boolean getIsOccupied()
	{
		return isOccupied;
	}
	public void setIsOccupied(boolean isOccupied)
	{
		this.isOccupied=isOccupied;
	}
	public String toString()
	{
		return " is selected for seat number "+getRowLetter()+getSeatNo();
		
	}
	

}