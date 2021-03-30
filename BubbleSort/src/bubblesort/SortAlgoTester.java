package bubblesort;

import java.util.Random;

public class SortAlgoTester {

    public static void main(String[] args) {
       int [] myArray = new int[50];
        Random rnd=new Random();
       for(int i=0;i<myArray.length;i++){
           
           myArray[i]=rnd.nextInt(100-1)+1; //Generate random numbers
          
       }

        SortAlgo algo = new SortAlgo(myArray);  
        long t=System.nanoTime();
        int[] sortedArray= algo.selection(myArray); //Sorting out the random numbers in the array by using bubble sort
        long t2=System.nanoTime();
        System.out.println("");
        System.out.print("Sorted array size of 50: ");
        for(int i=0;i<myArray.length;i++){
           
            System.out.print(sortedArray[i]+"  ");    //Print out the sorted number in an array
       }
        System.out.println("");
        System.out.println("Execution time in selection sort = "+ (t2-t));    //Time for computer to finish sorting
        
        long t3=System.nanoTime();
        int[]sortedArray1=algo.selection(sortedArray);
        long t4=System.nanoTime();
        System.out.println("Best\n" + (t4-t3));
        
        for(int i = 0; i <sortedArray.length/2;i++){
            int temp=sortedArray[i];
            sortedArray[i]=sortedArray[sortedArray.length-1-i];
            sortedArray[sortedArray.length-1-i]=temp;
        }

        long t5=System.nanoTime();
        int []sortedArray2= algo.selection(sortedArray);
        long t6=System.nanoTime();
        System.out.println("Worst\n"+(t6-t5));
        
//        long t3=System.nanoTime();
//        sortedArray = algo.selection(myArray);  //Sorting out the random numbers in the array by using selection sort
//        long t4=System.nanoTime();
//        System.out.println("Execution time in selection sort = "+ (t4-t3));
        
//        long t5=System.nanoTime();
//        sortedArray = algo.insertion(myArray);  //Sorting out the random numbers in the array by using insertion sort
//        long t6=System.nanoTime();
//        System.out.println("Execution time in insertion sort = "+ (t6-t5));
        
        
        
        
        int [] myArray1= new int[500];
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
        int []sortedArray4 = algo1.bubleSort(sortedArray3);  //Sorting out the random numbers in the array by using selection sort
        long t10=System.nanoTime();
        System.out.println("Best\n"+ (t10-t9));
        
        for(int i = 0; i <sortedArray3.length/2;i++){
            int temp= sortedArray3[i];
            sortedArray3[i]=sortedArray3[sortedArray3.length-1-i];
            sortedArray3[sortedArray3.length-1-i]=temp;
        }
        long t11=System.nanoTime();
        int []sortedArray5 = algo1.bubleSort(sortedArray4);  //Sorting out the random numbers in the array by using insertion sort
        long t12=System.nanoTime();
        System.out.println("Worst\n"+ (t12-t11));

        
        
        
        
        int [] myArray2= new int[5000];
        
        for(int i=0;i<myArray2.length;i++){
           
           myArray2[i]=rnd.nextInt(100-1)+1; //Generate random numbers
          
       }
        SortAlgo algo2 = new SortAlgo(myArray2);  
        long t13=System.nanoTime();
        int[]sortedArray6= algo2.insertion(myArray2); //Sorting out the random numbers in the array by using bubble sort
        long t14=System.nanoTime();
        System.out.println("");
        System.out.print("Sorted array size of 5000: ");
        for(int i=0;i<myArray2.length;i++){
           
              System.out.print(sortedArray6[i]+"  ");    //Print out the sorted number in an array
       }
        System.out.println("");
        System.out.println("Execution time in insertion sort = "+ (t14-t13));    //Time for computer to finish sorting
        
        long t15=System.nanoTime();
        int []sortedArray7 = algo2.insertion(sortedArray6);  //Sorting out the random numbers in the array by using selection sort
        long t16=System.nanoTime();
        System.out.println("Best\n"+ (t16-t15));
        
        for(int i = 0; i <sortedArray6.length/2;i++){
            int temp= sortedArray6[i];
            sortedArray6[i]=sortedArray6[sortedArray6.length-1-i];
            sortedArray6[sortedArray6.length-1-i]=temp;
        }
        long t17=System.nanoTime();
        int []sortedArray8 = algo2.insertion(sortedArray7);  //Sorting out the random numbers in the array by using insertion sort
        long t18=System.nanoTime();
        System.out.println("Worst\n"+ (t18-t17));
               
        
        
        
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
        int []sortedArray10 = algo3.bubleSort(myArray3);  //Sorting out the random numbers in the array by using selection sort
        long t22=System.nanoTime();
        System.out.println("Best\n"+ (t22-t21));
        
        for(int i = 0; i <sortedArray9.length/2;i++){
            int temp= sortedArray9[i];
            sortedArray9[i]=sortedArray9[sortedArray9.length-1-i];
            sortedArray9[sortedArray9.length-1-i]=temp;
        }
        long t23=System.nanoTime();
        int []sortedArray11 = algo3.bubleSort(sortedArray9);  //Sorting out the random numbers in the array by using insertion sort
        long t24=System.nanoTime();
        System.out.println("Worst\n"+ (t24-t23));
             
    }
    
}
