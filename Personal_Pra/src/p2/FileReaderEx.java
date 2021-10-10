package p2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx {
public static void main(String[] args) throws IOException{
	try {
	       // 바이트 단위로 파일읽기
	        String filePath = "C:\\Users\\user\\git\\Personal_Java_Pra\\Personal_Pra\\data_Save.txt"; // 대상 파일
	        FileInputStream fileStream = null; // 파일 스트림
	        
	        fileStream = new FileInputStream( filePath );// 파일 스트림 생성
	        //버퍼 선언
	        byte[ ] readBuffer = new byte[fileStream.available()];
	        while (fileStream.read( readBuffer ) != -1){}
	        System.out.println(new String(readBuffer)); //출력

	        fileStream.close(); //스트림 닫기
	    } catch (Exception e) {
		e.getStackTrace();
	    }
}
}
