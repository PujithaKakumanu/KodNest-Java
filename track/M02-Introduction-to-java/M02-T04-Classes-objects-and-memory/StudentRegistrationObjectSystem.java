import java. util. Scanner;

class Student {
    // Declare registrationId, name and attendancePercentage
    int id;
    String name;
    double attendance;
}
public class StudentRegistrationObjectSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create and populate firstStudent
        Student s1 = new Student();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.attendance = scanner.nextDouble();

        // Create and populate secondStudent
        Student s2 = new Student();
        s2.id = scanner.nextInt();
        s2.name = scanner.next();
        s2.attendance = scanner.nextDouble();

        // Read the selected ID and new attendance
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Student selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (s1.id == selectedId) {
        selectedStudent = s1;
        } else if(s2.id == selectedId){
        selectedStudent = s2;
        }
        // Update through selectedStudent when a match exists
        if(selectedStudent != null) {
            selectedStudent.attendance = newAttendance;
            System.out.println("Selected Student: "+selectedStudent. name);
        }
        else{
            System.out.println("Student not found.");
        }
    
        // Display both records
        System.out.println(s1.id+ " "+s1.name+" "+s1.attendance+"%");
        System.out.println(s2.id+" "+s2.name+" "+s2.attendance+"%");  
        scanner.close();
    }
}
    
