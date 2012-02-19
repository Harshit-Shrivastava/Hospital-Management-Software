package hospital.db;
import java.sql.*;
import static java.lang.System.*;

/**
 *
 * @author harshit
 */

public class dbconnect {
    public String query;
    
    public dbconnect(String query)
    {
        this.query=query;
    }
    public ResultSet exquery()
    {
        ResultSet res=null;
        try
        {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url="jdbc:db2://localhost:50000/dbhosp";
            String dbusername="db2inst1";
            String dbpasswd="doggierules";
            Connection conn=DriverManager.getConnection(url,dbusername,dbpasswd);
            Statement st=conn.createStatement();
            res=st.executeQuery(query);
            
        }

        catch(SQLException e)
        {
        }

        catch(ClassNotFoundException e)
        {
        }

        return res;
    }

    public void insquery()
    {
        try
        {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url="jdbc:db2://localhost:50000/dbhosp";
            String dbusername="db2inst1";
            String dbpasswd="doggierules";
            Connection conn=DriverManager.getConnection(url,dbusername,dbpasswd);
            Statement st=conn.createStatement();
            int res=st.executeUpdate(query);
        }
        catch(SQLException e)
        {
        }

        catch(ClassNotFoundException e)
        {
        }

    }

}
