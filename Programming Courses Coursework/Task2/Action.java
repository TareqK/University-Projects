public class Action extends Movie{



public Action()
{

	super();
		super.Type=4;
}
public Action(String name,String Starring ,String Language , String Country, int RunningTime)
{

super(name,Starring,Language,Country,RunningTime);
	super.Type=4;

}

@Override
	public String toString()

	{
		return("Action :" +Name+ " "+ Starring+" "+RunningTime+" "+Country+" "+Language);
	}

}
