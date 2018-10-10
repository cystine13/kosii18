package kosii18.com.table2.web;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import kosii18.com.table.service.TableVO;
import kosii18.com.table.service.impl.TableDAO;

@Controller
public class Table2Controller {

	private static final Logger LOGGER = LoggerFactory.getLogger(Table2Controller.class);

	@Resource(name = "TableDAO")
	private TableDAO tableDAO;

	@RequestMapping("/table2/selectTable2List.do")
	public String selectList(ModelMap model) {
		LOGGER.debug("목록");
		return "kosii18/com/table2/selectTable2List";
	}

	@RequestMapping("/table2/insertTable2Form.do")
	public String insertForm(ModelMap model) {
		LOGGER.debug("등록폼");
		return "kosii18/com/table2/insertTable2Form";
	}

	@RequestMapping("/table2/insertTable2.do")
	public String insert(TableVO vo, ModelMap model) throws Exception {
		LOGGER.debug("등록");
		LOGGER.debug("vo=" + vo);
		LOGGER.debug("applcntNm=" + vo.getApplcntNm());
		System.out.println("vo=" + vo);
		System.out.println("applcntNm=" + vo.getApplcntNm());
		tableDAO.insert(vo);
		return "kosii18/com/table2/insertTable2";
	}

}
