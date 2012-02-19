package hospital.service;

public class pharmacy {

    private String name;
    private String type;
    private double cost;
    private String med_id;
    private int manId;


    public pharmacy()
    {
        
    }

     public void setPharmacy(String name,String type,double cost,String med_id,
             int manId)
    {
        this.name=name;
        this.type=type;
        this.cost=cost;
        this.med_id=med_id;
        this.manId=manId;
    }

//    public pharmacy getPharmacy()
//    {
//        return this;
//    }
//
//    public pharmacy searchPharmacy()
//    {
//
//    }

     public void DBinsert(boolean b){
         
     }

}
