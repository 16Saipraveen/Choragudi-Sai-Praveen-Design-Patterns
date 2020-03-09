package com.praveen.epam_design_patterns;
import com.praveen.TemplatePattern.*;
import com.praveen.SingletonPattern.*;
import com.praveen.AdapterPattern.*;
import com.praveen.CommandPattern.*;
import com.praveen.PrototypePattern.*;
import com.praveen.BridgePattern.*;

public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
		TemplatePatternDemo t = new TemplatePatternDemo();
		DriverSingleton s = new DriverSingleton();
		DriverAdapter a = new DriverAdapter();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		DriverPrototype p = new DriverPrototype();
    }
}
