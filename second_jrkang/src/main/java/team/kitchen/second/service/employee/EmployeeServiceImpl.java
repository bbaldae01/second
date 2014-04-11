package team.kitchen.second.service.employee;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.kitchen.second.bean.employee.EmployeeBean;
import team.kitchen.second.mapper.employee.EmployeeMapper;

/**
 * 사원 관련 서비스
 * @version 1.0
 * @author jrkang
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
    /**
     * 사원 조회
     * @param EmployeeBean EmployeeBean
     * @return EmployeeBean
     * @throws Exception
     * @author jrkang             
     * @date 2014-04-09
     */
	@Override
	public EmployeeBean selectEmployee(EmployeeBean EmployeeBean) throws Exception {
		logger.debug("EmployeeServiceImpl > selectEmployee Call");
		EmployeeBean resultBean = employeeMapper.selectEmployee(EmployeeBean);
		return resultBean;
	}

    /**
     * 사원 리스트 조회
     * @param EmployeeBean EmployeeBean
     * @return List<EmployeeBean>
     * @throws Exception
     * @author jrkang             
     * @date 2014-04-09
     */
	@Override
	public List<EmployeeBean> selectEmployeeList(EmployeeBean EmployeeBean) throws Exception {
		logger.debug("EmployeeServiceImpl > selectEmployeeList Call");
		List<EmployeeBean> resultList = employeeMapper.selectEmployeeList(EmployeeBean);
		return resultList;
	}
	
    /**
     * 사원 추가
     * @param EmployeeBean EmployeeBean
     * @return Integer
     * @throws Exception
     * @author jrkang             
     * @date 2014-04-09
     */
	public Integer addEmployee(EmployeeBean EmployeeBean) throws Exception {
		logger.debug("EmployeeServiceImpl > addEmployee Call");
		return employeeMapper.addEmployee(EmployeeBean);
	}
    
	/**
     * 사원 삭제
     * @param EmployeeBean EmployeeBean
     * @return Integer
     * @throws Exception
     * @author jrkang             
     * @date 2014-04-09
     */
	public Integer deleteEmployee(EmployeeBean EmployeeBean) throws Exception {
		logger.debug("EmployeeServiceImpl > deleteEmployee Call");
		return employeeMapper.deleteEmployee(EmployeeBean);
	}
	
}
