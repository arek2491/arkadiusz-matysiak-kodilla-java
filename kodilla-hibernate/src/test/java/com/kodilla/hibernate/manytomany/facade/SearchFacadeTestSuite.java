package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    SearchFacade searchFacade;
    @Autowired
    FacadeMockDataProvider facadeMockDataProvider;

    @Test
    public void searchingEmployeeByStringFragmentTest() throws SearchingException {
        facadeMockDataProvider.createEmployees();
        facadeMockDataProvider.saveToEmployeeDao();
        searchFacade.searchEmployeeByStringFragment("sky");
        List<Employee> exampleList = searchFacade.getSearchEmployeeList();

        Assert.assertEquals(1, exampleList.size());
        Assert.assertEquals("Kovalsky", exampleList.get(0).getLastname());

        facadeMockDataProvider.cleanUpEmployeeDao();
        exampleList.removeAll(exampleList);
    }

    @Test
    public void searchingCompanyByStringFragmentTest() throws SearchingException  {

        facadeMockDataProvider.createCompanies();
        facadeMockDataProvider.saveToCompanyDao();
        searchFacade.searchCompanyByStringFragment("war");
        List<Company> exampleList = searchFacade.getSearchCompanyList();

        Assert.assertEquals(1, exampleList.size());
        Assert.assertEquals("Software Machine", exampleList.get(0).getName());

        facadeMockDataProvider.cleanUpCompanyDao();
        exampleList.removeAll(exampleList);
    }
}
