class TestString5{
	public static void main(String[] arg){
		StringBuilder sb=new StringBuilder();
		System.out.println("sb �r��e�q:" + sb.capacity());
		System.out.println("sb �r�����:" + sb.length());
		sb.append("Hello").append(" World");
		StringBuilder sb2=sb;
		System.out.println(sb);
		System.out.println(sb2);
		sb2.append(" Hello").append(" Java");
		sb.insert(11," Hello OCP");
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println("sb �r��e�q:" + sb.capacity());
		System.out.println("sb �r�����:" + sb.length());
		sb.delete(14,16);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
	}

}