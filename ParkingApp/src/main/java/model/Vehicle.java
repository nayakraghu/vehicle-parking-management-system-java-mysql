package model;
public class Vehicle {
    private int id; private String vehicleNumber,ownerName,vehicleType,entryTime,exitTime; private double charges; private String status;
    public Vehicle(){}
    public Vehicle(String vehicleNumber,String ownerName,String vehicleType,String entryTime,String exitTime,double charges,String status){this.vehicleNumber=vehicleNumber;this.ownerName=ownerName;this.vehicleType=vehicleType;this.entryTime=entryTime;this.exitTime=exitTime;this.charges=charges;this.status=status;}
    public int getId(){return id;} public void setId(int i){this.id=i;}
    public String getVehicleNumber(){return vehicleNumber;} public void setVehicleNumber(String v){this.vehicleNumber=v;}
    public String getOwnerName(){return ownerName;} public void setOwnerName(String o){this.ownerName=o;}
    public String getVehicleType(){return vehicleType;} public void setVehicleType(String t){this.vehicleType=t;}
    public String getEntryTime(){return entryTime;} public void setEntryTime(String e){this.entryTime=e;}
    public String getExitTime(){return exitTime;} public void setExitTime(String e){this.exitTime=e;}
    public double getCharges(){return charges;} public void setCharges(double c){this.charges=c;}
    public String getStatus(){return status;} public void setStatus(String s){this.status=s;}
}
