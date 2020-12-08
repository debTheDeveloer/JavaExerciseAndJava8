package Java8Practice.Predicate;

public class SoftwareEngineer {
     String name;
     Integer salary; //Making it Integer instead of int because I want to compare on the basis of this paramter
     boolean isHavingTicket;

    public SoftwareEngineer(String name, Integer salary, boolean isHavingTicket) {
        this.name = name;
        this.salary = salary;
        this.isHavingTicket = isHavingTicket;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public boolean isHavingTicket() {
        return isHavingTicket;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", isHavingTicket=" + isHavingTicket +
                '}';
    }
}
