import java.util.Scanner;

public class Control {
    public static void main(String[] args)
    {
          QLNL qlnl = new QLNL();
        Scanner scanner = new Scanner(System.in);

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Chọn tùy chọn:");
            System.out.println("1. Nhap ThoNG tin nhan luc");
            System.out.println("2. In thông tin nhan luc");
            System.out.println("3. Thoát");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    qlnl.addNhanLuc();
                    break;
                case 2:
                    qlnl.printAllNhanLuc();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Tùy chọn không hợp lệ.");
            }

            if (keepRunning) {
                System.out.print("Bạn có muốn thực hiện chức năng khác không? (y/n): ");
                String continueOption = scanner.nextLine();
                if (continueOption.equalsIgnoreCase("n")) {
                    keepRunning = false;
                    System.out.println("Thoát chương trình.");
                }
            }
        }
    }
        
    
        
}

