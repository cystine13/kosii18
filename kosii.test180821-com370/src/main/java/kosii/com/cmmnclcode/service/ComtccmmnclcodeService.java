package kosii.com.cmmnclcode.service;

import java.util.List;
import kosii.com.cmmnclcode.service.ComtccmmnclcodeDefaultVO;
import kosii.com.cmmnclcode.service.ComtccmmnclcodeVO;

/**
 * @Class Name : ComtccmmnclcodeService.java
 * @Description : Comtccmmnclcode Business class
 * @Modification Information
 *
 * @author cystine13
 * @since 2018-08-21
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface ComtccmmnclcodeService {
	
	/**
	 * comtccmmnclcode을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception;
    
    /**
	 * comtccmmnclcode을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형
	 * @exception Exception
	 */
    void updateComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception;
    
    /**
	 * comtccmmnclcode을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception;
    
    /**
	 * comtccmmnclcode을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 조회한 comtccmmnclcode
	 * @exception Exception
	 */
    ComtccmmnclcodeVO selectComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception;
    
    /**
	 * comtccmmnclcode 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtccmmnclcode 목록
	 * @exception Exception
	 */
    List selectComtccmmnclcodeList(ComtccmmnclcodeDefaultVO searchVO) throws Exception;
    
    /**
	 * comtccmmnclcode 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtccmmnclcode 총 갯수
	 * @exception
	 */
    int selectComtccmmnclcodeListTotCnt(ComtccmmnclcodeDefaultVO searchVO);
    
}
