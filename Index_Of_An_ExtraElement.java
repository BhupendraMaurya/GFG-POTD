// https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1

// You have given two sorted arrays arr1[] & arr2[] of distinct elements. 
//The first array has one element extra added in between. Return the index of the extra element.


public class Index_Of_An_ExtraElement {


    //TC : O(n);
    public int findExtra2(int n, int arr1[], int arr2[]) { 
        // simply checking that which number is not equal, 
        for(int i=0;i<arr2.length;i++){
            if(arr1[i] != arr2[i]){
                return i;
            }
        }
        
        return arr2.length;
    }
    //TC : O(log n)
    public int findExtra(int n, int arr1[], int arr2[]) {
        int si = 0;
        int ei = n-2;
        // since question is saying that it is sorted, so we can think of binary search
        // observe and see that,if at any index, value in both the array is equal,
        // then it would be equal in all the previous index. so just shift start.
        // so simple search for that index where correspoding array vlues are not equal.
        
        while(si <= ei){
            int mid = (si+ei)/2;
            
            if(arr1[mid] == arr2[mid]){
                si = mid+1;
                
            }
            
            else{
                ei = mid-1;
            }
        }
        
        return si;
    }
}

