package basicJavaPractice;

public class switchnestedclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char branch='c';
		
	    int collegeyear =4;
	    switch (collegeyear) {
	    case 1:
	    	System.out.println("English,math,science");
	    	break;
	    case 2:
	    	switch (branch) {
	    	case 'c':
	    		System.out.println("operating system,java data structure");
	    		break;
	    	case 'E':
	    		System.out.println("microprocessor,logic switching theory");
	    		break;
	    	case 'M':
	    		System.out.println("drawing,manufacturing,machines");
	    		break;}
	    	break;
	    case 3:
	    	switch (branch) {
	    	case 'c':
	    		System.out.println("computer,organization,multimedia");
	    		break;
	    	case 'E':
	    		System.out.println ("fundamentals of logic design,microelectronics");
	    		break;
	    	case 'M':
	    		System.out.println ("Internal combustion engines,mechanical vibration");
	    		break;}
	    	break;
	    case 4:
	    	switch (branch) {
	    	case 'c':
	    		System.out.println ("data communication and network,multimedia");
	    		break;
	    	
	    	case 'E':
	    		System.out.println ("embedded system,image,processing");
	    	case 'M':
	    		System.out.println ("production technology,thermal engineering");
	    		break;
	    	}
	    	break;}}
	    		
	    		
	    		
	    	
	    	
	    	
	    
	    
		
	}


