package bubblesort;

import java.util.Random;

public class SortAlgoTester {

    public static void main(String[] args) {
      
        int [] myArray1= new int[500];
        Random rnd=new Random();
        for(int i=0;i<myArray1.length;i++){
           
           myArray1[i]=rnd.nextInt(100-1)+1; //Generate random numbers
          
       }
        SortAlgo algo1 = new SortAlgo(myArray1);  
        long t7=System.nanoTime();
        int[] sortedArray3= algo1.bubleSort(myArray1); //Sorting out the random numbers in the array by using bubble sort
        long t8=System.nanoTime();
        System.out.println("");
        System.out.print("Sorted array size of 500: ");
        for(int i=0;i<myArray1.length;i++){
           
              System.out.print(sortedArray3[i]+"  ");    //Print out the sorted number in an array
       }
        System.out.println("");
        System.out.println("Execution time in bubble sort \t = "+ (t8-t7));    //Time for computer to finish sorting
        
        long t9=System.nanoTime();
        int []sortedArray4 = algo1.bubleSort(sortedArray3);  //Sorting out the random numbers in the array by using bubble sort
        long t10=System.nanoTime();
        System.out.println("Best\n"+ (t10-t9));
        
        for(int i = 0; i <sortedArray3.length/2;i++){
            int temp= sortedArray3[i];
            sortedArray3[i]=sortedArray3[sortedArray3.length-1-i];
            sortedArray3[sortedArray3.length-1-i]=temp;
        }
        long t11=System.nanoTime();
        int []sortedArray5 = algo1.bubleSort(sortedArray4);  //Sorting out the random numbers in the array by using bubble sort
        long t12=System.nanoTime();
        System.out.println("Worst\n"+ (t12-t11));

        
        
        
        
        int [] myArray3= new int[20000];
        
        for(int i=0;i<myArray3.length;i++){
           
           myArray3[i]=rnd.nextInt(100-1)+1; //Generate random numbers
          
       }
        SortAlgo algo3 = new SortAlgo(myArray3);  
        long t19=System.nanoTime();
        int[]sortedArray9= algo3.bubleSort(myArray3); //Sorting out the random numbers in the array by using bubble sort
        long t20=System.nanoTime();
        System.out.println("");
        System.out.print("Sorted array size of 2000: ");
        for(int i=0;i<myArray3.length;i++){
           
              System.out.print(sortedArray9[i]+"  ");    //Print out the sorted number in an array
       }
        System.out.println("\nExecution time in bubble sort = "+ (t20-t19));    //Time for computer to finish sorting
        
        long t21=System.nanoTime();
        int []sortedArray10 = algo3.bubleSort(myArray3);  //Sorting out the random numbers in the array by using bubble sort
        long t22=System.nanoTime();
        System.out.println("Best\n"+ (t22-t21));
        
        for(int i = 0; i <sortedArray9.length/2;i++){
            int temp= sortedArray9[i];
            sortedArray9[i]=sortedArray9[sortedArray9.length-1-i];
            sortedArray9[sortedArray9.length-1-i]=temp;
        }
        long t23=System.nanoTime();
        int []sortedArray11 = algo3.bubleSort(sortedArray9);  //Sorting out the random numbers in the array by using bubble sort
        long t24=System.nanoTime();
        System.out.println("Worst\n"+ (t24-t23));
             
    }
    
}
