package org.spring.message.rabbit.tutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TutorialApplicationTests {

	@Test
	public void contextLoads() {
		int g = 0, t=9;

		do{
			System.out.println(g);
			g+=2;
		}while (t>=g);

		for(int i=0;i<=t; i += 2){
			System.out.println("for " + i);
		}
	}

}
