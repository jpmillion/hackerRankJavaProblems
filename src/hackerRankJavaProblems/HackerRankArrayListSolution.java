package hackerRankJavaProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRankArrayListSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        int numOfArrays = scan.nextInt();
        
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>(numOfArrays);
        
        for (int i = 0; i < numOfArrays; i++) {
            int size = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>(size);
            
            for (int j = 0; j < size; j++) {
                int element = scan.nextInt();
                a.add(element);
            }
            arrays.add(a);
        }
        
        int queries = scan.nextInt();
        
        for (int i = 0; i < queries; i++) {
            int a = scan.nextInt() - 1;
            int element = scan.nextInt() - 1;
            ArrayList<Integer> array = arrays.get(a);
            
            if (element < array.size()) {
                System.out.println(array.get(element));
            } else {
                System.out.println("ERROR!");
            }
        }
        scan.close();
	}

}
