package util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class poi {
	Workbook wb = new HSSFWorkbook();
	
	DataFormat format = wb.createDataFormat();
	
	CellStyle style;
	
	Sheet sheet1 = wb.createSheet("APP列表");
	String[] title = {"软件名称","APK名称","软件大小（单位：M）","所属平台","所属分类","状态","下载次数","最新版本号"};
	
}
