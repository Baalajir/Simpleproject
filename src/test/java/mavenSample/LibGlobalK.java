package mavenSample;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobalK {

	public WebDriver driver;
	public WebElement element;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();


	}
	public void loadUrl(String url) {
		driver.get(url);

	}
	public void maximize() {
		driver.manage().window().maximize();

	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public String getEnteredUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;


	}
	public String getText() {
		String text = element.getText();
		return text;

	}
	public String getAttribute() {
		String attribute = element.getAttribute("value");
		return attribute;


	}
	public String getAttribute(WebElement element,String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
	public void close() {
		driver.close();
	}
	public void quit() {
		driver.quit();

	}
	public WebElement findElementById(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;


	}
	public WebElement findElementByName(String data) {
		WebElement element = driver.findElement(By.name(data));
		return element;

	}
	public WebElement findElementByXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;

	}
	public WebElement findElementByTagname(WebElement element,String data) {
		   WebElement findElement = driver.findElement(By.tagName(data));
		   return findElement;
		  
		 

	}
	public WebElement findElementByCssSelector(WebElement element,String data) {
		WebElement findElement = driver.findElement(By.cssSelector(data));
		return findElement;

	}
	public void typeInPage(WebElement element,String data) {
		element.sendKeys(data);


	}
	public void click(WebElement element) {
		element.click();

	}
	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();


	}
	public void selectOptionByText(WebElement element,String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);

	}
	public void selectOptionByValue(WebElement element,String data) {
		Select select = new Select(element);
		select.selectByValue(data);

	}
	public void selectOptionByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public List<WebElement> getDropDownOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public int lengthOfDropDown(WebElement element ) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		return size;

	}
	public WebElement getValueFromDropDown(WebElement element,int index) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		WebElement element2 = options.get(index);
		return element2;



	}
	public String getDropDowntext(WebElement element) {

		String text = element.getText();
		return text;



	}
	public String getDropDownAtrribute(WebElement element) {

		String attribute = element.getAttribute("value");
		return attribute;


	}
	public String getDropDownAtrribute(WebElement element,String attributeName) {

		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;

	}
	public WebElement getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}
	public void deselectByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);

	}
	public void deselectByAttribute(WebElement element,String data) {
		Select select = new Select(element);
		select.deselectByValue(data);

	}
	public void deselectByText(WebElement element,String data) {
		Select select = new Select(element);
		select.deselectByVisibleText(data);


	}
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();

	}
	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;

	}
	public void selectBySendKeys(WebElement element,String data) {
		element.sendKeys(data);



	}

	public void typeJs(WebElement element,String data) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','"+data+"')",element);


	}
	public void clickJs(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click",element);


	}
	public void getAttributeJs(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("return arguments[0].grtAttribute('value')",element);


	}
	public void scrollDownJs(WebElement element, boolean data) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(("+data+"))",element);


	}
	public void scrollUpJs(WebElement element,boolean data) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView("+data+"))",element);


	}
	public boolean  isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;



	}
	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public void switchToFrameById(String frameId) {
		driver.switchTo().frame(frameId);
	}
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);

	}
	public void switchToFrameByElement(WebElement element) {
		driver.switchTo().frame(element);

	}
	public List<WebElement> findingFramesByXpath(WebElement element,String data) {
		List<WebElement> frames = driver.findElements(By.xpath(data));
		return frames;


	}
	public List<WebElement> findingFramesByTagName(WebElement element,String frame) {
		List<WebElement> frames = driver.findElements(By.tagName(frame));
		return frames;



	}
	public int sizeOfFrame(WebElement element,String frame) {
		List<WebElement> frames = driver.findElements(By.tagName(frame));
		int size = frames.size();
		return size;

	}
	public void switchBetweenFrames() {
		driver.switchTo().defaultContent();

	}
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();

	}
	public void switchToWindowById(String windowId) {
		driver.switchTo().window(windowId);


	}
	public void switchToWindowByTitle(String title) {
		driver.switchTo().window(title);

	}
	public void switchToWindowByUrl(String url) {
		driver.switchTo().window(url);

	}
	public String getParentWindowId() {
		String parentWindowId = driver.getWindowHandle();
		return parentWindowId;

	}
	public  Set<String> getAllWindowsId() {
		Set<String> allWindowsID = driver.getWindowHandles();
		return allWindowsID;

	}
	

	//57
	public void updateData(String SheetName, int rowNo, int cellNo, String oldData, String newData) throws IOException {
	File file = new File("C:\\eclipse-workspace\\mavenSample\\Spreadsheets\\ADACTIN DATA.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet(SheetName);
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	String data = cell.getStringCellValue();
	if (data.contentEquals(oldData)) {
	cell.setCellValue(newData);
	}
	FileOutputStream o = new FileOutputStream(file);
	workbook.write(o);
	}

	//55
	public String getData(String SheetName, int rowNo, int cellNo) throws IOException {
	File file = new File("C:\\eclipse-workspace\\mavenSample\\Spreadsheets\\ADACTIN DATA.xlsx");
	String data = null;
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet(SheetName);
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	int type = cell.getCellType();

	if (type==1) {
	data = cell.getStringCellValue();
	}
	if (type==0) {
	if (DateUtil.isCellDateFormatted(cell)) {
	Date dateCell = cell.getDateCellValue();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
	data = dateFormat.format(dateCell);
	}
	else {
	double d = cell.getNumericCellValue();
	long l = (long)d;
	data = String.valueOf(l);
	} 
	}
	return data; 
	}
	
	//56
	public void writeData(String SheetName, int rowNo, int cellNo, String data) throws IOException {
	File file = new File("C:\\eclipse-workspace\\mavenSample\\Spreadsheets\\ADACTIN DATA.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet(SheetName);
	Row row = sheet.getRow(rowNo);
	Cell cell = row.createCell(cellNo);
	cell.setCellValue(data);
	FileOutputStream o = new FileOutputStream(file);
	workbook.write(o);
	}


	public List<String> getOptions(WebElement element) {

		List<String> allOptions = new ArrayList<String>();



		Select select= new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement eachElement : options) {
			String data = eachElement.getText();
			allOptions.add(data);


		}
		return allOptions;
	}
}





