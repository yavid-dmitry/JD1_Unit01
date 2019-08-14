package by.htp.task02.main;
/*
 * 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
 * В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 */
import java.io.*;
public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int c = reader.read();
			switch ((char)c) {
			case 'Д': {System.out.println("Мне нравятся девочки!"); break;}
			case 'М': {System.out.println("Мне нравятся мальчики"); break;}
			default: {System.out.println("Моя твоя не понимает"); break;}
			
			}
			
			
			
			
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
