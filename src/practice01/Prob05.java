package practice01;

public class Prob05 {

	public static void main(String[] args) {
		// 3,6,9가 몇개있는줄 세려면 문자로 바꿔서 문자비교하기
		int clapCount = 0;

		for (int i = 1; i < 100; i++) {
			String s = String.valueOf(i); // string으로 바꿨어
		
			char c0 = s.charAt(0);
			char c1 = 0;
			int length = s.length();
			if( length >i) {
				c1 = s.charAt(1);
			}
		

			if (c0 == '3' || c0 == '6' || c0 == '9') {
				//clapCount++;
				System.out.print(i);
				System.out.print("	짝");
				if (c1 == '3' || c1 == '6' || c1 == '9') {
					//clapCount++;
					System.out.print("	짝");
				}
				System.out.println();
				
			}
			
			
			
			
			
		} 
	

	
		/*int length = s.length();
		for (int i = 0; i < length; i++) {
			// 하나씩 순회를 하면서 찾는거
			char c = s.charAt(i);
			// 이 문자를 비교하는거
			if (c == '3' || c == '6' || 'c' == '9') {
				// 짝짝 나오게 해서 나오게 하면 될거같은데
				clapCount++;
			}
		}
		for (int i = 1; i <= 100; i++) {
			// 3,6,9를 찾아야 하고, 3이 들어갈때 짝치고, 3이 2개 들어가면 짝짞 쳐야한다.
		}
		// for(int j =0; j<clapCount; j++){} 
		 * */
	}
}
