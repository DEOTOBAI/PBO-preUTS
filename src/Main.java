import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        String username,password;
        int lama,biaya=3000;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        username = in.nextLine();
        System.out.print("Masukkan password: ");
        password = in.nextLine();

        System.out.print("Masukkan lama main: ");
        lama = in.nextInt();

        member member1 = new member();
        login login1 = new login();
        cpu cpu1 = new cpu();

        member1.setUsername(username);
        member1.setPassword(password);
        login1.setBiaya(lama,biaya);
        cpu1.setMerk("AMD");
        cpu1.setSpeed(3);
        cpu1.setNopc("1");
        cpu1.setSpek("8 Core 16 Thread");

        System.out.println("Username: "+member1.getUsername());
        System.out.println("Passwoed: "+member1.getPassword());
        System.out.println("Biaya: "+login1.getBiaya());
        System.out.println("Spesifikasi PC");
        System.out.println("No pc: "+ cpu1.getNopc());
        System.out.println("Merk CPU: "+cpu1.getMerk());
        System.out.println("Speed CPU: "+cpu1.getSpeed());
        System.out.println("Spek CPU: "+cpu1.getSpek());

        member1.outmember();
    }
}