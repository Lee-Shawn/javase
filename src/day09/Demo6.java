package day09;

public class Demo6 {
	public static void main(String[] args) {
		String s = "E:\\Code\\C++\\MOOC\\graphics\\graph.cpp";
		getFileName(s);
	}
	
	public static void getFileName(String path) {
		// ��ȡ�ַ��������һ��"\"
		int index = path.lastIndexOf("\\");
		// ��ȡ�ļ�������
		String fileName = path.substring(index+1);
		System.out.println(fileName);
	}
}
