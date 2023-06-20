package com.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ElementUtil {
    private WebDriver driver;
    public ElementUtil(WebDriver driver){
        this.driver =driver;
    }

    public void pageScrollByCordinate(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
    }

    public void pageScrollToBottom(WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public void pageScrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }


//    public static void main(String[] args) throws ParseException {
//        ElementUtil elementUtil = new ElementUtil(driver);
//        String x = "//td[@data-value='"+ elementUtil.getDate() +"'])[1]";
//        System.out.println(x);
//        System.out.println("End Date: "+elementUtil.EndDate());
//    }

    public void pageScroll(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //   js.executeScript("window.scrollBy(0,50)", "");
    }

    public String getDate(){

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        return sdf.format(date);
    }

    public Date EndDate() throws ParseException {
        Calendar cal = Calendar.getInstance();
    //    DateTimeUtils dtu = ThreadContainer.get().getDateTimeUtils();

//get info of date in parameter
        Date date1=new SimpleDateFormat("dd").parse(getDate());
        cal.setTime(date1);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

//get number of max days of next month
        Calendar NewCal = Calendar.getInstance();
        NewCal.set(year, month, 1);
        NewCal.add(Calendar.MONTH, 1);
        int nextMax=NewCal.getActualMaximum(Calendar.DAY_OF_MONTH);

        if(nextMax>=day) //if max day of next month is lower than current day, just add one month
        {
            cal.set(year,month,1);
            cal.add(Calendar.MONTH, 1);
           cal.set(Calendar.DAY_OF_MONTH, day);
        } else { //if not: go to next month, set day to maximum number of day
            cal.set(year,month,1);
            cal.add(Calendar.MONTH, 1);
            cal.set(Calendar.DAY_OF_MONTH, nextMax);
        }

        return cal.getTime();
    }

}
