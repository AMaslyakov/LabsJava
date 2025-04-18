package src.lr10.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GoodsCartXLSX {

    private static final Logger log = LogManager.getLogger(GoodsCartXLSX.class);
    private static final String MAIN_SHEET = "Товары";
    private static XSSFWorkbook document;


    GoodsCartXLSX(String filepath) throws IOException, IllegalArgumentException {
        check_file(filepath);
        document = new XSSFWorkbook(new FileInputStream(filepath));
    }

    private void check_file(String filepath) throws IllegalArgumentException, FileNotFoundException {
        File f = new File(filepath);
        if(!f.exists()){
            throw new FileNotFoundException("Файла: " + f.getAbsolutePath() + " не найдено");
        }
        if(!filepath.endsWith(".xlsx")){
            throw new IllegalArgumentException("Не правильное расширение файла");
        }
    }

    private XSSFSheet get_sheet(String sheetTitle){
        XSSFSheet sheet;
        sheet = document.getSheet(sheetTitle);
        return sheet;
    }


    public void print_goods() throws IOException {
       XSSFSheet sheet = get_sheet(MAIN_SHEET);
       FormulaEvaluator evaluator = document.getCreationHelper().createFormulaEvaluator();
       if(sheet == null){
           log.error("В документе отсутствует Лист: " + MAIN_SHEET);
       }else {

           for (Row row: sheet){
               int stop_row = Integer.MAX_VALUE;
                   for (Cell cell : row) {

                       if(cell.getCellType() == CellType.FORMULA){
                           CellValue value = evaluator.evaluate(cell);
                           System.out.print(value.getNumberValue() + "\t");
                           continue;
                       }

                       System.out.print(cell  +"\t");

                   }
                   if(row.getRowNum() == stop_row){
                       break;
                   }
                   System.out.println();
           }
       }
       document.close();
    }
}
