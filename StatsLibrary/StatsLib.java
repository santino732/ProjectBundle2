package StatsLibrary;
 
import java.util.HashSet;
	 
public class StatsLib {
	
	//Algorithm for finding mean of set list1 and list2
	public static double findMedian(int[] listX) {  
		
		
		double m=0;	
		double n = listX.length;
		
		if(n%2==1)
		{
			m=listX[(int) (((n+1)/2)-1)];
			
		}
		else
		{
			m=(listX[(int) (n/2-1)]+listX[(int) (n/2)])/2;
			
		}
		return m;	
	}
	
	//Algorithm for finding mode of set list1 and list2
	public static int findMode(int[] n) { 
		 
		int count2 = 0;
		int count1 = 0;
		int x =0;
		int y =0;
		    
		for (int i = 0; i < n.length; i++){
			x = n[i];
		    count1 = 0;    		        
		for (int j = i + 1; j < n.length; j++)
		    if (x == n[j]) count1++;
	
		        
		    if (count1 > count2){
		    	y = x;
		        count2 = count1;
	}
		        
		    else if(count1 == count2)
		        y = Math.min(y, x);
		       
	}
		    
		    return y;
		
	}
	
//Algorithm for finding mean of set list1 and list2
	public static double findMean(int[] numbers) {  
		double sum = 0;
		 
	    for (int i = 0; i < numbers.length; i++) {
	    	sum += numbers[i];
	    }
	 
	        double mean = sum / numbers.length;
	        
			return mean;
	 
	    }
	
	//Algorithm for finding Standard Deviation of set list1 and list2
	public static double getSD(int[] listX) {  
		
		if(listX.length == 1) 
			return 1;
			
			if(listX.length == 0) 
				return 0;
		
		double mean = 0;
		
		for(int i =0; i < listX.length; i++) {
			mean = mean + listX[i];
		}
			
		mean = mean/listX.length;
		
		double sumOfTempValues = 0;
		
		for(int i = 0; i < listX.length; i++) {
			double tempValue = Math.pow(mean - listX[i],2);
			sumOfTempValues = sumOfTempValues + tempValue;
		}
		
		double result = sumOfTempValues / (listX.length - 1);
		
		return Math.sqrt(result);
	}
	
	public static HashSet<Integer> union(int[] list1, int[] list2) {  
		
		//Algorithm for finding the union of set list1 and list2		  
		HashSet<Integer> s = new HashSet<>();
		   
	    // Inserting array elements in s
	    for (int i = 0; i < list1.length; i++)
	      s.add(list1[i]);
	   
	    for (int i = 0; i < list2.length; i++)
	        s.add(list2[i]);
	     
	        
			return s;
	       
	}
//find intersection of two sets
	 public static HashSet<Integer> intersection(int list1[], int list2[]){
		 int n = list1.length;
		 int m = list2.length;
	     int i = 0;
	     int j = 0;
	 
	        while (i < n && j < m) {
	 
	            if (list1[i] > list2[j]) {
	                j++;
	            }
	 
	            else if (list2[j] > list1[i]) {
	                i++;
	            }
	            else {
	                // when both are equal
	               
	                i++;
	                j++;
	            }
	        }
			 HashSet<Integer> s = new HashSet<>();
			 s.add(i);
			 s.add(j);

			return s;
	    }
	 
	//Algorithm for finding the complement of set list1 and list2
	 public static void complement(int list1[], int list2[]){
		
		 	int i = 0;
		 	int j = 0;
		 	int n= list1.length;
		 	int m = list2.length;
		 	
	        while (i < n && j < m){
	        	
	            if (list1[i] < list2[j])
	            {
	                System.out.print(list1[i] + " ");
	                i++;
	            } 
	            
	            else if (list1[i] > list2[j]){
	                j++;
	         
	            }
	            else if (list1[i] == list2[j]){
	                i++;
	                j++;
	            }
	        }

	        while (i < n){
	            System.out.print(list1[i] + " ");
	            i++;
	        }   
            System.out.println("");
	 }

	//Algorithm for finding the permutation of set list1 and list2
	 public static void permutation (int[] listX) {
	 	
	 	int f = 1;  
	     int j = 1;  
	     while(j <= listX.length) {  
	        f = f * j;  
	        j++;  
	     }  
	     System.out.println(f);  
	 }
	 
	//Algorithm for finding the combination of set list1 and list2
	 public static void combination(int[] listX) {
		  int f = 1;  
	      int j = 1;  
		while(j <= listX.length) {  
	         f = f * j;  
	         j++;  
	      }  
	      
	     System.out.println(f); 
	 }
	 
//n is number of trials/p is probability of success and q is failure. (failure * number of trials)*prob of success
	public static void geometricDistribution(double p,double n) {	
		double q = 1-p;
		
		System.out.println( Math.pow(q,n)*p); 
	}

//binomial distribution using n as number of trials. p = probability of success, q = probability of failure
	public static void binomialDistribution() {
		int n = 10;
		int r = 3;
		int y = n-r;
		double z;
		double p = .70;
		double q = 1-p;
		// n factorial / y factorial
		
		double fact1 = 1;
	    for (int i = 2; i <= n; i++) {
	        fact1 = fact1 * i;
	    } 
	    
	    double fact2 =1;
	    for (int i = 2; i <= y; i++) {
	       fact2 = fact2 * i;
	    }	    
	   
	    z = fact1/fact2;
	    
	   double prob = z * (Math.pow(p, y) * Math.pow(q,(n-y)));
	   System.out.println(prob);
	}


	//algorithm for hypergeometric distribution using given variables.
	public static void hypergeometricDistribution() {
        int N = 52;
        int n = 5;
        int r = 26;
        int y = 2;
        
        int a = N-r;
        int b = n-y;
        int c = (N-r)-(n-y);
  
        double fact1 = 1;
	    for (int i = 2; i <= r; i++) {
	        fact1 = fact1 * i;
	    }
	    
	    double fact2 = 1;
			for (int i = 2; i <= y; i++) {
		        fact2 = fact2 * i;
		        
	 }
		double fact3 = 1;
			for (int i = 2; i <= (r-y); i++) {
			        fact3 = fact3 * i;
		 }
			double one = fact1/(fact2*fact3);
			
		double fact4 = 1;
			for (int i = 2; i <= (N-r); i++) {
				        fact4 = fact4 * i;
			 }
		double fact5 = 1;
			for (int i = 2; i <= (n-y); i++) {
				        fact5 = fact5 * i;
			 }
			
		double fact6 = 1;
			for (int i = 2; i <= (c); i++) {
				        fact1 = fact1 * i;
			 }
			double two = fact4/(fact5*fact6);
			
		double fact7 = 1;
			for (int i = 2; i <= (N); i++) {
				        fact7 = fact7 * i;
			 }
		double fact8 = 1;
			for (int i = 2; i <= (n); i++) {
				        fact8 = fact8 * i;
			 }
		double fact9 = 1;
			for (int i = 2; i <= (N-n); i++) {
				        fact9 = fact9 * i;
			 }
		double three = fact7/(fact8*fact9);
		
		double prob = (one*two)/three;
		System.out.println(prob);
	 
	 }}


