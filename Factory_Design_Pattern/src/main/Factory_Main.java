package main;

import phone.Android;
import phone.OS;
import phone.OperatingSystemFactory;

//Even you have extra class in Future, it will not change your client Application, it will change the class

public class Factory_Main	//Client Application
{
	public static void main(String[] args)
	{
		//OS obj = new Android();
		//obj.spec();
		
		OperatingSystemFactory obj1 = new OperatingSystemFactory();
		OS res1 = obj1.getInstance("open");
		res1.spec();
		
		OperatingSystemFactory obj2 = new OperatingSystemFactory();
		OS res2 = obj2.getInstance("close");
		res2.spec();
		
		OperatingSystemFactory obj3 = new OperatingSystemFactory();
		OS res3 = obj3.getInstance("default");
		res3.spec();
	}
}