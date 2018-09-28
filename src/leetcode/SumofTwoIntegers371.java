package leetcode;

/**
 * 位运算实现加法
 *
 * @author db_boy
 */
public class SumofTwoIntegers371 {

	public static void main(String[] args) {
		int a=-1,b=1;
		
//		 while(b != 0){  
//	            int c =(a & b)<< 1;  
//	            a = a ^ b;  
//	            b = c ;  
//	        }
			System.out.println(System.currentTimeMillis());
			System.out.println(cal(a,b));
			System.out.println(System.currentTimeMillis());
	}
	static int cal(int a , int b){
	    if(b==0) return a;
	    return cal(a^b, (a&b)<<1);
	}
}
