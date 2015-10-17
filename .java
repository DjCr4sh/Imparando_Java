

class Computer {
	
	double costo;
	boolean on_off;
	
	
	public Computer (double c, boolean d){
		
		
		costo=c;
		on_off=d;
		
		
	}
	//Metodi
	
	public double GetCosto(){
		
		return costo;
		
	}
	
	//Metodi
	
	public void SetCosto(double c){
		
		costo=c;
		
	}
    public boolean GetOnOff(){
		
		return on_off;
		
	}
    
    public void SetOnOff (boolean d){
		
		on_off=d;
		
		
		
	}
    
	}


public class verifica {
	
	public static void main (String args[]) {
		Computer a;
		Computer b;
		double l1,l2;
		a=new Computer(321.2,false);
		b=new Computer(638.7,false);
		
		a.GetOnOff();
		a.GetCosto();
		System.out.println("Il computer costa: "+a.GetCosto());
		System.out.println("Il pc è  :"+a.GetOnOff());
		
		a.SetOnOff(true);
		a.SetCosto(212.3);
		System.out.println("Abbiamo scontato il pc adesso costa :"+a.GetCosto());
		System.out.println("Il pc è  :"+a.GetOnOff());
		
		l1=a.GetCosto();
		l2=b.GetCosto();
		
		if (l1 > l2){
			
			
			System.out.println("Il computer a costa di piu'");
			
			
			
			}
		
		   else {
			
			
			   System.out.println("Il computer b costa di piu'");
			
			
			   }
		
	}
}

