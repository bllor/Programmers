
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 비교하기
			int[] arr1= null;
			int[] arr2= null;
		
	        int answer = 0;
	        int sum1 = 0;
	        int sum2 = 0;
	        
	        for(int i =0; i<arr1.length; i++){
	            sum1+=arr1[i];
	        }
	        for(int i =0; i<arr2.length; i++){
	            sum2+=arr2[i];
	        }
	        
	        if(arr1.length<arr2.length){
	            answer= -1;
	        }else if(arr1.length>arr2.length){
	            answer = 1;
	        }else{
	            if(sum1>sum2){
	                answer=1;
	            }else if(sum1<sum2){
	                answer=-1;
	            }else{
	                answer=0;
	            }
	        
	        }
	}
}
