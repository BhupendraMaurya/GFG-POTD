// Given an array arr[] of n positive integers which can contain integers from 1 to p
// where elements can be repeated or can be absent from the array.
// Your task is to count the frequency of all numbers from 1 to n. 
// Do modify the array in-place changes in arr[], such that arr[i] = frequency(i) and assume 1-based indexing.

// Note: The elements greater than n in the array can be ignored for counting. 

// https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0

import java.util.Arrays;
import java.util.HashMap;

public class Frequencies_of_Limited_Range_Array_Elements {

    // first approach using hashing.
    public static void frequencyCount(int inputArray[], int size, int range){
        
        // Array to store frequencies of elements, initialized to zeros
        int[] frequencyArray = new int[size];
        
        // Calculate frequencies of elements within the specified range
        for(int i = 0; i < size; i++)
        {
            // Check if the current element is within the specified range
            if(inputArray[i] <= size){
                // Increment the count of the element's occurrence in frequencyArray
                frequencyArray[(inputArray[i] % size)]++;
            }
        }
        
        // Store the first element of frequencyArray in a temporary variable
        int temp = frequencyArray[0];
        
        // Shift elements of frequencyArray to the left in inputArray
        for(int i = 0; i < size - 1; i++)
        {
            inputArray[i] = frequencyArray[i + 1];
        }
        
        // Store the temporary variable in the last position of inputArray
        inputArray[size - 1] = temp;
    }

    // Using Map: simply insert all values in map and then traverse from 1 to n and then find the freq. of
    // all values of given array.
    public static void frequencyCount2(int a[], int size, int range){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<size;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        
        // initialising the given array as 0.
        Arrays.fill(a,0);
        
        // taking the frequency of all numbers from map and modify the given array.
        for(int i=1;i<=size;i++){
            if(map.containsKey(i)){
                a[i-1] = map.get(i);
            }
        }
        
        
    }

    // Brute force approach: TLE; 
    // run a loop from 1 to n and findng the frequency of each number and then
    // store in your extra array and then copy all value in original array.
    public static void frequencyCount3(int a[], int size, int range){
        
        
        int arr[] = new int [size];
        
        for(int i=1;i<=size;i++){
            int cnt = 0;
            
            for(int j=0;j<size;j++){
                if(i == a[j]){
                    cnt++;
                }
                
            }
            arr[i-1] = cnt;
        }
        
        
        for(int i=0;i<size;i++){
            a[i] = arr[i];
        }
        
        
    }
}
