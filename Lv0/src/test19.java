
public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이어 붙인 수
		int[]num_list = {3,4,5,2,1};
		String s1 = "";
		String s2 = "";
		for(int i=0;i<num_list.length;i++) {
			if(num_list[i]%2==0) {
				s1+=""+num_list[i];
			}else {
				s2+=""+num_list[i];
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(Integer.parseInt(s2)+Integer.parseInt(s1));

	}

}
