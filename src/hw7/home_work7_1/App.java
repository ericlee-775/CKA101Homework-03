package hw7.home_work7_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		String str;
		int count=0;
		int ch=0;
		File file = new File("C:\\CKA101_Workspace\\CKA101Homework-03\\src\\hw7\\home_work7_1\\Sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader bfr = new BufferedReader(fr);
		while((str=bfr.readLine())!=null) {
			count++;
			ch+=str.length();
			}
//		位元組（硬碟空間
		System.out.println(file.getName()+"檔案共有"+file.length()+"位元組，"+ch+"個字元，"+count+"列資料");
		bfr.close();
		fr.close();
	}
}
