package Aray_study;

public class Multidiamendtional_array {

	public static void main(String[] args) {
		
       int ar[][]= {{10,20,30},{20,60,70},{40,50,80}};                   //int
       
       for(int i=0;i<=2;i++) {
    	   {
    		   for(int j=0;j<=2;j++) {
    			   System.out.println(ar[i][j]);
    			   
    		   }
    		   System.out.println();
    	   }
    	   System.out.println("==============");
    	   //for charcters
    	   char d[][]= {{'a','b','c'},{'f','g','h'},{'e','r','t'},};                    
    	   
    	   for(int k=0;k<=2;k++) {
    		   
    		   for(int m=0;m<=2;m++) {
    		 
			System.out.println(d[k][m]);
    		   
    	   }
    		   System.out.println();
       }

    	   System.out.println("====================");
    	   //for string
    	   String s[][]= {{"ravi","kma","vijay"},{"vani","nabi","sami"},{"rucha","jaya","maya"}};
    	   
    	   for(int i1=0;i1<=2;i1++){
    		   for(int j1=0;j1<=2;j1++) {
    			   System.out.println(s[i1][j1]);
    		   }
    		   System.out.println();
    	   }
    	   System.out.println("==============");
    	   {
    		   
    	   }
	}
	}
}

