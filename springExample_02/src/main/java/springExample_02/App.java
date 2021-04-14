package springExample_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
		
		Laptop l = (Laptop) c.getBean("laptop");
		
		System.out.println("Ram size : "+l.getLaptopRam().getSize());
		System.out.println("HDD size : "+l.getDriveSize().getHddSize());
		
	}

}
