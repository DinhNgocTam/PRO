public class student implements Comparable <student> {
    private String studentID;
    private String name;
    private int year;
    private float point;
    public student(String studentID, String name, int year, float point) {
        this.studentID = studentID;
        this.name = name;
        this.year = year;
        this.point = point;
    }
    

    public student(String studentID) {  //constructor cho studentID
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public float getPoint() {
        return point;
    }
    public void setPoint(float point) {
        this.point = point;
    }
    @Override
    public String toString() {
        return "student [studentID=" + studentID + ", name=" + name + ", year=" + year + ", point=" + point + "]";
    }
    @Override
    public int compareTo(student o) {
        return this.studentID.compareTo(o.studentID);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        student other = (student) obj;
        if (studentID == null) {
            if (other.studentID != null)
                return false;
        } else if (!studentID.equals(other.studentID))
            return false;
        return true;
    }


    
}
