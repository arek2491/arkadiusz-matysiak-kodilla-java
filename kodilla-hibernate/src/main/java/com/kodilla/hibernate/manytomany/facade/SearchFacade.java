package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private List<Employee> searchEmployeeList = new ArrayList<>();
    private List<Company> searchCompanyList = new ArrayList<>();

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Employee> getSearchEmployeeList() {
        return searchEmployeeList;
    }

    public List<Company> getSearchCompanyList() {
        return searchCompanyList;
    }

    public void searchEmployeeByStringFragment(String partOfEmployeeName) throws SearchingException {
        searchEmployeeList = employeeDao.retrieveEmployeeByStringFragment(partOfEmployeeName);
        if(searchEmployeeList.size() == 0) {
            LOGGER.error(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchingException(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        LOGGER.info("Search completed. Found Employees with " + "'" + partOfEmployeeName + "'" + ": " + searchEmployeeList );

    }

    public void searchCompanyByStringFragment(String partOfCompanyName) throws SearchingException {
        searchCompanyList = companyDao.retrieveCompanyByStringFragment(partOfCompanyName);
        if(searchCompanyList.size() == 0) {
            LOGGER.error(SearchingException.ERR_COMPANY_NOT_FOUND);
            throw new SearchingException(SearchingException.ERR_COMPANY_NOT_FOUND);
        }
        LOGGER.info("Search completed. Found Companies with " + partOfCompanyName + ": " + searchCompanyList);
    }
}
