import java.util.Arrays;


public class MultiplyString {
	
	public static String multiply(String num1, String num2){
		
		if(num1==null||num2==null) return null;
		if(num1.equals("0")||num2.equals("0")) return "0";
		
		int[] resChar = new int[(num1.length()+num2.length())*2];
		int cur = resChar.length-1;
		int carry = 0;
		int inc = 0;
		for(int i=num2.length()-1;i>=0;i--){
			int b = num2.charAt(i) - '0';
			cur = cur - inc;
			for(int j=num1.length()-1;j>=0;j--){
				int a = num1.charAt(j)-'0';
				resChar[cur]+=a*b;
				carry = resChar[cur]/10;
				resChar[cur]%=10;
				resChar[cur-1]+=carry;
				cur--;
			}
			inc++;
			cur = resChar.length-1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<resChar.length;i++){
			if(resChar[i]!=0){
				while(i<resChar.length){
					sb.append(resChar[i]);
					i++;
				}
				break;
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String args[]){
		String num1 = "1245";
		String num2 = "139";
		System.out.println(multiply(num1,num2));
	}
}
