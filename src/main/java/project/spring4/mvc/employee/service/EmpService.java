package project.spring4.mvc.employee.service;

import project.spring4.mvc.employee.DAO.EmpDAO;

import java.util.List;

public interface EmpService {

    void newEmploy();
    List<EmpDAO> readEmp();
    void readOneEmp();
    void modifyEmp();
    void removeEmp();


}
