import java.util.ArrayList;

public class Employee extends Person{
    private String position;
    private Enum department;
    private double Salary;
    private boolean isSalary;
    private ArrayList<TimeCard> timeCardList = new ArrayList<TimeCard>();
//    private ArrayList<Incident> incidents;
    private BenefitPackage benefitPackage;

    Employee(int id, String firstName,String lastName){
        super(id,firstName,lastName);
    }

    Employee(int id,String firstName,String lastName, String phoneNumber){
        super(id,firstName,lastName,phoneNumber);
    }

    Employee(int id,String firstName,String lastName, String phoneNumber, String address){
        super(id,firstName,lastName,phoneNumber,address);
    }




    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Enum getDepartment() {
        return department;
    }

    public void setDepartment(Enum department) {
        this.department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public boolean getIsSalary() {
        return isSalary;
    }

    public void setIsSalary(boolean salary) {
        isSalary = salary;
    }

    public ArrayList<TimeCard> getTimeCardList() {
        return timeCardList;
    }

    public void addTimeCard(TimeCard timeCard) {
        timeCardList.add(timeCard);
    }

//    public ArrayList<Incident> getIncidents() {
//        return incidents;
//    }
//
//    public void addIncident(Incident incident) {
//        this.incidents.add(incident);
//    }

    public BenefitPackage getBenefitPackage() {
        return benefitPackage;
    }

    public void setBenefitPackage(BenefitPackage benefitPackage) {
        this.benefitPackage = benefitPackage;
    }
}
