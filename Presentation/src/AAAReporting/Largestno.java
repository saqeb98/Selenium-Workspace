 package AAAReporting;

public class Largestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={100,220,30,40,50,40};  
        int max = arr[0];  
        int secmax=arr[0];
    
        for (int i = 0; i < arr.length; i++) 
        {  
            
           if(arr[i] > max)  
               max = arr[i];
           
           else if(arr[i]>secmax && secmax!=max) 
           {
        	   secmax=arr[i];
           }
         
        }  
        System.out.println( max);
        System.out.println(secmax);
        
    }  

}
