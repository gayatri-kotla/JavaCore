package core.io.serialMy;

import java.io.Serializable;

public class Emp implements Serializable {
    String name;
    transient int salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
