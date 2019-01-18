package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class WebTablesExamplesRepeat extends TestBase {

    public void login(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test"+ Keys.ENTER);

    }

@Test
    public void printWholeTable(){
        login();
        String wholeTable=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody")).getText();
        System.out.println(wholeTable);

    }

@Test
    public void printWholeHeaders(){
        login();
        WebElement headers=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]"));
    System.out.println(headers.getText());
}


@Test
    public void printRow(){
        login();
   ////*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[2]
    //List<WebElement> rows= driver.findElements()
    WebElement row= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]"));
    System.out.println(row.getText());

    List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td"));
    System.out.println(rows.get(1).getText());

    for (WebElement rw:rows
         ) {
        System.out.println(rw.getText());
    }

}



@Test
    public void tableSize(){
        login();
        List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td"));
    System.out.println(columns.size());

    List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr"));
    System.out.println(rows.size());

}


@Test
    public void printAllCellsInOneRow(){
        login();
        List<WebElement> cell=driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td"));
    for (WebElement row2:cell
         ) {
        System.out.println(row2.getText());
    }


    WebElement cell1= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[4]"));
    System.out.println(cell1.getText());

////*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[2]
}

@Test
    public void printCell(){
       login();
        WebElement cell1=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[5]"));
    System.out.println(cell1.getText());
    WebElement cell2=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[6]"));
    System.out.println(cell2.getText());



    }

    public WebElement getCell(int row, int col){
        String xpath= "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+row+"]/td["+col+"]";
        return driver.findElement(By.xpath(xpath));
    }

    @Test
    public void getCellExample(){
        login();
        System.out.println(getCell(4,6).getText());
        System.out.println(getCell(3,8).getText());
    }



    @Test
    public void columnAllValues(){
        login();
        List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[3]"));
        for (WebElement col:columns
             ) {
            System.out.println(col.getText());
        }
    }

    @Test
    public void checkbox(){
        login();
        WebElement check=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid_ctl05_OrderSelector']"));
        //System.out.println(check.isSelected());


//        if(check.isSelected()==false){
////           check.click();
////
////        }
        check.click();
        //System.out.println(check.isSelected());
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();


    }

    //@Test
    public void test(String str){
        login();
        List<WebElement> names=driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        //System.out.println(names.size());
        for (WebElement name:names
             ) {
            if(str.equals(name)){
                System.out.println("name: "+str+" found");
                break;
            }

        }

    }

@Test
    public void checkName(){
        //test("Paul Brown");
        test("Steve Johns");

}


@Test
    public void test(){
        login();
        List<WebElement> cityNames=driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[7]"));
        //System.out.println(names.size());
        for (WebElement city:cityNames
        ) {
            if(city.equals("Hillsberry, UT")){
                System.out.println("name: "+city+" found");

                break;
            }

        }

    }



    public int getColumnIndex(String column){
        //int columnIndex=0;
        login();
        List<WebElement> columnNames=driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));
        for (int i = 0; i <columnNames.size() ; i++) {
            if(columnNames.get(i).getText().equals(column)){
                return i+1;
            }
        }
        return 0;
    }



    @Test
    public void checkInfo(){
        int columnIndex=getColumnIndex("City");
        System.out.println(columnIndex);
       // System.out.println(getColumnIndex("Product"));
        List<WebElement> vlue=driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+columnIndex+"]"));
        boolean found =false;
        for (WebElement value:vlue
             ) {
           if (value.getText().equals("Las Vegas, NV")){
               System.out.println(value.getText()+" found");
               found=true;
               break;
           }
        }

        Assert.assertTrue(found);

    }


}
