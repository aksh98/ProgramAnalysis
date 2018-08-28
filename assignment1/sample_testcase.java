
import java.util.Scanner;

class SampleFile {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Channel c=new Channel();
		
		if(a%2==0) {
			c.open(); c.close();   
		}else {
			c.open();
			System.out.println("Some text");   
		}
		while(a>=0) {                                     
			c.close();
			a=a/2;
		}
		
	}

}
/*

	------------------------------- Case 01 -----------------------------------

	a = 12
	line 11: <Condition Satisfied>
	line 12: Channel Opened
	line 12: Channel Closed
	line 17: <Condition Satisfied>
	line 18: Channel Closed ---> ERROR
	line 19: a = 6
	line 17: <Condition Satisfied>
	line 18: Channel Closed ---> ERROR
	line 19: a = 3
	line 17: <Condition Satisfied>
	line 18: Channel Closed ---> ERROR
	and so on
	
	Since, the closed channel is closed again, output should be NO

	------------------------------- Case 02 -----------------------------------

	a = 3
	line 13: <Condition Satisfied>
	line 14: Channel Opened
	line 15: "Some text" is printed
 	line 17: <Condition Satisfied>
	line 18: Channel Closed ---> ERROR
	line 19: a = 1
	line 17: <Condition Satisfied>
	line 18: Channel Closed ---> ERROR
	and so on
	
	Output: NO
	
	---------------------------------------------------------------------------
*/