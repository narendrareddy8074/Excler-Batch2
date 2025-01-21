public class Employee {
    private int id;            
    private String firstName;
    private String lastName;
    private String address;

    
    public Employee() {
        this.id = 0;
        this.firstName = "Yashwanth";
        this.lastName = "Reddy";
        this.address = "Bhadrachalam";
    }

    
    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee(); 
        System.out.println("Full Name: " + emp1.getFullName());

        Employee emp2 = new Employee(101, "Yashwanth", "Vajrala", "123 Main St");
        System.out.println("Full Name: " + emp2.getFullName());
    }
}