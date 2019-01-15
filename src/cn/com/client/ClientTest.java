package cn.com.client;

import java.util.List;
import java.util.Scanner;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;

public class ClientTest {
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("欢迎进入中英双向翻译系统");
			System.out.println("请输入需要翻译词语...");
			String word = scanner.nextLine();
			if (!"exit".equals(word.toLowerCase())) {
				EnglishChinese englishChinese = new EnglishChinese();

				EnglishChineseSoap englishChineseSoap = englishChinese.getEnglishChineseSoap();

				ArrayOfString data = englishChineseSoap.translatorString(word);

				List<String> result = data.getString();
				System.out.println(result);
				System.out.println();
			} else {
				System.out.println("谢谢使用中英双向翻译系统，Bye~");
				break;
			}
		}
	}
}
