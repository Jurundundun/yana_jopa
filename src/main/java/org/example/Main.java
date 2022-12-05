package org.example;

import org.example.entity.CompanyEntity;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<Integer, CompanyEntity> COMPANY_MAP = new HashMap<>();
    public static void main(String[] args) {
        FileOperations.openExcelFile("tables.xlsx");
        FileOperations.parseCompanyFromExcel("Company",COMPANY_MAP);
        for (CompanyEntity company: COMPANY_MAP.values()){
            System.out.println(company);
        }
    }
}
