package test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shuangyang.test.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
/*@ContextConfiguration("classpath:spring/applicationContext.xml")*/
public class Test1 {
	
	@Autowired
	UserService service;
	@Test
	public void print(String str) throws Exception{
		//List list = service.findUsers();
		System.out.println("从顶顶顶顶");
	}
	
}
