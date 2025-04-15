import java.util.*;

public class Array{

    // public static int linearSearch(int numbers[], int key){
    //     for(int i=0;i<numbers.length; i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String[] args) {
    //     int numbers[]={10, 20, 30, 44, 55};
    //     int key=4;
    //     int index=linearSearch(numbers, key);

    //     if(index == -1){
    //         System.out.println("Key not found");
    //     }else{
    //         System.out.println("Key found at index " + index);
    //     }
    // }

    // public static int getLargest(int numbers[]){
    //     int largest=Integer.MIN_VALUE;

    //     for(int i=0;i<numbers.length;i++){
    //         if(largest<numbers[i]){
    //             largest=numbers[i];
    //         }
    //     }
    //     return largest;
    // }
    // public static void main(String[] args) {
    //     int numbers[]={10, 20, 12, 34, 3, 89, 1};
    //     System.out.println(getLargest(numbers));
    // }

    // public static int getSmallest(int numbers[]){
    //     int smallest=Integer.MAX_VALUE;

    //     for(int i=0;i<numbers.length; i++){
    //         if(smallest>numbers[i]){
    //             smallest=numbers[i];
    //         }
    //     }
    //     return smallest;
    // }
    // public static void main(String[] args) {
    //     int numbers[]={ 10, 20, 30, 21, 1, 101};
    //     System.out.println(getSmallest(numbers));
    // }
    
    // public static int binarySearch(int numbers[], int key){
    //     int start=0;
    //     int end=numbers.length-1;

    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(numbers[mid]==key){
    //             return mid;
    //         }
    //         if(mid<key){
    //             start=mid+1;
    //         }else{
    //             end=mid-1;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String[] args) {
    //     int numbers[]={10, 20, 30, 40, 50, 84};
    //     int key=50;

    //     System.out.println(binarySearch(numbers, key));
    // }

    // public static void reverseArr(int numbers[]){
    //     int first=0;
    //     int last=numbers.length-1;

    //     while(first<last){

    //         int temp=numbers[last];
    //         numbers[last]=numbers[first];
    //         numbers[first]=temp;

    //         first++;
    //         last--;
    //     }
    // }
    // public static void main(String[] args) {
    //     int numbers[]={10, 20, 30, 40, 50};
    //     System.out.println("The reversed array is: ");
    //     reverseArr(numbers);
    //     for(int i=0; i<numbers.length;i++){
    //         System.out.print(numbers[i]+ " ");
    //     }
    // }

    // public static void printPairs(int numbers[]){
    //     int tp=0;

    //     for(int i=0; i<numbers.length;i++){
    //         int curr=numbers[i];
    //         for(int j=i+1; j<numbers.length;j++){
    //             System.out.print("("+ curr+","+numbers[j]+")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total pairs= "+tp);
    // }
    // public static void main(String[] args) {
    //     int numbers[]={2, 4, 6, 8, 10};
    //     printPairs(numbers);
    // }

    // public static void printSubarrays(int numbers[]){
    //     int ts=0;

    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             for(int k=i;k<=j;k++){
    //                 System.out.print(numbers[k]+" ");
    //             }
    //             System.out.println();
    //             ts++;
    //         }
    //     }
    //     System.out.println("Total pairs= "+ ts);
    // }

    // public static void main(String[] args) {
    //     int numbers[]={2, 4, 6, 8, 10};
    //     printSubarrays(numbers);
    // }

    //max subarray sum: brute force with TC=O(n^3)
    // public static void maxSubarraySum(int numbers[]){
    //     int currSum=0;
    //     int maxSum=Integer.MIN_VALUE;

    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             currSum=0;
    //             for(int k=i;k<=j;k++){
    //                 currSum += numbers[k];
    //             }
    //         }
    //         System.out.println(currSum);
    //         if(maxSum<currSum){
    //             maxSum=currSum;
    //         }
    //     }
    //     System.out.println("The max subarray sum is: "+maxSum);
    // }
    // public static void main(String[] args) {
    //     int numbers[]={2, 4, 6, 8, 10};
    //     maxSubarraySum(numbers);
    // }

    //max subarray sum: Prifix sum with TC=O(n^2)
    // public static void maxSubarraySum(int numbers[]){
    //     int currSum=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     int prefix[]=new int[numbers.length];

    //     prefix[0]=numbers[0];

    //     for(int i=1;i<prefix.length;i++){
    //         prefix[i]=prefix[i-1]+numbers[i];
    //     }

    //     for(int i=0; i<numbers.length;i++){
    //         int start=i;
    //         for(int j=i;j<numbers.length;j++){
    //             int end=j;
    //             currSum=0;

    //             currSum=start==0 ? prefix[end]: prefix[end]-numbers[i-1];

    //             if(maxSum<currSum){
    //                 maxSum=currSum;
    //             }
    //         }
    //     }
    //     System.out.println("The max sum is : "+ maxSum);
    // }
    // public static void main(String[] args) {
    //     int numbers[]={1, 2, 3, 4, 5};
    //     maxSubarraySum(numbers);
    // }
    
    //max subarray sum: kadanes algo with TC=O(n)
    // public static void kadanes(int numbers[]){
    //     int cs=0;
    //     int maxSum=Integer.MIN_VALUE;

    //     for(int i=0;i<numbers.length;i++){
    //         cs +=numbers[i];

    //         if(cs<0){
    //             cs=0;
    //         }

    //         maxSum=Math.max(maxSum, cs);
    //     }
    //     System.out.println("The max sum is : "+ maxSum);
    // }

    // public static void main(String[] args) {
    //     int numbers[]={1, 2, 3, 4, 5};
    //     kadanes(numbers);
    // }
}
