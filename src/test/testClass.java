package test;

import main.excelUtility.readExcelFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class testClass {

    public static void main(String[] args) {
       String expectedPriceSheetPath = System.getProperty("user.dir")+"/src/Resources/ExpectedPrice.xlsx";
        readExcelFile readFile = new readExcelFile(expectedPriceSheetPath);
        String cellData = readFile.getCellData("Price","PLU","US-HCB852Z-A-ADDPAGE","DKK");
        System.out.println(cellData);
    }

}
