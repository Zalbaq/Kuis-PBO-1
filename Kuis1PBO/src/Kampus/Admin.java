package Kampus;

public class Admin extends Person {
    private String idAdmin;

    
    public Admin(String name, int age, String idAdmin) {
        super(name, age);
        this.idAdmin = idAdmin;
    }

    public String getAdminId() {
        return idAdmin;
    }

    public void setAdminId(String idAdmin) {
        if (idAdmin.length() == 5) {
            this.idAdmin = idAdmin;
        } else {
            System.out.println("Employee ID must be 5 characters long");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + idAdmin);
        System.out.println("---------------------------------");
    }
}
