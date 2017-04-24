package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.common.Page;
import com.entity.User;
import com.service.UserService;
import com.service.UserServiceImpl;

public class UserTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext app=new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserService users=app.getBean(UserServiceImpl.class);
		User u= new User();
		Page<User> p=users.select(u);
		System.out.println(p);
	}
}
