package local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Model {
//20232305
	
	
	Model(){
		
	}
	
	boolean b=false;
	
	Model(boolean b){
		
		this.b=b;
		
		if(b==true) {
				
			SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
		    String timeStamp = date.format(new Date());
			
		    Ini ini = new Ini();
		    System.out.print(ini.getNumber()+ ": ");
		    
		    System.out.println("Mockup: Model-"+ timeStamp);
		}		
	}
	
	
	
	void setModel() {
		if(b==true)System.out.println("Set Model");
	}
	
	
	
	void getModel() {	
		if(b==true)System.out.println("Get Model");
	}
	
	
}
