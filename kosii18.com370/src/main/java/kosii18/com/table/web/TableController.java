package kosii18.com.table.web;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import kosii18.com.table.service.TableVO;
import kosii18.com.table.service.impl.TableDAO;

@Controller
public class TableController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TableController.class);

	@Resource(name = "TableDAO")
	private TableDAO tableDAO;

	@RequestMapping("/table/selectTableList.do")
	public String selectList(TableVO vo, ModelMap model) throws Exception {
		LOGGER.debug("목록");
		vo.setUseAt("Y");
		// vo.setTableNm("tb1");
		List<EgovMap> results = tableDAO.selectlist(vo);
		model.addAttribute("results", results);

		return "kosii18/com/table/selectTableList";
	}

	@RequestMapping("/table/insertTableForm.do")
	public String insertForm(TableVO vo, ModelMap model) {
		LOGGER.debug("등록폼");

		LOGGER.debug("getTableId=" + vo.getTableId());
		LOGGER.debug("getMulti=" + vo.getMulti());

		if ("update".equals(vo.getMulti())) {
			EgovMap select = tableDAO.select(vo);
			model.addAttribute("select", select);
		} else {

		}

		return "kosii18/com/table/insertTableForm";
	}

	@RequestMapping("/table/insertTable.do")
	public String insert(TableVO vo, ModelMap model) throws Exception {
		LOGGER.debug("등록");
		LOGGER.debug("vo=" + vo);
		LOGGER.debug("applcntNm=" + vo.getApplcntNm());
		System.out.println("vo=" + vo);
		System.out.println("applcntNm=" + vo.getApplcntNm());
		tableDAO.insert(vo);
		return "kosii18/com/table/insertTable";
	}

	@RequestMapping("/table/updateTable.do")
	public String update(TableVO vo, ModelMap model) throws Exception {
		LOGGER.debug("수정");
		LOGGER.debug("vo=" + vo);
		LOGGER.debug("applcntNm=" + vo.getApplcntNm());
		System.out.println("vo=" + vo);
		System.out.println("applcntNm=" + vo.getApplcntNm());
		int update = tableDAO.update(vo);
		model.addAttribute("update", update);
		return "kosii18/com/table/updateTable";
	}

	@RequestMapping("/table/deleteTable.do")
	public String delete(TableVO vo, ModelMap model) throws Exception {
		LOGGER.debug("삭제");
		LOGGER.debug("vo=" + vo);
		LOGGER.debug("applcntNm=" + vo.getApplcntNm());
		System.out.println("vo=" + vo);
		System.out.println("applcntNm=" + vo.getApplcntNm());
		int delete = tableDAO.delete(vo);
		model.addAttribute("delete", delete);
		return "kosii18/com/table/deleteTable";
	}

	@RequestMapping("/table/delete2Table.do")
	public String delete2(TableVO vo, ModelMap model) throws Exception {
		LOGGER.debug("삭제");
		LOGGER.debug("vo=" + vo);
		LOGGER.debug("applcntNm=" + vo.getApplcntNm());
		System.out.println("vo=" + vo);
		System.out.println("applcntNm=" + vo.getApplcntNm());
		int delete = tableDAO.delete2(vo);
		model.addAttribute("delete", delete);
		return "kosii18/com/table/deleteTable";
	}

}
