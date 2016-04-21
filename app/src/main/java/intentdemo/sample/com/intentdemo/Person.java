package intentdemo.sample.com.intentdemo;

import java.io.Serializable;

/**
 * Created by anildeshpande on 04/03/16.
 */
public class Person implements Serializable{


    private  String firstName;
    private String lastName;
    private String qualification;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getQualification() {
        return qualification;
    }
}
