package MINI_PROJECT;

import java.util.*;

public class Jobs
{
    private String name = new String();
    Map<String,String> list_of_companies = new HashMap<String,String>();

    public void setName(String name) {
        this.name = name;
    } // input of name

    public String getName() {
        return name;
    } // storing the name

    public Map getList_of_companies() {
        return list_of_companies;
    }
}
