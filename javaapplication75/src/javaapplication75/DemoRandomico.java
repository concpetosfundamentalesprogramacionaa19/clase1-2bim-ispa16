package javaapplication75;
import java.util.Random ;
public class DemoRandomico {
	
	public static void main(String [] args) {
		Random aleatorios = new Random();
		int v = aleatorios.nextInt(4);
		System.out.println(v);
	}
	
}
