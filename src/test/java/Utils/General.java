package Utils;

import java.util.Random;

public class General {
    Random num = new Random();

    public String randomEmail(){
        return "test" + num.nextInt(100) + "@gmail.com";
    }
}
