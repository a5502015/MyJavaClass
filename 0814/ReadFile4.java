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
      //System.out.println("�ɮץ��p :" + len + "byte\n");
      System.out.println("���e:");
      String data = "";
      /*
      if(fis.read(data)==len){ //���A�XŪ���j���ɮ�
        System.out.println(new String(data));
      }*/
      System.out.println("=================");
      while((data=br.readLine())!=null){
        System.out.println(data);
      }
    }catch(FileNotFoundException e1){
			System.out.println("���~:�ɮפ��s�b");
		}catch(IOException e2){
			System.out.println("���~:�g�ɿ��~");
		}
    //System.out.printf("123 :%s",temp);
  }
}
