package task_2;

public class Employee {
    private String name;
    private int age;
    private String job;

    public Employee() {
    }

    public Employee(String name, int age, String job) {
        this.name = name;
        try {
            if (age > 0){
                this.age = age;
            }else {
                throw new MyException("Jash tuura emes berildi!!!");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
