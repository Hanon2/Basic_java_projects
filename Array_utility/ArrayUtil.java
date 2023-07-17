class ArrayUtil{
    private int[]intArray; // an array with no size  
    public ArrayUtil(){// a default constructor that initializes the array as a size of zero
        intArray = new int[0];
    }
    public ArrayUtil(int []arr){ // an instructor that assigns the array to the passed argument
        intArray = arr; 
    }
    public void setIntArray(int []arr){ // a setter for the array 
        intArray=arr;
    }
    public int[] getIntArray(){ // a getter for the array 
        return intArray; 
    }
    public int minValue(){ // a method that return the minimum value in the array
        int min=0;
        if (intArray.length==0){ // check if there is nothing in the array
            return 0;
        }
        else {
            min = intArray[0]; //assign the variable to the first value of it
            for (int i=0; i<intArray.length; ++i){ // go through the array
                if (intArray[i]<min){ // if there is something lower than the variable min
                    min = intArray[i]; // assign this value to min
                }
            }
            
        }
        return min; 
    }
    public int maxValue(){ // a method that return the maximum value in the array
        int max=0;
        if (intArray.length==0){ // check if there is nothing in the array
            return 0;
        }
        else {
            max = intArray[0]; //assign the variable to the first value of it
            for (int i=0; i<intArray.length; ++i){ // go through the array
                if (intArray[i]>max){ // if there is something higher than the variable max
                    max = intArray[i]; // assign this value to max
                }
            }
            
        }
        return max; 
    }
    public int countUniqueIntegers(){
        int count=0; 
        if (intArray.length==0){// if the length of the array is 0 then return 0
            return 0;
        }
        else{
            int j=0;
        for (int i=0; i<intArray.length;++i){
            for (j=0; j<intArray.length;++j){ // a nested for loop to go through each single element in the array 
                if (intArray[i]==intArray[j]){
                    break; 
                }
            }
            if (i==j){ // if the values that match are at the same index then increase the count (so that it doesn't count the same element 2 times)
                ++count;
            }
        }
            return count; 
        }
    }
}