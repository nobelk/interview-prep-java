package nobel.khandaker.misc;

public class FindMaxSumSubarray {

    public static int findSum(int k, int[] arr){

        int maxSum = 0, windowSum = 0;
        int windowStart = 0;

        for(int windowEnd=0; windowEnd<arr.length; windowEnd++){
            windowSum += arr[windowEnd];
            if(windowEnd>=k-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        

        return maxSum;
    }

    public static void main(String[]args){
        System.out.println("Maximum sum of a subarray of size K: "
                + FindMaxSumSubarray.findSum(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + FindMaxSumSubarray.findSum(2, new int[] { 2, 3, 4, 1, 5 }));
    }
}
