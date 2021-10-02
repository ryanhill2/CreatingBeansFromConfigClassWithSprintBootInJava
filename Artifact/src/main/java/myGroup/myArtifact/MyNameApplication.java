package myGroup.myArtifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyNameApplication.class, args);

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		IPhone IPhone = factory.getBean(myGroup.myArtifact.IPhone.class);

//		Samsung sam = new Samsung();
		IPhone.CallIPhoneCPUProcess();
	}

}
