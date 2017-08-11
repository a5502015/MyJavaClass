import java.io.*;

class TestPrint{

	public static void main(String[] arg){
		PrintStream ps=new PrintStream(System.out,true);
		PrintWriter pw=new PrintWriter(System.out,true);

		ps.println("用PrintStream建立的輸出指令");
		pw.println("用PrintWriter建立的輸出指令");

	}
}
