package org.sapient.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddEmployee {
    static class IdComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getId() - o2.getId();
        }

    }
    private final List<Employee> list = new ArrayList<>();
    void addEmployee(Employee e){
        list.add(e);
    }
    Employee getEmployee(int id){
        int index = Collections.binarySearch(list, new Employee(id, null, null), new IdComparator());
        if(index < 0)
            return null;
        return list.get(index);
    }
}
