package Main;

/**
 * Created by MT-2016 on 6/12/2016.
 */
public class Teacher extends Human {
    private String Qualification;

    public Teacher(String name, String gender, int age, String qualification) {
        super(name, gender, age);
        Qualification = qualification;
    }

    public String toString()
    {   String data = super.toString();

        System.out.println("Qualification = " + Qualification);
        return data + "Qualification = " + Qualification;
    }

}
