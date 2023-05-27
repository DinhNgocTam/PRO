import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList{
   // private List<student> StudentList = new ArrayList<>(); //array list
    private ArrayList<student> list;
    public StudentList(ArrayList<student> list) { //constructor chinh
        this.list = list;
    }

    
    public StudentList(){  //constructor rong de dat ten cho class
        this.list = new ArrayList<student>();
    }
    
    public void addStudent(student std){ //them sinh vien vao danh sach
        this.list.add(std);
    }
    public void printStudentList(){ //in danh sach sinh vien
        for (student student : list) {
            System.out.println(student);
        }
    }
    public boolean checkListEmpty(){ //kiem tra danh sach co rong hay khong
        return this.list.isEmpty();
    }
    public int getNumberStudent(){ //lay ra so luong sinh vien trong danh sach
        return this.list.size();
    }
    public void makeListEmpty(){   // Xoa het tat ca
        this.list.removeAll(list);
    }

    public boolean checkExit(student otherStudent){ //Check student is exit in list or not, base on student ID

        return this.list.contains(otherStudent);
   }
    public boolean removeStudent(student otherStudent){  //Remove a stduent base on student ID
        return this.list.remove(otherStudent);
    }

    public void searchStudent(String name){ //Find all student base on name get from the key board
        for (student student : list) {
            if(student.getName().indexOf(name) >= 0){
                System.out.println(student);
            }
        }
    }

    public void sortStudentDecreaseByScore(){ //Print out student list base on score high to low
        Collections.sort(this.list, new Comparator<student>() {

            @Override
            public int compare(student std1, student std2) {
                if(std1.getPoint() < std2.getPoint()) return 1;
                else if(std1.getPoint() > std2.getPoint()) return -1;
                else return 0;
            }
            
        });
    }
}
