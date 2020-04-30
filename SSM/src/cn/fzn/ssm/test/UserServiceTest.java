package cn.fzn.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.fzn.ssm.pojo.User;
import cn.fzn.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testSelectList() {
		List<User> list = userService.selectList();
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	
	@Test
	public void testInsert() {
	}

	@Test
	public void testSelectByPrimaryKey() {
	}


	@Test
	public void testDelteByPrimaryKey() {
	}

}
