import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//1) WAP to get employees based on their age.

class Employee{
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class TestEmpGroupBy {

    public static void main(String[] args){
        Employee e1 = new Employee(101,"Rajesh",25);
        Employee e2 = new Employee(102,"Suraj",25);
        Employee e3 = new Employee(103,"Tom",28);

        List<Employee> mylist = Arrays.asList(e1,e2,e3);

        Map<Integer, List<Employee>> result = mylist.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(result);

    }

}
