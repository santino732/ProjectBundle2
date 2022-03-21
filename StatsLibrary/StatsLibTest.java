package StatsLibrary;

public class StatsLibTest {

public static void main(String[] args) {
	
	int[] list1 = new int[]{ 1,2,3}; 
	int[] list2 = new int[]{ 2,3,4,5}; 
	double p = .70; double n = 4;
	
	//Test class that calls each method by doing StatsLib.XXX
	System.out.println("Median list1: " + StatsLib.findMedian(list1)); System.out.println("Median list2: " + StatsLib.findMedian(list2));
	System.out.println("Mean list2: "+StatsLib.findMean(list1)); System.out.println("Mean list2: " +StatsLib.findMean(list2));
	System.out.println("Mode list1: " + StatsLib.findMode(list1)); System.out.println("Mode list2: " +StatsLib.findMode(list1));
	System.out.println("Standard Deviation list1: "+StatsLib.getSD(list1)); System.out.println("Standard Deviation list2: "+StatsLib.getSD(list2));
	System.out.println("Union of list1 and list2: " +StatsLib.union(list1, list2)); System.out.println("Intersection of list1 and list2: "+StatsLib.intersection(list1, list2));
	System.out.print("Compliment of list1 to list2: "); StatsLib.complement(list1, list2); System.out.print("Compliment of list2 to list1: "); StatsLib.complement(list2, list1);
	System.out.print("Permutation of list1: ");StatsLib.permutation(list1); System.out.print("Permutation of list2: ");StatsLib.permutation(list2);
	System.out.print("Combination of list1: ");StatsLib.combination(list1); System.out.print("Combination of list2: ");StatsLib.combination(list2);System.out.println();
	//Geometric Distribution, P is the probability of success, N is the number of trials. Send to statslib to go through formula.
    System.out.print("P="+ p + " N=" + n + " Probability by Geometric Distribution: " );StatsLib.geometricDistribution(p,n);System.out.println();
    System.out.print("P= .70   Y = 7 Probability by Binomial Distribution: " );StatsLib.binomialDistribution();
    System.out.println ("Q = .30   N = 10");System.out.println();
    System.out.println("Probability by Hypergeometric Distribution:");StatsLib.hypergeometricDistribution();
}
}

