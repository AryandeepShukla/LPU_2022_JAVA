
public class CapacityStringBufferBuilder {

	public static void main(String[] args) {
		
		//=========================>
        //String Buffer
		
		 StringBuffer sb1 = new StringBuffer();  
	     //printing default capacity of string buffer  
	     System.out.println("default capacity: " + sb1.capacity());
	     
	     StringBuffer sb2 = new StringBuffer("string buffer");  
         
         // printing the current capacity of the string buffer i.e. 16 + 13
         System.out.println("capacity: " + sb2.capacity());  
             
         sb2 = new StringBuffer("A");  
              
         // printing the current capacity of the string buffer i.e. 16 + 1  
         System.out.println("capacity: " + sb2.capacity());    
         System.out.println();
         
         //=========================>
         //String Builder
         
         StringBuilder sbb1 = new StringBuilder();  
	     //printing default capacity of string builder  
	     System.out.println("default capacity: " + sbb1.capacity());
	     
	     StringBuilder sbb2 = new StringBuilder("string builder");  
         
         // printing the current capacity of the string builder i.e. 16 + 14
         System.out.println("capacity: " + sbb2.capacity());  
             
         sbb2 = new StringBuilder("A");  
              
         // printing the current capacity of the string builder i.e. 16 + 1  
         System.out.println("capacity: " + sbb2.capacity());          
         
	}

}
