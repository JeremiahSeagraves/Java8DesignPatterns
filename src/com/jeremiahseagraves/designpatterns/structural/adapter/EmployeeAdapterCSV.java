package com.jeremiahseagraves.designpatterns.structural.adapter;

/**
 * This is a specific adapter for instances of EmployeeCSV so they can be adapted to Employee legacy interface
 */
public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

}
