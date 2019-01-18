package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExamples extends TestBase {

@Test
public void printWholeTable(){
    login();
    WebElement table= driver.findElement(By.id("ctl00_MainContent_orderGrid"));
    System.out.println(table.getText());//whole table


}


    public void login(){
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
       driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
       driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test"+ Keys.ENTER);
    }

@Test
    public void printAllHeaders(){
    login();
    //    //table[@id='ctl00_MainContent_orderGrid']//th

    List<WebElement> headers=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));
    for (WebElement header:headers) {
        System.out.println(header.getText());//headers are printed
    }

}
    @Test
    public void printRow(){
        login();
        List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr")); //]//tr[1] row 1 yazdirilir
        System.out.println("number of rows: "+allRows.size());

        for (WebElement rows:allRows
             ) {
            System.out.println(rows.getText());

        }

        System.out.println("printing rows 1 by 1");
        System.out.println(allRows.get(3).getText());



}


@Test
    public void tableSize(){
    login();
    List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
    System.out.println("number of rows: "+allRows.size());


    //      //table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/t      column sayisi

    List<WebElement> allHeaders=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));
    System.out.println("number of columns: "+allHeaders.size());
}


//print a row without using list
@Test
    public void printRow2(){
    login();
    WebElement row=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]"));
    System.out.println(row.getText());

    WebElement row1=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[8]"));// row satirlari 1 den basliyor
    System.out.println(row1.getText());
}



@Test
    public void printAllCellsInOneRow(){// multiple elements bulurken list ile yazariz
    login();
    List<WebElement> cells=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td"));

for(WebElement header:cells){
    System.out.println(header.getText());
}

}
//based on coordinates
    @Test
    public void printCell() {
        login();
        WebElement cell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[3]"));

        System.out.println(cell.getText());

        WebElement cell1 = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[5]/td[7]"));

        System.out.println(cell1.getText());
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



//print all the values in a single column, names: at the second column, second td s of all rows
    @Test
    public void printColumnAllValues(){//
    login();
////table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+col+"]
        List<WebElement> allNames= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for (WebElement header:allNames
             ) {
            System.out.println(header.getText());
        }
        
    }
//          //td[.='Mark Smith']/../td[1]/input
//finfd the checkbox of given name


    @Test
    public void selectCheckbox(){
    login();
    WebElement checkBox= driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]/input"));
        System.out.println(checkBox.isSelected());
        checkBox.click();
        System.out.println(checkBox.isSelected());
    }


    //verify that 'Mark Smith' exist in the names column
    //verify that city 'Whitestone, British' exists in the cities column

    @Test
    public void test(){
        login();
        int nameIndex =  getColumnIndex("Name");
        System.out.println(nameIndex);

        List<WebElement> allNames = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+nameIndex+"]"));
        boolean found =false;

        for (int i = 0; i < allNames.size(); i++) {
            if (allNames.get(i).getText().equals("Mark Smith")){
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);

        found = false;
        int cityIndex = getColumnIndex("City");
        List<WebElement> allCities = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+cityIndex+"]"));

        for (int i = 0; i < allCities.size(); i++) {
            if (allCities.get(i).getText().equals("Whitestone, British")){
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);
    }

    /*
    gets a column name as a parameters
    returns the index of the column name
     */
    public int getColumnIndex(String column){
        List<WebElement> allHeader = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

        for (int i = 0; i < allHeader.size(); i++) {
            if (allHeader.get(i).getText().equals(column)){
                return i+1;
            }
        }
        return 0;
    }

}
///Users/vedatcakmaktepe/Downloads/test.txt

