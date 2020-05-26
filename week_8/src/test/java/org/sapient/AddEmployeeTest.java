package org.sapient;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddEmployeeTest {
    private AddEmployee obj;
    @BeforeEach
    void setUp() {
        obj = new AddEmployee();
    }

    @AfterEach
    void tearDown() {
        obj = null;
    }

    @Test
    void addEmployee() {
        obj.addEmployee(new Employee(1,"23","@3"));
    }

    @Test
    void should_return_Employee_getEmployee() {
        Employee employee = new Employee(12,"2323","2323");
        obj.addEmployee(employee);
        assertEquals(employee, obj.getEmployee(12));
    }

    @Test
    void should_return_null_getEmployee(){
        assertNull(obj.getEmployee(100));
    }
}