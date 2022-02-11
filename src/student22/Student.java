
package student22;

public class Student {
    private String studentId;
    private String studentName;
    private int mark;

    //Hello there how are you today?
    
    
    
    //constructor
    public Student(String studentId, String studentName,int mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }
    
    //set and get

    
    public int getMark(){
     return mark;   
    }
    
    public void setMark(int mark){
this.mark = mark;
    }
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
   
    
    
    
}
