package Log4j_2.junit;

import org.junit.jupiter.api.Test;

public class NegativeValue {
	@Test
	public void nagativeNumber() {
		
		 int[] array = {2,3,-4,-7,19,8};
	     int nagative = 0;
	    
	     for (int i = 0; i < array.length; i++) {
	  
	    	 if(nagative >array[i]) {
	    		  nagative = array[i];	 
	    	 }
	    	 
		}
	     System.out.println(" the Nagative number "+nagative);
	     
	}
	public static void main(String[] args) {
		NegativeValue n = new NegativeValue();
		n.nagativeNumber();
	}

}
