import java.io.*;

class TestPrint{

	public static void main(String[] arg){
		PrintStream ps=new PrintStream(System.out,true);
		PrintWriter pw=new PrintWriter(System.out,true);

		ps.println("��PrintStream�إߪ���X���O");
		pw.println("��PrintWriter�إߪ���X���O");

	}
}
