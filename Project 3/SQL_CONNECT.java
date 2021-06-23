//////package MINI_PROJECT;
//////import javax.swing.*;
//////import java.sql.*;
//////import java.util.ArrayList;
//////
//////public class SQL_CONNECT {
//////    static final String URL = "jdbc:mysql://localhost/RECRUITMENT";
//////    static final String USER = "Charut24";
//////    static  final String PASS = "91169";
//////
//////    ArrayList<String> job_provider = new ArrayList<>();
//////    ArrayList<String> CANDIDATE = new ArrayList<>();
//////
//////    /*Map<String,job_provider> P = new HashMap<String,job_provider>();
//////        Map<String,CANDIDATE> S = new HashMap<String,CANDIDATE>();*/
//////
//////    //public static void main(String[] agrs)
////////    SQL_CONNECT()
////////    {
////////        try(Connection con = DriverManager.getConnection(URL,USER,PASS))
////////        {
////////            Statement stmt = con.createStatement();
////////
////////            //System.out.println("Success");
////////
////////            if (con == null)
////////            {
////////                String SQL = "CREATE TABLE LOGIN (ID INTEGER not NULL AUTO_INCREMENT," + " EMAIL VARCHAR (255), "+" PRIMARY KEY ( ID)"+" NAME VARCHAR (255)"+"ADDRESS VARCHAR (255)"+"DATE_OF_BIRTH CHAR (255)"+"PHONE_NUMBER CHAR (11)";
////////                stmt.executeUpdate(SQL);
////////                SQL = "INSERT INTO LOGIN (EMAIL,NAME,ADDRESS,DATE_OF_BIRTH,PHONE_NUMBER)" +
////////                        "VALUES()";
////////                stmt.executeUpdate(SQL);
////////
////////            }
////////
////////        }
////////
////////        catch (SQLException throwables) {
////////            throwables.printStackTrace();
////////        }
////////
////////    }
//////
//////    public void Register(String name, String Pass, String Phone)
//////    {
//////        try(Connection conn =DriverManager.getConnection(URL,USER,PASS);
//////        Statement stmt = conn.createStatement()) {
//////
//////            if (!tableExists("REGISTRATION")) {
//////                System.out.println("Holas in table creation");
//////                   String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER CHAR (11),"+"PRIMARY KEY ( ID))";
//////                   stmt.executeUpdate(sql);
//////                   stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
//////            }
//////            else
//////            {
//////                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
//////            }
//////
//////        }catch(SQLException e)
//////        {
//////            e.printStackTrace();
//////        }
//////    }
//////
//////    public void Job_Seeker(String name, String DOB, String email, String address, String gender ,String cgpa) throws SQLException {
//////        try(Connection con = DriverManager.getConnection(URL,USER,PASS);
//////            Statement st = con.createStatement())
//////        {
//////            Class.forName ("com.mysql.jdbc.Driver");
//////            if (!tableExists("Job_Seeker"))
//////            {
//////                String sql1 = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
//////                st.executeUpdate(sql1);
//////                st.executeUpdate("INSERT INTO Job_Seeker (name,DOB,email,address,gender,cgpa) VALUES (?,?,?,?,?,?)");
//////            }
//////            else
//////            {
//////                st.executeUpdate("INSERT INTO Job_Seeker (name,DOB,email,address,gender,cgpa) VALUES (?,?,?,?,?,?)");
//////            }
//////        }
//////        catch (SQLException |ClassNotFoundException e) {
//////            e.printStackTrace();
//////        }
//////    }
//////
//////    public void Job_Provider(String name, String provider_mail, String Company_name) throws SQLException {
//////        try(Connection connect = DriverManager.getConnection(URL,USER,PASS);
//////        Statement state = connect.createStatement())
//////        {
//////            Class.forName("com.mysql.jdbc.Driver");
//////            if (!tableExists("Job_Provider"))
//////            {
//////                String sql2 = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
//////                state.executeUpdate(sql2);
//////                state.executeUpdate("INSERT INTO Job_Provider (name,provider_mail,Company_name) VALUES (?,?,?)");
//////            }
//////            else
//////            {
//////                state.executeUpdate("INSERT INTO Job_Provider (name,provider_mail,Company_name) VALUES (?,?,?)");
//////            }
//////
//////        }
//////        catch (SQLException |ClassNotFoundException e) {
//////            e.printStackTrace();
//////        }
//////    }
//////
//////    boolean tableExists(String table_name)throws SQLException
//////    {
//////
//////        try(Connection conn = DriverManager.getConnection(URL,USER,PASS);
//////            ResultSet res = conn.getMetaData().getTables(null, null, table_name,new String[] {"TABLE"})) {
//////            return res.next();
//////        }
//////
//////    }
//////}
////package MINI_PROJECT;
////import java.sql.*;
////import java.util.ArrayList;
////import java.util.HashMap;
////import java.util.Map;
////
////public class SQL_CONNECT {
////    static final String URL = "jdbc:mysql://localhost/DEMO";
////    static final String USER = "Charut24";
////    static  final String PASS = "91169";
////
////    ArrayList<String> Register = new ArrayList<>();
////    ArrayList<String> job_provider = new ArrayList<>();
////    ArrayList<String> candidate = new ArrayList<>();
////
////
////    Map<String,Job_provider> old_jp = new HashMap<String,Job_provider>();
////    Map<String,CANDIDATE> old_c = new HashMap<String,CANDIDATE>();
////    //public static void main(String[] agrs)
////    SQL_CONNECT()
////    {
////        try(Connection con = DriverManager.getConnection(URL,USER,PASS))
////        {
////            Statement stmt = con.createStatement();
////            //System.out.println("Success");
////            if (!tableExists("Registration"))
////            {
////                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER CHAR (11),"+"PRIMARY KEY ( ID))";
////                stmt.executeUpdate(sql);
////            }
////            else
////            {
////                String sql = "SELECT * FROM REGISTRATION";
////                ResultSet res = stmt.executeQuery(sql);
////
////                int i=0;
////                while(res.next())
////                {
//////                    Register.add(res.getString("NAME"));
//////                    Register.add(res.getString("PASSWORD"));
//////                    Register.add(res.getString("PHONE_NUMBER"));
////                    old_jp.put(res.getString("NAME"),new Job_provider());
////                    old_jp.get(res.getString("NAME")).setName(res.getString("Name"));
////                    old_jp.get(res.getString("NAME")).setPassword(res.getString("PASSWORD"));
////                    old_jp.get(res.getString("NAME")).setPhone(res.getString("PHONE_NUMBER"));
////                    i++;
////                }
////                res.close();
////            }
////            if (!tableExists("Job_Seeker"))
////            {
////                String sql = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
////                stmt.executeUpdate(sql);
////            }
////            else
////            {
////                String sql = "SELECT * FROM Job_Seeker";
////                ResultSet res = stmt.executeQuery(sql);
////
////                int i=0;
////                while (res.next())
////                {
//////                    candidate.add(res.getString("NAME"));
//////                    candidate.add(res.getString("DATE_OF_BIRTH"));
//////                    candidate.add(res.getString("EMAIL"));
//////                    candidate.add(res.getString("ADDRESS"));
//////                    candidate.add(res.getString("GENDER"));
//////                    candidate.add(res.getString("CGPA"));
////                    old_c.get(res.getString("NAME")).setDob(res.getString("DATE_OF_BIRTH"));
////                    old_c.get(res.getString("NAME")).setEmail(res.getString("EMAIL"));
////                    old_c.get(res.getString("NAME")).setAddress(res.getString("ADDRESS"));
////                    old_c.get(res.getString("NAME")).setGender(res.getString("GENDER"));
////                    old_c.get(res.getString("NAME")).setSgpa(Float.parseFloat(res.getString("CGPA")));
////
////                    i++;
////                }
////                res.close();
////            }
////            if (!tableExists("Job_Provider"))
////            {
////                String sql = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
////                stmt.executeUpdate(sql);
////            }
////            else
////            {
////                String sql = "SELECT * FROM Job_Provider";
////                ResultSet res = stmt.executeQuery(sql);
////
////                int i=0;
////                while (res.next())
////                {
//////                    job_provider.add(res.getString("NAME"));
//////                    job_provider.add(res.getString("EMAIL"));
//////                    job_provider.add(res.getString("COMPANY_NAME"));
////                    old_jp.get(res.getString("NAME")).setEmail(res.getString("EMAIL"));
////                    old_jp.get(res.getString("NAME")).setCompany_name(res.getString("COMPANY_NAME"));
////                    i++;
////                }
////                res.close();
////            }
////            stmt.close();
////        }
////        catch (SQLException throwables) {
////            throwables.printStackTrace();
////        }
////
////    }
////
////    public void Register(String name, String Pass, String Phone, String Type)
////    {
////        try(Connection conn =DriverManager.getConnection(URL,USER,PASS);
////            Statement stmt = conn.createStatement()) {
////            System.out.println(conn);
////            if (!tableExists("REGISTRATION")) {
////
////                System.out.println("Holas in table creation");
////                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER CHAR (11),"+"TYPE VARCHAR (255)"+"PRIMARY KEY ( ID))";
////                stmt.executeUpdate(sql);
////                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"'+'"+Type+"')");
////            }
////            else
////            {
////                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"'+'"+Type+"')");
////            }
////
////        }catch(SQLException e)
////        {
////            e.printStackTrace();
////        }
////    }
////
////    public void Job_Seeker(String name, String DOB, String email, String address, String gender ,String cgpa) throws SQLException {
////        try(Connection con = DriverManager.getConnection(URL,USER,PASS);
////            Statement st = con.createStatement())
////        {
////            Class.forName ("com.mysql.jdbc.Driver");
////            String In = "INSERT INTO Job_Seeker (NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA) VALUES('"+name+"','"+DOB+"','"+email+"','"+address+"','"+gender+"','"+cgpa+"')";
////            if (!tableExists("Job_Seeker"))
////            {
////                String sql1 = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (300),"+"ADDRESS VARCHAR (350),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
////                st.executeUpdate(sql1);
////                st.executeUpdate(In);
////            }
////            else
////                st.executeUpdate(In);
////        }
////        catch (SQLException |ClassNotFoundException e) {
////            e.printStackTrace();
////        }
////    }
////
////    public void Job_Provider(String name, String provider_mail, String Company_name) throws SQLException {
////        try(Connection connect = DriverManager.getConnection(URL,USER,PASS);
////            Statement state = connect.createStatement())
////        {
////            Class.forName("com.mysql.jdbc.Driver");
////            if (!tableExists("Job_Provider"))
////            {
////                String sql2 = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
////                state.executeUpdate(sql2);
////                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"')");
////            }
////            else
////            {
////                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"')");
////            }
////
////        }
////        catch (SQLException |ClassNotFoundException e) {
////            e.printStackTrace();
////        }
////    }
//////
////
////    public void Record_Delete(String Table_name, String Record) {
////        try (Connection con = DriverManager.getConnection(URL, USER, PASS)){
////            Statement stmt = con.createStatement();
////
////            String sql = "DELETE FROM "+Table_name+" WHERE NAME = '"+Record+"'";
////            stmt.executeUpdate(sql);
////
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////    }
////
//////    public void Update_Info(String Table_name, String Record)
//////    {
//////        try(Connection con = DriverManager.getConnection(URL,USER,PASS))
//////        {
//////            Statement stmt = con.createStatement();
//////            // search for record
//////            String sql = "SELECT "+Record+" FROM "+Table_name;
//////            ResultSet res = stmt.executeQuery(sql);
//////            // found
//////            if (Table_name.matches("Job_Seeker"))
//////            {
//////      //          old_c.get(res.getString("NAME")).
//////            }
//////            //UPDATE Customers
//////            //SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
//////            //WHERE CustomerID = 1;
//////
//////        }
//////        catch (SQLException e) {
//////            e.printStackTrace();
//////        }
//////    }
////
////    public void Load_Data(String Table_name) throws SQLException {
////
////        PreparedStatement p = null;
////        Connection con = DriverManager.getConnection(URL, USER, PASS);
////        try (Statement st = con.createStatement()) {
////            // Try bock to catch exception/s
////            // SQL command data stored in String datatype
////            String sql = "SELECT /* FROM " + Table_name;
////            p = con.prepareStatement(sql);
////            ResultSet res;
////            res = p.executeQuery();
////
////            // Printing ID, name, email of customers
////            // of the SQL command above
////
////            // Condiion check
////            while (res.next())
////            {
////                if (Table_name.equals("REGISTRATION"))
////                {
////                    String name = res.getString("NAME");
////                    String password = res.getString("PASSWORD");
////                    String phone = res.getString("PHONE_NUMBER");
////                }
////                if (Table_name.matches("Job_Seeker")) //NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA
////                {
////                    String name = res.getString("NAME");
////                    String dob = res.getString("DATE_OF_BIRTH");
////                    String email = res.getString("EMAIL");
////                    String address= res.getString("ADDRESS");
////                    String gen = res.getString("GENDER");
////                    String gpa = res.getString("CGPA");
////                }
////                if (Table_name.matches("Job_Provider")) //NAME,EMAIL,COMPANY_NAME
////                {
////                    String name = res.getString("NAME");
////                    String p_mail = res.getString("EMAIL");
////                    String com_name = res.getString("COMPANY_NAME");
////                }
////
////            }
////        }
////    }
////
//////    public void Job()
//////    {
//////
//////    }
////
////    boolean tableExists(String table_name)throws SQLException
////    {
////
////        try(Connection conn = DriverManager.getConnection(URL,USER,PASS);
////            ResultSet res = conn.getMetaData().getTables(null, null, table_name,new String[] {"TABLE"})) {
////            return res.next();
////        }
////
////    }
////}
//////package MINI_PROJECT;
//////import javax.swing.*;
//////import java.sql.*;
//////import java.util.ArrayList;
//////
//////public class SQL_CONNECT {
//////    static final String URL = "jdbc:mysql://localhost/DEMO";
//////    static final String USER = "Student123";
//////    static  final String PASS = "4483";
//////
//////    ArrayList<String> job_provider = new ArrayList<>();
//////    ArrayList<String> CANDIDATE = new ArrayList<>();
//////
//////    /*Map<String,job_provider> P = new HashMap<String,job_provider>();
//////        Map<String,CANDIDATE> S = new HashMap<String,CANDIDATE>();*/
//////
//////    //public static void main(String[] agrs)
////////    SQL_CONNECT()
////////    {
////////        try(Connection con = DriverManager.getConnection(URL,USER,PASS))
////////        {
////////            Statement stmt = con.createStatement();
////////
////////            //System.out.println("Success");
////////
////////            if (con == null)
////////            {
////////                String SQL = "CREATE TABLE LOGIN (ID INTEGER not NULL AUTO_INCREMENT," + " EMAIL VARCHAR (255), "+" PRIMARY KEY ( ID)"+" NAME VARCHAR (255)"+"ADDRESS VARCHAR (255)"+"DATE_OF_BIRTH CHAR (255)"+"PHONE_NUMBER CHAR (11)";
////////                stmt.executeUpdate(SQL);
////////                SQL = "INSERT INTO LOGIN (EMAIL,NAME,ADDRESS,DATE_OF_BIRTH,PHONE_NUMBER)" +
////////                        "VALUES()";
////////                stmt.executeUpdate(SQL);
////////
////////            }
////////
////////        }
////////
////////        catch (SQLException throwables) {
////////            throwables.printStackTrace();
////////        }
////////
////////    }
//////
//////    public void Register(String name, String Pass, String Phone)
//////    {
//////        try(Connection conn =DriverManager.getConnection(URL,USER,PASS);
//////            Statement stmt = conn.createStatement()) {
//////
//////            if (!tableExists("REGISTRATION")) {
//////                System.out.println("Holas in table creation");
//////                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER CHAR (11),"+"PRIMARY KEY ( ID))";
//////                stmt.executeUpdate(sql);
//////                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
//////            }
//////            else
//////            {
//////                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
//////            }
//////
//////        }catch(SQLException e)
//////        {
//////            e.printStackTrace();
//////        }
//////    }
//////
//////    public void Job_Seeker(String name, String DOB, String email, String address, String gender ,String cgpa) throws SQLException {
//////        try(Connection con = DriverManager.getConnection(URL,USER,PASS);
//////            Statement st = con.createStatement())
//////        {
//////            Class.forName ("com.mysql.jdbc.Driver");
//////            if (!tableExists("Job_Seeker"))
//////            {
//////                String sql1 = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
//////                st.executeUpdate(sql1);
//////                st.executeUpdate("INSERT INTO Job_Seeker (name,DOB,email,address,gender,cgpa) VALUES (?,?,?,?,?,?)");
//////            }
//////            else
//////            {
//////                st.executeUpdate("INSERT INTO Job_Seeker (name,DOB,email,address,gender,cgpa) VALUES (?,?,?,?,?,?)");
//////            }
//////        }
//////        catch (SQLException |ClassNotFoundException e) {
//////            e.printStackTrace();
//////        }
//////    }
//////
//////    public void Job_Provider(String name, String provider_mail, String Company_name) throws SQLException {
//////        try(Connection connect = DriverManager.getConnection(URL,USER,PASS);
//////            Statement state = connect.createStatement())
//////        {
//////            Class.forName("com.mysql.jdbc.Driver");
//////            if (!tableExists("Job_Provider"))
//////            {
//////                String sql2 = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
//////                state.executeUpdate(sql2);
//////                state.executeUpdate("INSERT INTO Job_Provider (name,provider_mail,Company_name) VALUES (?,?,?)");
//////            }
//////            else
//////            {
//////                state.executeUpdate("INSERT INTO Job_Provider (name,provider_mail,Company_name) VALUES (?,?,?)");
//////            }
//////
//////        }
//////        catch (SQLException |ClassNotFoundException e) {
//////            e.printStackTrace();
//////        }
//////    }
//////
//////    boolean tableExists(String table_name)throws SQLException
//////    {
//////
//////        try(Connection conn = DriverManager.getConnection(URL,USER,PASS);
//////            ResultSet res = conn.getMetaData().getTables(null, null, table_name,new String[] {"TABLE"})) {
//////            return res.next();
//////        }
//////
//////    }
//////}
////package MINI_PROJECT;
////import java.sql.*;
////import java.util.ArrayList;
////
////public class SQL_CONNECT<con> {
////    static final String URL = "jdbc:mysql://localhost/DEMO";
////    static final String USER = "Student123";
////    static  final String PASS = "4483";
////
////    ArrayList<String> Register = new ArrayList<>();
////    ArrayList<String> job_provider = new ArrayList<>();
////    ArrayList<String> candidate = new ArrayList<>();
////
////    /*Map<String,job_provider> P = new HashMap<String,job_provider>();
////        Map<String,CANDIDATE> S = new HashMap<String,CANDIDATE>();*/
////
////    //public static void main(String[] agrs)
////    SQL_CONNECT()
////    {
////        try(Connection con = DriverManager.getConnection(URL,USER,PASS))
////        {
////            Statement stmt = con.createStatement();
////            //System.out.println("Success");
////            if (!tableExists("Registration"))
////            {
////                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER CHAR (11),"+"PRIMARY KEY ( ID))";
////                stmt.executeUpdate(sql);
////            }
////            else
////            {
////                String sql = "SELECT * FROM REGISTRATION";
////                ResultSet res = stmt.executeQuery(sql);
////
////                while(res.next())
////                {
////                    Register.add(res.getString("NAME,PASSWORD,PHONE_NUMBER"));
////                }
////                res.close();
////            }
////            if (!tableExists("Job_Seeker"))
////            {
////                String sql = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
////                stmt.executeUpdate(sql);
////            }
////            else
////            {
////                String sql = "SELECT * FROM Job_Seeker";
////                ResultSet res = stmt.executeQuery(sql);
////
////                while (res.next())
////                {
////                    candidate.add(res.getString("NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA"));
////                }
////                res.close();
////            }
////            if (!tableExists("Job_Provider"))
////            {
////                String sql = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
////                stmt.executeUpdate(sql);
////            }
////            else
////            {
////                String sql = "SELECT * FROM Job_Provider";
////                ResultSet res = stmt.executeQuery(sql);
////
////                while (res.next())
////                {
////                    job_provider.add(res.getString("NAME,EMAIL,COMPANY_NAME"));
////                }
////                res.close();
////            }
////            stmt.close();
////        }
////        catch (SQLException throwables) {
////            throwables.printStackTrace();
////        }
////
////    }
////
////    public void Register(String name, String Pass, String Phone)
////    {
////        try(Connection conn =DriverManager.getConnection(URL,USER,PASS);
////            Statement stmt = conn.createStatement()) {
////            System.out.println(conn);
////            if (!tableExists("REGISTRATION")) {
////
////                System.out.println("Holas in table creation");
////                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER CHAR (11),"+"PRIMARY KEY ( ID))";
////                stmt.executeUpdate(sql);
////                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
////            }
////            else
////            {
////                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
////            }
////
////        }catch(SQLException e)
////        {
////            e.printStackTrace();
////        }
////    }
////
////    public void Job_Seeker(String name, String DOB, String email, String address, String gender ,String cgpa) throws SQLException {
////        try(Connection con = DriverManager.getConnection(URL,USER,PASS);
////            Statement st = con.createStatement())
////        {
////            Class.forName ("com.mysql.jdbc.Driver");
////            if (!tableExists("Job_Seeker"))
////            {
////                String sql1 = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (300),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
////                st.executeUpdate(sql1);
////                st.executeUpdate("INSERT INTO Job_Seeker (NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA) VALUES ('"+name+"','"+DOB+"'','"+email+"','"+address+"','"+gender+"','"+cgpa+"')");
////            }
////            else
////            {
////                st.executeUpdate("INSERT INTO Job_Seeker (NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA) VALUES ('"+name+"','"+DOB+"'','"+email+"','"+address+"','"+gender+"','"+cgpa+"')");
////            }
////        }
////        catch (SQLException |ClassNotFoundException e) {
////            e.printStackTrace();
////        }
////    }
////
////    public void Job_Provider(String name, String provider_mail, String Company_name) throws SQLException {
////        try(Connection connect = DriverManager.getConnection(URL,USER,PASS);
////            Statement state = connect.createStatement())
////        {
////            Class.forName("com.mysql.jdbc.Driver");
////            if (!tableExists("Job_Provider"))
////            {
////                String sql2 = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
////                state.executeUpdate(sql2);
////                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"')");
////            }
////            else
////            {
////                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"')");
////            }
////
////        }
////        catch (SQLException |ClassNotFoundException e) {
////            e.printStackTrace();
////        }
////    }
////
////    public void Load_Data(String Table_name) throws SQLException {
////
////        PreparedStatement p = null;
////        Connection con = DriverManager.getConnection(URL, USER, PASS);
////        try (Statement st = con.createStatement()) {
////            // Try bock to catch exception/s
////            // SQL command data stored in String datatype
////            String sql = "SELECT /* FROM " + Table_name;
////            p = con.prepareStatement(sql);
////            ResultSet res;
////            res = p.executeQuery();
////
////            // Printing ID, name, email of customers
////            // of the SQL command above
////
////
////            // Condiion check
////            while (res.next())
////            {
////                if (Table_name.equals("REGISTRATION"))
////                {
////                    String name = res.getString("NAME");
////                    String password = res.getString("PASSWORD");
////                    String phone = res.getString("PHONE_NUMBER");
////                }
////                if (Table_name.matches("Job_Seeker")) //NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA
////                {
////                    String name = res.getString("NAME");
////                    String dob = res.getString("DATE_OF_BIRTH");
////                    String email = res.getString("EMAIL");
////                    String address= res.getString("ADDRESS");
////                    String gen = res.getString("GENDER");
////                    String gpa = res.getString("CGPA");
////                }
////                if (Table_name.matches("Job_Provider")) //NAME,EMAIL,COMPANY_NAME
////                {
////                    String name = res.getString("NAME");
////                    String p_mail = res.getString("EMAIL");
////                    String com_name = res.getString("COMPANY_NAME");
////                }
////
////            }
////        }
////    }
////
////    boolean tableExists(String table_name)throws SQLException
////    {
////
////        try(Connection conn = DriverManager.getConnection(URL,USER,PASS);
////            ResultSet res = conn.getMetaData().getTables(null, null, table_name,new String[] {"TABLE"})) {
////            return res.next();
////        }
////
////    }
////}
//package MINI_PROJECT;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//public class SQL_CONNECT{
//    static final String URL = "jdbc:mysql://localhost/DEMO";
//    static final String USER = "Charut24";
//    static  final String PASS = "91169";
//
//    ArrayList<String> Register = new ArrayList<>();
//    ArrayList<String> job_provider = new ArrayList<>();
//    ArrayList<String> candidate = new ArrayList<>();
//
//
//    Map<String,Job_provider> old_jp = new HashMap<String,Job_provider>();
//    Map<String,CANDIDATE> old_c = new HashMap<String,CANDIDATE>();
//
//    //public static void main(String[] agrs)
//    SQL_CONNECT()
//    {
//        try(Connection con = DriverManager.getConnection(URL,USER,PASS))
//        {
//            Statement stmt = con.createStatement();
//            //System.out.println("Success");
//            if (!tableExists("Registration"))
//            {
//                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER VARCHAR (11),"+"TYPE VARCHAR(255),"+"PRIMARY KEY ( ID))";
//                stmt.executeUpdate(sql);
//            }
//            else
//            {
//                String sql = "SELECT * FROM REGISTRATION";
//                ResultSet res = stmt.executeQuery(sql);
//
//                int i=0;
//                while(res.next())
//                {
////                    Register.add(res.getString("NAME"));
////                    Register.add(res.getString("PASSWORD"));
////                    Register.add(res.getString("PHONE_NUMBER"));
//                    String s =new String();
//                    if(res.getString("TYPE")=="job_provider")
//                    {
//                        s = res.getString("NAME");
//                        old_jp.put(s, new Job_provider());
//                        old_jp.get(s).setName(s);
//                        old_jp.get(s).setPassword(res.getString("PASSWORD"));
//                        old_jp.get(s).setPhone(res.getString("PHONE_NUMBER"));
//                    }
//                    else
//                    {
//                        s = res.getString("NAME");
//                        old_c.put(s,new CANDIDATE());
//                        old_c.get(s).setName(s);
//                        old_c.get(s).setPassword(res.getString("PASSWORD"));
//                        old_c.get(s).setPhoneno(res.getString("PHONE_NUMBER"));
//                    }
//                    i++;
//                }
//                res.close();
//            }
//            if (!tableExists("Job_Seeker"))
//            {
//                String sql = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
//                stmt.executeUpdate(sql);
//            }
//            else
//            {
//                String sql = "SELECT * FROM Job_Seeker";
//                ResultSet res = stmt.executeQuery(sql);
//
//                int i=0;
//                while (res.next())
//                {
//                    String s = new String();
////                    candidate.add(res.getString("NAME"));
////                    candidate.add(res.getString("DATE_OF_BIRTH"));
////                    candidate.add(res.getString("EMAIL"));
////                    candidate.add(res.getString("ADDRESS"));
////                    candidate.add(res.getString("GENDER"));
////                    candidate.add(res.getString("CGPA"));
//                    s = res.getString("NAME");
//                    old_c.get(s).setDob(res.getString("DATE_OF_BIRTH"));
//                    old_c.get(s).setEmail(res.getString("EMAIL"));
//                    old_c.get(s).setAddress(res.getString("ADDRESS"));
//                    old_c.get(s).setGender(res.getString("GENDER"));
//                    old_c.get(s).setSgpa(Float.parseFloat(res.getString("CGPA")));
//                    i++;
//                }
//                res.close();
//            }
//            if (!tableExists("Job_Provider"))
//            {
//                String sql = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
//                stmt.executeUpdate(sql);
//            }
//            else
//            {
//                String sql = "SELECT * FROM Job_Provider";
//                ResultSet res = stmt.executeQuery(sql);
//
//                int i=0;
//                while (res.next())
//                {
//                    String s = new String();
////                    job_provider.add(res.getString("NAME"));
////                    job_provider.add(res.getString("EMAIL"));
////                    job_provider.add(res.getString("COMPANY_NAME"));
//                    s = res.getString("NAME");
//                    old_jp.get(s).setEmail(res.getString("EMAIL"));
//                    old_jp.get(s).setCompany_name(res.getString("COMPANY_NAME"));
//                    i++;
//                }
//                res.close();
//            }
//            stmt.close();
//        }
//        catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//    }
//    public Map getold_jp()
//    {
//        return old_jp;
//    }
//    public Map getold_c()
//    {
//        return old_c;
//    }
//    public void Register(String name, String Pass, String Phone, String type)
//    {
//        try(Connection conn =DriverManager.getConnection(URL,USER,PASS);
//            Statement stmt = conn.createStatement()) {
//            System.out.println(conn);
//            if (!tableExists("REGISTRATION")) {
//
//                System.out.println("Holas in table creation");
//                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER VARCHAR (11),"+"TYPE VARCHAR(255),"+"PRIMARY KEY ( ID))";
//                stmt.executeUpdate(sql);
//                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER,TYPE) VALUES('"+name+"','"+Pass+"','"+Phone+"','"+type+"')");
//            }
//            else
//            {
//                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER,TYPE) VALUES('"+name+"','"+Pass+"','"+Phone+"','"+type+"')");
//            }
//
//        }catch(SQLException e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//    public void Job_Seeker(String name, String DOB, String email, String address, String gender ,String cgpa) throws SQLException {
//        try(Connection con = DriverManager.getConnection(URL,USER,PASS);
//            Statement st = con.createStatement())
//        {
//
//            //Class.forName ("com.mysql.jdbc.Driver");
//            String sql = "INSERT INTO Job_Seeker (NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA) VALUES ('"+name+"','"+DOB+"','"+email+"','"+address+"','"+gender+"','"+cgpa+"')";
//            if (!tableExists("Job_Seeker"))
//            {
//                String sql1 = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
//                st.executeUpdate(sql1);
//                st.executeUpdate(sql);
//            }
//            else
//            {
//                st.executeUpdate(sql);
//            }
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void Job_Provider(String name, String provider_mail, String Company_name) throws SQLException {
//        try(Connection connect = DriverManager.getConnection(URL,USER,PASS);
//            Statement state = connect.createStatement())
//        {
//            //Class.forName("com.mysql.jdbc.Driver");
//            if (!tableExists("Job_Provider"))
//            {
//                String sql2 = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
//                state.executeUpdate(sql2);
//                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"')");
//            }
//            else
//            {
//                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"')");
//            }
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
////    public void Load_Data(String Table_name) throws SQLException {
////
////        PreparedStatement p = null;
////        Connection con = DriverManager.getConnection(URL, USER, PASS);
////        try (Statement st = con.createStatement()) {
////            // Try bock to catch exception/s
////            // SQL command data stored in String datatype
////            String sql = "SELECT /* FROM " + Table_name;
////            p = con.prepareStatement(sql);
////            ResultSet res;
////            res = p.executeQuery();
////
////            // Printing ID, name, email of customers
////            // of the SQL command above
////
////            // Condiion check
////            while (res.next())
////            {
////                if (Table_name.equals("REGISTRATION"))
////                {
////                    String name = res.getString("NAME");
////                    String password = res.getString("PASSWORD");
////                    String phone = res.getString("PHONE_NUMBER");
////                }
////                if (Table_name.matches("Job_Seeker")) //NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA
////                {
////                    String name = res.getString("NAME");
////                    String dob = res.getString("DATE_OF_BIRTH");
////                    String email = res.getString("EMAIL");
////                    String address= res.getString("ADDRESS");
////                    String gen = res.getString("GENDER");
////                    String gpa = res.getString("CGPA");
////                }
////                if (Table_name.matches("Job_Provider")) //NAME,EMAIL,COMPANY_NAME
////                {
////                    String name = res.getString("NAME");
////                    String p_mail = res.getString("EMAIL");
////                    String com_name = res.getString("COMPANY_NAME");
////                }
////
////            }
////        }
////    }
//
//    boolean tableExists(String table_name)throws SQLException
//    {
//
//        try( Connection conn = DriverManager.getConnection(URL,USER,PASS);
//             ResultSet res = conn.getMetaData().getTables(null, null, table_name,new String[] {"TABLE"})){
//            return res.next();
//        }
//
//
//    }
//}

package MINI_PROJECT;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SQL_CONNECT{
    static final String URL = "jdbc:mysql://localhost/DEMO";
    static final String USER = "Charut24";
    static  final String PASS = "91169";


    Map<String, Jobs> old_j = new HashMap<>();
    Map<String,Job_provider> old_jp = new HashMap<String,Job_provider>();
    Map<String,CANDIDATE> old_c = new HashMap<String,CANDIDATE>();

    //public static void main(String[] agrs)
    SQL_CONNECT()
    {
        ResultSet res =null;
        try(Connection con = DriverManager.getConnection(URL,USER,PASS))
        {
            Statement stmt = con.createStatement();
            //System.out.println("Success");
            if (!tableExists("Registration"))
            {
                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE VARCHAR (255),"+"TYPE VARCHAR(255),"+"PRIMARY KEY ( ID))";
                stmt.executeUpdate(sql);
            }
            else
            {
                String sql = "SELECT * FROM REGISTRATION";
                res = stmt.executeQuery(sql);

                int i=0;
                while(res.next())
                {
//                    Register.add(res.getString("NAME"));
//                    Register.add(res.getString("PASSWORD"));
//                    Register.add(res.getString("PHONE_NUMBER"));
                    String s =new String();
                    if(res.getString("TYPE").equals("job_provider"))
                    {
                        s = res.getString("NAME");
                        old_jp.put(s, new Job_provider());
                        old_jp.get(s).setName(s);
                        old_jp.get(s).setPassword(res.getString("PASSWORD"));
                        old_jp.get(s).setPhone(res.getString("PHONE"));
                    }
                    else
                    {
                        s = res.getString("NAME");
                        old_c.put(s,new CANDIDATE());
                        old_c.get(s).setName(s);
                        old_c.get(s).setPassword(res.getString("PASSWORD"));
                        old_c.get(s).setPhoneno(res.getString("PHONE"));
                    }
                    i++;
                }
                res.close();
            }
            if (!tableExists("Job_Seeker"))
            {
                String sql = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PHONE VARCHAR (255),"+"PRIMARY KEY ( ID))";
                stmt.executeUpdate(sql);
            }
            else
            {
                String sql = "SELECT * FROM Job_Seeker";
                res = stmt.executeQuery(sql);

                int i=0;
                while (res.next())
                {
                    String s = new String();
//                    candidate.add(res.getString("NAME"));
//                    candidate.add(res.getString("DATE_OF_BIRTH"));
//                    candidate.add(res.getString("EMAIL"));
//                    candidate.add(res.getString("ADDRESS"));
//                    candidate.add(res.getString("GENDER"));
//                    candidate.add(res.getString("CGPA"));
                    s = res.getString("NAME");
                    old_c.get(s).setDob(res.getString("DATE_OF_BIRTH"));
                    old_c.get(s).setEmail(res.getString("EMAIL"));
                    old_c.get(s).setAddress(res.getString("ADDRESS"));
                    old_c.get(s).setGender(res.getString("GENDER"));
                    old_c.get(s).setSgpa(Float.parseFloat(res.getString("CGPA")));
                    i++;
                }
                res.close();
            }
            if (!tableExists("Job_Provider"))
            {
                String sql = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PHONE VARCHAR (255),"+"PRIMARY KEY ( ID))";
                stmt.executeUpdate(sql);
            }
            else
            {
                String sql = "SELECT * FROM Job_Provider";
                res = stmt.executeQuery(sql);

                int i=0;
                while (res.next())
                {
                    String s = new String();
//                    job_provider.add(res.getString("NAME"));
//                    job_provider.add(res.getString("EMAIL"));
//                    job_provider.add(res.getString("COMPANY_NAME"));
                    s = res.getString("NAME");
                    old_jp.get(s).setEmail(res.getString("EMAIL"));
                    old_jp.get(s).setCompany_name(res.getString("COMPANY_NAME"));
                    i++;
                }
                res.close();

            }
            if (!tableExists("jobs"))
            {
                String sql3 = "CREATE TABLE JOBS (ID INTEGER not NULL AUTO_INCREMENT, "+" JOB_TYPE VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"JOB_POST VARCHAR (300),"+"NAME VARCHAR (255),"+"PHONE VARCHAR (255),"+"PRIMARY KEY ( ID))";
                stmt.executeUpdate(sql3);
            }
            else
            {
                String sql = "SELECT * FROM jobs";
                res = stmt.executeQuery(sql);

                while (res.next())
                {
                    String s = res.getString("JOB_TYPE");
                    if (old_j.containsKey(s))
                    {
                        old_j.get(s).list_of_companies.put(res.getString("COMPANY_NAME"), res.getString("JOB_POST"));
                    }
                    else
                    {
                        old_j.put(s,new Jobs());
                        old_j.get(s).setName(s);
                        old_j.get(s).list_of_companies.put(res.getString("COMPANY_NAME"), res.getString("JOB_POST"));
                    }
                }
                res.close();
            }
            for (Map.Entry<String,Job_provider> entry : old_jp.entrySet())
            {
                if(tableExists(entry.getKey()))
                {
                    res = stmt.executeQuery("SELECT * FROM "+entry.getKey());
                    while (res.next())
                    {
                        old_jp.get(entry.getKey()).AppliedCandidates.add(old_c.get(res.getString("NAME")));
                        old_c.get(res.getString("NAME")).AppliedCompanies.put(entry.getKey(),res.getString("POST_NAME"));
                    }


                }
            }
            stmt.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public Map getold_jp()
    {
        return old_jp;
    }
    public Map getold_c()
    {
        return old_c;
    }
    public Map getold_j()
    {
        return old_j;
    }
    public void Register(String name, String Pass, String Phone, String type)
    {
        try(Connection conn =DriverManager.getConnection(URL,USER,PASS);
            Statement stmt = conn.createStatement()) {
            System.out.println(conn);
            if (!tableExists("REGISTRATION")) {

                System.out.println("Holas in table creation");
                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE VARCHAR (255),"+"TYPE VARCHAR(255),"+"PRIMARY KEY ( ID))";
                stmt.executeUpdate(sql);
                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE,TYPE) VALUES('"+name+"','"+Pass+"','"+Phone+"','"+type+"')");
            }
            else
            {
                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE,TYPE) VALUES('"+name+"','"+Pass+"','"+Phone+"','"+type+"')");
            }

        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void Job_Seeker(String name, String DOB, String email, String address, String gender ,String cgpa,String phone) throws SQLException {
        try(Connection con = DriverManager.getConnection(URL,USER,PASS);
            Statement st = con.createStatement())
        {

            //Class.forName ("com.mysql.jdbc.Driver");
            String sql = "INSERT INTO Job_Seeker (NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA,PHONE) VALUES ('"+name+"','"+DOB+"','"+email+"','"+address+"','"+gender+"','"+cgpa+"','"+phone+"')";
            if (!tableExists("Job_Seeker"))
            {
                String sql1 = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PHONE VARCHAR (255),"+"PRIMARY KEY ( ID))";
                st.executeUpdate(sql1);
                st.executeUpdate(sql);
            }
            else
            {
                st.executeUpdate(sql);
            }
        }
        catch (SQLException e) {
            e.printStackTrace(); //The printStackTrace() method in Java is a tool used to handle exceptions and errors.
        }
    }

    public void Job_Provider(String name, String provider_mail, String Company_name, String Phone) throws SQLException {
        try(Connection connect = DriverManager.getConnection(URL,USER,PASS);
            Statement state = connect.createStatement())
        {
            //Class.forName("com.mysql.jdbc.Driver");
            if (!tableExists("Job_Provider"))
            {
                String sql2 = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PHONE VARCHAR (255),"+"PRIMARY KEY ( ID))";
                state.executeUpdate(sql2);
                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME,PHONE) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"','"+Phone+"')");
            }
            else
            {
                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME,PHONE) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"','"+Phone+"')");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void Job_Applicants(String pro_name, String job_post,String can_name,String phone)
    {
        try(Connection connect = DriverManager.getConnection(URL,USER,PASS);
            Statement state = connect.createStatement()) {

            if (!tableExists(pro_name))
            {
                String sql = "CREATE TABLE "+pro_name+" (ID INTEGER not NULL AUTO_INCREMENT,"+"POST_NAME VARCHAR (255),"+"NAME VARCHAR (255),"+"PHONE VARCHAR (255),"+"PRIMARY KEY ( ID))";
                state.executeUpdate(sql);
                state.executeUpdate("INSERT INTO "+pro_name+" (POST_NAME,NAME,PHONE) VALUES('"+job_post+"','"+can_name+"','"+phone+"')");
            }
            else
            {
                state.executeUpdate("INSERT INTO "+pro_name+" (POST_NAME,NAME,PHONE) VALUES('"+job_post+"','"+can_name+"','"+phone+"')");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void jobs(String Jobs, String Company_name, String Job_Post,String Provider_name,String phone)
    {
        try(Connection con = DriverManager.getConnection(URL,USER,PASS);
        Statement stat = con.createStatement())
        {
            if (!tableExists("JOBS"))
            {
                String sql3 = "CREATE TABLE JOBS (ID INTEGER not NULL AUTO_INCREMENT, "+" JOB_TYPE VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"JOB_POST VARCHAR (300),"+"NAME VARCHAR (255),"+"PHONE VARCHAR (255),"+"PRIMARY KEY ( ID))";
                stat.executeUpdate(sql3);
                //ResultSet res = stat.executeQuery(sql3);

//                while(res.next())
//                 {
//                     String s = res.getString("JOB");
//                     old_j.values();
//                     //old_jp.get(s).setEmail(res.getString("EMAIL"));
//                 }
              //  for (int i=0; i<)
                stat.executeUpdate("INSERT INTO JOBS (JOB_TYPE,COMPANY_NAME,JOB_POST,NAME,PHONE) VALUES ('"+Jobs+"','"+Company_name+"','"+Job_Post+"','"+Provider_name+"','"+phone+"')");
               }
            else
            {
                stat.executeUpdate("INSERT INTO JOBS (JOB_TYPE,COMPANY_NAME,JOB_POST,NAME,PHONE) VALUES ('"+Jobs+"','"+Company_name+"','"+Job_Post+"','"+Provider_name+"','"+phone+"')");
            }
        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
    public void delete_table(String table_name)
    {
        try(Connection conn =  DriverManager.getConnection(URL,USER,PASS);
            Statement stmt = conn.createStatement())
        {
            if(tableExists(table_name)) {
                String delete = "DROP TABLE " + table_name;

                stmt.executeUpdate(delete);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void delete_record(String table_name, String record_phone)
    {
        try(Connection conn = DriverManager.getConnection(URL,USER,PASS);
            Statement stmt = conn.createStatement())
        {
            if (table_name.matches("REGISTRATION"))
            {
                String sql = "DELETE FROM "+table_name+" WHERE PHONE = '"+record_phone+"'";
                stmt.executeUpdate(sql);
            }
            else if (table_name.matches("Job_Seeker"))
            {
                String sql = "DELETE FROM "+table_name+" WHERE PHONE = '"+record_phone+"'";
                stmt.executeUpdate(sql);
            }
//            else if (table_name.matches("Job_Applicants"))
//            {
//                String sql = "DELETE FROM "+table_name+" WHERE PHONE = '"+record_phone+"'";
//                stmt.executeUpdate(sql);
//            }
            else if (table_name.matches("Job_Provider"))
            {
                String sql = "DELETE FROM "+table_name+" WHERE PHONE = '"+record_phone+"'";
                stmt.executeUpdate(sql);
            }
            else if (table_name.matches("jobs"))
            {
                String sql = "DELETE FROM "+table_name+" WHERE PHONE = '"+record_phone+"'";
                stmt.executeUpdate(sql);
            }
            else
            {
                String sql = "DELETE FROM "+table_name+" WHERE PHONE = '"+record_phone+"'";
                stmt.executeUpdate(sql);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

//    public void Load_Data(String Table_name) throws SQLException {
//
//        PreparedStatement p = null;
//        Connection con = DriverManager.getConnection(URL, USER, PASS);
//        try (Statement st = con.createStatement()) {
//            // Try bock to catch exception/s
//            // SQL command data stored in String datatype
//            String sql = "SELECT /* FROM " + Table_name;
//            p = con.prepareStatement(sql);
//            ResultSet res;
//            res = p.executeQuery();
//
//            // Printing ID, name, email of customers
//            // of the SQL command above
//
//            // Condiion check
//            while (res.next())
//            {
//                if (Table_name.equals("REGISTRATION"))
//                {
//                    String name = res.getString("NAME");
//                    String password = res.getString("PASSWORD");
//                    String phone = res.getString("PHONE_NUMBER");
//                }
//                if (Table_name.matches("Job_Seeker")) //NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA
//                {
//                    String name = res.getString("NAME");
//                    String dob = res.getString("DATE_OF_BIRTH");
//                    String email = res.getString("EMAIL");
//                    String address= res.getString("ADDRESS");
//                    String gen = res.getString("GENDER");
//                    String gpa = res.getString("CGPA");
//                }
//                if (Table_name.matches("Job_Provider")) //NAME,EMAIL,COMPANY_NAME
//                {
//                    String name = res.getString("NAME");
//                    String p_mail = res.getString("EMAIL");
//                    String com_name = res.getString("COMPANY_NAME");
//                }
//
//            }
//        }
//    }

    boolean tableExists(String table_name)throws SQLException
    {

        try( Connection conn = DriverManager.getConnection(URL,USER,PASS);
             ResultSet res = conn.getMetaData().getTables(null, null, table_name,new String[] {"TABLE"})){
            return res.next();
        }


    }
}

////package MINI_PROJECT;
////import javax.swing.*;
////import java.sql.*;
////import java.util.ArrayList;
////
////public class SQL_CONNECT {
////    static final String URL = "jdbc:mysql://localhost/DEMO";
////    static final String USER = "Student123";
////    static  final String PASS = "4483";
////
////    ArrayList<String> job_provider = new ArrayList<>();
////    ArrayList<String> CANDIDATE = new ArrayList<>();
////
////    /*Map<String,job_provider> P = new HashMap<String,job_provider>();
////        Map<String,CANDIDATE> S = new HashMap<String,CANDIDATE>();*/
////
////    //public static void main(String[] agrs)
//////    SQL_CONNECT()
//////    {
//////        try(Connection con = DriverManager.getConnection(URL,USER,PASS))
//////        {
//////            Statement stmt = con.createStatement();
//////
//////            //System.out.println("Success");
//////
//////            if (con == null)
//////            {
//////                String SQL = "CREATE TABLE LOGIN (ID INTEGER not NULL AUTO_INCREMENT," + " EMAIL VARCHAR (255), "+" PRIMARY KEY ( ID)"+" NAME VARCHAR (255)"+"ADDRESS VARCHAR (255)"+"DATE_OF_BIRTH CHAR (255)"+"PHONE_NUMBER CHAR (11)";
//////                stmt.executeUpdate(SQL);
//////                SQL = "INSERT INTO LOGIN (EMAIL,NAME,ADDRESS,DATE_OF_BIRTH,PHONE_NUMBER)" +
//////                        "VALUES()";
//////                stmt.executeUpdate(SQL);
//////
//////            }
//////
//////        }
//////
//////        catch (SQLException throwables) {
//////            throwables.printStackTrace();
//////        }
//////
//////    }
////
////    public void Register(String name, String Pass, String Phone)
////    {
////        try(Connection conn =DriverManager.getConnection(URL,USER,PASS);
////            Statement stmt = conn.createStatement()) {
////
////            if (!tableExists("REGISTRATION")) {
////                System.out.println("Holas in table creation");
////                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER CHAR (11),"+"PRIMARY KEY ( ID))";
////                stmt.executeUpdate(sql);
////                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
////            }
////            else
////            {
////                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
////            }
////
////        }catch(SQLException e)
////        {
////            e.printStackTrace();
////        }
////    }
////
////    public void Job_Seeker(String name, String DOB, String email, String address, String gender ,String cgpa) throws SQLException {
////        try(Connection con = DriverManager.getConnection(URL,USER,PASS);
////            Statement st = con.createStatement())
////        {
////            Class.forName ("com.mysql.jdbc.Driver");
////            if (!tableExists("Job_Seeker"))
////            {
////                String sql1 = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
////                st.executeUpdate(sql1);
////                st.executeUpdate("INSERT INTO Job_Seeker (name,DOB,email,address,gender,cgpa) VALUES (?,?,?,?,?,?)");
////            }
////            else
////            {
////                st.executeUpdate("INSERT INTO Job_Seeker (name,DOB,email,address,gender,cgpa) VALUES (?,?,?,?,?,?)");
////            }
////        }
////        catch (SQLException |ClassNotFoundException e) {
////            e.printStackTrace();
////        }
////    }
////
////    public void Job_Provider(String name, String provider_mail, String Company_name) throws SQLException {
////        try(Connection connect = DriverManager.getConnection(URL,USER,PASS);
////            Statement state = connect.createStatement())
////        {
////            Class.forName("com.mysql.jdbc.Driver");
////            if (!tableExists("Job_Provider"))
////            {
////                String sql2 = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
////                state.executeUpdate(sql2);
////                state.executeUpdate("INSERT INTO Job_Provider (name,provider_mail,Company_name) VALUES (?,?,?)");
////            }
////            else
////            {
////                state.executeUpdate("INSERT INTO Job_Provider (name,provider_mail,Company_name) VALUES (?,?,?)");
////            }
////
////        }
////        catch (SQLException |ClassNotFoundException e) {
////            e.printStackTrace();
////        }
////    }
////
////    boolean tableExists(String table_name)throws SQLException
////    {
////
////        try(Connection conn = DriverManager.getConnection(URL,USER,PASS);
////            ResultSet res = conn.getMetaData().getTables(null, null, table_name,new String[] {"TABLE"})) {
////            return res.next();
////        }
////
////    }
////}
//package MINI_PROJECT;
//import java.sql.*;
//import java.util.ArrayList;
//
//public class SQL_CONNECT<con> {
//    static final String URL = "jdbc:mysql://localhost/DEMO";
//    static final String USER = "Student123";
//    static  final String PASS = "4483";
//
//    ArrayList<String> Register = new ArrayList<>();
//    ArrayList<String> job_provider = new ArrayList<>();
//    ArrayList<String> candidate = new ArrayList<>();
//
//    /*Map<String,job_provider> P = new HashMap<String,job_provider>();
//        Map<String,CANDIDATE> S = new HashMap<String,CANDIDATE>();*/
//
//    //public static void main(String[] agrs)
//    SQL_CONNECT()
//    {
//        try(Connection con = DriverManager.getConnection(URL,USER,PASS))
//        {
//            Statement stmt = con.createStatement();
//            //System.out.println("Success");
//            if (!tableExists("Registration"))
//            {
//                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER CHAR (11),"+"PRIMARY KEY ( ID))";
//                stmt.executeUpdate(sql);
//            }
//            else
//            {
//                String sql = "SELECT * FROM REGISTRATION";
//                ResultSet res = stmt.executeQuery(sql);
//
//                while(res.next())
//                {
//                    Register.add(res.getString("NAME,PASSWORD,PHONE_NUMBER"));
//                }
//                res.close();
//            }
//            if (!tableExists("Job_Seeker"))
//            {
//                String sql = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (255),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
//                stmt.executeUpdate(sql);
//            }
//            else
//            {
//                String sql = "SELECT * FROM Job_Seeker";
//                ResultSet res = stmt.executeQuery(sql);
//
//                while (res.next())
//                {
//                    candidate.add(res.getString("NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA"));
//                }
//                res.close();
//            }
//            if (!tableExists("Job_Provider"))
//            {
//                String sql = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
//                stmt.executeUpdate(sql);
//            }
//            else
//            {
//                String sql = "SELECT * FROM Job_Provider";
//                ResultSet res = stmt.executeQuery(sql);
//
//                while (res.next())
//                {
//                    job_provider.add(res.getString("NAME,EMAIL,COMPANY_NAME"));
//                }
//                res.close();
//            }
//            stmt.close();
//        }
//        catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//    }
//
//    public void Register(String name, String Pass, String Phone)
//    {
//        try(Connection conn =DriverManager.getConnection(URL,USER,PASS);
//            Statement stmt = conn.createStatement()) {
//            System.out.println(conn);
//            if (!tableExists("REGISTRATION")) {
//
//                System.out.println("Holas in table creation");
//                String sql = "CREATE TABLE REGISTRATION (ID INTEGER not NULL AUTO_INCREMENT,"+" NAME VARCHAR (255),"+"PASSWORD VARCHAR (255),"+"PHONE_NUMBER CHAR (11),"+"PRIMARY KEY ( ID))";
//                stmt.executeUpdate(sql);
//                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
//            }
//            else
//            {
//                stmt.executeUpdate("INSERT INTO REGISTRATION (NAME,PASSWORD,PHONE_NUMBER) VALUES('"+name+"','"+Pass+"','"+Phone+"')");
//            }
//
//        }catch(SQLException e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//    public void Job_Seeker(String name, String DOB, String email, String address, String gender ,String cgpa) throws SQLException {
//        try(Connection con = DriverManager.getConnection(URL,USER,PASS);
//            Statement st = con.createStatement())
//        {
//            Class.forName ("com.mysql.jdbc.Driver");
//            if (!tableExists("Job_Seeker"))
//            {
//                String sql1 = "CREATE TABLE Job_Seeker (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+"DATE_OF_BIRTH CHAR (255),"+" EMAIL VARCHAR (255),"+"ADDRESS VARCHAR (300),"+"GENDER VARCHAR (255),"+"CGPA CHAR (255),"+"PRIMARY KEY ( ID))";
//                st.executeUpdate(sql1);
//                st.executeUpdate("INSERT INTO Job_Seeker (NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA) VALUES ('"+name+"','"+DOB+"'','"+email+"','"+address+"','"+gender+"','"+cgpa+"')");
//            }
//            else
//            {
//                st.executeUpdate("INSERT INTO Job_Seeker (NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA) VALUES ('"+name+"','"+DOB+"'','"+email+"','"+address+"','"+gender+"','"+cgpa+"')");
//            }
//        }
//        catch (SQLException |ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void Job_Provider(String name, String provider_mail, String Company_name) throws SQLException {
//        try(Connection connect = DriverManager.getConnection(URL,USER,PASS);
//            Statement state = connect.createStatement())
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            if (!tableExists("Job_Provider"))
//            {
//                String sql2 = "CREATE TABLE Job_Provider (ID INTEGER not NULL AUTO_INCREMENT," +" NAME VARCHAR (255),"+" EMAIL VARCHAR (255),"+"COMPANY_NAME VARCHAR (255),"+"PRIMARY KEY ( ID))";
//                state.executeUpdate(sql2);
//                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"')");
//            }
//            else
//            {
//                state.executeUpdate("INSERT INTO Job_Provider (NAME,EMAIL,COMPANY_NAME) VALUES ('"+name+"','"+provider_mail+"','"+Company_name+"')");
//            }
//
//        }
//        catch (SQLException |ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void Load_Data(String Table_name) throws SQLException {
//
//        PreparedStatement p = null;
//        Connection con = DriverManager.getConnection(URL, USER, PASS);
//        try (Statement st = con.createStatement()) {
//            // Try bock to catch exception/s
//            // SQL command data stored in String datatype
//            String sql = "SELECT /* FROM " + Table_name;
//            p = con.prepareStatement(sql);
//            ResultSet res;
//            res = p.executeQuery();
//
//            // Printing ID, name, email of customers
//            // of the SQL command above
//
//
//            // Condiion check
//            while (res.next())
//            {
//                if (Table_name.equals("REGISTRATION"))
//                {
//                    String name = res.getString("NAME");
//                    String password = res.getString("PASSWORD");
//                    String phone = res.getString("PHONE_NUMBER");
//                }
//                if (Table_name.matches("Job_Seeker")) //NAME,DATE_OF_BIRTH,EMAIL,ADDRESS,GENDER,CGPA
//                {
//                    String name = res.getString("NAME");
//                    String dob = res.getString("DATE_OF_BIRTH");
//                    String email = res.getString("EMAIL");
//                    String address= res.getString("ADDRESS");
//                    String gen = res.getString("GENDER");
//                    String gpa = res.getString("CGPA");
//                }
//                if (Table_name.matches("Job_Provider")) //NAME,EMAIL,COMPANY_NAME
//                {
//                    String name = res.getString("NAME");
//                    String p_mail = res.getString("EMAIL");
//                    String com_name = res.getString("COMPANY_NAME");
//                }
//
//            }
//        }
//    }
//
//    boolean tableExists(String table_name)throws SQLException
//    {
//
//        try(Connection conn = DriverManager.getConnection(URL,USER,PASS);
//            ResultSet res = conn.getMetaData().getTables(null, null, table_name,new String[] {"TABLE"})) {
//            return res.next();
//        }
//
//    }
//}