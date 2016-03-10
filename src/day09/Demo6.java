package day09;

public class Demo6 {
	public static void main(String[] args) {
		String s = "E:\\Code\\C++\\MOOC\\graphics\\graph.cpp";
		getFileName(s);
	}
	
	public static void getFileName(String path) {
		// 获取字符串中最后一个"\"
		int index = path.lastIndexOf("\\");
		// 获取文件名索引
		String fileName = path.substring(index+1);
		System.out.println(fileName);
	}
}
