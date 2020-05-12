
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;


public class TestData {
    public int cntr=1;
    
    
    @DataProvider
    public Object[][] getData() throws IOException {
        FileInputStream is = new FileInputStream("TestData.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(is);
        XSSFSheet ws = wb.getSheetAt(0 );
        int rowCount=ws.getPhysicalNumberOfRows();
        XSSFRow row = ws.getRow(ws.getFirstRowNum());
        int colCount = row.getLastCellNum()-row.getFirstCellNum();
        Object sheetData[][] = new Object[rowCount][colCount];
//        for (int r = ws.getFirstRowNum() + 1; r < ws.getLastRowNum(); r++) { //if you dont want to include columns
        for (int r = ws.getFirstRowNum(); r < rowCount; r++) {  //if you want to include columns
            XSSFRow objRow = ws.getRow(r);
            for (int c = objRow.getFirstCellNum(); c < objRow.getLastCellNum(); c++) {
                XSSFCell cell = objRow.getCell(c);
                if (cell == null) {
                    sheetData[r][c] = "";
                } else {
                    sheetData[r][c] = cell.getStringCellValue();
                }
            }
        }

        return sheetData;
    }

    @Test(dataProvider = "getData")
    public void print_params_from_dataprovider(String p1, String p2, String p3, String p4) {
        System.out.println("-----------:"+cntr);
        System.out.println("Param1 Value:"+p1);
        System.out.println("Param2 Value:"+p2);
        System.out.println("Param3 Value:"+p3);
        System.out.println("Param4 Value:"+p4);
        cntr++;
    }

}
