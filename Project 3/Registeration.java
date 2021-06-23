//package MINI_PROJECT;
////import MINI_PROJECT.CANDIDATE;
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//public class Registeration {
//    public static boolean isvalid(String E_Mail) {
//        String mailregex = "[a-z0-9].+" + "@sitpune.edu.in"; //^[A-Za-z0-9+_.-]+@(.+)$
//        Pattern pat = Pattern.compile(mailregex);
//        if (E_Mail == null)
//            return false;
//        return (pat.matches(mailregex, E_Mail));
//    }
//    public static boolean pass_valid(String password) {
//        int length = String.valueOf(password).length();
//        for ( int i=0; i<=length ; i++ ) {
//            char c = password.charAt(i);
//            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9'))// Checks if it is a lower case letter //Checks if it is an upper case letter//Checks to see if it is a digit)
//                return true;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String Name = new String();
//        String First_Name, Last_Name, Middle_Name;
//        String E_Mail, password,DOB;
//        System.out.println(" FIRST NAME: ");
//        First_Name = sc.nextLine();
//        System.out.println(" MIDDLE NAME: ");
//        Middle_Name = sc.nextLine();
//        System.out.println(" LAST NAME: ");
//        Last_Name = sc.nextLine();
//        Name = new StringBuilder().append(First_Name).append(Middle_Name).append(Last_Name).toString();
//        System.out.println(" E-MAIL ADDRESS: ");
//        E_Mail = "";
//        while (true) {
//            E_Mail = sc.nextLine();
//            if (isvalid(E_Mail))
//                break;
//            System.out.println("Invalid Mail id\n kindly enter a valid mail id");
//        }
//        System.out.println("Password: ");
//        password = "";
//        while (true) {
//            password = sc.next();
//            if (pass_valid(password))
//                break;
//            System.out.println("INVALID PASSWORD! \n ENTER CORRECT PASSWORD: ");
//        }
//        System.out.println("DATE OF BIRTH(dd/mm/yyyy): ");
//        DOB = sc.next();
//        System.out.println("CONTACT DETAILS: ");
//        // taking contact details
//        CONTACT_INFO C = new CONTACT_INFO(); // object of class CONTACT_INFO for call the functions
//        C.Get_Address();
//        C.Number();
//        //CANDIDATE can = new CANDIDATE(); // creating object of class CANDIDATE
//        //can.Get_Candidate_Info(Name,E_Mail,DOB,C.Address,C.phone_no);
//    }
//}
//class CONTACT_INFO extends Registeration
//{
//    String phone_no ;
//    ArrayList<String> Address = new ArrayList<String>();
//    Scanner a = new Scanner(System.in);
//    void Get_Address() {
//        System.out.println("ADDRESS: ");
//        Address.add(a.nextLine());
//    }
//    void Number()
//    {
//        System.out.println("CONTACT NUMBER: ");
//        while (true)
//        {
//            phone_no = a.next();
//            if (Validno(phone_no)) // validation of phone number
//                break;
//            System.out.println("Invalid Contact number! \n Kindly Enter Valid Mobile number");
//        }
//    }
//    static boolean Validno(String phone_no)
//    {
//        int length = String.valueOf(phone_no).length();
//        if (length != 10)
//            return false;
//        else
//            return true;
//    }
//}
//
package MINI_PROJECT;

//import MINI_PROJECT.CANDIDATE;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

class Registration {
    private  String name="",First_name="",Last_Name="",Middle_name="",password,DOB;
    public boolean isvalid(String E_Mail) {
        String mailregex = "[a-z0-9].+" + "@sitpune.edu.in"; //^[A-Za-z0-9+_.-]+@(.+)$
        Pattern pat = Pattern.compile(mailregex);
        if (E_Mail == null)
            return false;
        return (pat.matches(mailregex, E_Mail));
    }

    public void setFirst_name(String first_name) {
        this.First_name = first_name+" ";
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setMiddle_name(String middle_name) {
        this.Middle_name = middle_name+" ";
    }

    public String getMiddle_name() {
        return Middle_name;
    }

    public void setLast_Name(String last_Name) {
        this.Last_Name=last_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setName() {
        this.name = this.First_name+this.Middle_name+this.Last_Name;
    }


//
//    public static boolean pass_valid(String password) {
//        int length = String.valueOf(password).length();
//        for ( int i=0; i<=length ; i++ ) {
//            char c = password.charAt(i);
//            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9'))// Checks if it is a lower case letter //Checks if it is an upper case letter//Checks to see if it is a digit)
//                return true;
//        }
//        return false;
//    }
//
//
//        Scanner sc = new Scanner(System.in);
//
//        String Name = new String();
//        String First_Name, Last_Name, Middle_Name;
//        String E_Mail, password,DOB;
//
//        System.out.println(" FIRST NAME: ");
//        First_Name = sc.nextLine();
//        System.out.println(" MIDDLE NAME: ");
//        Middle_Name = sc.nextLine();
//        System.out.println(" LAST NAME: ");
//        Last_Name = sc.nextLine();
//        Name = new StringBuilder().append(First_Name).append(Middle_Name).append(Last_Name).toString();
//        System.out.println(" E-MAIL ADDRESS: ");
//        E_Mail = "";
//        while (true) {
//            E_Mail = sc.nextLine();
//            if (isvalid(E_Mail))
//                break;
//            System.out.println("Invalid Mail id\n kindly enter a valid mail id");
//        }
//        System.out.println("Password: ");
//        password = "";
//        while (true) {
//            password = sc.next();
//            if (pass_valid(password))
//                break;
//            System.out.println("INVALID PASSWORD! \n ENTER CORRECT PASSWORD: ");
//        }
//
//        System.out.println("DATE OF BIRTH(dd/mm/yyyy): ");
//        DOB = sc.next();
//
//        System.out.println("CONTACT DETAILS: ");
//        // taking contact details
//        CONTACT_INFO C = new CONTACT_INFO(); // object of class CONTACT_INFO for call the functions
//        C.Get_Address();
//        C.Number();
//
//        CANDIDATE can = new CANDIDATE(); // creating object of class CANDIDATE
//
//        can.Get_Candidate_Info(DOB,Name,E_Mail,C.Address,C.phone_no);
//        can.Update_Candid_Info(DOB,First_Name,Middle_Name,Last_Name,E_Mail,C.Address,C.phone_no);
//    }
//
//
//class CONTACT_INFO extends Registration
//{
//    String phone_no ;
//    ArrayList<String> Address = new ArrayList<String>();
//    Scanner a = new Scanner(System.in);
//
//    void Get_Address() {
//        System.out.println("ADDRESS: ");
//        Address.add(a.nextLine());
//    }
//
//    void Number()
//    {
//        System.out.println("CONTACT NUMBER: ");
//        while (true)
//        {
//            phone_no = a.next();
//            if (Validno(phone_no)) // validation of phone number
//                break;
//            System.out.println("Invalid Contact number! \n Kindly Enter Valid Mobile number");
//        }
//    }
//
//    static boolean Validno(String phone_no)
//    {
//        int length = String.valueOf(phone_no).length();
//        if (length != 10)
//            return false;
//        else
//            return true;
//    }

}