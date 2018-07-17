package kosii.com.cmmnclcode.service;

import egovframework.com.cmm.ComDefaultVO;

@SuppressWarnings("serial")
public class CmmnClCodeVO extends ComDefaultVO {
	private String clCode;
	private String clCodeNm;

	public String getClCode() {
		return clCode;
	}

	public void setClCode(String clCode) {
		this.clCode = clCode;
	}

	public String getClCodeNm() {
		return clCodeNm;
	}

	public void setClCodeNm(String clCodeNm) {
		this.clCodeNm = clCodeNm;
	}

}
