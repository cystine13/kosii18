package kosii.com.cmmnclcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import kosii.com.cmmnclcode.service.ComtccmmnclcodeService;
import kosii.com.cmmnclcode.service.ComtccmmnclcodeDefaultVO;
import kosii.com.cmmnclcode.service.ComtccmmnclcodeVO;
import kosii.com.cmmnclcode.service.impl.ComtccmmnclcodeDAO;

/**
 * @Class Name : ComtccmmnclcodeServiceImpl.java
 * @Description : Comtccmmnclcode Business Implement class
 * @Modification Information
 *
 * @author cystine13
 * @since 2018-08-21
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("comtccmmnclcodeService")
public class ComtccmmnclcodeServiceImpl extends EgovAbstractServiceImpl implements
        ComtccmmnclcodeService {
        
    private static final Logger LOGGER = LoggerFactory.getLogger(ComtccmmnclcodeServiceImpl.class);

    @Resource(name="comtccmmnclcodeDAO")
    private ComtccmmnclcodeDAO comtccmmnclcodeDAO;
    
    /** ID Generation */
    //@Resource(name="{egovComtccmmnclcodeIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * comtccmmnclcode을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
    	LOGGER.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	LOGGER.debug(vo.toString());
    	
    	comtccmmnclcodeDAO.insertComtccmmnclcode(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * comtccmmnclcode을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        comtccmmnclcodeDAO.updateComtccmmnclcode(vo);
    }

    /**
	 * comtccmmnclcode을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        comtccmmnclcodeDAO.deleteComtccmmnclcode(vo);
    }

    /**
	 * comtccmmnclcode을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 조회한 comtccmmnclcode
	 * @exception Exception
	 */
    public ComtccmmnclcodeVO selectComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
        ComtccmmnclcodeVO resultVO = comtccmmnclcodeDAO.selectComtccmmnclcode(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * comtccmmnclcode 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtccmmnclcode 목록
	 * @exception Exception
	 */
    public List<?> selectComtccmmnclcodeList(ComtccmmnclcodeDefaultVO searchVO) throws Exception {
        return comtccmmnclcodeDAO.selectComtccmmnclcodeList(searchVO);
    }

    /**
	 * comtccmmnclcode 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return comtccmmnclcode 총 갯수
	 * @exception
	 */
    public int selectComtccmmnclcodeListTotCnt(ComtccmmnclcodeDefaultVO searchVO) {
		return comtccmmnclcodeDAO.selectComtccmmnclcodeListTotCnt(searchVO);
	}
    
}
