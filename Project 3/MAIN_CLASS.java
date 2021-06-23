//////package MINI_PROJECT;
//////import javax.swing.*;
//////import java.awt.*;
//////import java.awt.event.ActionEvent;
//////import java.awt.event.ActionListener;
//////import java.util.*;
//////import java.util.regex.Pattern;
//////public class MAIN_CLASS
//////{
//////    public static boolean isvalid(String E_Mail)
//////    {
//////        String mailregex = "[a-z0-9].+"+"@sitpune.edu.in"; //^[A-Za-z0-9+_.-]+@(.+)$
//////        Pattern pat = Pattern.compile(mailregex);
//////        if (E_Mail == null)
//////            return false;
//////        return (pat.matches(mailregex,E_Mail));
//////    }
//////    public static void main(String[] args)
//////    {
//////        String Name = new String();
//////        String E_Mail = new String();
//////        Scanner sc = new Scanner(System.in);
//////        System.out.println(" NAME: ");
//////        Name = sc.nextLine();
//////        System.out.println(" E-MAIL ADDRESS: ");
//////        E_Mail="";
//////        while(true)
//////        {
//////            E_Mail = sc.nextLine();
//////            if(isvalid(E_Mail))
//////                break;
//////            System.out.println("Invalid Mail id\nkindly enter a valid mail id");
//////        }
//////        String provider_anme = "digha";
//////        JFrame message_box = new JFrame();
//////        Map<String,job_provider> P = new HashMap<String,job_provider>();
//////        System.out.println("CONTACT DETAILS: ");
//////        JTextField provider_email = new JTextField();// first
//////        JPasswordField provider_password = new JPasswordField();//second
//////        JPasswordField provider_password_reenter = new JPasswordField();//third
//////        JTextField provider_phone = new JTextField();// fourth
//////        JTextField provider_company = new JTextField();//fifth
//////        JTextField provider_name = new JTextField();
//////        provider_name.setBounds(100,130,100,30);
//////        provider_email.setBounds(100,200,100,30);
//////        provider_password.setBounds(100,270,100,30);
//////        provider_phone.setBounds(100,410,100,30);
//////        provider_company.setBounds(100,480,100,30);
//////        provider_password_reenter.setBounds(100,340,100,30);
//////        JButton provider_next = new JButton("NEXT");
//////        provider_next.setBackground(Color.cyan);
//////        provider_next.setBounds(510,100,200,50);
//////        provider_next.addActionListener(new ActionListener(){
//////            @Override
//////            public void actionPerformed(ActionEvent e)
//////            {
//////
//////                P.put(provider_anme,new job_provider());
//////                if(P.get(provider_anme).check_email(provider_email.getText()))
//////                {
//////                    P.get(provider_anme).setEmail(provider_email.getText());
//////                }
//////                if(provider_password.getText().equals(provider_password_reenter.getText()))
//////                {
//////                    P.get(provider_anme).setPassword(provider_password.getText());
//////                }
//////                else
//////                {
//////                    JOptionPane.showMessageDialog(message_box,"The password Entered differs,kindly re-enter your password");
//////                }
//////                if(provider_phone.getText().length()==10)
//////                {
//////                    P.get(provider_anme).setPhone(provider_phone.getText());
//////                }
//////                else
//////                {
//////                    JOptionPane.showMessageDialog(message_box,"The entered number is incorrect, Kindly please enter a correct number");
//////                }
//////                P.get(provider_anme).setCompany_name(provider_company.getText());
//////                if((P.get(provider_anme).check_email(provider_email.getText()))&&(provider_password.getText().equals(provider_password_reenter.getText()))&&(provider_phone.getText().length()==10))
//////                    JOptionPane.showMessageDialog(message_box,"Job server with\nName : "+provider_anme+"\nfrom Company "+P.get(provider_anme).getCompany_name()+" has been added");
//////            }
//////        });
//////        JFrame provider_details = new JFrame();
//////        provider_details.add(provider_phone);
//////        provider_details.add(provider_company);
//////        provider_details.add(provider_email);
//////        provider_details.add(provider_password);
//////        provider_details.add(provider_password_reenter);
//////        provider_details.add(provider_next);
//////        provider_details.add(provider_name);
//////        provider_details.setTitle("Provider Details");
//////        provider_details.setVisible(true);
//////        provider_details.setBounds(10,10,800,600);
//////        provider_details.setLayout(null);
//////    }
//////}
///////*class CONTACT_INFO extends MAIN_CLASS
//////{
//////}*/
/////
//////package MINI_PROJECT;
////////import MINI_PROJECT.Registration;
//////import java.util.*;
//////import java.util.regex.Pattern;
//////public class MAIN_CLASS //LOGIN PAGE
//////{
//////    public static void main(String[] args)
//////    {
//////        String login,Password;
//////        Scanner log = new Scanner(System.in);
//////        System.out.println("LOGIN ID: ");
//////        login = "";
//////        while(true)
//////        {
//////            login = log.next();
//////            if(valid_mail(login))
//////                break;
//////            System.out.println("INVALID MAIL ADDRESS! \n ENTER CORRECT LOGIN ID: ");
//////        }
//////        System.out.println("Password: ");
//////        Password = "";
//////        while (true)
//////        {
//////            Password = log.next();
//////            if (password_valid(Password))
//////                break;
//////            System.out.println("INVALID PASSWORD! \n ENTER CORRECT PASSWORD: ");
//////        }
//////    }
//////    public static boolean valid_mail(String login)
//////    {
//////        String sitregex = "[a-z0-9].+"+"@sitpune.edu.in";
//////        String normal = "^[A-Za-z0-9+_.-]"+ "@gmail.com";
//////        Pattern p = Pattern.compile(sitregex);
//////        Pattern n = Pattern.compile(normal);
//////        if (login == null)
//////            return false;
//////        return (p.matcher(login).matches());
//////    }
//////    public static boolean password_valid(String Password)
//////    {
//////        int length = String.valueOf(Password).length();
//////        for ( int i=0; i<=length ; i++ ) {
//////            char c = Password.charAt(i);
//////            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9'))// Checks if it is a lower case letter //Checks if it is an upper case letter//Checks to see if it is a digit)
//////                return true;
//////        }
//////        return false;
//////    }
//////}
////package MINI_PROJECT;
////import javax.swing.*;
////import java.awt.*;
////import java.awt.event.ActionEvent;
////import java.awt.event.ActionListener;
////import java.text.DateFormat;
////import java.util.*;
////import java.util.regex.Pattern;
////import javax.swing.JFrame;
////import com.toedter.calendar.JDateChooser;
////
////public class MAIN_CLASS //LOGIN PAGE
////{
////    public static void main(String[] args)
////    {
////        //String login,Password;
////        JFrame message_box = new JFrame();
//////        Scanner input = new Scanner(System.in);
//////        System.out.println("LOGIN ID: ");
//////        login = "";
//////        while(true)
//////        {
//////            login = input.next();
//////            if(valid_mail(login))
//////                break;
//////            System.out.println("INVALID MAIL ADDRESS! \n ENTER CORRECT LOGIN ID: ");
//////        }
//////        System.out.println("Password: ");
//////        Password = "";
//////        while (true)
//////        {
//////            Password = input.next();
//////            if (password_valid(Password))
//////                break;
//////            System.out.println("INVALID PASSWORD! \n ENTER CORRECT PASSWORD: ");
//////        }
////        JFrame lf = new JFrame();
////        Map<String,job_provider> P = new HashMap<String,job_provider>();
////        Map<String,CANDIDATE> S = new HashMap<String,CANDIDATE>();
////        JFrame registration = new JFrame();
////        JTextField e_mail = new JTextField();
////        e_mail.setBounds(50,100,100,30);
////        JPasswordField password = new JPasswordField();
////        password.setBounds(50,200,100,30);
////        JLabel new_to_this = new JLabel("New to system? Sign up =>");
////        new_to_this.setBounds(30,250,180,15);
////        new_to_this.setFont(new Font("TimesRoman",Font.ITALIC,15));
////        JButton log_in = new JButton("Login");
////        log_in.setBounds(220,200,100,30);
////        log_in.setBackground(Color.cyan);
////        JButton signup = new JButton("Signup");
////        signup.setBounds(220,250,100,30);
////        // name -> first
////        // password -> second
////        log_in.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                System.out.println("holas");
////                if(!valid_mail(e_mail.getText()))
////                {
////                    System.out.println("email accepted");
////                    JOptionPane.showMessageDialog(message_box,"login successful");
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"Invalid Email address\nRenter it!");
////                }
////            }
////        });
////        JTextField register_name = new JTextField();
////        JPasswordField register_password = new JPasswordField();
////        JPasswordField register_password_reenter = new JPasswordField();
////        JTextField register_phone = new JTextField();// fourth
////        register_name.setBounds(100,130,100,30);
////        register_name.setBounds(100,270,100,30);// first
////        register_phone.setBounds(100,480,100,30);//fourth
////        register_password.setBounds(100,410,100,30);//second
////        register_password_reenter.setBounds(100,340,100,30);//third
////        JButton Job_provider = new JButton("JOB PROVIDER");
////        JButton Job_Seeker = new JButton("JOB SEEKER");
////        Job_Seeker.setBounds(100,540,180,30);
////        Job_provider.setBounds(250,540,180,30);
////        JLabel i_am = new JLabel("I am a =>");
////        i_am.setBounds(30,560,180,15);
////        i_am.setFont(new Font("TimesRoman",Font.ITALIC,15));
////        signup.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e)
////            {
////                     JFrame ask = new JFrame();
////                     ask.setSize(800,800);
////                     ask.setVisible(true);
////                     ask.add(Job_Seeker);
////                     ask.add(Job_provider);
////                     ask.add(register_name);
////                     ask.add(register_password);
////                     ask.add(register_password_reenter);
////                     ask.add(register_phone);
////                     ask.add(i_am);
////                     ask.setTitle("You are");
////                     ask.setLayout(null);
////            }
////        });
////        JTextField provider_email = new JTextField();//first
////        JTextField provider_company = new JTextField();//second
////        JButton seeker_done = new JButton("finish");
////        seeker_done.setBounds(100,450,80,50);
////        provider_email.setBounds(100,200,100,30);
////        provider_company.setBounds(100,380,100,30);
////        Job_provider.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e)
////            {
////                P.put(register_name.getText(),new job_provider());
////                P.get(register_name.getText()).setName(register_name.getText());
////                if(register_password.getText().equals(register_password_reenter.getText()))
////                {
////                    P.get(register_name.getText()).setPassword(register_password.getText());
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"The password Entered differs,kindly re-enter your password");
////                }
////                if(check_phone(register_phone.getText()))
////                {
////                    P.get(register_name.getText()).setPhone(register_phone.getText());
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"The entered number is incorrect, Kindly please enter a correct number");
////                }
////                if((register_password.getText().equals(register_password_reenter.getText()))&&(check_phone(register_phone.getText())))
////                {
////
////                    JOptionPane.showMessageDialog(message_box,"-----Job Seeker---\nName : "+register_name.getText()+" has been saved");
////                    JFrame get_provider_info = new JFrame();
////                    get_provider_info.setSize(800,800);
////                    get_provider_info.setVisible(true);
////                    get_provider_info.add(provider_company);
////                    get_provider_info.add(provider_email);
////                    get_provider_info.add(seeker_done);
////                    get_provider_info.setTitle("JOB PROVIDER INFO");
////                    get_provider_info.setLayout(null);
////                    get_provider_info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////                }
////            }
////        });
////        seeker_done.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e)
////            {
////                if(P.get(register_name.getText()).check_email(provider_email.getText()))
////                {
////                    P.get(register_name.getText()).setCompany_name(provider_company.getText());
////                    P.get(register_name.getText()).setEmail(provider_email.getText());
////                    JOptionPane.showMessageDialog(message_box,"Job seeker "+register_name.getText()+"'s Details saved\nRe-login in to the application and continue your work");
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"Invalid email address!");
////                }
////            }
////        });
////        JDateChooser chooser = new JDateChooser();//calendar : first
////        chooser.setBounds(300,100,100,30);
////        JTextField candidate_email = new JTextField();// first
////        candidate_email.setBounds(300,200,100,30);
////        JTextField candidate_address = new JTextField();//second
////        candidate_address.setBounds(300,300,100,30);
////        JTextField SGPA = new JTextField();
////        SGPA.setBounds(300,500,100,30);
////        JRadioButton Female =new JRadioButton("Female");
////        Female.setActionCommand("Female");
////        JRadioButton Male=new JRadioButton("Male");
////        Male.setActionCommand("Male");
////        JRadioButton Other=new JRadioButton("Other");
////        Other.setActionCommand("Other");
////        JRadioButton nomention = new JRadioButton("Won't mention");
////        nomention.setActionCommand("Won't mention");
////        JButton candidate_done = new JButton("done");
////        candidate_done.setBounds(600,500,80,30);
////        candidate_done.setBackground(Color.cyan);
////        ButtonGroup group=new ButtonGroup();
////        chooser.setLocale(Locale.US);
////        group.add(Female);
////        group.add(Male);
////        group.add(Other);
////        group.add(nomention);
////        Female.setBounds(20,400,100,30);
////        Male.setBounds(120,400,100,30);
////        Other.setBounds(220,400,100,30);
////        nomention.setBounds(320,400,100,30);
////        Job_Seeker.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e)
////            {
////                S.put(register_name.getText(),new CANDIDATE());
////                S.get(register_name.getText()).setName(register_name.getText());
////                if(register_password.getText().equals(register_password_reenter.getText()))
////                {
////                    S.get(register_name.getText()).setPassword(register_password.getText());
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"The password Entered differs,kindly re-enter your password");
////                }
////                if(check_phone(register_phone.getText()))
////                {
////                    S.get(register_name.getText()).setPhoneno(register_phone.getText());
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"The entered number is incorrect, Kindly please enter a correct number");
////                }
////                if((register_password.getText().equals(register_password_reenter.getText()))&&(check_phone(register_phone.getText())))
////                {
////                    JOptionPane.showMessageDialog(message_box,"-----Job Server---\nName : "+register_name.getText()+" has been saved");
////                    JFrame get_candidate_info = new JFrame();
////                    get_candidate_info.setSize(800,800);
////                    get_candidate_info.setVisible(true);
////                    get_candidate_info.add(candidate_email);
////                    get_candidate_info.add(chooser);
////                    get_candidate_info.add(candidate_address);
////                    get_candidate_info.add(Female);
////                    get_candidate_info.add(Male);
////                    get_candidate_info.add(Other);
////                    get_candidate_info.add(nomention);
////                    get_candidate_info.add(SGPA);
////                    get_candidate_info.add(candidate_done);
////                    get_candidate_info.setTitle("Candidate info");
////                    get_candidate_info.setLayout(null);
////                    get_candidate_info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////                }
////            }
////        });
////        candidate_done.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                Date date = chooser.getDate();
////                String date_string = DateFormat.getDateInstance().format(date);
////                if(date_string!=null) {
////                    S.get(register_name.getText()).setDob(date_string);
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"Enter your date of birth");
////                }
////                if(S.get(register_name.getText()).mailisvalid(candidate_email.getText()))
////                {
////                    S.get(register_name.getText()).setEmail(candidate_email.getText());
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"Enter A valid email address");
////                }
////                if(candidate_address.getText()!=null)
////                {
////                    S.get(register_name.getText()).setAddress(candidate_address.getText());
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"Enter an address");
////                }
////                if(group.getSelection().getActionCommand()!=null)
////                {
////                    S.get(register_name.getText()).setGender(group.getSelection().getActionCommand());
////                }
////                else {
////                    JOptionPane.showMessageDialog(message_box,"Choose an option for your gender");
////                }
////                if(SGPA.getText()!=null)
////                {
////                    S.get(register_name.getText()).setSgpa(Float.parseFloat(SGPA.getText()));
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"SGPA is an important criteria\nHence please enter your sgpa");
////                }
////                if((date_string!=null)&&(S.get(register_name.getText()).mailisvalid(candidate_email.getText()))&&(candidate_address.getText()!=null)&&(group.getSelection().getActionCommand()!=null)&&(SGPA.getText()!=null))
////                {
////                    JOptionPane.showMessageDialog(message_box,"Job candidate Name : "+register_name.getText()+"\n has been added\nKindly re-login to continue with your work!");
////                }
////            }
////        });
//////        //System.out.println("CONTACT DETAILS: ");
//////        //JTextField provider_email = new JTextField();// first
////////        JPasswordField provider_password = new JPasswordField();//second
////////        JPasswordField provider_password_reenter = new JPasswordField();//third
////////        JTextField provider_phone = new JTextField();// fourth
//////        //JTextField provider_company = new JTextField();//fifth
//////        //JTextField provider_name = new JTextField();
//////        //provider_name.setBounds(100,130,100,30);
////////        provider_email.setBounds(100,200,100,30);
////////        provider_password.setBounds(100,270,100,30);
////////        provider_phone.setBounds(100,410,100,30);
////////        provider_company.setBounds(100,480,100,30);
//////        //provider_password_reenter.setBounds(100,340,100,30);
//////        JButton provider_next = new JButton("NEXT");
//////        provider_next.setBackground(Color.cyan);
//////        provider_next.setBounds(510,100,200,50);
//////        provider_next.addActionListener(new ActionListener() {
//////            @Override
//////            public void actionPerformed(ActionEvent e)
//////            {
//////                P.put(register_name.getText(),new job_provider());
//////                if(P.get(register_name.getText()).check_email(provider_email.getText()))
//////                {
//////                    P.get(register_name.getText()).setEmail(provider_email.getText());
//////                }
////////                if(provider_password.getText().equals(provider_password_reenter.getText()))
////////                {
////////                    P.get(provider_anme).setPassword(provider_password.getText());
////////                }
////////                else
////////                {
////////                    JOptionPane.showMessageDialog(message_box,"The password Entered differs,kindly re-enter your password");
////////                }
////////                if(provider_phone.getText().length()==10)
////////                {
////////                    P.get(provider_anme).setPhone(provider_phone.getText());
////////                }
////////                else
////////                {
////////                    JOptionPane.showMessageDialog(message_box,"The entered number is incorrect, Kindly please enter a correct number");
////////                }
////////                P.get(provider_anme).setCompany_name(provider_company.getText());
////////                if((P.get(provider_anme).check_email(provider_email.getText()))&&(provider_password.getText().equals(provider_password_reenter.getText()))&&(provider_phone.getText().length()==10))
////////                    JOptionPane.showMessageDialog(message_box,"Job server with\nName : "+provider_anme+"\nfrom Company "+P.get(provider_anme).getCompany_name()+" has been added");
//////             }
//////        });
////////        JFrame provider_details = new JFrame();
////////       // provider_details.add(provider_phone);
////////        provider_details.add(provider_company);
////////        provider_details.add(provider_email);
////////        //provider_details.add(provider_password);
////////        //provider_details.add(provider_password_reenter);
////////        provider_details.add(provider_next);
////////       // provider_details.add(provider_name);
////////        provider_details.setTitle("Provider Details");
////////        provider_details.setVisible(true);
////////        provider_details.setBounds(10,10,800,600);
////////        provider_details.setLayout(null);
////        lf.setSize(800,800);
////        lf.setVisible(true);
////        lf.add(new_to_this);
////        lf.add(signup);
////        lf.add(e_mail);
////        lf.add(password);
////        lf.add(log_in);
////        lf.setTitle("Welcome");
////        lf.setLayout(null);
// //    }
////    public static boolean valid_mail(String login)
////    {
////        String Mail_regex = "[A-Z1-9a-z]+@[a-z]+.[a-z]";
////        Pattern p = Pattern.compile(Mail_regex);
////        if (login == null)
////            return false;
////        return (p.matcher(login).matches());
////    }
////    public static boolean password_valid(String Password)
////    {
////        int length = String.valueOf(Password).length();
////        for ( int i=0; i<=length ; i++ ) {
////            char c = Password.charAt(i);
////            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9'))// Checks if it is a lower case letter //Checks if it is an upper case letter//Checks to see if it is a digit)
////                return true;
////        }
////        return false;
////    }
////    public static boolean check_phone(String s)
////    {
////        String numregex = "[0-9]{10}";
////        Pattern pat = Pattern.compile(numregex);
////        if (s == null)
////            return false;
////        return (pat.matches(numregex,s));
////    }
////}
//package MINI_PROJECT;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.SQLException;
//import java.text.DateFormat;
//import java.util.*;
//import java.util.regex.Pattern;
//import javax.swing.JFrame;
//import com.toedter.calendar.JDateChooser;
//public class MAIN_CLASS //LOGIN PAGE
//{
//    public static void main(String[] args)
//    {
//        //String login,Password;
//        JFrame message_box = new JFrame();
////        Scanner input = new Scanner(System.in);
////        System.out.println("LOGIN ID: ");
////        login = "";
////        while(true)
////        {
////            login = input.next();
////            if(valid_mail(login))
////                break;
////            System.out.println("INVALID MAIL ADDRESS! \n ENTER CORRECT LOGIN ID: ");
////        }
////        System.out.println("Password: ");
////        Password = "";
////        while (true)
////        {
////            Password = input.next();
////            if (password_valid(Password))
////                break;
////            System.out.println("INVALID PASSWORD! \n ENTER CORRECT PASSWORD: ");
////        }
//        SQL_CONNECT sql = new SQL_CONNECT();
//        JFrame lf = new JFrame();
//        Map<String,job_provider> P = new HashMap<String,job_provider>();
//        Map<String,CANDIDATE> S = new HashMap<String,CANDIDATE>();
//        JFrame registration = new JFrame();
//        JTextField e_mail = new JTextField();
//        e_mail.setBounds(50,100,100,30);
//        JPasswordField password = new JPasswordField();
//        password.setBounds(50,200,100,30);
//        JLabel new_to_this = new JLabel("New to system? Sign up =>");
//        new_to_this.setBounds(30,250,180,15);
//        new_to_this.setFont(new Font("TimesRoman",Font.ITALIC,15));
//        JButton log_in = new JButton("Login");
//        log_in.setBounds(220,200,100,30);
//        log_in.setBackground(Color.cyan);
//        JButton signup = new JButton("Signup");
//        signup.setBounds(220,250,100,30);
//        // name->first
//        // password -> second
//        log_in.addActionListener(new ActionListener() {// if in login window login button is choosed
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("holas");
//                if(!valid_mail(e_mail.getText()))
//                {
//                    System.out.println("email accepted");
//                    JOptionPane.showMessageDialog(message_box,"login successful");
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"Invalid Email address\nRenter it!");
//                }
//
//            }
//        });
//        JTextField register_name = new JTextField();
//        JPasswordField register_password = new JPasswordField();
//        JPasswordField register_password_reenter = new JPasswordField();
//        JTextField register_phone = new JTextField();// fourth
//        register_name.setBounds(100,130,100,30);
//        register_name.setBounds(100,270,100,30);// first
//        register_phone.setBounds(100,480,100,30);//fourth
//        register_password.setBounds(100,410,100,30);//second
//        register_password_reenter.setBounds(100,340,100,30);//third
//        JButton Job_provider = new JButton("JOB PROVIDER");
//        JButton Job_Seeker = new JButton("JOB SEEKER");
//        Job_Seeker.setBounds(100,540,180,30);
//        Job_provider.setBounds(250,540,180,30);
//        JLabel i_am = new JLabel("I am a =>");
//        i_am.setBounds(30,560,180,15);
//        i_am.setFont(new Font("TimesRoman",Font.ITALIC,15));
//        signup.addActionListener(new ActionListener() {//if button pressed on login window is signup then
//            @Override// a new frame -> registration will be created with variuos textfields and 2 buttons job provider,job seeker
//            public void actionPerformed(ActionEvent e)
//            {
//                JFrame ask = new JFrame();
//                ask.setSize(800,800);
//                ask.setVisible(true);
//                ask.add(Job_Seeker);
//                ask.add(Job_provider);
//                ask.add(register_name);
//                ask.add(register_password);
//                ask.add(register_password_reenter);
//                ask.add(register_phone);
//                ask.add(i_am);
//                ask.setTitle("You are");
//                ask.setLayout(null);
//
//            }
//        });
//        JTextField provider_email = new JTextField();//first
//        JTextField provider_company = new JTextField();//second
//        JButton provider_done = new JButton("finish");
//        provider_done.setBounds(100,450,80,50);
//        provider_email.setBounds(100,200,100,30);
//        provider_company.setBounds(100,380,100,30);
//        Job_provider.addActionListener(new ActionListener() {// if from registration page job provider is chosen then firstly save the info on registration page into job provider object
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//                P.put(register_name.getText(),new job_provider());
//                P.get(register_name.getText()).setName(register_name.getText());
//                if(register_password.getText().equals(register_password_reenter.getText()))
//                {
//                    P.get(register_name.getText()).setPassword(register_password.getText());
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"The password Entered differs,kindly re-enter your password");
//                }
//                if(check_phone(register_phone.getText()))
//                {
//                    P.get(register_name.getText()).setPhone(register_phone.getText());
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"The entered number is incorrect, Kindly please enter a correct number");
//                }
//                if((register_password.getText().equals(register_password_reenter.getText()))&&(check_phone(register_phone.getText())))
//                {
//                    JOptionPane.showMessageDialog(message_box,"-----Job Provider---\nName : "+register_name.getText()+" has been saved");
//                    sql.Register(register_name.getText(), register_password.getText(), register_phone.getText());
//                    JFrame get_provider_info = new JFrame();// firstly whole data for job provider is verified and saved and now frame for job provider's further info is created
//                    get_provider_info.setSize(800,800);
//                    get_provider_info.setVisible(true);
//                    get_provider_info.add(provider_company);
//                    get_provider_info.add(provider_email);
//                    get_provider_info.add(provider_done);
//                    get_provider_info.setTitle("JOB PROVIDER INFO");
//                    get_provider_info.setLayout(null);
//                    get_provider_info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                }
//            }
//        });
//        provider_done.addActionListener(new ActionListener() {// now user will enter data into job provider's further info frame and presses done
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//                if(P.get(register_name.getText()).check_email(provider_email.getText()))
//                {
//                    P.get(register_name.getText()).setCompany_name(provider_company.getText());
//                    P.get(register_name.getText()).setEmail(provider_email.getText());
//                    JOptionPane.showMessageDialog(message_box,"Job Provider "+register_name.getText()+"'s Details saved\nRe-login in to the application and continue your work");
//                    try {
//                        sql.Job_Provider(register_name.getText(),provider_email.getText(),provider_company.getText());
//                    } catch (SQLException throwables) {
//                        throwables.printStackTrace();
//                    }
//                    // now all of your info is saved and program exits
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"Invalid email address!");
//                }
//            }
//        });
//        JDateChooser chooser = new JDateChooser();//calendar : first
//        chooser.setBounds(300,100,100,30);
//        JTextField candidate_email = new JTextField();// first
//        candidate_email.setBounds(300,200,100,30);
//        JTextField candidate_address = new JTextField();//second
//        candidate_address.setBounds(300,300,100,30);
//        JTextField SGPA = new JTextField();
//        SGPA.setBounds(300,500,100,30);
//        JRadioButton Female =new JRadioButton("Female");
//        Female.setActionCommand("Female");
//        JRadioButton Male=new JRadioButton("Male");
//        Male.setActionCommand("Male");
//        JRadioButton Other=new JRadioButton("Other");
//        Other.setActionCommand("Other");
//        JRadioButton nomention = new JRadioButton("Won't mention");
//        nomention.setActionCommand("Won't mention");
//        JButton candidate_done = new JButton("done");
//        candidate_done.setBounds(600,500,80,30);
//        candidate_done.setBackground(Color.cyan);
//        ButtonGroup group=new ButtonGroup();
//        chooser.setLocale(Locale.US);
//        group.add(Female);
//        group.add(Male);
//        group.add(Other);
//        group.add(nomention);
//        Female.setBounds(20,400,100,30);
//        Male.setBounds(120,400,100,30);
//        Other.setBounds(220,400,100,30);
//        nomention.setBounds(320,400,100,30);
//        Job_Seeker.addActionListener(new ActionListener() {// if on registration page among the buttons job seeker and job provider, if job seeker is pressed then we come to this code
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//                S.put(register_name.getText(),new CANDIDATE());
//                S.get(register_name.getText()).setName(register_name.getText());
//                if(register_password.getText().equals(register_password_reenter.getText()))
//                {
//                    S.get(register_name.getText()).setPassword(register_password.getText());
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"The password Entered differs,kindly re-enter your password");
//                }
//                if(check_phone(register_phone.getText()))
//                {
//                    S.get(register_name.getText()).setPhoneno(register_phone.getText());
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"The entered number is incorrect, Kindly please enter a correct number");
//                }
//                if((register_password.getText().equals(register_password_reenter.getText()))&&(check_phone(register_phone.getText())))//if the entered data on registration page that is name , password and phone all are correct then we come here
//                {
//                    sql.Register(register_name.getText(), register_password.getText(), register_phone.getText());
//                    JOptionPane.showMessageDialog(message_box,"-----Job Seeker---\nName : "+register_name.getText()+" has been saved");
//                    JFrame get_candidate_info = new JFrame();// once data on your registration  page is saved , then a new window is created for further info of job seeker
//                    get_candidate_info.setSize(800,800);
//                    get_candidate_info.setVisible(true);
//                    get_candidate_info.add(candidate_email);
//                    get_candidate_info.add(chooser);
//                    get_candidate_info.add(candidate_address);
//                    get_candidate_info.add(Female);
//                    get_candidate_info.add(Male);
//                    get_candidate_info.add(Other);
//                    get_candidate_info.add(nomention);
//                    get_candidate_info.add(SGPA);
//                    get_candidate_info.add(candidate_done);
//                    get_candidate_info.setTitle("Candidate info");
//                    get_candidate_info.setLayout(null);
//                    get_candidate_info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                }
//            }
//        });
//        candidate_done.addActionListener(new ActionListener() {// Now we enter data into the further info of job seeker frame , once we click done thenthis code starts executing
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Date date = chooser.getDate();
//                String date_string = DateFormat.getDateInstance().format(date);
//                if(date_string!=null) {
//                    S.get(register_name.getText()).setDob(date_string);
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"Enter your date of birth");
//                }
//                if(S.get(register_name.getText()).mailisvalid(candidate_email.getText()))
//                {
//                    S.get(register_name.getText()).setEmail(candidate_email.getText());
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"Enter A valid email address");
//                }
//                if(candidate_address.getText()!=null)
//                {
//                    S.get(register_name.getText()).setAddress(candidate_address.getText());
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"Enter an address");
//                }
//                if(group.getSelection().getActionCommand()!=null)
//                {
//                    S.get(register_name.getText()).setGender(group.getSelection().getActionCommand());
//                }
//                else {
//                    JOptionPane.showMessageDialog(message_box,"Choose an option for your gender");
//                }
//                if(SGPA.getText()!=null)
//                {
//                    S.get(register_name.getText()).setSgpa(Float.parseFloat(SGPA.getText()));
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(message_box,"CGPA is an important criteria\nHence please enter your CGPA");
//                }
//                if((date_string!=null)&&(S.get(register_name.getText()).mailisvalid(candidate_email.getText()))&&(candidate_address.getText()!=null)&&(group.getSelection().getActionCommand()!=null)&&(SGPA.getText()!=null))
//                // if entered data on the job seeker's further info frame is correct then we will come here
//                {
//                    JOptionPane.showMessageDialog(message_box,"Job candidate Name : "+register_name.getText()+"\n has been added\nKindly re-login to continue with your work!");
//                    try {
//                        sql.Job_Seeker(register_name.getText(),date_string,candidate_email.getText(),candidate_address.getText(),group.getSelection().getActionCommand(),SGPA.getText());
//                    } catch (SQLException throwables) {
//                        throwables.printStackTrace();
//                    }
//
//                }
//
//            }
//        });
////        //System.out.println("CONTACT DETAILS: ");
////        //JTextField provider_email = new JTextField();// first
//////        JPasswordField provider_password = new JPasswordField();//second
//////        JPasswordField provider_password_reenter = new JPasswordField();//third
//////        JTextField provider_phone = new JTextField();// fourth
////        //JTextField provider_company = new JTextField();//fifth
////        //JTextField provider_name = new JTextField();
////        //provider_name.setBounds(100,130,100,30);
//////        provider_email.setBounds(100,200,100,30);
//////        provider_password.setBounds(100,270,100,30);
//////        provider_phone.setBounds(100,410,100,30);
//////        provider_company.setBounds(100,480,100,30);
////        //provider_password_reenter.setBounds(100,340,100,30);
////        JButton provider_next = new JButton("NEXT");
////        provider_next.setBackground(Color.cyan);
////        provider_next.setBounds(510,100,200,50);
////        provider_next.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e)
////            {
////                P.put(register_name.getText(),new job_provider());
////                if(P.get(register_name.getText()).check_email(provider_email.getText()))
////                {
////                    P.get(register_name.getText()).setEmail(provider_email.getText());
////                }
//////                if(provider_password.getText().equals(provider_password_reenter.getText()))
//////                {
//////                    P.get(provider_anme).setPassword(provider_password.getText());
//////                }
//////                else
//////                {
//////                    JOptionPane.showMessageDialog(message_box,"The password Entered differs,kindly re-enter your password");
//////                }
//////                if(provider_phone.getText().length()==10)
//////                {
//////                    P.get(provider_anme).setPhone(provider_phone.getText());
//////                }
//////                else
//////                {
//////                    JOptionPane.showMessageDialog(message_box,"The entered number is incorrect, Kindly please enter a correct number");
//////                }
//////                P.get(provider_anme).setCompany_name(provider_company.getText());
//////                if((P.get(provider_anme).check_email(provider_email.getText()))&&(provider_password.getText().equals(provider_password_reenter.getText()))&&(provider_phone.getText().length()==10))
//////                    JOptionPane.showMessageDialog(message_box,"Job server with\nName : "+provider_anme+"\nfrom Company "+P.get(provider_anme).getCompany_name()+" has been added");
////             }
////        });
//////        JFrame provider_details = new JFrame();
//////       // provider_details.add(provider_phone);
//////        provider_details.add(provider_company);
//////        provider_details.add(provider_email);
//////        //provider_details.add(provider_password);
//////        //provider_details.add(provider_password_reenter);
//////        provider_details.add(provider_next);
//////       // provider_details.add(provider_name);
//////        provider_details.setTitle("Provider Details");
//////        provider_details.setVisible(true);
//////        provider_details.setBounds(10,10,800,600);
//////        provider_details.setLayout(null);
//        lf.setSize(800,800);
//        lf.setVisible(true);
//        lf.add(new_to_this);
//        lf.add(signup);
//        lf.add(e_mail);
//        lf.add(password);
//        lf.add(log_in);
//        lf.setTitle("Welcome");// First window->login => login or register?  + 2 buttons-> login,signup
//        lf.setLayout(null);
//    }
//    public static boolean valid_mail(String login)
//    {
//        String Mail_regex = "^(.+)@(.+)$";
//        Pattern p = Pattern.compile(Mail_regex);
//        if (login == null)
//            return false;
//        return (p.matcher(login).matches());
//    }
//    public static boolean password_valid(String Password)
//    {
//        int length = String.valueOf(Password).length();
//        for ( int i=0; i<=length ; i++ ) {
//            char c = Password.charAt(i);
//            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9'))// Checks if it is a lower case letter //Checks if it is an upper case letter//Checks to see if it is a digit)
//                return true;
//        }
//        return false;
//    }
//    public static boolean check_phone(String s)
//    {
//        String numregex = "[0-9]{10}";
//        Pattern pat = Pattern.compile(numregex);
//        if (s == null)
//            return false;
//        return (pat.matches(numregex,s));
//    }
//
//}
package MINI_PROJECT;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

public class MAIN_CLASS //LOGIN PAGE
{
    public static void main(String[] args)
    {
        JFrame message_box = new JFrame();
        message_box.getContentPane().setBackground(Color.WHITE);
        //        Scanner input = new Scanner(System.in);
//        System.out.println("LOGIN ID: ");
//        login = "";
//        while(true)
//        {
//            login = input.next();
//            if(valid_mail(login))
//                break;
//            System.out.println("INVALID MAIL ADDRESS! \n ENTER CORRECT LOGIN ID: ");
//        }
//        System.out.println("Password: ");
//        Password = "";
//        while (true)
//        {
//            Password = input.next();
//            if (password_valid(Password))
//                break;
//            System.out.println("INVALID PASSWORD! \n ENTER CORRECT PASSWORD: ");
//        }
        JFrame lf = new JFrame();
        lf.getContentPane().setBackground(Color.WHITE);
        SQL_CONNECT sql = new SQL_CONNECT();
        String[] Jobs ={"SELECT","IT / Software","Core-Technical","Diploma Jobs","Part Time Jobs"};
        //Map<Object, Registration> R = new HashMap<>();
// selection of jobs
        Map<String,Jobs> Job_posts = sql.getold_j();
        for (String x: Jobs)
        // checking whether value of x is present in hash map job_post if not then x will store values which are in jobs
        {
            if(!Job_posts.containsKey(x)) {
                Job_posts.put(x,new Jobs());
            }
        }
//        Job_posts.put("IT / Software",new Jobs());
//        Job_posts.get("IT / Software").setName("IT / Software");
//        Job_posts.put("Core Technical",new Jobs());
//        Job_posts.get("Core Technical").setName("Core Technical");
//        Job_posts.put("DIPLOMA JOBS",new Jobs());
//        Job_posts.get("DIPLOMA JOBS").setName("DIPLOMA JOBS");
//        Job_posts.put("PART TIME JOBS",new Jobs());
//        Job_posts.get("PART TIME JOBS").setName("PART TIME JOBS");
        Map<String,Job_provider> P = sql.getold_jp() ;
        for (Map.Entry<String,Job_provider> entry:P.entrySet()) {
            System.out.println(entry.getValue().getName());
        }
        Map<String,CANDIDATE> S = sql.getold_c();
        for (Map.Entry<String,CANDIDATE> entry:S.entrySet()) {
            System.out.println(entry.getValue().getName());
        }
////        if (sql.Register.size()!=0)
//        {
//            int i=0;
//            while(i!=sql.Register.size())
//            {
//                R.get(sql.Register.get(i));
//                R.put(sql.Register.get(i),new Registration());
//                R.get(sql.Register.get(i)).setName();
//                //R.get(sql.Register.get(i)).C_name = sql.Register.get(i);
//                //R.get(sql.Register.get(i)) = sql.//(sql_var.old_Professors.get(i));
////                all_profs.add(sql_var.old_Professors.get(i));
////                //System.out.println(sql_var.old_Professors.get(i));
////                R.get(sql_var.old_Professors.get(i)).Extract_old_batches();
////                //System.out.println("Going to extract courses for "+sql_var.old_Professors.get(i));
////                R.get(sql_var.old_Professors.get(i)).Extract_old_courses_Professor();
////                //System.out.println("extracted courses for "+sql_var.old_Professors.get(i));
//                i++;
//            }
//        }
//        System.setFont(new Font("Old English Text MT", Font.BOLD, 50));
//        System.setBounds(336, 194, 218, 83);
//        JFrame registration = new JFrame();
//        registration.getContentPane().setBackground(Color.WHITE);
//        ImageIcon image1 = new ImageIcon("E:\\Intelli J WS\\src\\MINI_PROJECT\\Image.png");
//        JLabel label = new JLabel(image1);
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setVerticalAlignment(JLabel.TOP);                        ImageIcon image = new ImageIcon("D:\\college lectures\\JAVA_PROGRAM\\src\\MINI_PROJECT\\Logo.png");
        ImageIcon image = new ImageIcon("D:\\college lectures\\JAVA_PROGRAM\\src\\MINI_PROJECT\\Logo.png");

        JLabel heading = new JLabel("SYMBIOSIS INSTITUTE OF TECHNOLOGY");
        JLabel heading1 = new JLabel("--- ONLINE RECRUITMENT SYSTEM ---");
        heading.setBounds(355, 125, 500, 30);
        heading.setFont(new Font("Sitka Heading",Font.BOLD,26));
        heading1.setBounds(430, 160, 400, 20);
        heading1.setFont(new Font("Sitka Heading",Font.BOLD,20));
        heading.setForeground(new Color(170, 0, 0));
        heading1.setForeground(new Color(200, 0, 0));
        JLabel mail = new JLabel("Email:");
        mail.setBounds(450, 245, 100, 20);
        mail.setFont(new Font("Sitka Heading",Font.BOLD,18));
        JTextField e_mail = new JTextField();
        e_mail.setBounds(450,270,300,40);
        JLabel Password = new JLabel("Password:");
        Password.setBounds(450, 345, 100, 20);
        Password.setFont(new Font("Sitka Heading",Font.BOLD,18));
        JPasswordField password = new JPasswordField();
        password.setBounds(450,370,300,40);
        JRadioButton login_provider = new JRadioButton("Job Provider");
        login_provider.setActionCommand("Job Provider");
        login_provider.setBounds(600,420,100,50);
        JRadioButton login_seeker = new JRadioButton("Job Seeker");
        login_seeker.setActionCommand("Job Seeker");
        login_seeker.setBounds(500,420,100,50);
        ButtonGroup g1 = new ButtonGroup();
        g1.add(login_provider);
        g1.add(login_seeker);
        g1.add(login_seeker);
        JLabel new_to_this = new JLabel("Didn't Sign up yet?");
        new_to_this.setBounds(540,550,180,50);
        new_to_this.setFont(new Font("Sitka Heading",Font.BOLD,15));
        JButton log_in = new JButton("Login");
        log_in.setBounds(550,500,100,30);
        log_in.setBackground(Color.PINK);
        JButton signup = new JButton("Signup");
        signup.setBounds(550,600,100,30);
        // name->first
        // password -> second

        //JTabbedPane tt = new JTabbedPane();
//        JFrame Profile_see = new JFrame();


        JLabel disp_name = new JLabel("Candidate Name:");
        disp_name.setBounds(200, 200, 150, 18);
        disp_name.setFont(new Font("Sitka Heading",Font.BOLD,18));

        JLabel name = new JLabel();
        name.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        name.setBounds(350,200,200,18);

        JLabel disp_mail = new JLabel("Registered Mail:");
        disp_mail.setBounds(200, 250, 150, 18);
        disp_mail.setFont(new Font("Sitka Heading",Font.BOLD,18));

        JLabel email = new JLabel();
        email.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        email.setBounds(350,250,400,18);

        JLabel disp_mobn = new JLabel("Mobile Number:");
        disp_mobn.setBounds(200, 300, 150, 18);
        disp_mobn.setFont(new Font("Sitka Heading",Font.BOLD,18));

        JLabel phone_number = new JLabel();
        phone_number.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        phone_number.setBounds(350,300,200,18);

        JLabel disp_comp = new JLabel("Company Name:");
        disp_comp.setBounds(200, 350, 150, 18);
        disp_comp.setFont(new Font("Sitka Heading",Font.BOLD,18));

        JLabel comp = new JLabel();
        comp.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        comp.setBounds(380,350,200,18);

        JLabel disp_dob = new JLabel("Date of Birth:");
        disp_dob.setBounds(200, 350, 150, 18);
        disp_dob.setFont(new Font("Sitka Heading",Font.BOLD,18));

        JLabel DOB = new JLabel();
        DOB.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        DOB.setBounds(350,350,100,18);

        JLabel disp_gen = new JLabel("Gender:");
        disp_gen.setBounds(200, 400, 150, 18);
        disp_gen.setFont(new Font("Sitka Heading",Font.BOLD,18));

        JLabel gen = new JLabel();
        gen.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        gen.setBounds(350,400,100,18);

        JLabel disp_gpa = new JLabel("GPA:");
        disp_gpa.setBounds(200, 450, 150, 18);
        disp_gpa.setFont(new Font("Sitka Heading",Font.BOLD,18));

        JLabel CGPA = new JLabel();
        CGPA.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        CGPA.setBounds(350,450,100,18);

        JLabel disp_addr = new JLabel("Address given:");
        disp_addr.setBounds(200, 500, 150, 18);
        disp_addr.setFont(new Font("Sitka Heading",Font.BOLD,18));

        JLabel addr = new JLabel();
        addr.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        addr.setBounds(350,500,400,18);


        JComboBox jobtypes = new JComboBox(Jobs);
        jobtypes.setBounds(400,600,150,35);
        JLabel disp_text = new JLabel("JOB:");
        disp_text.setBounds(575, 600, 50, 20);
        disp_text.setFont(new Font("Sitka Heading",Font.BOLD,15));
        JTextField post_name = new JTextField();
        post_name.setBounds(625,600,150,35);
        JButton clickpost = new JButton();
        clickpost.setBounds(800,600,75,35);
        JButton clickjobs = new JButton("Applicable Jobs");
        clickjobs.setBounds(600,600,150,35);

        JLabel disp_del = new JLabel("Delete Record:");
        disp_del.setBounds(830, 700, 120, 18);
        disp_del.setFont(new Font("Sitka Heading",Font.BOLD,18));
        JButton delete = new JButton("DELETE");
        delete.setBounds(965,685,100,45);
//        JTable seeker_Table=new JTable();
//        JScrollPane sp=new JScrollPane(tt);
//        sp.setSize(800,150);
//        sp.setBounds(100,150,800,125);
//        seeker_Table.setSize(800,100);
//digha.jain@sitpune.edu.in
        JButton Apply = new JButton("APPLY");
        Apply.setBounds(500,650,150,40);
        JButton review = new JButton("APPLICATIONS");
        review.setBounds(200,425,175,40);
        review.setFocusable(false);
        final JTable[] table = new JTable[2];
        final DefaultTableModel[] model = new DefaultTableModel[2];
//        registration.setVisible(true);
        model[0] = new DefaultTableModel(new Object[]{"Company Name", "Post", "Select"}, 0)
        {
            @Override
            public Class getColumnClass(int columnIndex)
            {
                switch (columnIndex)
                {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    default:
                        return Boolean.class;
                }
            }
        };
        model[1] = new DefaultTableModel(new Object[]{"Candidate", "Applied Post","Email-address","CGPA"}, 0)
        {
            @Override
            public Class getColumnClass(int columnIndex)
            {
                switch (columnIndex)
                {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    default:
                        return String.class;
                }
            }
        };
       // ActionListener in Java is a class that is responsible for handling all action events
        log_in.addActionListener(new ActionListener() {// if in login window login button is choosed
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("holas");
                boolean found = false;
                String s =new String();
                if(g1.getSelection().getActionCommand()=="Job Provider")
                {
                    for(Map.Entry<String,Job_provider> entry:P.entrySet())
                    {
                        if((entry.getValue().getEmail().equals(e_mail.getText()))&&(entry.getValue().getPassword().equals(password.getText())))
                        {
                            s = entry.getKey();
                            found=true;
                            break;
                        }
                    }
                }
                else
                {
                    for(Map.Entry<String,CANDIDATE> entry:S.entrySet())
                    {
                        if((entry.getValue().getEmail().equals(e_mail.getText()))&&(entry.getValue().getPassword().equals(password.getText())))
                        {
                            s = entry.getKey();
                            found=true;
                            break;
                        }
                    }
                }
                if(found)
                {
                    if(g1.getSelection().getActionCommand()=="Job Seeker")
                    {
//                      JFrame Seeker = new JFrame();
//                      JPanel applications = new JPanel();
                        JFrame Profile_see = new JFrame();
                        Profile_see.getContentPane().setBackground(Color.WHITE);

                        Profile_see.setBackground(Color.white);
                        Profile_see.setResizable(false);

                        Profile_see.setIconImage(image.getImage());
                        name.setText(S.get(s).getName());
                        email.setText(S.get(s).getEmail());
                        phone_number.setText(S.get(s).getPhoneno());
                        DOB.setText(S.get(s).getDob());
                        gen.setText(S.get(s).getGender());
                        CGPA.setText(Float.toString(S.get(s).getSgpa()));
                        addr.setText(S.get(s).getAddress());

                        Profile_see.setTitle("  JOB SEEKER INFORMATION DISPLAY");
                        Profile_see.add(disp_name);
                        Profile_see.add(disp_mail);
                        Profile_see.add(disp_mobn);
                        Profile_see.add(disp_dob);
                        Profile_see.add(disp_gen);
                        Profile_see.add(disp_gpa);
                        Profile_see.add(disp_addr);
                        Profile_see.add(disp_del);
                        Profile_see.add(name);
                        Profile_see.add(email);
                        Profile_see.add(phone_number);
                        Profile_see.add(DOB);
                        Profile_see.add(gen);
                        Profile_see.add(CGPA);
                        Profile_see.add(addr);
                        Profile_see.add(clickjobs);
                        Profile_see.add(jobtypes);
                        Profile_see.add(delete);
                        JLabel surplus =new JLabel(" ");
                        surplus.setBounds(350,400,150,18);
                        Profile_see.add(surplus);
                        Profile_see.setSize(1200,800);
                        Profile_see.setVisible(true);
                        //applications.add(jobtypes);
                        //applications.add(clickjobs);
                        //tt.add(Profile_see);
//                      Seeker.add(tt);
//                      Seeker.setSize(900, 900);
//                      tt.setBounds(10, 10, 800, 800);
//                      Seeker.setLayout(null);
//                      Seeker.setVisible(true);
                    }
                    else
                    {
                        JFrame Profile_see = new JFrame();
                        Profile_see.getContentPane().setBackground(Color.WHITE);

                        Profile_see.setBackground(Color.white);
                        Profile_see.setResizable(false);
                        Profile_see.setIconImage(image.getImage());
//                      JPanel applications = new JPanel();
                        clickpost.setText("Post");
                        Profile_see.add(clickpost);
                        Profile_see.add(review);
                        Profile_see.add(jobtypes);
                        Profile_see.add(post_name);
                        Profile_see.add(disp_del);
                        name.setText(P.get(s).getName());
                        email.setText(P.get(s).getEmail());
                        phone_number.setText(P.get(s).getPhone());
                        comp.setText(P.get(s).getCompany_name());
                        Profile_see.setTitle("  JOB PROVIDER INFORMATION DISPLAY");
                        Profile_see.add(disp_name);
                        Profile_see.add(disp_mail);
                        Profile_see.add(disp_mobn);
                        Profile_see.add(disp_comp);
                        Profile_see.add(disp_text);
                        Profile_see.add(name);
                        Profile_see.add(email);
                        Profile_see.add(phone_number);
                        Profile_see.add(comp);
                        Profile_see.add(delete);
                        JLabel surplus =new JLabel(" ");
                        surplus.setBounds(350,400,150,18);
                        Profile_see.add(surplus);
                        Profile_see.setSize(1200,800);
//                      applications.add(jobtypes);
//                      applications.add(post_name);
                        Profile_see.setVisible(true);
//                      applications.add(clickpost);
//                      tt.add(Profile_see);
//                      tt.add(applications);
//                      tt.setBounds(10, 10, 900, 900);
//                      Provider.setSize(900, 900);
//                      Provider.add(tt);
//
//
//                      Provider.setLayout(null);
//                      Provider.setVisible(true);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"Invalid E-mail address or Password!");
                }
            }
        });
        clickpost.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if((jobtypes.getSelectedIndex()!=0)&&(post_name.getText()!=null))
                {
                    Job_posts.get(jobtypes.getItemAt(jobtypes.getSelectedIndex()).toString()).list_of_companies.put(comp.getText(),post_name.getText());
                    sql.jobs(jobtypes.getItemAt(jobtypes.getSelectedIndex()).toString(),P.get(name.getText()).getCompany_name(),post_name.getText(),name.getText(),phone_number.getText());
                    JOptionPane.showMessageDialog(message_box,"JOB POSTED SUCCESSFULLY");
                }
                else
                {
                    JOptionPane.showMessageDialog(message_box,"KINDLY ENTER CORRECT DETAILS! ");
                }
            }
        });
        clickjobs.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jobtypes.getSelectedIndex()!=0)
                {
                    //Job_posts.get(jobtypes.getItemAt(jobtypes.getSelectedIndex()).toString()).list_of_companies.put("XYZ","head");
                    //Job_posts.get(jobtypes.getItemAt(jobtypes.getSelectedIndex()).toString()).list_of_companies.put("microsoft","developer");
                    int n = Job_posts.get(jobtypes.getItemAt(jobtypes.getSelectedIndex()).toString()).list_of_companies.size();
                    Job_posts.get(jobtypes.getItemAt(jobtypes.getSelectedIndex()).toString()).getList_of_companies().forEach((key, value) -> model[0].addRow(new Object[]{key, value, Boolean.FALSE}));
                    JFrame jf = new JFrame();
                    table[0] = new JTable(model[0]);
                    jf.add(Apply);
                    JScrollPane sp = new JScrollPane(table[0]);
//                    sp.setBounds(100,100,500,500);
                    // sp.setSize(400,400);
                    //sp.setPreferredSize(new Dimension(500,500));
                    jf.add(sp);
                    jf.setSize(900, 900);
                    jf.getContentPane().setBackground(Color.WHITE);
//                    table[0] = new JTable(model[0]);
                    jf.setTitle("  AVAILABLE JOBS");
//                    jf.add(Apply);
//                    jf.add(table[0]);
                    jf.setSize(1200, 800);
                    jf.setResizable(false);
                    jf.setIconImage(image.getImage());
                    jf.setVisible(true);
                }
            }
        });
        Apply.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int cnt=0;
                for (int i = 0; i < Job_posts.get(jobtypes.getItemAt(jobtypes.getSelectedIndex()).toString()).list_of_companies.size(); i++)
                {
                    Boolean isChecked = Boolean.valueOf(table[0].getValueAt(i, 2).toString());
                    if (isChecked)
                    {
                        String posted_by = new String();
                        for(Map.Entry<String,Job_provider> entry : P.entrySet())
                        {
                            if(entry.getValue().getCompany_name().equals(table[0].getValueAt(i,0).toString())) {
                                posted_by = entry.getKey();
                                break;
                            }
                        }
                        //storing job list, post available,candidate who chose the job and company name who posted it
                        P.get(posted_by).AppliedCandidates.add(S.get(name.getText()));
                        String temp = new String();
                        for (Map.Entry<String,Job_provider> entry:P.entrySet())
                        {
                            if(entry.getValue().getCompany_name().equals(table[0].getValueAt(i,0).toString()))
                        {
                            temp = entry.getKey() ;
                        }

                        }
                        S.get(name.getText()).AppliedCompanies.put(temp,table[0].getValueAt(i,1).toString());
                        // storing provider name, job post and candidate name
                        sql.Job_Applicants(posted_by,table[0].getValueAt(i,1).toString(),name.getText(),S.get(name.getText()).getPhoneno());
                        cnt++;
                    }
                    else {
                        System.out.printf("Row %s is not checked \n", i);
                    }
                }
                if (cnt>= 1 )
                    JOptionPane. showMessageDialog ( message_box , "Applied successfully!\nYou will be contacted by the company if found eligible for the post.\nYour application will be passed to Job provider,\n                  All the best!") ;
            }
        });
        review.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
//                P.get(name.getText()).AppliedCandidates.add(S.get("digha"));
//                S.get("digha").AppliedCompanies.put(name.getText(),post_name.getText());
                for (CANDIDATE x: P.get(name.getText()).AppliedCandidates)
                {
                    model[1].addRow(new Object[]{x.getName(),x.AppliedCompanies.get(name.getText()),x.getEmail(),x.getSgpa()});
//                    P.get(name.getText()).AppliedCandidates.add(S.get(name));
//                    S.get(name).AppliedCompanies.put(name.getText(), post_name.getText());
                }
                JFrame applicants = new JFrame();
                applicants.setTitle("  RECIEVED APPLICATIONS");
                table[1] = new JTable(model[1]);
                table[1].setRowHeight(table[1].getRowHeight() + 20);
                table[1].setEnabled(false);
                table[1].setBounds(300,250, 632, 215);
                table[1].setSize(700,700);
                JScrollPane sp = new JScrollPane(table[1]);
                sp.setSize(400,400);
                applicants.add(sp);
                applicants.setSize(900,900);
                applicants.getContentPane().setBackground(Color.WHITE);
                applicants.setTitle("  RECEIVED APPLICATIONS");
//                table[1] = new JTable(model[1]);
//                applicants.add(table[1]);
                applicants.setSize(1200,800);
                applicants.setResizable(false);
                applicants.setIconImage(image.getImage());
                applicants.setVisible(true);
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(S.containsKey(name.getText()))
                {
                    if(S.get(name.getText()).AppliedCompanies.size()>=1)
                    {
                        ArrayList<String> from_AppliedCompanies_companyName = new ArrayList<>();
                        System.out.println(S.get(name.getText()).AppliedCompanies);
                        for (Map.Entry<String,String> entry : S.get(name.getText()).AppliedCompanies.entrySet())
                        {
                            System.out.println("äpplied companies loop");
                            System.out.println(entry.getKey());
                            from_AppliedCompanies_companyName.add(P.get(entry.getKey()).getCompany_name());
                        }
                        System.out.println(S.get(name.getText()).AppliedCompanies.size());
                        int i=0;
                        while(i!=S.get(name.getText()).AppliedCompanies.size()) {

                            for (Map.Entry<String, Job_provider> entry : P.entrySet()) {
                                if (entry.getValue().getCompany_name().equals(from_AppliedCompanies_companyName.get(i))) {
                                    System.out.println("About to delete");
                                    sql.delete_record(entry.getKey(),S.get(name.getText()).getPhoneno());
                                }
                            }
                            i++;
                        }
                    }
                }
                if(P.containsKey(name.getText())) {
                    sql.delete_table(name.getText());
                    sql.delete_record("JOBS",phone_number.getText());
                }
                sql.delete_record("REGISTRATION",phone_number.getText());
                sql.delete_record("Job_Seeker",phone_number.getText());
                //sql.delete_record("Job_Applicants",phone_number.getText());
                sql.delete_record("Job_Provider",phone_number.getText());

                JOptionPane. showMessageDialog ( message_box , "DELETED SUCCESSFULLY! ") ;

            }
        });

        JLabel Full_Name = new JLabel("Enter your Name: ");
        Full_Name.setBounds(300,200,200,40);
        Full_Name.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JLabel Pattern = new JLabel("Enter Password: ");
        Pattern.setBounds(300,275,200,40);
        Pattern.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JLabel Re_Pattern = new JLabel("Re-enter Password: ");
        Re_Pattern.setBounds(300,350,200,40);
        Re_Pattern.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JLabel Phnum = new JLabel("Mobile Number: ");
        Phnum.setBounds(300,425,200,40);
        Phnum.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JTextField register_name = new JTextField();
        JPasswordField register_password = new JPasswordField();
        JPasswordField register_password_reenter = new JPasswordField();
        JTextField register_phone = new JTextField();// fourth
        register_name.setBounds(500,200,200,40);// first
        register_password.setBounds(500,275,200,40);//second
        register_password_reenter.setBounds(500,350,200,40);//third
        register_phone.setBounds(500,425,200,40);//fourth
        JButton Job_provider = new JButton("JOB PROVIDER");
        JButton Job_Seeker = new JButton("JOB SEEKER");
        Job_Seeker.setBounds(500,500,200,40);
        Job_provider.setBounds(700,500,200,40);
        JLabel i_am = new JLabel("Select your Role: ");
        i_am.setBounds(300,500,200,40);
        i_am.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        signup.addActionListener(new ActionListener() {//if button pressed on login window is signup then
            @Override// a new frame -> registration will be created with various textfields and 2 buttons job provider,job seeker
            public void actionPerformed(ActionEvent e)
            {
                JFrame ask = new JFrame();
                ask.getContentPane().setBackground(Color.WHITE);
                ask.setIconImage(image.getImage());
                ask.setSize(1200,800);
                ask.setResizable(false);
                ask.add(Full_Name);
                ask.add(Pattern);
                ask.add(Re_Pattern);
                ask.add(Phnum);
                ask.add(Job_Seeker);
                ask.add(Job_provider);
                ask.add(register_name);
                ask.add(register_password);
                ask.add(register_password_reenter);
                ask.add(register_phone);
                ask.add(i_am);
                ask.setTitle("  REGISTRATION PAGE");
                ask.setLayout(null);
                ask.setVisible(true);
            }
        });
        JLabel Pro_Mail = new JLabel("Enter your Email: ");
        Pro_Mail.setBounds(300,280,220,40);
        Pro_Mail.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JLabel Comp_Name = new JLabel("Enter Company's Name: ");
        Comp_Name.setBounds(300,380,220,40);
        Comp_Name.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JTextField provider_email = new JTextField();//first
        JTextField provider_company = new JTextField();//second
        JButton provider_done = new JButton("DONE");
        provider_email.setBounds(520,280,200,40);
        provider_company.setBounds(520,380,200,40);
        provider_done.setBounds(550,500,100,40);
        Job_provider.addActionListener(new ActionListener() {// if from registration page job provider is chosen then firstly save the info on registration page into job provider object
            @Override
            public void actionPerformed(ActionEvent e)
            {
                P.put(register_name.getText(),new Job_provider());
                P.get(register_name.getText()).setName(register_name.getText());
                if(register_password.getText().equals(register_password_reenter.getText())) {
                    P.get(register_name.getText()).setPassword(register_password.getText());
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"The Password differs, kindly re-enter.");
                }
                if(check_phone(register_phone.getText())) {
                    P.get(register_name.getText()).setPhone(register_phone.getText());
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"The Mobile number is incorrect, Kindly re-enter.");
                }
                if((register_password.getText().equals(register_password_reenter.getText()))&&(check_phone(register_phone.getText())))
                {

                    JOptionPane.showMessageDialog(message_box,"----- Job Provider ---\nName: "+register_name.getText()+" has been saved");
                    sql.Register(register_name.getText(), register_password.getText(), register_phone.getText(),"job_provider");
                    JFrame get_provider_info = new JFrame();// firstly whole data for job provider is verified and saved and now frame for job provider's further info is created
                    get_provider_info.getContentPane().setBackground(Color.WHITE);
                    get_provider_info.setSize(1200,800);
                    get_provider_info.setResizable(false);
                    get_provider_info.setIconImage(image.getImage());
                    get_provider_info.add(Pro_Mail);
                    get_provider_info.add(Comp_Name);
                    get_provider_info.add(provider_company);
                    get_provider_info.add(provider_email);
                    get_provider_info.add(provider_done);
                    get_provider_info.setTitle("  JOB PROVIDER INFORMATION INPUT");
                    get_provider_info.setLayout(null);
                    //get_provider_info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    get_provider_info.setVisible(true);
                }
            }
        });
        provider_done.addActionListener(new ActionListener() {// now user will enter data into job provider's further info frame and presses done
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(P.get(register_name.getText()).check_email(provider_email.getText()))
                {
                    P.get(register_name.getText()).setCompany_name(provider_company.getText());
                    P.get(register_name.getText()).setEmail(provider_email.getText());
                    JOptionPane.showMessageDialog(message_box,"Job Provider "+register_name.getText()+"'s Details saved.\nRe-login and continue with your work.");
                    try {
                        sql.Job_Provider(register_name.getText(),provider_email.getText(),provider_company.getText(),P.get(register_name.getText()).getPhone());
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    // now all of your info is saved and program exits
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"Invalid Email address!");
                }
            }
        });
        JLabel DofB = new JLabel("Enter Date of Birth: ");
        DofB.setBounds(300,200,200,40);
        DofB.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JLabel JSmail = new JLabel("Enter your Mail: ");
        JSmail.setBounds(300,275,200,40);
        JSmail.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JLabel JSAdd = new JLabel("Enter your Address: ");
        JSAdd.setBounds(300,350,200,40);
        JSAdd.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JLabel grade = new JLabel("Enter your CGPA: ");
        grade.setBounds(300,425,200,40);
        grade.setFont(new Font("Sitka Heading",Font.TRUETYPE_FONT,18));
        JDateChooser chooser = new JDateChooser();//calendar : first
        chooser.setBounds(500,200,200,40);
        JTextField candidate_email = new JTextField();// first
        candidate_email.setBounds(500,275,200,40);
        JTextField candidate_address = new JTextField();//second
        candidate_address.setBounds(500,350,200,40);
        JTextField SGPA = new JTextField();
        SGPA.setBounds(500,425,200,40);
        JRadioButton Female =new JRadioButton("Female");
        Female.setActionCommand("Female");
        JRadioButton Male=new JRadioButton("Male");
        Male.setActionCommand("Male");
        JRadioButton Other=new JRadioButton("Other");
        Other.setActionCommand("Other");
        JRadioButton nomention = new JRadioButton("Won't mention");
        nomention.setActionCommand("Won't mention");
        JButton candidate_done = new JButton("Submit");
        candidate_done.setBounds(550,600,100,30);
        candidate_done.setBackground(Color.cyan);
        ButtonGroup group=new ButtonGroup();
        chooser.setLocale(Locale.US);
        group.add(Female);
        group.add(Male);
        group.add(Other);
        group.add(nomention);
        Female.setBounds(300,500,100,30);
        Male.setBounds(400,500,100,30);
        Other.setBounds(500,500,100,30);
        nomention.setBounds(600,500,140,30);
        Job_Seeker.addActionListener(new ActionListener() {// if on registration page among the buttons job seeker and job provider, if job seeker is pressed then we come to this code
            @Override
            public void actionPerformed(ActionEvent e)
            {
                S.put(register_name.getText(),new CANDIDATE());
                S.get(register_name.getText()).setName(register_name.getText());
                if(register_password.getText().equals(register_password_reenter.getText())) {
                    S.get(register_name.getText()).setPassword(register_password.getText());
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"The Password differs, kindly re-enter.");
                }
                if(check_phone(register_phone.getText())) {
                    S.get(register_name.getText()).setPhoneno(register_phone.getText());
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"The Mobile number is incorrect, kindly re-enter.");
                }
                if((register_password.getText().equals(register_password_reenter.getText()))&&(check_phone(register_phone.getText())))//if the entered data on registration page that is name , password and phone all are correct then we come here
                {
                    sql.Register(register_name.getText(), register_password.getText(), register_phone.getText(),"candidate");
                    JOptionPane.showMessageDialog(message_box,"----- Job Seeker ---\nName: "+register_name.getText()+" has been saved.");
                    JFrame get_candidate_info = new JFrame();// once data on your registration  page is saved , then a new window is created for further info of job seeker
                    get_candidate_info.getContentPane().setBackground(Color.WHITE);
                    get_candidate_info.setSize(1200,800);
                    get_candidate_info.setResizable(false);
                    get_candidate_info.setIconImage(image.getImage());
                    get_candidate_info.add(DofB);
                    get_candidate_info.add(JSmail);
                    get_candidate_info.add(JSAdd);
                    get_candidate_info.add(grade);
                    get_candidate_info.add(candidate_email);
                    get_candidate_info.add(chooser);
                    get_candidate_info.add(candidate_address);
                    get_candidate_info.add(Female);
                    get_candidate_info.add(Male);
                    get_candidate_info.add(Other);
                    get_candidate_info.add(nomention);
                    get_candidate_info.add(SGPA);
                    get_candidate_info.add(candidate_done);
                    get_candidate_info.setTitle("  CANDIDATE INFORMATION INPUT");
                    get_candidate_info.setLayout(null);
                    //get_candidate_info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    get_candidate_info.setVisible(true);
                }
            }
        });
        candidate_done.addActionListener(new ActionListener() {// Now we enter data into the further info of job seeker frame , once we click done thenthis code starts executing
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = chooser.getDate();
                String date_string = DateFormat.getDateInstance().format(date);
                if(date_string!=null) {
                    S.get(register_name.getText()).setDob(date_string);
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"Enter your Date of Birth!");
                }
                if(S.get(register_name.getText()).mailisvalid(candidate_email.getText())) {
                    S.get(register_name.getText()).setEmail(candidate_email.getText());
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"Enter a valid Email address!");
                }
                if(candidate_address.getText()!=null) {
                    S.get(register_name.getText()).setAddress(candidate_address.getText());
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"Enter your Address!");
                }
                if(group.getSelection().getActionCommand()!=null) {
                    S.get(register_name.getText()).setGender(group.getSelection().getActionCommand());
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"Select your Gender!");
                }
                if(SGPA.getText()!=null) {
                    S.get(register_name.getText()).setSgpa(Float.parseFloat(SGPA.getText()));
                }
                else {
                    JOptionPane.showMessageDialog(message_box,"Enter your CGPA!");
                }
                if((date_string!=null)&&(S.get(register_name.getText()).mailisvalid(candidate_email.getText()))&&(candidate_address.getText()!=null)&&(group.getSelection().getActionCommand()!=null)&&(SGPA.getText()!=null))
                // if entered data on the job seeker's further info frame is correct then we will come here
                {
                    JOptionPane.showMessageDialog(message_box,"Candidate Name: "+register_name.getText()+"\n has been added.\nKindly re-login to continue with your work.");
                    try {
                        sql.Job_Seeker(register_name.getText(),date_string,candidate_email.getText(),candidate_address.getText(),group.getSelection().getActionCommand(),SGPA.getText(),register_phone.getText());
                    }
                    catch (SQLException throwables)
                    {
                        throwables.printStackTrace();
                    }
                }
            }
        });
//        //System.out.println("CONTACT DETAILS: ");
//        //JTextField provider_email = new JTextField();// first
////        JPasswordField provider_password = new JPasswordField();//second
////        JPasswordField provider_password_reenter = new JPasswordField();//third
////        JTextField provider_phone = new JTextField();// fourth
//        //JTextField provider_company = new JTextField();//fifth
//        //JTextField provider_name = new JTextField();
//        //provider_name.setBounds(100,130,100,30);
////        provider_email.setBounds(100,200,100,30);
////        provider_password.setBounds(100,270,100,30);
////        provider_phone.setBounds(100,410,100,30);
////        provider_company.setBounds(100,480,100,30);
//        //provider_password_reenter.setBounds(100,340,100,30);
//        JButton provider_next = new JButton("NEXT");
//        provider_next.setBackground(Color.cyan);
//        provider_next.setBounds(510,100,200,50);
//        provider_next.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//
//                P.put(register_name.getText(),new job_provider());
//                if(P.get(register_name.getText()).check_email(provider_email.getText()))
//                {
//                    P.get(register_name.getText()).setEmail(provider_email.getText());
//                }
////                if(provider_password.getText().equals(provider_password_reenter.getText()))
////                {
////                    P.get(provider_anme).setPassword(provider_password.getText());
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"The password Entered differs,kindly re-enter your password");
////                }
////                if(provider_phone.getText().length()==10)
////                {
////                    P.get(provider_anme).setPhone(provider_phone.getText());
////                }
////                else
////                {
////                    JOptionPane.showMessageDialog(message_box,"The entered number is incorrect, Kindly please enter a correct number");
////                }
////                P.get(provider_anme).setCompany_name(provider_company.getText());
////                if((P.get(provider_anme).check_email(provider_email.getText()))&&(provider_password.getText().equals(provider_password_reenter.getText()))&&(provider_phone.getText().length()==10))
////                    JOptionPane.showMessageDialog(message_box,"Job server with\nName : "+provider_anme+"\nfrom Company "+P.get(provider_anme).getCompany_name()+" has been added");
////
//             }
//        });
////        JFrame provider_details = new JFrame();
////
////       // provider_details.add(provider_phone);
////        provider_details.add(provider_company);
////        provider_details.add(provider_email);
////        //provider_details.add(provider_password);
////        //provider_details.add(provider_password_reenter);
////        provider_details.add(provider_next);
////       // provider_details.add(provider_name);
////        provider_details.setTitle("Provider Details");
////        provider_details.setVisible(true);
////        provider_details.setBounds(10,10,800,600);
////        provider_details.setLayout(null);
        lf.setSize(1200,800);
        lf.setResizable(false);
        lf.setIconImage(image.getImage());
        lf.add(heading);
        lf.add(heading1);
        lf.add(mail);
        lf.add(Password);
        lf.add(new_to_this);
        lf.add(signup);
        lf.add(e_mail);
        lf.add(password);
        lf.add(log_in);
        lf.add(login_provider);
        lf.add(login_seeker);
        lf.setTitle("  LOGIN PAGE");
        lf.setLayout(null);
        lf.setVisible(true);
    }
    public static boolean valid_mail(String login)
    {
        String Mail_regex = "[A-Z1-9a-z].+@[A-Z1-9a-z].+";
        Pattern p = Pattern.compile(Mail_regex);
        if (login == null)
            return false;
        return (p.matcher(login).matches());
    }
    public static boolean password_valid(String Password)
    {
        int length = String.valueOf(Password).length();
        for ( int i=0; i<=length ; i++ ) {
            char c = Password.charAt(i);
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9'))// Checks if it is a lower case letter //Checks if it is an upper case letter//Checks to see if it is a digit)
                return true;
        }
        return false;
    }
    public static boolean check_phone(String s)
    {
        String numregex = "[0-9]{10}";
        Pattern pat = Pattern.compile(numregex);
        if (s == null)
            return false;
        return (pat.matches(numregex,s));
    }
}