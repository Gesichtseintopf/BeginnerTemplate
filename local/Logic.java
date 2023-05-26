package local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logic {
//20232305
	
	Logic(){
		
	}
	
	
	boolean b = false;	
	
	Logic(boolean b){
		
		this.b=b;
		
		if(b==true) {
			
			SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
		    String timeStamp = date.format(new Date());
			
		    Ini ini = new Ini();
		    System.out.print(ini.getNumber()+ ": ");
		    
		    System.out.println("Mockup: Logic-"+timeStamp);
		}
	}

	
	
	void start() {
		
		
		Model mo = new Model(b);
		UserInterface ui = new UserInterface(b);
		
		mo.setModel();
		mo.getModel();
		ui.getData();
		ui.printData();
		
	}
	
	
}
