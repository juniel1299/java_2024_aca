package 476;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class userVoice {
	
	private static String path;
	static {
		path = "C:\\class\\code\\java\\ewttew\\476\\uservoicelist.txt";
	}
	
	private static ArrayList<userVoiceInfo> list = new ArrayList<>();
	
	
	public static void readAll() {
		
		try {
			
			String line = "";
			String[] temp = null;
			String st;
			int count = 1; // 민원 리스트 앞 번호
			int input = 0; // 민원 리스트 중 읽을 번호입력
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			Scanner scan = new Scanner(System.in);
			userVoiceInfo info;
			
			while((line = reader.readLine()) != null) { // 민원 한 줄씩 불러오기
				temp = line.split(",");
				st = String.format("%d %s %s %s %b ", count, temp[0], temp[1], temp[2], temp[3]);
				//list.add(info);
				count++;
				System.out.println(st);
			}
			
			
			System.out.print("읽을 민원을 입력하세요.");
			input = scan.nextInt();
			
			for(int i=0; i<input; i++) {
				if(i == input) {
				}
			}
			
			
			
			
			
			
			
			
			reader.close();
		} catch (Exception e) {
			System.out.println("UserVoice.readAll");
			e.printStackTrace();
		}
	}
	
	

	public static void write() {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
			
			for(int i=100; i<120; i++) {
				String temp = String.format("abc%d,%d,가나다라마바사,0",i,i);
				writer.write(temp);
				writer.newLine();
			}
			
			System.out.println("저장완료");
			writer.close();
			
		} catch (Exception e) {
			System.out.println("UserVoice.write");
			e.printStackTrace();
		}
	}
}





//일반민원정보  아이디,제목,내용,읽음여부(boolean)