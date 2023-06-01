package test;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1,2,-3,4,-5};
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++ ) {
				int mul = numbers[i] * numbers[j]; 
				if (max < mul) {max = mul;}
			}
		}
		answer = max;
		System.out.println(answer);
	}
}
