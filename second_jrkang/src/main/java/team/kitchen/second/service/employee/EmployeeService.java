package team.kitchen.second.service.employee;

import java.util.List;

import team.kitchen.second.bean.employee.EmployeeBean;

/**
 * 사원 관련 서비스
 * @version 1.0
 * @author jrkang
 */
public interface EmployeeService {
	
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
     * 사원 리스트 조회
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
