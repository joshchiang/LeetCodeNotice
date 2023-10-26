package leetcode.solution.num;

public class P67_AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "11";
		String b = "1";

		P67_AddBinary test = new P67_AddBinary();
		test.addBinary(a, b);

	}

	public String addBinary(String a, String b) {

		StringBuilder result = new StringBuilder();
	    int carry = 0;
	    int i = a.length() - 1;
	    int j = b.length() - 1;

	    while (i >= 0 || j >= 0 || carry > 0) {
	    	
			int sum = carry;
	        if (i >= 0) {
	            sum += a.charAt(i) - '0';
	            i--;
	        }
	        if (j >= 0) {
	            sum += b.charAt(j) - '0';
	            j--;
	        }

	        result.insert(0, sum % 2);
	        carry = sum / 2;
	    }

	    return result.toString();

	}

}
