package StreamAPI;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male","Electrical",2018,80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female","Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male","Computer Science",2017,57.5));

        Stream <Student> stream = studentList.stream();
        System.out.println();

        // print name of all department
        Set<String> departmentList = stream.map(t->t.engDepartment).collect(Collectors.toSet());
        System.out.println(departmentList);

        // names of student enrolled after 2018
        List<Student> classAfter2018 = studentList.stream().filter(t->t.yearOfEnrollment > 2018).toList();
        classAfter2018.stream().map(t->t.name).forEach(System.out::println);

        // Get the details of all male student in the computer sci department
        List<Student> csBoys = studentList.stream().filter(t-> Objects.equals(t.engDepartment, "Computer Science")).toList();
        for(Student stu:csBoys){
            System.out.println(stu.id + " " + stu.name + " " + stu.age + " " + stu.gender + " " + stu.perTillDate + " " + stu.yearOfEnrollment + " " + stu.engDepartment);
        }

        // How many male and female student are there
        List<String> girlsAndBoys = studentList.stream().map(t -> t.gender).toList();
        Map<String,Long> girlsAndBoysCount = girlsAndBoys.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(girlsAndBoysCount);

        // Get the details of youngest male student in the Electronic department?
        List<Student> electronicsList = studentList.stream().filter(t->t.engDepartment.equals("Electronic")).toList();
        Double electronicTopperMarks = electronicsList.stream().mapToDouble(Student::getPerTillDate).max().getAsDouble();
        List<Student> electronicTopper = electronicsList.stream().filter(t->t.perTillDate==electronicTopperMarks).toList();
        for(Student stu:electronicTopper){
            System.out.println(stu.id + " " + stu.name + " " + stu.age + " " + stu.gender + " " + stu.perTillDate + " " + stu.yearOfEnrollment + " " + stu.engDepartment);
        }

        // What is the average age of male and female students
        List<Student> girls = studentList.stream().filter(t -> Objects.equals(t.gender, "Female")).toList();
        double girlsPerSum = girls.stream().map(t->t.perTillDate).reduce(0.0, Double::sum);
        List<Student> boys = studentList.stream().filter(t -> Objects.equals(t.gender, "Male")).toList();
        double boysPerSum = boys.stream().map(t->t.perTillDate).reduce(0.0, Double::sum);
        System.out.println("Boys Average : " + (boysPerSum/boys.size()) + '\n' + "Girls Average : " + (girlsPerSum/girls.size()));

        // Count the number of students in each department? (Hint :use Collectors.groupingBy())
        List<String> departments = studentList.stream().map(t -> t.engDepartment).toList();
        Map<String,Long> eachDepartmentList = departments.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(eachDepartmentList);

        // How many male and female students are there in the computer science department
        List<Student> computerKids = studentList.stream().filter(t -> Objects.equals(t.engDepartment, "Computer Science")).toList();
        long computerGirls = computerKids.stream().filter(t-> Objects.equals(t.gender, "Female")).count();
        System.out.println("Girls In CS : " + computerGirls + "\n" + "Boys in CS : " + (computerKids.size()-computerGirls));

        //Get the details of highest student having highest percentage
        Double topperMarks = studentList.stream().mapToDouble(Student::getPerTillDate).max().getAsDouble();
        List<Student> topperList= studentList.stream().filter(t->t.perTillDate==topperMarks).toList();
        for(Student stu:topperList){
            System.out.println(stu.id + " " + stu.name + " " + stu.age + " " + stu.gender + " " + stu.perTillDate + " " + stu.yearOfEnrollment + " " + stu.engDepartment);
        }




    }
}
