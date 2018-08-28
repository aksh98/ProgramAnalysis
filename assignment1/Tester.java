import java.io.* ;
import java.util.Scanner; 


class Tester {

	public static void main(String args[])
	{

  		String file = "/Users/akarsha/Downloads/assignment1/ChannelTest.java";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) 
		{
 			String line;
		  
			PrintStream o = new PrintStream(new FileOutputStream("output.java"));
			PrintStream console = System.out;
	
	        System.setOut(o);
	        // System.out.println("written to the text file");
	
	        // System.setOut(console);
	        // System.out.println("written on the console!");
	        /////////////////////////////////////////////////////////

	        int counter = 1;
	        System.out.println("import java.io.* ;");
	        line = br.readLine();
	        /////////////////////////////////////////////////////////
	        int lala = 0;
			while((line) != null)
			{
				counter++;
				// for(int i = 0; i < line.length; i ++)
				// {
					String lin = line;

					if(lala == 2){ //lala = 2 when no {
						if(!(lin.contains("{"))){
							System.out.println("{"); 
							lala = 3; } // when no }
					} /////////// kaanddddddd---------------
					if(lin.contains("ChannelTest")){
						System.out.println("class output {");
					}
					else{
					System.out.println(lin);
						}
					
					
					if(lala == 3){
						System.out.println("System.out.println(\"Line "+ counter+ ": <Condition Satisfied>\");");lala = 0; 
						System.out.println("}");
					}

					if(lala == 2){
						if(lin.contains("{")){
							System.out.println("System.out.println(\"Line "+ counter+ ": <Condition Satisfied>\");");lala = 0; }
					}

					if(lala == 1){
						System.out.println("int flag = 0,temp = 0;");
						System.out.println("try {");
						System.out.println("PrintStream o = new PrintStream(new FileOutputStream(\"out.txt\"));");					
						System.out.println("PrintStream console = System.out;");
						System.out.println("System.setOut(o);");
						System.out.println("} catch (IOException e) {e.printStackTrace();}");
	       				lala = 0; }


					if(lin.contains("void main(")){
						lala = 1;
					}
					if(lin.contains("a=")){
						System.out.println("System.out.println(\"Line "+counter+": a =\"+ a);");
					}
					if(lin.contains("b=")){
						System.out.println("System.out.println(\"Line "+counter+": b =\"+ b);");			
					}
				//====================================================================================

					if(lin.contains("if") || lin.contains("else")){
						if(lin.contains("{")){
							System.out.println("System.out.println(\"Line "+ counter+ ": <Condition Satisfied>\");");
						}
						else{
							lala = 2;
						}
					}
				//====================================================================================

					if(lin.contains(".close()"))
					{
						System.out.println("if(flag==1){");
						System.out.println("System.out.println(\"Line "+counter+": Channel Closed\");}");
						System.out.println("else {");
						System.out.println("System.out.println(\"Line "+counter+": Channel Closed --> ERROR\"); System.out.println(\" Output => NO\");temp = 1; return;}");
						System.out.println("flag = 0;");
					}
				//====================================================================================
					if(lin.contains(".open()"))
					{
						System.out.println("if(flag == 1){");
						System.out.println("System.out.println(\"Line "+counter+": Channel Opened --> ERROR\"); System.out.println(\" Output => NO\");temp = 1; return;}");		
						System.out.println("else { flag = 1;");	
						System.out.println("System.out.println(\"Line "+counter+": Channel Opened\");}");


					}
				//====================================================================================
					if(lin.contains(".read()")){
						System.out.println("if(flag == 1){");
						System.out.println("System.out.println(\"Line "+counter+": Channel Read\");}");
						System.out.println("else {");
						System.out.println("System.out.println(\"Line "+counter+": Channel Read --> ERROR\"); System.out.println(\"Output => NO\"); temp = 1; return;}");		

					}
				//====================================================================================
					if(lin.contains(".write()")){
						System.out.println("if(flag == 1){");
						System.out.println("System.out.println(\"Line "+counter+": Channel Write\");}");
						System.out.println("else {");
						System.out.println("System.out.println(\"Line "+counter+": Channel Write --> ERROR\"); System.out.println( \"Output => NO\"); temp = 1; return;}");
					}
				//====================================================================================
					
				// } // while ends
				line = br.readLine();
			}
		} catch (IOException e) {e.printStackTrace();}	 
       
        /////////////////////////////////////////////////////////

		// inFile.close();	

	}

}


// 1. The channel is always closed after it is opened.
