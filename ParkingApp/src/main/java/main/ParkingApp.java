package main; import java.util.Scanner; import dao.*; import model.Vehicle;
public class ParkingApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);VehicleDAO dao=new VehicleDAO();UserDAO u=new UserDAO();
        System.out.println("===== Admin Login =====");System.out.print("Username: ");String user=sc.nextLine();System.out.print("Password: ");String pass=sc.nextLine();
        if(!u.login(user,pass)){System.out.println("Invalid");return;}System.out.println("Login Successful");
        while(true){
            System.out.println("\n===== Vehicle Parking Management System =====");
            System.out.println("1.Vehicle Entry\n2.View All\n3.Search by ID\n4.Active Vehicles\n5.Vehicle Exit\n6.Remove Record\n7.Total Revenue\n8.Vehicle Type Report\n9.Exit");
            System.out.print("Choice: ");int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("Vehicle No: ");String vn=sc.nextLine();System.out.print("Owner Name: ");String o=sc.nextLine();System.out.print("Type (2W/4W/Heavy): ");String t=sc.nextLine();System.out.print("Entry Time: ");String et=sc.nextLine();System.out.print("Exit Time (N/A if not yet): ");String xt=sc.nextLine();System.out.print("Charges: ");double c=sc.nextDouble();sc.nextLine();System.out.print("Status (Parked/Exited): ");String st=sc.nextLine();System.out.println(dao.add(new Vehicle(vn,o,t,et,xt,c,st))?"Vehicle Entered":"Failed");break;
                case 2:dao.viewAll();break;case 3:System.out.print("ID: ");dao.searchById(sc.nextInt());break;
                case 4:dao.activeVehicles();break;
                case 5:System.out.print("ID: ");int eid=sc.nextInt();System.out.print("Final Charges: ");System.out.println(dao.exitVehicle(eid,sc.nextDouble())?"Vehicle Exited":"Failed");break;
                case 6:System.out.print("ID: ");System.out.println(dao.delete(sc.nextInt())?"Deleted":"Failed");break;
                case 7:dao.totalRevenue();break;case 8:dao.vehicleTypeReport();break;
                case 9:System.out.println("Thank you!");return;default:System.out.println("Invalid");
            }
        }
    }
}
