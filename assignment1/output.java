import java.io.* ;
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

class output {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
int flag = 0,temp = 0;
try {
PrintStream o = new PrintStream(new FileOutputStream("out.txt"));
PrintStream console = System.out;
System.setOut(o);
} catch (IOException e) {e.printStackTrace();}
		int a=s.nextInt();
System.out.println("Line 34: a ="+ a);
		Channel c=new Channel();
		
		if(a%2==0) {
System.out.println("Line 37: <Condition Satisfied>");
			c.open(); c.close();   
if(flag==1){
System.out.println("Line 38: Channel Closed");}
else {
System.out.println("Line 38: Channel Closed --> ERROR"); System.out.println(" Output => NO");temp = 1; return;}
flag = 0;
if(flag == 1){
System.out.println("Line 38: Channel Opened --> ERROR"); System.out.println(" Output => NO");temp = 1; return;}
else { flag = 1;
System.out.println("Line 38: Channel Opened");}
		}else {
System.out.println("Line 39: <Condition Satisfied>");
			c.open();
if(flag == 1){
System.out.println("Line 40: Channel Opened --> ERROR"); System.out.println(" Output => NO");temp = 1; return;}
else { flag = 1;
System.out.println("Line 40: Channel Opened");}
			System.out.println("Some text");   
		}
		while(a>=0) {                                     
			c.close();
if(flag==1){
System.out.println("Line 44: Channel Closed");}
else {
System.out.println("Line 44: Channel Closed --> ERROR"); System.out.println(" Output => NO");temp = 1; return;}
flag = 0;
			a=a/2;
System.out.println("Line 45: a ="+ a);
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
class output {
	public static void main(String args[]){
        Channel channel = new Channel();
int flag = 0,temp = 0;
try {
PrintStream o = new PrintStream(new FileOutputStream("out.txt"));
PrintStream console = System.out;
System.setOut(o);
} catch (IOException e) {e.printStackTrace();}
		channel.open();
if(flag == 1){
System.out.println("Line 92: Channel Opened --> ERROR"); System.out.println(" Output => NO");temp = 1; return;}
else { flag = 1;
System.out.println("Line 92: Channel Opened");}
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
        int x;
		if(a % 2 == 0 && b < 10)
        {
System.out.println("Line 98: <Condition Satisfied>");
	        channel.close();
if(flag==1){
System.out.println("Line 99: Channel Closed");}
else {
System.out.println("Line 99: Channel Closed --> ERROR"); System.out.println(" Output => NO");temp = 1; return;}
flag = 0;
    	    x = a;
        }
		else if (b % a == 0) 
        {
System.out.println("Line 103: <Condition Satisfied>");
		    channel.read();
if(flag == 1){
System.out.println("Line 104: Channel Read");}
else {
System.out.println("Line 104: Channel Read --> ERROR"); System.out.println("Output => NO"); temp = 1; return;}
            x = b;
		} else {
System.out.println("Line 106: <Condition Satisfied>");
            b = 10;
			int c = a + b;
		}
		channel.close();
if(flag==1){
System.out.println("Line 110: Channel Closed");}
else {
System.out.println("Line 110: Channel Closed --> ERROR"); System.out.println(" Output => NO");temp = 1; return;}
flag = 0;
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
