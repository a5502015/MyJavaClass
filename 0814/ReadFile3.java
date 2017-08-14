import java.io.*;
class ReadFile3{
  public static void main(String[] args) {
    byte data[];
    //char temp[] = new char [100];
    int len = 0;
    try(FileInputStream fis = new FileInputStream("a1.txt")){
      //System.out.println("內容:");
      InputStreamReader isr = new InputStreamReader(fis);
      BufferedReader br = new BufferedReader(isr);

      len = fis. available();
      data = new byte[len];
      System.out.println("檔案打小 :" + len + "byte\n");
      System.out.println("內容:");
      String dat = "";
      /*
      if(fis.read(data)==len){ //不適合讀取大型檔案
        System.out.println(new String(data));
      }*/
      System.out.println("=================");
      while((dat=br.readLine())!=null){
        System.out.println(dat);
      }
    }catch(FileNotFoundException e1){
			System.out.println("錯誤:檔案不存在");
		}catch(IOException e2){
			System.out.println("錯誤:寫檔錯誤");
		}
    //System.out.printf("123 :%s",temp);
  }
}
