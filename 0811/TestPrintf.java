class TestPrintf{
	public static void main(String[] arg){
		System.out.printf("��P�v:[%8.2f]\n",Math.PI);
		System.out.printf("��P�v:[%+8.2f]\n",Math.PI);
		System.out.printf("��P�v:[%-8.2f]\n",Math.PI);
		System.out.printf("��P�v:[%.2f]\n",Math.PI);
		System.out.printf("127���K�i���: %o , �Q���i���: %x\n",127,127);
		System.out.printf("127���K�i���: %o , �Q���i���: %#x\n",127,127);
		System.out.printf("0x7f���Q�i���:%d\n",0x7f);
		System.out.printf("1010���Q�i���:%d\n",0b1010);
		System.out.printf("10>5���G:%b\n",10>5);
		System.out.print(String.format("��P�v:[%8.2f]\n",Math.PI));
		System.out.print(String.format("��P�v:[%+8.2f]\n",Math.PI));
		System.out.print(String.format("��P�v:[%-8.2f]\n",Math.PI));
		System.out.print(String.format("��P�v:[%.2f]\n",Math.PI));
	}


}