package Main;

/**
 * Created by MT-2016 on 6/12/2016.
 */
public class Human {

    private String Name;
    private String Gender;
    private int Age;

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }


    public Human(String name, String gender, int age) {
        Name = name;
        Gender = gender;
        Age = age;
    }

    @Override
    public String toString()
    {
        System.out.println("Name = " + Name);
        System.out.println("Gender = " + Gender);
        System.out.println("Age = " + Age);
        return "Name = " + Name + "Gender = " + Gender + "Age = " + Age;
    }
}
