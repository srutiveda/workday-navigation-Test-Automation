import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Workday {
    public static void main(String args[]) {

        boolean isupload= false;

        System.setProperty("webdriver.chrome.driver", "/Users/srutiveda/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://workday.wd5.myworkdayjobs.com/en-US/Workday/job/Czech-Republic-Prague/Senior-Business-Intelligence-Analyst---Augmented-Analytics-Analyst_JR-31549/apply");
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'wd-Authentication-NO_METADATA_ID-uid4\']/div/div/div[2]/div/div[3]/div[1]/div/input").sendKeys("srutiveda17@gmail.com");
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'wd-Authentication-NO_METADATA_ID-uid4\']/div/div/div[2]/div/div[3]/div[2]/div/input").sendKeys("Srutiveda@17");
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'wd-Authentication-NO_METADATA_ID-uid4\']/div/div/div[2]/div/div[5]/div").click();

        if(isupload) {
            //code for resume upload
        }else {
            WebElement d = ((ChromeDriver) driver).findElementByXPath("//*[@id='gwt-uid-11']");
            d.click();
        }
        //CommonUtils.explicitWait(driver,10,"//*[@id='mainContent']/section/div[2]/div[2]/div[2]/button[1]");
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'mainContent\']/section/div[2]/div[1]/div[1]/button[1]").click();

        WebElement country = (((ChromeDriver) driver).findElementByXPath("//*[@id=\'dropDownSelectList.countries-input--uid20-input\']"));
        country.click();
        country.sendKeys("United States of America");
        //CommonUtils.explicitWait(driver,10,"//*[@id='textInput.nameComponent--uid257-input']");
        ((ChromeDriver) driver).findElementByXPath("//*[@id='textInput.nameComponent--uid23-input']").clear();
        ((ChromeDriver) driver).findElementByXPath( "//*[@id='textInput.nameComponent--uid23-input']" ).sendKeys("Lakshmi Sruti Veda");

        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.nameComponent--uid24-input\']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.nameComponent--uid24-input\']").sendKeys("Pidatala");

        ((ChromeDriver) driver).findElementByXPath("//*[@id='textInput.addressComponentsDeferred[i]--uid28-input']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id='textInput.addressComponentsDeferred[i]--uid28-input']").sendKeys("1390 Faircrest Ln Alpharetta");

        ((ChromeDriver) driver).findElementByXPath("//*[@id='textInput.addressComponentsDeferred[i]--uid29-input']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id='textInput.addressComponentsDeferred[i]--uid29-input']").sendKeys("Atlanta");

        WebElement state= ((ChromeDriver) driver).findElementByXPath("//*[@id=\'dropDownSelectList.addressComponentsDeferred[i]-input--uid30-input\']");
        //state.click();
        state.sendKeys("Georgia");

        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.addressComponentsDeferred[i]--uid31-input\']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.addressComponentsDeferred[i]--uid31-input\']").sendKeys("30004");

        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.phone--uid37-input\']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.phone--uid37-input\']").sendKeys("7048906817");


        WebElement info= ((ChromeDriver) driver).findElementByXPath("//*[@id=\'dropDownSelectList.sources-input--uid39-input\']");
        //state.click();
        info.sendKeys("Website-Indeed");

        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'mainContent\']/section/div[2]/div[1]/div[2]/button[1]").click();
        //CommonUtils.explicitWait(driver,10,"//*[@id='textInput.jobHistoryTitle--uid141-input']");


        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.jobHistoryTitle--uid65-input\']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.jobHistoryTitle--uid65-input\']").sendKeys("Intern");




        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.jobHistoryCompany--uid66-input\']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.jobHistoryCompany--uid66-input\']").sendKeys("SmartBridge Educational Services Pvt. Ltd.");

        //((ChromeDriver) driver).findElementByXPath("//*[@id=\'dateInput.jobStartDate--uid72\']/div").clear();
        //((ChromeDriver) driver).findElementByXPath("//*[@id=\'dateInput.jobStartDate--uid72\']/div").sendKeys("12/2016");

        //((ChromeDriver) driver).findElementByXPath("//*[@id=\'dateInput.jobEndDate--uid79\']/div").clear();
        //((ChromeDriver) driver).findElementByXPath("//*[@id=\'dateInput.jobEndDate--uid79\']/div").sendKeys("05/2017");

        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textAreaInput.jobSummary--uid80-input\']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textAreaInput.jobSummary--uid80-input\']").sendKeys("Applied integration of IOT tools to monitor electricity theft"+
                "Performed real time monitoring of current data at each node using Web dashboard in MapMode" +
                "Noted and visualized capped electricity trends for minimizing further thefts" +
                "Created survey on methods implemented in pilfering electricity and technologies involved in smart energy meters" +
                "Developed a mobile application for any occurrences of electricity theft using AndroidStudio");

        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.jobHistoryTitle--uid47-input\']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.jobHistoryTitle--uid47-input\']").sendKeys("Business Intelligence Intern");

        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.jobHistoryCompany--uid48-input\']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.jobHistoryCompany--uid48-input\']").sendKeys("SmartBridge Educational Services Pvt. Ltd.");

//        //((ChromeDriver) driver).findElementByXPath("//*[@id=\'dateInput.jobStartDate--uid54\']/div").clear();
//        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'dateInput.jobStartDate--uid54\']/div").sendKeys("05/2017");
//
//        //((ChromeDriver) driver).findElementByXPath("//*[@id=\'dateInput.jobEndDate--uid61\']/div").clear();
//        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'dateInput.jobEndDate--uid61\']/div").sendKeys("12/2017");
//
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textAreaInput.jobSummary--uid62-input\']").clear();
        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textAreaInput.jobSummary--uid62-input\']").sendKeys("Designed, built, enhanced and supported Business Intelligence and Analytics solutions for better storytelling with the data" +
                "Designed and developed dashboards for forensic level information that give stakeholders the ability to gain quick insights to make more informed business decisions" +
                "Met with business units to gather requirements to translate them into dashboards in Tableau.");

//        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.schoolName--uid88-input\']").clear();
//        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textInput.schoolName--uid88-input\']").sendKeys("Jawaharlal Nehru Technological University");
//
//        WebElement schooldegree= ((ChromeDriver) driver).findElementByXPath("//*[@id=\'dropDownSelectList.schoolDegrees-input--uid89-input\']/div[1]");
//        schooldegree.sendKeys("Masters");
//
//        WebElement fieldofstudy= ((ChromeDriver) driver).findElementByXPath("//*[@id=\'monikerListInput.(!string:isString(education.fieldOfStudy)-&&-not-empty-education.fieldOfStudy.id)?-list:toList(education.fieldOfStudy)-:-(not-empty-fieldOfStudySupply.data-?-fieldOfStudySupply.data-:-fieldOfStudies.data)--uid90\']");
//        fieldofstudy.sendKeys("Computer Science");
//
//        ((ChromeDriver) driver).findElementByXPath(" //*[@id=\'wd-FieldSet-NO_METADATA_ID-uid82\']/div[2]/div/ul/li[1]/div[2]").clear();
//        ((ChromeDriver) driver).findElementByXPath(" //*[@id=\'wd-FieldSet-NO_METADATA_ID-uid82\']/div[2]/div/ul/li[1]/div[2]").sendKeys("University of North Carolina at Charlotte");



         ((ChromeDriver) driver).findElementByXPath("//*[@id=\'mainContent\']/section/div[2]/div[1]/div[2]/button[1]").click();

         WebElement dropdownselect = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"dropDownSelectList.48c4b98411a3106f35086a5dc62873dd-input--uid106-input\"]");
         dropdownselect.sendKeys("No,I have never been employed by or provided services to Workday.");

         ((ChromeDriver) driver).findElementByXPath("//*[@id=\"textAreaInput.48c4b98411a3106f35086acc04d073e4--uid108-input\"]").sendKeys("N/A");

         WebElement dropdownselect1= ((ChromeDriver) driver).findElementByXPath("//*[@id=\'dropDownSelectList.48c4b98411a3106f35086ad6e9e073e5-input--uid110-input\']");
         dropdownselect1.sendKeys("No,I do not use the system in my current job");

         ((ChromeDriver) driver).findElementByXPath("//*[@id=\'textAreaInput.48c4b98411a3106f35086afdea4073e9--uid112-input\']").sendKeys("N/A");

        ((ChromeDriver) driver).findElementByXPath("//*[@id='mainContent']/section/div[2]/div[1]/div[2]/button[1]").click();

        //CommonUtils.explicitWait(driver,10,"//*[@id=\'checkBoxInput.agreementCheckbox--uid120\']/div");
        //*[@id="checkBoxInput.agreementCheckbox--uid120"]/div
        //Thread.sleep(20);
         WebElement checkbox= ((ChromeDriver) driver).findElementById("checkBoxInput.agreementCheckbox--uid120-input");
        //*[@id="checkBoxInput.agreementCheckbox--uid120"]/div
        //*[@id="checkBoxInput.agreementCheckbox--uid120-input"]
        System.out.println(checkbox.isEnabled());

        checkbox.click();

       //*[@id="checkBoxInput.agreementCheckbox--uid120"]/div
        //*[@id="mainContent"]/section/div[2]/div[1]/div[2]/button[1]
        //*[@id="dropDownSelectList.48c4b98411a3106f35086a5dc62873dd-input--uid106-input"]
        //*[@id="textAreaInput.48c4b98411a3106f35086acc04d073e4--uid108-input"]
        //*[@id="dropDownSelectList.48c4b98411a3106f35086ad6e9e073e5-input--uid110-input"]
        //*[@id="textAreaInput.48c4b98411a3106f35086afdea4073e9--uid112-input"]



        }

        //*[@id="textInput.schoolName--uid88-input"]
        //*[@id="dropDownSelectList.schoolDegrees-input--uid89-input"]/div[1] - drop down

        //*[@id="monikerListInput.(!string:isString(education.fieldOfStudy)-&&-not-empty-education.fieldOfStudy.id)?-list:toList(education.fieldOfStudy)-:-(not-empty-fieldOfStudySupply.data-?-fieldOfStudySupply.data-:-fieldOfStudies.data)--uid90"]

        //*[@id="wd-FieldSet-NO_METADATA_ID-uid82"]/div[2]/div/ul/li[1]/div[2]
        //*[@id="dropDownSelectList.schoolDegrees-input--uid84-input"]
        //*[@id="textInput.schoolGpa--uid86-input"]


        //*[@id="mainContent"]/section/div[2]/div[2]/div[2]/button[1]


















//        ((ChromeDriver) driver).findElementByXPath("//*[@id='wd-Authentication-NO_METADATA_ID-uid4']/div/div/div[2]/div/div[7]/div/div[1]/a").click();
//        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'wd-Authentication-NO_METADATA_ID-uid4\']/div/div/div[2]/div/div[3]/div[1]/div/input").sendKeys("sk@uncc.edu");
//        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'wd-Authentication-NO_METADATA_ID-uid4\']/div/div/div[2]/div/div[3]/div[2]/div/input").sendKeys("Srutiveda@17");
//        ((ChromeDriver) driver).findElementByXPath("//*[@id=\'wd-Authentication-NO_METADATA_ID-uid4\']/div/div/div[2]/div/div[3]/div[3]/div/input").sendKeys("Srutiveda@17");
//        WebElement d=((ChromeDriver) driver).findElementByXPath("//*[@id=\"wd-Authentication-NO_METADATA_ID-uid4\"]/div/div/div[2]/div/div[4]/div[2]/div/div");
//        d.click();

        // driver.navigate().back();
        //((ChromeDriver) driver).findElementByXPath("//*[@id=\"wd-Authentication-NO_METADATA_ID-uid4\"]/div/div/div[2]/div/div[5]/div").click();

        //((ChromeDriver) driver).findElementByXPath("//*[@id='wd-FileUploadAwesome-fileUpload2.attachments']/div[2]/div[3]/div/button[1]/span[2]").sendKeys("/Users/srutiveda/Desktop/final.docx");

    }


