package co.com.mintic.proyecto4.cartera.util;


public class EncryptPassword {

    public static void main(String[] args){

        var password = "123";
        System.out.println("password:  " + password);
        System.out.println("password encrypt:" + encryptPassword(password));

    }

    public static String encryptPassword(String password){
        BCryptPasswordEncoder encoder =  new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
