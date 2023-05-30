import java.util.Scanner;


public class main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        StudentList stdList = new StudentList();
        int choice;
        do{
            System.out.println("---------------------------Menu-----------------------------");
            System.out.println("1. Add student in list");
            
            System.out.println("2. Print student list on screen");
            System.out.println("3. Check student list is empty or not");
            System.out.println("4. Get number of student in list");
            System.out.println("5. Make student list emty");
            System.out.println("6. Check student is exit in list or not, base on student ID");
            System.out.println("7. Remove a stduent base on student ID");
            System.out.println("8. Find all student base on name get from the key board");
            System.out.println("9. Print out student list base on score high to low");
            System.out.println("Press 0 to END program");
            System.out.print("Press your choice here: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Input student ID : " ); String studentID = sc.nextLine();
                    System.out.println("Input name student : " ); String nameStudent = sc.nextLine();
                    System.out.println("Input year student : " ); int yearStudent = sc.nextInt();
                    System.out.println("Input score student : " ); float scoreStudent = sc.nextFloat();
                    student std = new student(studentID, nameStudent, yearStudent, scoreStudent);
                    stdList.addStudent(std);
                    break;
                case 2:
                    stdList.printStudentList();
                    break;
                case 3:
                    System.out.println("Check list empty: " + stdList.checkListEmpty());
                    break;  
                case 4:
                    System.out.println("Number student current: " + stdList.getNumberStudent());
                    break;
                case 5:
                    stdList.makeListEmpty(); //Lam rong danh sach
                    System.out.println("Student list is empty now");
                    break;
                case 6:
                    System.out.print("Input student ID you wanna search: "); String studentID1 = sc.nextLine();
                    student stdSearch = new student(studentID1);
                    System.out.println("Check student in list: " + stdList.checkExit(stdSearch));
                    break;
                case 7:
                    System.out.print("Input student ID you wanna remove: "); String studentID2 = sc.nextLine();
                    student stdRemove = new student(studentID2);
                    //stdList.removeStudent(stdRemove);
                    System.out.println(stdList.removeStudent(stdRemove) == true ? "This student was remove" : "Don't have this student in list, please check again");
                    break;
                case 8:
                    System.out.println("Input name student you wanna to search : " ); String nameStudent1 = sc.nextLine();
                    System.out.println("Result searching: ");
                    stdList.searchStudent(nameStudent1);
                    break;
                case 9:
                    stdList.sortStudentDecreaseByScore();
                    stdList.printStudentList();
                    break;  
                case 0:
                    System.out.println("Thank you to use");
                    break;       
                default:
                    System.out.println("Don't have this choice");
                    break;
            }
        }while(choice != 0);
    }
}
