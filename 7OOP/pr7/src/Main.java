//public class Main extends java.lang.Object {
public class Main extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
//        System.out.println(max.toString());
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);

        System.out.println("=============");
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
//        System.out.println(tim.getAge());
//        System.out.println(tim.collectPay());
        System.out.println("=============");
//        Employee joe = new Employee("Joe", "10/11/1981", "11/02/2020");
        SalariedEmployee joe = new SalariedEmployee("Joe", "10/11/1981", "11/02/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());
        System.out.println("=============");

        HourlyEmployee mary = new HourlyEmployee("Mary", "08/09/1989", "10/05/2020", 20);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
//        System.out.println("=============");
//        System.out.println("=============");

    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

//class PrimarySchoolStudent extends Student, Object { - incorrect extending
class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
