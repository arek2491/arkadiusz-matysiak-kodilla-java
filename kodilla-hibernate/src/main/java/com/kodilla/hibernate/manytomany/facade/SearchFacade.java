package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> searchEmployeeByStringFragment(String partOfEmployeeName) throws SearchingException {
       List<Employee> searchList = employeeDao.retrieveEmployeeByStringFragment(partOfEmployeeName);
        if(searchList.size() == 0) {
            throw new SearchingException(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return searchList;
    }

    public List<Company> searchCompanyByStringFragment(String partOfCompanyName) throws SearchingException {
       List<Company> searchList = companyDao.retrieveCompanyByStringFragment(partOfCompanyName);
        if(searchList.size() == 0) {
            throw new SearchingException(SearchingException.ERR_COMPANY_NOT_FOUND);
        }
        return searchList;
    }
}
