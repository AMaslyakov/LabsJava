package src.lr10.task1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadXLSX {
    public static void main(String[] args) throws IOException {
        String filepath = "src/lr10/task1/goods.xlsx";
        FileInputStream inputStream = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Товары");

        for(Row row: sheet){
            for(Cell cell: row) System.out.print(cell.toString() + "\t");
            System.out.println();}
        workbook.close();
        inputStream.close();}}
