package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ApachePOIExcel {
	
	private static final String FILE_NAME = "resources/data.xlsx";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try {
			FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
			//Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
          //Iterate through each rows one by one
            // Iterator<Row> rowIterator = sheet.iterator();
        
            System.out.println();
            
            
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
