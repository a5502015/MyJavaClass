class TestPrintf{
	public static void main(String[] arg){
		System.out.printf("圓周率:[%8.2f]\n",Math.PI);
		System.out.printf("圓周率:[%+8.2f]\n",Math.PI);
		System.out.printf("圓周率:[%-8.2f]\n",Math.PI);
		System.out.printf("圓周率:[%.2f]\n",Math.PI);
		System.out.printf("127的八進位值: %o , 十六進位值: %x\n",127,127);
		System.out.printf("127的八進位值: %o , 十六進位值: %#x\n",127,127);
		System.out.printf("0x7f的十進位值:%d\n",0x7f);
		System.out.printf("1010的十進位值:%d\n",0b1010);
		System.out.printf("10>5結果:%b\n",10>5);
		System.out.print(String.format("圓周率:[%8.2f]\n",Math.PI));
		System.out.print(String.format("圓周率:[%+8.2f]\n",Math.PI));
		System.out.print(String.format("圓周率:[%-8.2f]\n",Math.PI));
		System.out.print(String.format("圓周率:[%.2f]\n",Math.PI));
	}


}