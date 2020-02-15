package sample;

public class Employee {
    public String firstName;
    public String lastName;
    public boolean isActive1;
    @Override
    public String toString(){
        return this.firstName + " "+this.lastName + " "+isActive1;
    }
}
