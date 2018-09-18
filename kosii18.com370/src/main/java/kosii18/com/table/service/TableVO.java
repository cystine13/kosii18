package kosii18.com.table.service;

import org.apache.commons.lang3.builder.ToStringBuilder;

import egovframework.com.cmm.ComDefaultVO;

@SuppressWarnings("serial")
public class TableVO extends ComDefaultVO {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	private String applcntNm;
	private String tableId;
	private String useAt;

	public String getApplcntNm() {
		return applcntNm;
	}

	public void setApplcntNm(String applcntNm) {
		this.applcntNm = applcntNm;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public String getUseAt() {
		return useAt;
	}

	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

}
