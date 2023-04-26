package project.spring4.mvc.employee.DAO;

import project.spring4.mvc.employee.model.EmpVO;

import java.util.List;

public interface EmpDAO {
    int insertEmp(EmpVO emp);

    List<EmpVO> selectEmp();

    EmpDAO selectOneEmp(int empid);

    int updateEmp(EmpVO emp);

    int deleteEmp(int empid);

}
