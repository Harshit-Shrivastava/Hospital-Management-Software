package hospital.service;
import java.util.Date;
import hospital.db.*;

public class opBill{

    public patient p;
    protected int bill_id;
    protected String bill_type;
    protected int hospitalNo;
    protected int deptCode;
    protected Date billDate;
    protected int amount;

    public opBill()
    {
        billDate=new Date();
        amount=0;
    }

    public void setBill(int hospitalNo,Date billDate,
            int depCode,int amnt) {

        this.hospitalNo=hospitalNo;
        this.billDate=billDate;
        this.amount=amnt;
        this.deptCode=depCode;

    }

    public void generateBill() {



    }

    public void searchBill() {
        
    }

    public void insertDB(boolean b){
        if(b){
        String date=billDate.getDate()+"/"+billDate.getMonth()+"/"+(billDate.getYear()+1900);
        String query="insert into tblopbilling(hospitalno,billdate,amount,depcode) values("
                +this.hospitalNo+",'"+date+"',"+this.amount+","+this.deptCode+")";
        dbconnect conn=new dbconnect(query);
        System.out.println(query);
        conn.insquery();
        }
    }

}
