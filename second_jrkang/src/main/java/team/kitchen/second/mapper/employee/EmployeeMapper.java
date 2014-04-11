package team.kitchen.second.mapper.employee;

import java.util.List;

import org.springframework.stereotype.Repository;

import team.kitchen.second.bean.employee.EmployeeBean;

/**
 * 사원 관련 매퍼
 * @version 1.0
 * @author jrkang
 */
@Repository
public interface EmployeeMapper {

    /**
     * 사원 조회
     * @param EmployeeBean employeeBean
     * @return EmployeeBean
     * @throws Exception
     * @author jrkang             
     * @date 2014-04-09
     */
	public EmployeeBean selectEmployee(EmployeeBean employeeBean) throws Exception;
	
    /**
     * 사원 조회
     * @param EmployeeBean employeeBean
     * @return List<EmployeeBean>
     * @throws Exception
     * @author jrkang             
     * @date 2014-04-09
     */
	public List<EmployeeBean> selectEmployeeList(EmployeeBean employeeBean) throws Exception;
	
    /**
     * 사원 추가
     * @param EmployeeBean employeeBean
     * @return Integer
     * @throws Exception
     * @author jrkang             
     * @date 2014-04-09
     */
	public Integer addEmployee(EmployeeBean employeeBean) throws Exception;
    
	/**
     * 사원 삭제
     * @param EmployeeBean employeeBean
     * @return Integer
     * @throws Exception
     * @author jrkang             
     * @date 2014-04-09
     */
	public Integer deleteEmployee(EmployeeBean employeeBean) throws Exception;
	
}
