import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        String [] students = {"Dương", "Phi", "Đức", "Thanh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên sinh viên: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("Vị trí của sinh viên " + name + " là: " + (i+1));
                isExist = true;
                break;
            }
        }
        if (isExist == false) {
            System.out.println("Not found");
        }
    }
}
