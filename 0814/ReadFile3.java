import java.io.*;
class ReadFile3{
  public static void main(String[] args) {
    byte data[];
    //char temp[] = new char [100];
    int len = 0;
    try(FileInputStream fis = new FileInputStream("a1.txt")){
      //System.out.println("���e:");
      InputStreamReader isr = new InputStreamReader(fis);
      BufferedReader br = new BufferedReader(isr);

      len = fis. available();
      data = new byte[len];
      System.out.println("�ɮץ��p :" + len + "byte\n");
      System.out.println("���e:");
      String dat = "";
      /*
      if(fis.read(data)==len){ //���A�XŪ���j���ɮ�
        System.out.println(new String(data));
      }*/
      System.out.println("=================");
      while((dat=br.readLine())!=null){
        System.out.println(dat);
      }
    }catch(FileNotFoundException e1){
			System.out.println("���~:�ɮפ��s�b");
		}catch(IOException e2){
			System.out.println("���~:�g�ɿ��~");
		}
    //System.out.printf("123 :%s",temp);
  }
}
