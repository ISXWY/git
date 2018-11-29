package service;

import org.springframework.stereotype.Service;

import pojo.DevUser;

@Service
public interface DevUserService {
	/**
	 * 用户登录
	 * @param devCode
	 * @param devPassword
	 * @return
	 */
	public DevUser login(String devCode,String devPassword) throws Exception;
}
