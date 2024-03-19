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
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    //Refresh
    public static void refresh() {
        driver.navigate().refresh();
    }

    //Maximize window
    public static void maximizewindow() {
        driver.manage().window().maximize();
    }

    //Implicity Wait
    public static void implicitywait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    //Sendkeys
    public void sendkeys(WebElement element, String data) {
        element.sendKeys(data);
    }

    //Sendkeys with Date format
    public void sendKeysWithDateFormat(WebElement element, String dateFormat, String date) {
        // Format the date according to the desired format
        String formattedDate = date.format(String.valueOf(DateTimeFormatter.ofPattern(dateFormat)));

        // Send the formatted date to the element
        element.sendKeys(formattedDate);
    }

    //Javascript scroll down
    public void javascriptscrolldown() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[text()='Register']")));

    }

    //click
    public void click(WebElement element) {
        element.click();
    }

    //Actionclick
    public void actionclick(WebElement element) {
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

    //waituntill
    public void waituntillexpectedcondition(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated((By) element));

    }

    // visibilityof
    public void visibilityOf(WebElement element) {
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driverWait.until(ExpectedConditions.visibilityOf(element));
    }

    //elementtobeclickable
    public void elementtobeclickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //Presenceof
    public void presenceof(WebElement element) {
        Duration timeout = Duration.ofSeconds(60);

        WebDriverWait driverWait = (WebDriverWait) new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated((By) element));
    }

    //Scroll into view
    public void scrolldown(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public void scrollup(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false)", element);

    }


    //javascript click
    public void elementclickjs(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }


    //getProperty
    public static String getprojectpath() {
        String path = System.getProperty("user.dir");
        return path;
    }

    //getPropertyFileValue
    public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(getprojectpath() + "/src/test/java/Config/Config.Properties"));
        Object object = properties.get(key);
        String value = (String) object;
        return value;
    }


    //getdriver
    public void getdriver(String browsertype) {
        switch (browsertype) {
            case "ChromeDriver":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
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

    public void Tabswitcher() throws AWTException {
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        System.out.println("Title of the current page: " + driver.getTitle());

    }
    public void Tabforwardswitcher() throws AWTException {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Title of the current page: " + driver.getTitle());

    }

    //getTitle
    public String getTitle() {
        String title = driver.getTitle();
        return title;

    }

    // getApplicationurl
    public String getApplicationurl() {
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
    public WebElement Findlocatorbyid(String value) {
        WebElement element = driver.findElement(By.id(value));
        return element;
    }

    //FindLocatorbyname
    public WebElement Findlocatorbyname(String value) {
        WebElement element = driver.findElement(By.name(value));
        return element;
    }

    //FindLocatorbyxpath
    public WebElement Findlocatorbyxpath(String value) {
        WebElement element = driver.findElement(By.xpath(value));
        return element;
    }


    //GetText
    public String getText(WebElement element) {
        String text = element.getText();
        return text;
    }

    // getAttribute
    public String getAttribute(WebElement element, String AttributeName) {
        String attribute = element.getAttribute(AttributeName);
        return attribute;
    }

    //SelectALL
    public void selectall() throws AWTException {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();

    }


    //SelectoptionbyText
    public void SelectoptionbyText(WebElement element, String Text) {
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
    public void screenshot(String Methodname) throws IOException {
        TakesScreenshot tk = (TakesScreenshot) driver;
        File file = tk.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("C:\\Users\\ICANIO-10090\\Desktop\\Project\\PluginLive-Automation\\Screenshot\\"+"FailedScreenshot_"+Methodname+"_"+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Click drop option
    public void clickddoption() {

    }

    //ReadExcelData
    //Corporate Role Creation
    public String readExcelData(String sheetname, int rownum, int cellnum) throws IOException {
        String res = null;
        File file = new File(getPropertyFileValue("excelpath"));
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
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    res = dateFormat.format(dateCellValue);
                } else {
                    double numericCellValue = cell.getNumericCellValue();
                    long check = Math.round(numericCellValue);
                    if (numericCellValue == check) {
                        res = String.valueOf(check);
                    } else {
                        res = String.valueOf(numericCellValue);
                    }
                }

                break;
            default:
                break;
        }
        return res;
    }


    //Students Onboarding
    public String readExcelData1(String sheetname, int rownum, int cellnum) throws IOException {
        String res = null;
        File file = new File(getPropertyFileValue("studentOnboardingexcelpath"));
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
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    res = dateFormat.format(dateCellValue);
                } else {
                    double numericCellValue = cell.getNumericCellValue();
                    long check = Math.round(numericCellValue);
                    if (numericCellValue == check) {
                        res = String.valueOf(check);
                    } else {
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

    public void updateDateincellExcel(String sheetname, int cellnum, int rownum, String olddata, String newdata) throws IOException {
        File file = new File("C:\\PluginLive Automation\\PluginLive Automation\\Excel\\Pluginlive Automation.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetname);
        Row row = sheet.getRow(cellnum);
        Cell cell = row.createCell(cellnum);
        String stringCellValue = cell.getStringCellValue();
        if (stringCellValue.equals("olddata")) {
            cell.setCellValue("newdata");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        workbook.write(fileOutputStream);
    }


    public void enterkey(WebElement element) {
        element.sendKeys(Keys.ENTER);

    }

    //Quitbrowser
    public void quitbrowser() {
        driver.quit();
    }

    //Close Browser
    public void closebrowser() {
        driver.close();
    }

    //To clear tghe selected Text
    public String clearAndReturnPreviousText(WebElement element) {
        String previousText = element.getText();
        element.clear();
        return previousText;
    }

    //To clear
    public void clear(WebElement element) {
        element.clear();
    }


    //upload file
    public void tenthuploadfile() throws AWTException, IOException {
        StringSelection ss = new StringSelection(getPropertyFileValue("imagePath"));
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot r = new Robot();
        r.delay(1000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }

    public void deletecookies() {
        driver.manage().deleteAllCookies();
    }

    public void pageload() {
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    public void switchchildwindow() {

        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }

    public void windowHandles() {
        Set<String> windowhandles = driver.getWindowHandles();
        List<String> list = new ArrayList<>(windowhandles);
        String parentwindowID = list.get(0);
        //String childwindowID = list.get(1);

//        System.out.println("parentwindowID:" + parentwindowID);
        //System.out.println("Child window ID:" + childwindowID);

    }

    public void oldwindowHandle(){
        Set<String> windowhandles = driver.getWindowHandles();
        List<String> list = new ArrayList<>(windowhandles);
        String parentwindowID = list.get(0);
        System.out.println("parentwindowID:" + parentwindowID);


    }
    public void newwindowHandle(){
        Set<String> windowhandles = driver.getWindowHandles();
        List<String> list = new ArrayList<>(windowhandles);
        String childwindowID = list.get(1);
        System.out.println("Child window ID:" + childwindowID);


    }



    public void switchToWindow(){
        String mainWindowHandle = driver.getWindowHandle();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        for (String tab : tabs) {
            if (!tab.equals(mainWindowHandle)) {
                driver.switchTo().window(tab);
                break;
            }
        }
    }

}










