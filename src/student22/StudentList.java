
package student22;

public class StudentList {
    public static void main(String[] args){
        Student[] studentList = new Student[4];
        
                studentList[0] = new Student("S1", "John", 12);
                studentList[1]= new Student("s2", "Anna",13);
                studentList[2]= new Student("s3", "Jim",14);
                
                for( int i =0; i<studentList.length; i++){
                    System.out.println(studentList[i].getStudentName());
             
                    System.out.println(studentList[i].getStudentId()); 
                
                }
                   
    }
}
