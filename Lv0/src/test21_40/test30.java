package test21_40;

public class test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 접미사인지 확인하기
		
		String my_string ="banana";  
		String is_suffix ="zbanana";
		int a = my_string.lastIndexOf(is_suffix);
		String s = "";
		int answer = 0;
		if(my_string.lastIndexOf(is_suffix)<0) {
			return ;
		}else {
		for(int i = my_string.lastIndexOf(is_suffix); i<my_string.length();i++) {
			System.out.println(i+ " "+my_string.charAt(i));
			s+=my_string.charAt(i);
		}
		System.out.println("s : "+s);
		if(s.equals(is_suffix)) {
			answer = 1;
			}
		}
		System.out.println("answer :"+answer);
	}

}
