package bubblesort;

public class SortAlgo {
    
    private int [] intArray;
    
    public SortAlgo(int []array){
      this.intArray=array;
    }
    public int[] getArray(){
        return this.intArray;
    }
    
    public int[]bubleSort(int[]array1){
      intArray = array1;
      boolean changed = false;
        do{
            changed = false;
            for(int i = 0;i<this.intArray.length-1;i++){
                if(intArray[i] > intArray[i+1]){
                    int temp = intArray[i];
                    intArray[i] = intArray[i+1];
                    this.intArray[i+1] = temp;
                    changed = true;
                }
            }
        }while(changed);
        return intArray;
    }
}


