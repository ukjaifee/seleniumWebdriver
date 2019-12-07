/*package com.sakValut.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class skipClasses {
	
	XmlSuite suite = new XmlSuite();
    suite.setName("TmpSuite");
   
    

    XmlTest test = new XmlTest(suite);
    test.setName("TmpTest");
    List<XmlClass> classes = new ArrayList<XmlClass>();
    List<XmlSuite> suites = new ArrayList<XmlSuite>();

    FileInputStream file=new FileInputStream(new File("D:\\TestCases.xlsx"));

    XSSFWorkbook workbook=new XSSFWorkbook(file);

    XSSFSheet sheet=workbook.getSheetAt(0);

    for(int i=1; i<sheet.getPhysicalNumberOfRows(); i++){

        if(sheet.getRow(i).getCell(1).getStringCellValue().equals("Y")){


            classes.add(new XmlClass(sheet.getRow(i).getCell(0).getStringCellValue()));

        }

    }

    test.setXmlClasses(classes) ;
    suites.add(suite);
    TestNG tng = new TestNG();
    tng.setXmlSuites(suites);
    tng.run();

}
*/