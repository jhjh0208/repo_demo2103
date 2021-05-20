package design.duck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiDuckSimulation {
	//spring-beans.jar 안에 
	
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("design\\duck\\duckBean.xml"); //클래스패스에 등록된 xml 파일을 불러서 인스턴스화.
		Duck myDuck = (Duck) context.getBean("myDuck");
		myDuck.performQuack();
		myDuck.performFly();
		myDuck = null; //14에서 15로 넘어가는 순간에 캔디데이트 상태가 된다.
		myDuck = new MallardDuck(); //다시 생성함. 결국 11번 덕과 15번 덕은 전혀 다른 덕. 11번 덕은 관리를 받지만 15번 덕은 전혀 관리 받지 않는다.
		myDuck.performQuack();
		myDuck.performFly();

	}

}
