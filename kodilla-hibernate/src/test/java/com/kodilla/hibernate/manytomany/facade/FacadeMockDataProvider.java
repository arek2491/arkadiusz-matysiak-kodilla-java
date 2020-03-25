package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacadeMockDataProvider {
    private Employee johnSmith;
    private Employee stephanieClarckson;
    private Employee lindaKovalsky;
    private Company softwareMachine;
    private Company dataMaesters;
    private Company greyMatter;
    private int softwareMachineId;
    private int dataMaestersId;
    private int greyMatterId;
    private int johnSmithId;
    private int stephanieClarksonId;
    private int lindaKovalskyId;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

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

    public void cleanUpCompanyDao() throws NullPointerException {
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {

        }
    }

    public void cleanUpEmployeeDao() throws NullPointerException {
        try {
            employeeDao.deleteById(johnSmithId);
            employeeDao.deleteById(stephanieClarksonId);
            employeeDao.deleteById(lindaKovalskyId);
        } catch(Exception e) {

        }
    }
}
