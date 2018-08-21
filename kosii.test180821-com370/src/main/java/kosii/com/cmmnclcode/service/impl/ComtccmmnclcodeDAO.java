package kosii.com.cmmnclcode.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import kosii.com.cmmnclcode.service.ComtccmmnclcodeDefaultVO;
import kosii.com.cmmnclcode.service.ComtccmmnclcodeVO;

/**
 * @Class Name : ComtccmmnclcodeDAO.java
 * @Description : Comtccmmnclcode DAO Class
 * @Modification Information
 *
 * @author cystine13
 * @since 2018-08-21
 * @version 1.0
 * @see
 * 
 * 		Copyright (C) All right reserved.
 */

@Repository("comtccmmnclcodeDAO")
public class ComtccmmnclcodeDAO extends EgovComAbstractDAO {
	// public class ComtccmmnclcodeDAO extends EgovAbstractDAO {

	/**
	 * comtccmmnclcode을 등록한다.
	 * 
	 * @param vo
	 *            - 등록할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	public String insertComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
		return (String) insert("comtccmmnclcodeDAO.insertComtccmmnclcode_S", vo);
	}

	/**
	 * comtccmmnclcode을 수정한다.
	 * 
	 * @param vo
	 *            - 수정할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형
	 * @exception Exception
	 */
	public void updateComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
		update("comtccmmnclcodeDAO.updateComtccmmnclcode_S", vo);
	}

	/**
	 * comtccmmnclcode을 삭제한다.
	 * 
	 * @param vo
	 *            - 삭제할 정보가 담긴 ComtccmmnclcodeVO
	 * @return void형
	 * @exception Exception
	 */
	public void deleteComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
		delete("comtccmmnclcodeDAO.deleteComtccmmnclcode_S", vo);
	}

	/**
	 * comtccmmnclcode을 조회한다.
	 * 
	 * @param vo
	 *            - 조회할 정보가 담긴 ComtccmmnclcodeVO
	 * @return 조회한 comtccmmnclcode
	 * @exception Exception
	 */
	public ComtccmmnclcodeVO selectComtccmmnclcode(ComtccmmnclcodeVO vo) throws Exception {
		return (ComtccmmnclcodeVO) select("comtccmmnclcodeDAO.selectComtccmmnclcode_S", vo);
	}

	/**
	 * comtccmmnclcode 목록을 조회한다.
	 * 
	 * @param searchMap
	 *            - 조회할 정보가 담긴 Map
	 * @return comtccmmnclcode 목록
	 * @exception Exception
	 */
	public List<?> selectComtccmmnclcodeList(ComtccmmnclcodeDefaultVO searchVO) throws Exception {
		return list("comtccmmnclcodeDAO.selectComtccmmnclcodeList_D", searchVO);
	}

	/**
	 * comtccmmnclcode 총 갯수를 조회한다. @param searchMap - 조회할 정보가 담긴 Map @return
	 * comtccmmnclcode 총 갯수 @exception
	 */
	public int selectComtccmmnclcodeListTotCnt(ComtccmmnclcodeDefaultVO searchVO) {
		return (Integer) select("comtccmmnclcodeDAO.selectComtccmmnclcodeListTotCnt_S", searchVO);
	}

}
