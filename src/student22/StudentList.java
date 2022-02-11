
package student22;

public class StudentList {
    public static void main(String[] args){
        Student[] studentList = new Student[3];
        
                studentList[0] = new Student("S1", "John");
                studentList[1]= new Student("s2", "Anna");
                studentList[2]= new Student("s3", "Jim");
                
                for( int i =0; i<studentList.length; i++){
                    System.out.println(studentList[i].getStudentName());
             
                    System.out.println(studentList[i].getStudentId()); 
                
                }
                   
    }
}
