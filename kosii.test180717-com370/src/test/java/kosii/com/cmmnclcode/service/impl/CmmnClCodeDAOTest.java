package kosii.com.cmmnclcode.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kosii.com.cmmnclcode.service.CmmnClCodeVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:egovframework/spring/com/**/context-*.xml")
public class CmmnClCodeDAOTest {

	@Resource(name = "CmmnClCodeDAO")
	private CmmnClCodeDAO cmmnClCodeDAO;

	// @Test
	public void test() {
		// fail("Not yet implemented");

	}

	// @Test
	public void insertCmmnClCode() {
		CmmnClCodeVO vo = new CmmnClCodeVO();
		vo.setClCode("AAA");
		vo.setClCodeNm("에이에이에이");

		Object result = cmmnClCodeDAO.insertCmmnClCode(vo);

		System.out.println("result=" + result);
	}

	// @Test
	public void updateCmmnClCode() {
		CmmnClCodeVO vo = new CmmnClCodeVO();
		vo.setClCode("AAA");
		vo.setClCodeNm("에이에이에이 수정");

		int result = cmmnClCodeDAO.updateCmmnClCode(vo);

		System.out.println("result=" + result);
	}

	@Test
	public void deleteCmmnClCode() {
		CmmnClCodeVO vo = new CmmnClCodeVO();
		vo.setClCode("AAA");

		int result = cmmnClCodeDAO.deleteCmmnClCode(vo);

		System.out.println("result=" + result);
	}

}
