import java.io.*;
class ReadFile2{
  public static void main(String[] args) {
    byte data[];
    //char temp[] = new char [100];
    int len = 0;
    try(FileInputStream fis = new FileInputStream("a1.txt")){
      //System.out.println("���e:");
      len = fis. available();
      data = new byte[len];
      System.out.println("�ɮץ��p :" + len + "byte\n");
      System.out.println("���e:");
      //int i=0;
      /*
      while(fis.read(data)!=-1){
        //System.out.print(data[0] + " ");
        System.out.print((char)data[0]);
        //temp[i] = (char)data[0];
        //i++;
      }
      */
      if(fis.read(data)==len){ //���A�XŪ���j���ɮ�
        System.out.println(new String(data));
      }
    }catch(FileNotFoundException e1){
			System.out.println("���~:�ɮפ��s�b");
		}catch(IOException e2){
			System.out.println("���~:�g�ɿ��~");
		}
    //System.out.printf("123 :%s",temp);
  }
}
