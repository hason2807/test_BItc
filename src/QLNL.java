import java.util.ArrayList;
import java.util.Scanner;

public class QLNL {
     
     private ArrayList<NhanLuc> NhanLuc1 = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public void addNhanLuc(){
      
            System.out.print("Nhập so luong nhan luc: ");
            int nhanluc = scanner.nextInt();
            scanner.nextLine(); 
    
            for (int i = 0; i < nhanluc ; i++) {
                System.out.println("Nhập thông tin cho nhan luc " + (i + 1));
                System.out.print("Age: ");
                int age  = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Gender: ");
                String gender = scanner.nextLine();
                NhanLuc nhanluc1 = new NhanLuc(age, name,gender );
                NhanLuc1.add(nhanluc1);
            }
    
    }
    public void printAllNhanLuc() {
        if(NhanLuc1.isEmpty())
        {
            System.out.println("khoong co nhan luc nao de in ra");
        }else {
            for(NhanLuc nhanluc1: NhanLuc1){
                nhanluc1.information();
            }
        }
      }
   
}
