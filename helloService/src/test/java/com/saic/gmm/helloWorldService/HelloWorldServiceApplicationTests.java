package com.saic.gmm.helloWorldService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.saic.gmm.helloWorldService.controllers.HelloWorldController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldServiceApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testSayHello() {
		HelloWorldController controller = new HelloWorldController();
		String result = controller.sayHello();
		Assert.assertEquals("Hello World!", result);
	}
	

}
