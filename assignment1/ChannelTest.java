/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package channeltest;
import java.util.Scanner;
/**
 *
 * @author ridhi
 */
class Channel {

	public static void open(){
		// Channel is opened
	}
	public static void read(){
		// Channel is reading
	}
	public static void write(){
		// Channel is writing
	}
	public static void close(){
		// Channel is closed
	}

}

class ChannelTest {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Channel c=new Channel();
		
		if(a%2==0) {
			c.open(); c.close();   
		}else {
			c.open();
			System.out.println("Some text");   
			c.open();
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
/*
class ChannelTest {
	public static void main(String args[]){
        Channel channel = new Channel();
		channel.open();
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
        int x;
		if(a % 2 == 0 && b < 10)
        {
	        channel.close();
    	    x = a;
        }
		else if (b % a == 0) 
        {
		    channel.read();
            x = b;
		} else {
            b = 10;
			int c = a + b;
		}
		channel.close();
	}
}
*/

/*

	------------------------------- Case 01 -----------------------------------

	a = 12, b = 12
	line 15: Channel Opened
	line 26: <Condition Satisfied>
	line 28: Channel Read
	line 34: Channel Closed
	
	Since, this execution follows a valid path (pattern), output should be YES

	------------------------------- Case 02 -----------------------------------

	a = 10, b = 8
	line 15: Channel Opened
	line 21: <Condition Satisfied>
	line 23: Channel Closed
	line 34: Channel Closed    ----> Error
	
	Output: NO
	
	---------------------------------------------------------------------------
*/
