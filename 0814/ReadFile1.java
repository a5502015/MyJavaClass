import java.io.*;
class ReadFile1{
  public static void main(String[] args) {
    byte data[] = new byte[1];
    char temp[] = new char [100];
    int len = 0;
    try(FileInputStream fis = new FileInputStream("a1.txt")){
      //System.out.println("內容:");
      len = fis. available();
      System.out.println("檔案打小 :" + len + "byte\n");
      System.out.println("內容:");
      int i=0;
      while(fis.read(data)!=-1){
        //System.out.print(data[0] + " ");
        System.out.print((char)data[0]);
        //temp[i] = (char)data[0];
        //i++;
      }
    }catch(FileNotFoundException e1){
			System.out.println("錯誤:檔案不存在");
		}catch(IOException e2){
			System.out.println("錯誤:寫檔錯誤");
		}
    //System.out.printf("123 :%s",temp);
  }
}
