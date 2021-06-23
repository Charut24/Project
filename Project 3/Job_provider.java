package MINI_PROJECT;

import javax.swing.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Job_provider
{
    private String email=new String();
    private String password = new String();
    private String phone = new String();
    private String company_name = new String();
    private String name=new String();
    public ArrayList<CANDIDATE> AppliedCandidates = new ArrayList<>() ;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public String getCompany_name() {
        return company_name;
    }
    public boolean check_email(String s)
    {
        String mailregex = "[a-z0-9A-Z]+"+"@"+"[a-z]+"+".com";
        Pattern pat = Pattern.compile(mailregex);
        if (s == null)
            return false;
        return (pat.matches(mailregex,s));
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }


}
