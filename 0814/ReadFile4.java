import java.io.*;
class ReadFile4{
  public static void main(String[] args) {
    //byte data[];
    //char temp[] = new char [100];
    int len = 0;
    try(FileReader fr = new FileReader("a1.txt");
      BufferedReader br = new BufferedReader(fr)){

      //len = fr. available();
      //data = new byte[len];
      //System.out.println("檔案打小 :" + len + "byte\n");
      System.out.println("內容:");
      String data = "";
      /*
      if(fis.read(data)==len){ //不適合讀取大型檔案
        System.out.println(new String(data));
      }*/
      System.out.println("=================");
      while((data=br.readLine())!=null){
        System.out.println(data);
      }
    }catch(FileNotFoundException e1){
			System.out.println("錯誤:檔案不存在");
		}catch(IOException e2){
			System.out.println("錯誤:寫檔錯誤");
		}
    //System.out.printf("123 :%s",temp);
  }
}
