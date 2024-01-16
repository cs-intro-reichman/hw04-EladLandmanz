public class ArrayOps {
    public static void main(String[] args) {
            
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        boolean found = false;
        int missingNum = 0;
        
        for (int i = 0; i < (array.length+1); i ++ ) {
            for (int j = 0; j < array.length; j ++ ) {
                if ( i == array[j]){
                    found = true;
                }     
            }
            if ( !found ){
                missingNum = i;
            }
            found = false;       
        }
        return missingNum;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max = array[0];
        int secondMax = array[0];
        for (int i = 1; i < array.length; i ++ ) {
            if (array[i] > max){
                secondMax = max;
                max = array[i];
            }else if ( array[i] > secondMax){
                secondMax = array [i];
            }
              
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean found = false; 
        for (int i = 0; i < array1.length; i ++ ) {
            for (int j = 0; j < array2.length; j ++ ) {
                if ( array1[i] == array2[j]){
                    found = true;
                    break;
                }
                found = false;            
            }
            if ( !found ){
                break;
            }
        }

        return found;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean decreasing = true;
        boolean increasing = true;
        boolean isSorted = false;
        int j = 0; 
        for (int i = 0; i < array.length - 1; i ++ ) {
            j = i + 1;
            //System.out.println("array " + i +   " = " + array[i]);
            //System.out.println("array " + j +   " = " + array[j]);
            if ( !(array[j] >= array[i])){
                increasing = false;
                
            }else if (!(array[j] <= array[i])){
                decreasing = false;
                
            }
       
        }
        isSorted = (increasing || decreasing);
        
        return isSorted;
    }

}
