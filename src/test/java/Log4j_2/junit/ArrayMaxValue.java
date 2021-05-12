package Log4j_2.junit;

import org.junit.jupiter.api.Test;

public class ArrayMaxValue {
	@Test
	public void maxArray() {
		int[] array = {2,3,4,6,19,8};
    int max = array[0];
    
    for (int i = 0; i < array.length; i++) {
 
   	 if(max <array[i]) {
   		  max = array[i];	 
   	 }
	}
    
    System.out.println(" max  value "+max);
	}
	
	 public static void main( String[] args )
	 {

		 ArrayMaxValue  a = new ArrayMaxValue ();
		 a. maxArray();
	    	 
	    
	}
	

}
