package org.example;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.example.entity.CompanyEntity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class FileOperations {
    private static XSSFWorkbook myExcelBook;
    private static XWPFDocument document;

    public static void openExcelFile(String fileName) {

        try (FileInputStream fileInputStream = new FileInputStream(fileName)){
            myExcelBook = new XSSFWorkbook(fileInputStream);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("Failed to read information from file");
            e.printStackTrace();
        }
    }
    public static void parseCompanyFromExcel( String sheetName,Map<Integer, CompanyEntity> companyMap){
        XSSFSheet sheet = myExcelBook.getSheet(sheetName);
        for(Row row: sheet){
            CompanyEntity companyEntity = new CompanyEntity();
            companyEntity.setId((int) row.getCell(0).getNumericCellValue());
            companyEntity.setName(row.getCell(1).getStringCellValue());
            companyEntity.setAddress(row.getCell(2).getStringCellValue());
            companyEntity.setInn((long) row.getCell(3).getNumericCellValue());
            companyMap.put(companyEntity.getId(),companyEntity);
        }
    }

}
