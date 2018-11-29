package service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import mapper.AppInfoMapper;
import pojo.AppInfo;
import service.AppService;
import util.TiaoJian;


@Service
public class AppServiceImpl implements AppService {
	@Resource
	private AppInfoMapper mapper;
	
	
	public AppInfo getAppInfo(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfo(id, null);
	}

	
	public PageInfo<AppInfo> getAppInfoList(String querySoftwareName,
			Integer queryCategoryLevel1,
			Integer queryCategoryLevel2, Integer queryCategoryLevel3,
			Integer queryFlatformId,Integer currentPageNo,
			Integer pageSize) throws Exception {
		PageHelper.startPage(currentPageNo, pageSize);
		List<AppInfo> list = mapper.getAppInfoList(querySoftwareName, 1, queryCategoryLevel1, queryCategoryLevel2, 
                queryCategoryLevel3, queryFlatformId, null);
		PageInfo<AppInfo> pageInfo = new  PageInfo<AppInfo>(list);
		return pageInfo;
	}

	
	public int getAppInfoCount(String querySoftwareName,
			Integer queryCategoryLevel1,
			Integer queryCategoryLevel2, Integer queryCategoryLevel3,
			Integer queryFlatformId) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfoCount(querySoftwareName, 1, queryCategoryLevel1, queryCategoryLevel2, 
                queryCategoryLevel3, queryFlatformId, null);
	}

	
	public boolean updateSatus(Integer status, Integer id) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(mapper.updateSatus(status, id) > 0 ){
			flag = true;
		}
		return flag;
	}
}
