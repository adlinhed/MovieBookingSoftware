package questionTwo;

import java.util.Scanner;

/**
 * F28PA | Software Development A | Coursework
 * 
 * The Coursework specification is provided in Canvas. Please read through it in
 * full before you start work.
 * 
 * @author NUR ADLIN FADHLINA BINTI HEDILIYSAM
 */
public class BookingSoft {
	public static void main(String[] args) throws InterruptedException {
		// There are currently 6 shows offered in 6 different venues.
		Show[] shows = new Show[6];

		// Uncomment lines 17 to 22 once the constructors have been written.
		shows[0] = new Show("1N", new Film("SING", 1));
		shows[1] = new Show("2W", new Film("THE GRINCH", 2));
		shows[2] = new Show("3E", new Film("BOSS BABY", 3));
		shows[3] = new Show("3S", new Film("YES DAY", 3));
		shows[4] = new Show("1E", new Film("THE KARATE KID", 1));
		shows[5] = new Show("2N", new Film("THE SEA BEAST", 2));
		System.out.println("### Welcome to the Booking System ###\n");
		// DO NOT CHANGE THE ABOVE PART OF THE CODE.
		///////////////////////////////////////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < shows.length; i++) 
		{
			System.out.println(shows[i].locationInfo());
			System.out.println();
		}
		System.out.println("Would you like to buy a ticket? Type in yes or no.");
		while (true) //special feature: option to buy the ticket
		{
			int num=0;
			String yesOrNo=input.next();
			if(yesOrNo.equalsIgnoreCase("yes"))
			{
			while (true) 
			{
				System.out.println("Enter the show ID: ");
				String showID = input.next();
				
				try //Exception Handling
				{
					for (Show show : shows) 
					{
						if (showID.equalsIgnoreCase(show.toString())) 
						{
								Show wantedShow = show;
								wantedShow.printHall();
								wantedShow.printAvailability();


								System.out.println("Which seat would you like to book? " + "Enter the seat number of your choice");

								String selectedSeat = input.next();
								
								int seatNum = Character.getNumericValue(selectedSeat.charAt(1));
								

								if (wantedShow.seatCheckAvailability(selectedSeat.charAt(0), seatNum) == true)
								{
									System.out.println("Seat unavailable");
								}
								else {
									System.out.println("Seat is booked");
									wantedShow.buyTicket(selectedSeat.charAt(0), seatNum);
								}
						}
					}
				
				}
				catch(Exception e) 
				{
					System.out.println("ERROR");
				}
			}
			}
			else
			{
				System.out.println("Thank you for visiting our booking software :)");
				break;
			}
			
		}
	}
	//source:(w3school)
	//source:(stackoverflow)
}
