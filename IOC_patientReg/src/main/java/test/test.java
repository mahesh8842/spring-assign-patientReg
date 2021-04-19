package test;
import java.util.*;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import mainController.mainController;
import patientVO.patientVO;
public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter patient Name ::");
		String name=sc.next();
		System.out.println("enter patient Address ::");
		String addr=sc.next();
		System.out.println("enter patient Mobile Number ::");
		String number=sc.next();
		System.out.println("enter patient`s bill amount ::");
		String bill=sc.next();
		
		patientVO vo=new patientVO();
		vo.setpName(name);
		vo.setpAddr(addr);
		vo.setpNo(number);
		vo.setBillAmt(bill);
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("petientCONFG/appContext.xml");
		 mainController controller=factory.getBean("controller",mainController.class);
	
		 try {
			 String result=controller.registerPatient(vo);
			 System.out.println(result);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
			 System.out.println("error occured !! please try again later");
		 }
	
	
	}

	
}
