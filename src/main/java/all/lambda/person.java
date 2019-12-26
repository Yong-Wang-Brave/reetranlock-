package all.lambda;

import lombok.Data;

@Data
public class person {




    private String firstName;
    private String lastName;
    private  int age;

 public person(){};

    public person(String firstName, String lastName, int age) {

this.firstName=firstName;
this.lastName=lastName;
   this.age=age;

    }
}
