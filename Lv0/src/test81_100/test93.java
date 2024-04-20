package test81_100;

public class test93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test93 커피심부름
		String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
		String[] order2 = {"americanoice", "americano", "iceamericano"};
		int a = solution(order2);
		System.out.println(a);
	}

	public static int solution(String[] order) {
		int answer = 0;
		for(int i = 0; i<order.length;i++) {
        	if(order[i].indexOf("cafe")>=0) {
        		answer +=5000;
        	}else {
        		answer +=4500;
        	}
        }
		
		return answer;
    }
}
