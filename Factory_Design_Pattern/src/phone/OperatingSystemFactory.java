package phone;

//the class which gives an Object, this is called Factory Design Pattern

public class OperatingSystemFactory	//Class
{
	public OS getInstance(String str)
	{
		if(str.equals("open"))
			return new Android();
		else if(str.equals("close"))
			return new IOS();
		else
			return new Windows();
	}
}