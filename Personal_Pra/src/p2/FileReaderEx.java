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
	       // ����Ʈ ������ �����б�
	        String filePath = "C:\\Users\\user\\git\\Personal_Java_Pra\\Personal_Pra\\data_Save.txt"; // ��� ����
	        FileInputStream fileStream = null; // ���� ��Ʈ��
	        
	        fileStream = new FileInputStream( filePath );// ���� ��Ʈ�� ����
	        //���� ����
	        byte[ ] readBuffer = new byte[fileStream.available()];
	        while (fileStream.read( readBuffer ) != -1){}
	        System.out.println(new String(readBuffer)); //���

	        fileStream.close(); //��Ʈ�� �ݱ�
	    } catch (Exception e) {
		e.getStackTrace();
	    }
}
}
