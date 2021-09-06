import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên trong đó có ít nhất 1 ký tự in hoa, 1 ký tự số, 1 ký tự đặc biệt như . - _ …
//
//        Nếu mật khẩu ít hơn 10 ký tự thông báo mật khẩu yếu
//        Nếu thiếu một trong các ký tự đặc biệt thì thông báo mật khẩu chưa đủ mạnh

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Mật khẩu: ");
        String pass = sc.nextLine();

        int n = EntryPoint.isPassworvalid(pass);
        if (n == 1) {
            System.out.println("Mật khẩu yếu");
            System.out.println("Mật khẩu không đủ mạnh");
        }

        if (n == 2) {
            System.out.println("Mật khẩu yếu");
        }
        if (n == 3) {
            System.out.println("Mật khẩu không đủ mạnh");
        }
    }


}
