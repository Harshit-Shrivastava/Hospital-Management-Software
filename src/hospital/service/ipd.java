package hospital.service;
import java.util.Date;
import hospital.db.*;

/**
 *
 * @author harshit
 */

public class ipd {

protected int hospitalNo;
protected int wardNo;
protected int bedNo;
protected Date dateOfAdmission;

    public ipd()
    {
        dateOfAdmission=new Date();
    }

    public void setDepartment(int hospitalNo,int wardNo,int bedNo,Date dateOfAdmission)
    {
        this.hospitalNo=hospitalNo;
        this.wardNo=wardNo;
        this.bedNo=bedNo;
        this.dateOfAdmission=dateOfAdmission;
    }

    public void insertDB(boolean b){
        if(b){
            String date=dateOfAdmission.getDate()+"/"+dateOfAdmission.getMonth()+"/"+(dateOfAdmission.getYear()+1900);
            String query="insert into tblipreg(hospitalno,wardno,bedno,dateofadmission) values("
                    +this.hospitalNo+","+this.wardNo+","+this.bedNo+",'"+date+"')";
            dbconnect conn=new dbconnect(query);
            System.out.println(query);
            conn.insquery();
        }
    }

    public void getDepartment()
    {
        
    }

}
