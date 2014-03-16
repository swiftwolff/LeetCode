public class PlusOne {
	public static int[] plusOne(int[] digits) {
		if (digits.length==0){
			return digits;
		}
        return advance(digits,digits.length-1);
    }
    public static int[] advance(int[] digits, int index){
        if (index<0){
            int[] newArry = new int[digits.length+1];
            newArry[0] = 1;
            int j=0;
            for(int i=1;i<digits.length;i++){
                newArry[i] = digits[j];
                j++;
            }
            return newArry;
        }
        
        if(digits[index]==9){
            digits[index] = 0;
            digits = advance(digits,index-1);
        }else{
            digits[index]+=1;
        }
        
        return digits;
    }
	public static void main(String args[]){
		int[] A = {9};
		
		int[] B = plusOne(A);

		for(int i:B){
			System.out.println(i);
		}
		
	}
}
