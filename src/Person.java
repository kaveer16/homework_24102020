/*Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods (instance methods):*/

//Name of Class is Person as per requirement.
public class Person {
    //3 instance variables as per requirement.
    String firstName;
    String lastName;
    int age;

    public String getFirstName() { //1st user defined method, without parameters
        return firstName;
    }
    public String getLastName() { //2nd user defined method, without parameters
        return lastName;
    }
    public int getAge() { //3rd user defined method, without parameters
        return age;
    }
    public void setfirstName(String fname) { //

        this.firstName = fname;
    }
    public void setLastName(String lname) {
        this.lastName = lname;
    }
    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 100) {
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }
    public String getFullName() {
        if (lastName.isEmpty()) {
            this.lastName = firstName;
            return this.lastName;
        }
        if (firstName.isEmpty()) {
            this.firstName = lastName;
            return this.firstName;
        }
        return firstName + " " + lastName;
        }

    public static void main(String[] args) {
        Person person = new Person();
        person.setfirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setfirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    }

