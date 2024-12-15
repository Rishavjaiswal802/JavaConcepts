import java.util.Scanner;

class TooYoungException extends RuntimeException{
    TooYoungException(String str){
        super(str);
    }
}
class TooOldException extends RuntimeException{
    TooOldException(String str){
        super(str);  //to mak e description available to default exception handler
    }
}

public class CustomException {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the age");
         int age= sc.nextInt();
        if (age>60){
            throw new TooYoungException("please wait more time surely you will get the best match soon...");

        } else if (age<18) {
            throw new TooOldException("Your age has already crossed marriage age ...no chance of getting marriage");
        }else {
            System.out.println("You will be notified soon via your Email...");
        }
    }
}
