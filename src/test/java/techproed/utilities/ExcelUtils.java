package techproed.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class ExcelUtils {

    Workbook workbook;
    Sheet sheet;
    String path;

    //Costructor: Excel path'ine ve Excel'deki sayfaya ulaşmak için 2 parametreli
    //            Contructor oluşturduk.
    public ExcelUtils(String path, String sheetName) {
        this.path = path;

        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Satır ve sütun sayıları girildiğinde, o hücrede ki veriyi return eder.
    public String getCellData(int rowNumber,int columnNumber){
        Cell cell = sheet.getRow(rowNumber).getCell(columnNumber);
        return cell.toString();
    }
    //Excelde ki satır sayısını return eder
    public int rowCount(){
       return sheet.getLastRowNum();
    }
    //Excelde ki sütun sayısını return eder
    public int columnCount(){
        return sheet.getRow(0).getLastCellNum();
    }
}
