package mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import pojo.DevUser;
@Repository
public interface DevUserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public DevUser getLoginUser(@Param("devCode")String devCode)throws Exception;
}
