import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class Business {
    Student[] students;
    public static void main(String[] args) throws IOException, StudentNotFoundException {
        Business b = new Business();

        String c = "Ahmedabad";
        int i = 20;
        b.readStudents();
        b.displayStudents();
        System.out.println("================================");
        b.displayCityWiseSorted();
        System.out.println("================================");

        b.displayNameWiseSorted();
        System.out.println("================================");

        b.displayStudentsByCity(c);
        System.out.println("================================");

        b.displayStudentById(i);
        System.out.println("================================");

    }

    private void displayStudents(){
        Stream.of(students).forEach(System.out::println);
    }

    private void displayStudentsByCity(String city){
        Stream.of(students).filter(student -> student.getCity().equals(city)).forEach(System.out::println);
    }

    private void displayNameWiseSorted(){
        Stream.of(students).sorted(new Student.NameComparator()).forEach(System.out::println);
    }

    private void displayCityWiseSorted(){
        Stream.of(students).sorted(new Student.CityComparator()).forEach(System.out::println);
    }

    private void displayStudentById(int id) throws StudentNotFoundException {
        Student res = null;
        for(Student s: students){
            if(s.getId() == id) {
                res = s;
                break;
            }
        }
        if(res == null)
            throw new StudentNotFoundException();
        System.out.println(res);
    }

    private void readStudents() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfStudents = Integer.parseInt(bufferedReader.readLine());
        students = new Student[numOfStudents];
        for(int i=0;i<numOfStudents;i++){
            String[] s = bufferedReader.readLine().split(" ");
            int id = Integer.parseInt(s[0]);
            students[i] = new Student(id,s[1],s[2]);
        }
    }
}