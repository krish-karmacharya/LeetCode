class Solution {
    //return index
    //return -1 if not foound
    public int search(int[] arr, int target) {
       int start =0;
       int end =arr.length -1;

       while(start <=end){
        //find the middle element
        // int mid =(start + end )/2;
        //int has a fix size and might be possibility that start+end  exceeds the reange of int in java
        int mid = start + (end - start) / 2;
        if(target < arr[mid]){
            end = mid - 1;

        }else if(target>arr[mid]){
            start = mid +1;
        }else{
            return mid;
        }
       }
       return -1;
    }
}