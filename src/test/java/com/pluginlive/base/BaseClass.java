package com.pluginlive.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;

    public BaseClass() throws IOException {
    }

    //Launching Browser
 public static void browserlaunch() {
     driver = new ChromeDriver();
 }

// Entering URL
    public static void enterurl(String url) {
        driver.get(url);
    }

//Maximize window
    public static void maximizewindow(){
     driver.manage().window().maximize();
    }
//Implicity Wait
    public static void implicitywait(){
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    //Sendkeys
    public void sendkeys(WebElement element, String data) {
     element.sendKeys(data);
    }

    //click
    public void click(WebElement element){
     element.click();
    }

    //Actionclick
  public void  actionclick(WebElement element){
      Actions actions = new Actions(driver);
      actions.moveToElement(element).click().build().perform();
  }

//ROBOT Key down
    public void keydown() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


// visibilityof
  public void   visibilityOf(WebElement element){
      WebDriverWait driverWait = new WebDriverWait(driver,Duration.ofSeconds(30));
      driverWait.until(ExpectedConditions.visibilityOf(element));
  }

  //Scroll into view
   public void scrolldown(WebElement element){
       JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true)",element);
   }

   public void scrollup(WebElement element){
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(false)",element);

   }


    //javascript click
 public  void elementclickjs(WebElement element){
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("arguments[0].click()",element);
 }

 //Javascript Sendkeys


    //getProperty
    public static String getprojectpath() {
      String path = System.getProperty("user.dir");
      return path;
    }

    //getPropertyFileValue
    public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
properties.load(new FileInputStream(getprojectpath()+"/src/test/java/Config/Config.Properties") );
Object object = properties.get(key);
String value = (String) object;
return value;
    }


//getdriver
    public void getdriver(String browsertype) {
     switch (browsertype){
         case "ChromeDriver":
             WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
             break;
         case "firefox" :
             driver = new FirefoxDriver();
             break;
     }

 }
// enterKey
    public void enterKey() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
//getTitle
    public String getTitle(){
     String title = driver.getTitle();
        return title;

    }
// getApplicationurl
   public String  getApplicationurl(){
String currenturl = driver.getCurrentUrl();
return currenturl;
     }
// To get the options in dropdown as text
    public String getOptionsDropDownasText(WebElement element) {
        Select s = new Select(element);
        List<WebElement> li = s.getOptions();
        for (WebElement listitems : li) {
            String text = listitems.getText();
        }
        return null;
    }

//Findlocatorbyid
    public WebElement Findlocatorbyid(String value){
     WebElement element = driver.findElement(By.id(value));
     return element;
 }

 //FindLocatorbyname
    public WebElement Findlocatorbyname(String value){
     WebElement element = driver.findElement(By.name(value));
     return element;
    }
//FindLocatorbyxpath
    public WebElement Findlocatorbyxpath(String value){
     WebElement element = driver.findElement(By.xpath(value));
     return element;
    }
//GetText
    public String getText(WebElement element){
     String text = element.getText();
     return text;
    }
// getAttribute
  public String  getAttribute(WebElement element, String AttributeName){
     String attribute = element.getAttribute(AttributeName);
     return attribute;
  }

//SelectoptionbyText
    public void SelectoptionbyText(WebElement element, String Text){
        Select select = new Select(element);
        select.selectByVisibleText(Text);
    }

    //SelectoptionbyAttribute
    public void SelectoptionbyAttribute(WebElement element, String Text) {
        Select select = new Select(element);
        select.selectByValue(Text);
    }

   //SelectoptionbyIndex
   public void SelectoptionbyIndex(WebElement element, int index) {
       Select select = new Select(element);
       select.selectByIndex(index);
   }

   //Screenshot for a page
   public void screenshot(String name) throws IOException {
       TakesScreenshot tk = (TakesScreenshot) driver;
       File file = tk.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(file, new File("C:\\Users\\T-450\\Desktop\\PluginLive Automation testing Screenshot"));
   }
// Click drop option
    public void clickddoption(){

    }
   //RealExcelData
    public String readExcelData(String sheetname,int rownum,int cellnum) throws IOException {
        String res = null;
        File file = new File("C:\\PluginLive Automation\\PluginLive Automation\\Excel\\PluginLive Automation.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetname);
        Row row = sheet.getRow(rownum);
        Cell cell = row.getCell(cellnum);
        CellType cellType = cell.getCellType();
        switch (cellType) {
            case STRING:
                res = cell.getStringCellValue();
                break;

            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    Date dateCellValue = cell.getDateCellValue();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yy");
                    dateFormat.format(dateCellValue);
                } else {
                    double numericCellValue = cell.getNumericCellValue();
                    long check = Math.round(numericCellValue);
                    if (numericCellValue == check)
                    {
                        res = String.valueOf(check);
                    } else{
                        res = String.valueOf(numericCellValue);
                    }
                }

                break;
            default:
                break;
        }
        return res;
    }
// WriteDataincellExcel
    public void WriteDataincellExcel(String sheetname, int cellnum, int rownum, String data) throws IOException {
        File file = new File("C:\\PluginLive Automation\\PluginLive Automation\\Excel\\Pluginlive Automation.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetname);
        Row row = sheet.getRow(cellnum);
        Cell cell = row.createCell(cellnum);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        workbook.write(fileOutputStream);

    }

//updateDataincellExcel

public void updateDateincellExcel(String sheetname, int cellnum,int rownum, String olddata, String newdata ) throws IOException {
    File file = new File("C:\\PluginLive Automation\\PluginLive Automation\\Excel\\Pluginlive Automation.xlsx");
    FileInputStream fileInputStream = new FileInputStream(file);
    Workbook workbook = new XSSFWorkbook(fileInputStream);
    Sheet sheet = workbook.getSheet(sheetname);
    Row row = sheet.getRow(cellnum);
    Cell cell = row.createCell(cellnum);
    String stringCellValue = cell.getStringCellValue();
    if(stringCellValue.equals("olddata")){
        cell.setCellValue("newdata");
    }
   FileOutputStream fileOutputStream = new FileOutputStream(file) ;
    workbook.write(fileOutputStream);
}
//Quitbrowser
    public void quitbrowser(){
        driver.quit();
    }
//Close Browser
    public void closebrowser(){
        driver.close();
    }
//clearText
    public void clear(WebElement element){
        element.clear();
    }

    }
















