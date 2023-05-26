package local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInterface {
//20232605-1749
	
	UserInterface(){
		
	}
	
	
	boolean b=false;
	
	UserInterface(boolean b){
		
		this.b=b;
		
		if(b==true) {
		
			SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
		    String timeStamp = date.format(new Date());
		    
		    Ini ini = new Ini();
		    System.out.print(ini.getNumber()+ ": ");
		    
			System.out.println("Mockup: UserInterface-"+timeStamp);
		}	
	}
	
	
	
	
	void getData() {
		
		if(b==true)System.out.println("Get Data: Eingabewerte CSV");
	}
	
	void printData() {
		if(b==true)System.out.println("Ausgabe der Daten in .txt");
	}
	
}
