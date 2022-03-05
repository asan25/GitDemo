//whoever want to use this below methods first need to create obj of this class and pass driver as a argument
// do not create object in the step definitons class
package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;


public class GenericUtils {

    public WebDriver driver;
    public GenericUtils(WebDriver driver){
    this.driver=driver;

    }

    public void SwitchWindowToChild(){
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
    }

}
