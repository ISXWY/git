package service;

import java.util.List;
import pojo.AppCategory;

public interface AppCategoryService {
	/**
	 * 根据父节点parentId获取相应的分类列�?
	 * @param parentId
	 * @return
	 * @throws Exception
	 */
	public List<AppCategory> getAppCategoryListByParentId(Integer parentId)throws Exception;
}
