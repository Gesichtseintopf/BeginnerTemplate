package local;

public class SwitchGen {
//20232305
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean cmd = false;
		try {
			if(args[0].equals("c"))cmd=true;	
		}
		catch(Exception e) {
			
		}
		
		Logic lo = new Logic(cmd);			
		lo.start();
		
	}

}

/*
 * Bei den Sachen die ich alle Brauch mal gucken wie es läuft.
 * 
 * -CSV lesen
 * 
 * -TEXT ausgeben
 * 
 * Den Switch-Block schneiden in drei Teile; Kopf-Case-default.
 * 
 * 
 */
