package Log4j_2.junit;
public class ArrayMAxValue
{

    public static void main( String[] args )
    
    {
    	
     int[] array = {2,3,4,6,19,8};
     int max = array[0];
    
     for (int i = 0; i < array.length; i++) {
  
    	 if(max <array[i]) {
    		  max = array[i];	 
    	 }
	}
     System.out.println(" max  value "+max);
    	 
    }
}
