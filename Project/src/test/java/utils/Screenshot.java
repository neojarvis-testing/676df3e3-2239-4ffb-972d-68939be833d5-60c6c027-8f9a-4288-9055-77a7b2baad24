package utils;

/**
 * @Created by Ram Prasath
 * @Description Class for capturing screenshots during automated tests and storing them in a designated directory.
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Screenshot extends Base {

    public static TakesScreenshot ts;

    /**
     * @Description Captures a screenshot with the specified filename and saves it in the "screenshots" directory.
     *              If the directory does not exist, it will be created.
     * @param filename Name of the screenshot file (timestamp will be appended to the filename).
     */
    public static void captureScreenshot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";

        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);

        // Create the screenshots directory if it doesn't exist
        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}