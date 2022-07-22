//Problem 2:6
//Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin, password: adm1n


import java.util.Scanner;

public class login{
    public static void main(String[] args){
        String username = "admin";
        String password = "adm1n";
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String user = sc.next();
        System.out.println("Enter the password: ");
        String pass = sc.next();
        if(username.equals(user) && password.equals(pass)){
            found = true;
            System.out.println("User logged in");
        }else{
            int j = 3;
            for(int i = 0; i<3; i++){
                if(password.equals(pass)){
                    found = true;
                    break;
                }
                else{
                    found = false;
                    System.out.println("Wrong password. You have " + (j-i) + " attempt left. Enter a valid password: ");
                    pass = sc.next();
                }
            }
        if(found = false){
            System.out.println("System is locked. Try again later");
        }else{
            System.out.println("User successfully logged in");
        }   
    }
        sc.close();
    }
}


