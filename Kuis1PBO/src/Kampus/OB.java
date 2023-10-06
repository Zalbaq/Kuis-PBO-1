package Kampus;

public class OB extends Person {
    private String obId;

    public OB(String name, int age, String obId) {
        super(name, age);
        this.obId = obId;
    }

    public String getObId() {
        return obId;
    }

    public void setObId(String obId) {
        if (obId.length() == 5) {
            this.obId = obId;
        } else {
            System.out.println("Ob ID must be 5 characters long");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("OB ID: " + obId);
        System.out.println("---------------------------------");
    }
}
