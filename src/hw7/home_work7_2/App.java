package hw7.home_work7_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
	public static void main(String[] args)  {
		try {
		Random r =new Random();
		int[] lst = r.getRandom();
		FileWriter fw = new FileWriter("C:\\CKA101_Workspace\\CKA101Homework-03\\src\\hw7\\home_work7_2\\Data.txt",true);
		BufferedWriter bfr = new BufferedWriter(fw);
		for(int i=0;i<lst.length;i++) {
			bfr.write(Integer.toString(lst[i]));
			bfr.append(" ");
			System.out.println(lst[i]);
		}
		bfr.close();
		fw.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		try {
	        // 測試複製檔案
			CopeFile("C:\\CKA101_Workspace\\CKA101Homework-03\\src\\hw7\\home_work7_2\\Data.txt","C:\\CKA101_Workspace\\CKA101Homework-03\\src\\hw7\\home_work7_2\\c1.txt");
	    } catch (IOException e) {
	        System.out.println("複製失敗：" + e.getMessage());
	    }
	}
	public static void CopeFile(String sourcePath,String destPath) throws IOException {
		Path source = Paths.get(sourcePath);
		Path dest = Paths.get(destPath);
		Files.copy(source,dest);
		System.out.println("複製檔案成功");
		
	}
}
