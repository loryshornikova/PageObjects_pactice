package Tests;

import java.util.Random;

public class UserInfo {

public String firstName="Larysa";
public String lastName="Tester";
public String emailForRegistration=generateRandomEmail();
public String email="larysatester@gmail.com";
public String username="Larysa";
public String password = "Password1!";


    public String generateRandomEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "Larysa"+ randomInt +"@gmail.com";
    }

}
