package questionTwo;
public class Film 
{
	String filmTitle;
	int sessionTime;
	
	
	public Film(String title, int sessionTime)
	{
		this.filmTitle=title;
		this.sessionTime=sessionTime;
	}
	public String getSession()
	{
		String showTime="";
		if(sessionTime==1)
		{
			return showTime+="Afternoon (1 PM)";
		}
		else if(sessionTime==2)
		{
			return showTime+="Evening (5 PM)";
		}
		else if(sessionTime==3)
		{
			return showTime+="Night (9 PM)";
		}
		else
		{
			return "Show time is not available";
		}
	}
	public String getTitle()
	{
		return filmTitle;
	}
	public String toString()
	{
		return "Title of the film: "+getTitle()+"\nShow Time: "+getSession();
	}
	
}