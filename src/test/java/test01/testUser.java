package test01;

import org.springframework.beans.factory.annotation.Autowired;

import mapper.DevUserMapper;
import pojo.DevUser;
import service.DevUserService;
import service.impl.DevUserServiceImpl;

public class testUser {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DevUserService service = new DevUserServiceImpl();
		DevUser user=null;
		try {
			 user= service.login("test001", "123456");
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("用户名 密码");
		}
		
		System.out.println(user);
	}

}
