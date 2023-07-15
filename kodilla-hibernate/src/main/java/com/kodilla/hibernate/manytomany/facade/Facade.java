package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kodilla.hibernate.manytomany.*;

import java.util.List;

@Service
public class Facade {
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public Facade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }
    List<Employee> employeesSearch(String chars){
        return employeeDao.retrieveEmployeeWhoseNameContains(chars);
    }
    List<Company> companiesSearch(String chars){
        return companyDao.retrieveCompanyWhichNameContains(chars);
    }
}