package kosii.com.cmmnclcode.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kosii.com.cmmnclcode.service.CmmnClcodeVo;

@Repository("CmmClCodeDAO")
public class CmmClCodeDAO extends EgovComAbstractDAO {

	public EgovMap selectCmmnClcode(CmmnClcodeVo vo) throws Exception {
		return (EgovMap) select("CmmnClcodeDAO.selectCmmnClcode", vo);
	}

}
