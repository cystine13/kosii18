package kosii.com.cmmnclcode.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import kosii.com.cmmnclcode.service.CmmnClCodeVO;

@Repository("CmmnClCodeDAO")
public class CmmnClCodeDAO extends EgovComAbstractDAO {

	public Object insertCmmnClCode(CmmnClCodeVO vo) {
		return insert("CmmnClCodeDAO.insertCmmnClCode", vo);
	}

	public int updateCmmnClCode(CmmnClCodeVO vo) {
		return update("CmmnClCodeDAO.updateCmmnClCode", vo);
	}

	public int deleteCmmnClCode(CmmnClCodeVO vo) {
		return delete("CmmnClCodeDAO.deleteCmmnClCode", vo);
	}

}
