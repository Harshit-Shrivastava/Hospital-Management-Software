package hospital.service;
import hospital.db.*;
import java.util.Date;

/**
 *
 * @author harshit
 */

public class ipBill{

    private patient p;
    protected int hospitalNo;
    protected int testCode;
    protected Date billDate;
    protected int amount;
    protected int ipno;

    public ipBill()
    {
        Date billDate=new Date();
        amount=0;
    }

    public void setBill(Date billdate,int amount,int ipno)
    {
        this.billDate=billdate;
        this.amount=amount;
        this.ipno=ipno;
    }

    public void generateBill() {

    }

    public void searchBill() {

    }

    public void insertDB(boolean b){
        String bdate=billDate.getDate()+"/"+billDate.getMonth()+"/"+(billDate.getYear()+1900);
        String query="insert into tlbipbilling(billdate,amount,ipno) values("
                +"'"+bdate+"',"+this.amount+","+this.ipno+")";
        System.out.println(query);
        dbconnect conn=new dbconnect(query);
        conn.insquery();
    }
}
