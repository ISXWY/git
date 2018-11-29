package service;

import java.util.List;

import pojo.DataDictionary;

public interface DataDictionaryService {
	
	/**
	 * 根据typeCode查询相应的数据字典列�?
	 * @param typeCode
	 * @return
	 * @throws Exception
	 */
	public List<DataDictionary> getDataDictionaryList(String typeCode)throws Exception;
}
