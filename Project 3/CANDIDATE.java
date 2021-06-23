//package MINI_PROJECT;
//
//import javax.swing.*;
//import java.io.Serializable;
//import java.util.*;
//import java.util.ArrayList;
//
//
//public class CANDIDATE
//{
//    public static void main(String[] args)
//    {
//
//        JFrame f;
//        f=new JFrame("SELECT TO UPDATE");
//        JComboBox cb=new JComboBox();
//        cb.setBounds(50, 50,90,20);
//        f.add(cb);
//        f.setLayout(null);
//        f.setSize(400,500);
//        f.setVisible(true);
//
//        JFrame job;
//        job= new JFrame("SEARCH JOBS ");
//        String Jobs[]={"IT / Software ","Core Technical","DIPLOMA JOBS","PART TIME JOBS"};
//        JComboBox c=new JComboBox(Jobs);
//        c.setBounds(50, 50,90,20);
//        job.add(c);
//        job.setLayout(null);
//        job.setSize(400,500);
//        job.setVisible(true);
//
//    }
//
//    public Serializable Update_Candid_Info(String s, String f_name, String m_name, String l_name, String e_Mail, ArrayList<String> address, String phone_no)
//    {
//        Registration R = new Registration();
//        CONTACT_INFO C = new CONTACT_INFO();
//
//        Scanner sc = new Scanner(System.in);
//        String Upadation[]={"NAME","E-MAIL","PASSWORD","ADDRESS","CONTACT NUMBER"};
//        int choice;
//        String c;
//
//        System.out.println("SELECT TO UPDATE : ");
//        System.out.println("1. NAME");
//        System.out.println("2. E-MAIL");
//        System.out.println("3. ADDRESS");
//        System.out.println("4. CONTACT NUMBER");
//        System.out.println("Enter choice: ");
//        choice = sc.nextInt();
//
//        switch (choice)
//        {
//            case 1:
//                System.out.println("Select: ");
//                System.out.println("(a) First Name.");
//                System.out.println("(b) Middle Name.");
//                System.out.println("(c) Last Name.");
//                System.out.println("CHOICE: ");
//                c = sc.nextLine();
//                int l = String.valueOf(c).length();
//                for (int i =0;i<l;i++)
//                {
//                    char current = c.charAt(i);
//                    if (current == 'a')
//                    {
//                        System.out.println("UPDATED FIRST NAME: ");
//                        f_name = sc.next();
//                        return f_name;
//                    }
//
//                    else
//                    if (current == 'b')
//                    {
//                        System.out.println("UPDATED MIDDLE NAME: ");
//                        m_name = sc.next();
//                        return m_name;
//                    }
//
//                    else
//                    if (current == 'c')
//                    {
//                        System.out.println("UPDATED LAST NAME: ");
//                        l_name = sc.next();
//                        return l_name;
//                    }
//
//                }
//                break;
//
//            case 2:
//                System.out.println("ENTER UPDATED E-MAIL: ");
//                e_Mail= "";
//                while(true)
//                {
//                    e_Mail=sc.next();
//                    if(Registration.isvalid(e_Mail))
//                        break;
//                    System.out.println("INVALID E-MAIL! \n KINDLE RE-ENTER CORRECT E-MAIL: ");
//                }
//                return e_Mail;
//
//            case 3:
//                System.out.println("UPDATED ADDRESS: ");
//                address.add(sc.nextLine());
//                return address;
//
//            case 4:
//                System.out.println("UPDATED CONTACT NUMBER: ");
//                while(true) {
//                    phone_no = sc.next();
//                    if (CONTACT_INFO.Validno(phone_no))
//                        break;
//                    System.out.println("INVALID CONTACT! \n KINDLE ENTER CORRECT CONTACT NUMBER: ");
//                }
//                return phone_no;
//
//            default:
//                System.out.println("INVALID CHOICE.");
//        }
//        return null;
//    }
//
//    public void Get_Candidate_Info(String s, String name, String e_Mail, ArrayList<String> address, String phone_no)
//    {
//        System.out.println(" NAME:          \t"+name);
//        System.out.println(" E-MAIL:        \t"+e_Mail);
//        System.out.println(" DATE OF BIRTH: \t"+s);
//        System.out.println(" ADDRESS:       \t"+address);
//        System.out.println(" CONTACT NO.:   \t"+phone_no);
//    }
//
//    public void Apply_Job(){
//
//    };
//    public void Search_Job()
//    {
//        class Job_By_Category
//        {
//
//            Job_By_Category()
//            {
//
//            }
//            public void main(String[] args) {
//                new Job_By_Category();
//            }
//        }
//    }
//
//    public void UPLOAD_RESUME()
//    {
//
//    }
//};
package MINI_PROJECT;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class CANDIDATE
{
    private String dob=new String(), name=new String(), email=new String(), phoneno=new String(), job=new String(),password=new String(),address=new String() ,gender=new String();
    private float sgpa=0;
    public Map<String,String> AppliedCompanies = new HashMap<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public float getSgpa() {
        return sgpa;
    }

    public void setSgpa(float sgpa) {
        this.sgpa = sgpa;
    }

    public boolean mailisvalid(String E_Mail)
    {
        String mailregex = "[a-z0-9].+"+"@sitpune.edu.in"; //^[A-Za-z0-9+_.-]+@(.+)$
        Pattern pat = Pattern.compile(mailregex);
        if (E_Mail == null)
            return false;
        return (pat.matches(mailregex,E_Mail));
    }
//    public void Update_Info() {
//        this.dob = dob;
//        this.name = name;
//        this.email = email;
//        //this.addr = addr;
//        this.phoneno = phoneno;
//    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void Apply_Job() {
        this.job = job;
    }

    public String Search_Job() {
        return job;
    }

}