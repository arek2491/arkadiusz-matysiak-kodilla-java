package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyMockDataProvider {

    private Employee johnSmith;
    private Employee stephanieClarckson;
    private Employee lindaKovalsky;
    private Company softwareMachine;
    private Company dataMaesters;
    private Company greyMatter;
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;
    private int softwareMachineId;
    private int dataMaestersId;
    private int greyMatterId;
    private int johnSmithId;
    private int stephanieClarksonId;
    private int lindaKovalskyId;

    public void createEmployees() {
        johnSmith = new Employee("John", "Smith");
        stephanieClarckson = new Employee("Stephanie", "Clarckson");
        lindaKovalsky = new Employee("Linda", "Kovalsky");
    }

    public void createCompanies() {
        softwareMachine = new Company("Software Machine");
        dataMaesters = new Company("Data Maesters");
        greyMatter = new Company("Grey Matter");
    }

    public void addEmployeesToCompanies() {
        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);
    }


    public void addCompaniesToEmployees() {
        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
    }


    public void saveToCompanyDao() throws NullPointerException {
        try {
            companyDao.save(softwareMachine);
            softwareMachineId = softwareMachine.getId();
            companyDao.save(dataMaesters);
            dataMaestersId = dataMaesters.getId();
            companyDao.save(greyMatter);
            greyMatterId = greyMatter.getId();
        }
        catch(Exception e) {

        }
    }

    public void saveToEmployeeDao() throws NullPointerException {
        try {
            employeeDao.save(johnSmith);
            johnSmithId = johnSmith.getId();
            employeeDao.save(stephanieClarckson);
            stephanieClarksonId = stephanieClarckson.getId();
            employeeDao.save(lindaKovalsky);
            lindaKovalskyId = lindaKovalsky.getId();
        } catch (Exception e) {

        }
    }

    public void cleanUp() throws NullPointerException {
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {

        }
    }


}
