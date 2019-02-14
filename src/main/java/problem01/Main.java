package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {

		// number가 두자리 수 일 때
		if(number > 9)
		{	
			if(29 < number && number >40)//30자리
			{
				
			}

			else			// 30자리 제외한 두자리 수 
			{
				
				// 한자리수 만 가져옴
//				String temp, temp2;				
//				temp.format("%d", number);//				
//				temp2 = temp.getChars(1, 1, (char)temp, 0);

//				if((_ttoi(temp2))%3 == 0) // 3으로 나눠서 나머지 값이 0 일 때 짝
//				{
//					return number;					
//				}
			}
			
			
		}
		else if(number%3 == 0)	// 3으로 나눠서 나머지 값이 0 일 때 짝
		{
			return number;
		}

		return 0;
	
	}
}