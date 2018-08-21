package kosii.com.cmmnclcode.service;

/**
 * @Class Name : ComtccmmnclcodeVO.java
 * @Description : Comtccmmnclcode VO class
 * @Modification Information
 *
 * @author cystine13
 * @since 2018-08-21
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class ComtccmmnclcodeVO extends ComtccmmnclcodeDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /** CL_CODE */
    private java.lang.String clCode;
    
    /** CL_CODE_NM */
    private java.lang.String clCodeNm;
    
    /** CL_CODE_DC */
    private java.lang.String clCodeDc;
    
    /** USE_AT */
    private java.lang.String useAt;
    
    /** FRST_REGIST_PNTTM */
    private java.util.Date frstRegistPnttm;
    
    /** FRST_REGISTER_ID */
    private java.lang.String frstRegisterId;
    
    /** LAST_UPDT_PNTTM */
    private java.util.Date lastUpdtPnttm;
    
    /** LAST_UPDUSR_ID */
    private java.lang.String lastUpdusrId;
    
    public java.lang.String getClCode() {
        return this.clCode;
    }
    
    public void setClCode(java.lang.String clCode) {
        this.clCode = clCode;
    }
    
    public java.lang.String getClCodeNm() {
        return this.clCodeNm;
    }
    
    public void setClCodeNm(java.lang.String clCodeNm) {
        this.clCodeNm = clCodeNm;
    }
    
    public java.lang.String getClCodeDc() {
        return this.clCodeDc;
    }
    
    public void setClCodeDc(java.lang.String clCodeDc) {
        this.clCodeDc = clCodeDc;
    }
    
    public java.lang.String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(java.lang.String useAt) {
        this.useAt = useAt;
    }
    
    public java.util.Date getFrstRegistPnttm() {
        return this.frstRegistPnttm;
    }
    
    public void setFrstRegistPnttm(java.util.Date frstRegistPnttm) {
        this.frstRegistPnttm = frstRegistPnttm;
    }
    
    public java.lang.String getFrstRegisterId() {
        return this.frstRegisterId;
    }
    
    public void setFrstRegisterId(java.lang.String frstRegisterId) {
        this.frstRegisterId = frstRegisterId;
    }
    
    public java.util.Date getLastUpdtPnttm() {
        return this.lastUpdtPnttm;
    }
    
    public void setLastUpdtPnttm(java.util.Date lastUpdtPnttm) {
        this.lastUpdtPnttm = lastUpdtPnttm;
    }
    
    public java.lang.String getLastUpdusrId() {
        return this.lastUpdusrId;
    }
    
    public void setLastUpdusrId(java.lang.String lastUpdusrId) {
        this.lastUpdusrId = lastUpdusrId;
    }
    
}
