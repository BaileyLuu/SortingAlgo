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
    
    public int[]selection(int[]array2){
        intArray = array2;
        int iPos;
        int iMin;
        for(iPos = 0;iPos < intArray.length;iPos++){
            iMin = iPos;
            for(int i=iPos+1;i<intArray.length;i++){
                if(intArray[i] < intArray[iMin]){
                    iMin = i;
                }
            }if(iMin!=iPos){
                int temp = intArray[iPos];
                intArray[iPos] = intArray[iMin];
                intArray[iMin] = temp;
            }
        }
        return intArray;
    }
    public int[]insertion(int[]array3){
        intArray=array3;
        for(int i = 1; i < intArray.length;i++){
            int value = intArray[i];
            int j = i-1;
            while(j>=0&&intArray[j]>value){
                intArray[j+1] = intArray[j];
                j = j-1;
            }
            intArray[j+1] = value;
        }return intArray;
    }
}


