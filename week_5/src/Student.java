import java.util.Comparator;

class Student {
    final private int id;
    final private String name;
    final private String city;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    static class NameComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class CityComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCity().compareTo(o2.getCity());
        }
    }
}

class StudentNotFoundException extends Exception {

}