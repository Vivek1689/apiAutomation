package main.excelUtility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

public class readExcelFile {
    public String path;
    public FileInputStream fis = null;
    public FileOutputStream fileOut = null;
    private XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row = null;
    private XSSFCell cell = null;

    public readExcelFile(String path) {

        this.path = path;
        try {

            fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public int getRowNumber (String sheetName, String columnName,String plu){
        int sheetCount;
        int rowNumber = -1;
        sheetCount = workbook.getNumberOfSheets();
        for(int i=0;i<sheetCount;i++){
            if(workbook.getSheetName(i).equalsIgnoreCase(sheetName)){
                sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row row= rows.next(); //This would get the first row
                Iterator<Cell> cell = row.cellIterator();
                int k = 0, coloumn = 0;
                while(cell.hasNext()){
                    Cell cellValue = cell.next();
                    if(cellValue.getStringCellValue().equalsIgnoreCase(columnName)){
                        coloumn = k;
                        break;
                    }k++;
                }
                while(rows.hasNext()){
                    Row row1 = rows.next();
                    if(row1.getCell(coloumn).getStringCellValue().equalsIgnoreCase(plu)){
                        rowNumber =  row1.getRowNum();
                        break;
                    }
                }
            }
        }
        return rowNumber;
    }

    public String getCellData(String sheetName, String columnName,String plu,String currencyCode){
        int rowNumber = getRowNumber(sheetName,columnName,plu);
        rowNumber++;
        readWriteExcelFile readWriteExcel = new readWriteExcelFile(path);
        return readWriteExcel.getCellData(sheetName, currencyCode, rowNumber);
    }


}

