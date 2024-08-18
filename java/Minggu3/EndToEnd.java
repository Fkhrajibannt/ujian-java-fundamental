package Minggu3;

import org.testng.annotations.Test;

public class EndToEnd {
    @Test
    public void  main() throws InterruptedException {
        AllKeyWord keyWord = new AllKeyWord();
        keyWord.login("standard_user","secret_sauce");
        keyWord.addToChart();
        keyWord.driver.close();
    }
}
