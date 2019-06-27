import java.util.Scanner;

public class ValueSearchInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String search;
        String[] listStudent = {"Long", "Tam", "Huy","Hieu", "Quang", "Luu"};
        System.out.println("Enter a name's student:");
        search = scanner.nextLine();
        boolean check = false;

        for(int i = 0; i < listStudent.length; i++) {
            if(listStudent[i].equals(search)) {
                System.out.println("Position of the students in the list is: " + (i + 1));
                check = true;
                break;
            }
        }

        if(!check){
            System.out.println("Not found " + search + " in the list.");
        }

    }
}
