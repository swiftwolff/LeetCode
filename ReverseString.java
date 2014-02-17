
public class ReverseString {
	
	public static String swap(String str, int start, int end){
		str = str + " ";
		char[] c = str.toCharArray();
		char t;
//		int start = 0;
//		int end = c.length-1;
		while (start<end){
			t = c[start];
			c[start] = c[end];
			c[end] = t;
			start++;
			end--;
		}
		
		int head = 0;
		int tail = 0;
		for(int i = 0;i<c.length;i++){
			if(c[i]==' '){
				tail = i -1;
				while(head < tail){
					t = c[head];
					c[head] = c[tail];
					c[tail] = t;
					head++;
					tail--;
				}
				head = i + 1;
			}
		}
		
		String res = new String(c);
		
		return res;
	}
	
	
	public static void main(String args[]){
		
		String s = "i am a very good looking guy";
		
		System.out.println(ReverseString.swap(s, 0, s.length()-1));
		
		
		
		
		
		
	}
}
