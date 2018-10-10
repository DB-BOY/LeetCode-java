package leetcode;

/**
 * Created by DB_BOY on 2018/10/9.
 * 山脉数组的峰顶索引
 */
public class MountainArray852 {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,2,1,0}));
    }
    public static int peakIndexInMountainArray(int[] A) {
        // for(int i = 1;i<A.length-1;i++){
        //     if(A[i]>A[i+1]){
        //         return i;
        //     }
        // }
        // return 0;
        int start = 0;
        int end = A.length -1 ;
        int mid = 0;
        while(start< end){
            mid = (start+end)/2;
            if(A[mid]>A[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
}
