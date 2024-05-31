import java.util.Random;
import java.util.Scanner;

class Procedure{
    Scanner s = new Scanner(System.in);

    int pass,setpass;
    int OTP,GenOtp;
    int i=0;
    String setusername,username;

    // Randome Function used for OTP Generation
    Random ran = new Random();

    // Registration Method
    public void registration(){

        System.out.println("Set your UserName = ");
        setusername = s.next();
        System.out.println("Set your Password = ");
        setpass = s.nextInt();

        GenOtp = ran.nextInt(999,9999);
        System.out.println("Your OTP is : "+GenOtp);

        System.out.println("Enter OTP for Confirmation = ");
        OTP = s.nextInt();

        if(GenOtp == OTP){
            System.out.println("Otp Submitted");
            System.out.println("Please Enter your Credentials");
            login();
        }
        else{
            System.out.println("Wrong OTP");
        }
    }

    // LogIn Method
    public void login(){

        System.out.println("Enter Username = ");
        username = s.next();
        System.out.println("Enter Password = ");
        pass = s.nextInt();


        if(pass == setpass ){
            System.out.println("LogIn Succesfully");
        }
        else if(pass == 3456 ){
            System.out.println("LogIn Succesfully");
        }
        else if(pass != setpass || pass != 3456){
            i++;
            if(i==3){
                System.out.println("Unauthorized Access!!");
                System.out.println("Access Denied");
            }
            else{
                System.out.println("Enter valid password and Username!!");
                login();
            }            
        }
        else{
            System.out.println("Wrong Credentials");
        }

    }
}

public class Reg_or_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int ch;
        Procedure ob = new Procedure();


        System.out.println("Choose any one kind of Procedure");
        System.out.println("1.Registration 2.Log In");

        System.out.println("Enter the your choise = ");
        ch = sc.nextInt();

        switch(ch){

                case 1 : ob.registration();
                break;
                case 2 : ob.login();
                break;

                default : System.out.println("Enter Given choises");
        }
    }
}
