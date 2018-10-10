package kosii18.com.table.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import kosii18.com.table.service.TableVO;

@Repository("TableDAO")
public class TableDAO extends EgovComAbstractDAO {

	public Object insert(TableVO vo) throws Exception {
		return insert("TableDAO.insert", vo);
	}

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectlist(TableVO vo) throws Exception {
		return (List<EgovMap>) list("TableDAO.selectlist", vo);
	}

}