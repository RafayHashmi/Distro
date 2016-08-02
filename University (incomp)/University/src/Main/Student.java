package Main;

/**
 * Created by MT-2016 on 6/12/2016.
 */
public class Student extends Human {
    private String Grade;

    public Student(Human h, String grade) {
        super(h.getName(), h.getGender(), h.getAge());
        Grade = grade;
    }

    @Override
    public String toString()
    {
        System.out.println("Name = " + getName());
        System.out.println("Gender = " + getGender());
        System.out.println("Age = " + getAge());
        //or super.View();
        System.out.println("Grade = " + Grade);
        return "Name = " + getName() + "Gender = " + getGender() + "Age = " + getAge() +
                "Grade = " + Grade;
    }

}
