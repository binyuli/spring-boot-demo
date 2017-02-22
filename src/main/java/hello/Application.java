package hello;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application{
	private static final Logger logger = Logger.getLogger(Application.class);
	
	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        logger.debug("start in Application:");	// 记录不到日志
        System.out.println("start in Application:");
        
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}
		
}
