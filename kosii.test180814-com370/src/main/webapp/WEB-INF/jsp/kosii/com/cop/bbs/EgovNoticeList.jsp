<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="egovframework.com.cmm.service.EgovProperties" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="ImgUrl" value="/images/egovframework/com/cop/bbs/"/>
<%
 /**
  * @Class Name : EgovNoticeList.jsp
  * @Description : 게시물 목록화면
  * @Modification Information
  * @
  * @  수정일      수정자            수정내용
  * @ -------        --------    ---------------------------
  * @ 2009.03.19   이삼섭          최초 생성
  * @ 2011.11.11   이기하          익명게시판 검색시 작성자 제거
  * @ 2015.05.08   조정국          표시정보 클릭시 이동링크 제한 : bbsId가 없는 요청은 처리제한.
  *
  *  @author 공통서비스 개발팀 이삼섭
  *  @since 2009.03.19
  *  @version 1.0
  *  @see
  *
  */
%>

<section class="resume-section p-3 p-lg-5 d-flex flex-column" id="notice">

<c:if test="${anonymous == 'true'}"><c:set var="prefix" value="/anonymous"/></c:if>
<script type="text/javascript" src="<c:url value='/js/egovframework/com/cop/bbs/EgovBBSMng.js' />" ></script>
<c:choose>
<c:when test="${preview == 'true'}">
<script type="text/javascript">
<!--
	function press(event) {
	}

	function fn_egov_addNotice() {
	}

	function fn_egov_select_noticeList(pageNo) {
	}

	function fn_egov_inqire_notice(nttId, bbsId) {
	}
//-->
</script>
</c:when>
<c:otherwise>
<script type="text/javascript">
<!--
	function press(event) {
		if (event.keyCode==13) {
			fn_egov_select_noticeList('1');
		}
	}

	function fn_egov_addNotice() {
		document.frm.action = "<c:url value='/cop/bbs${prefix}/addBoardArticle.do'/>";
		document.frm.submit();
	}

	function fn_egov_select_noticeList(pageNo) {
		document.frm.pageIndex.value = pageNo;
		document.frm.action = "<c:url value='/cop/bbs${prefix}/selectBoardList.do'/>";
		document.frm.submit();
	}

	function fn_egov_inqire_notice(nttId, bbsId) {
		 if(bbsId == "") return false; //20150508
		 document.submitParam.nttId.value = nttId;
		 document.submitParam.bbsId.value = bbsId;
		 document.submitParam.action = "<c:url value='/cop/bbs${prefix}/selectBoardArticle.do'/>";
		 document.submitParam.submit();
	}
//-->
</script>
</c:otherwise>
</c:choose>
<%-- <title><c:out value="${brdMstrVO.bbsNm}"/></title> --%>

<div id="border">

<form name="frm" action ="<c:url value='/cop/bbs${prefix}/selectBoardList.do'/>" method="post">
<input type="hidden" name="bbsId" value="<c:out value='${boardVO.bbsId}'/>" />
<input type="hidden" name="nttId"  value="0" />
<input type="hidden" name="bbsTyCode" value="<c:out value='${brdMstrVO.bbsTyCode}'/>" />
<input type="hidden" name="bbsAttrbCode" value="<c:out value='${brdMstrVO.bbsAttrbCode}'/>" />
<input type="hidden" name="authFlag" value="<c:out value='${brdMstrVO.authFlag}'/>" />
<input name="pageIndex" type="hidden" value="<c:out value='${searchVO.pageIndex}'/>"/>
<table width="100%" cellpadding="8" class="table-search" border="0">
 <tr>
  <td width="40%" class="title_left">
  	<h1>
  		<img src="<c:url value='/images/egovframework/com/cmm/icon/tit_icon.gif' />" width="16" height="16" hspace="3" align="middle" alt="제목아이콘이미지">&nbsp;<c:out value="${brdMstrVO.bbsNm}"/>
  	</h1>
  </td>
  <td width="10%"class="title_left">
	<select name="searchCnd" class="select form-control" title="검색조건선택">
		   <option value="0" <c:if test="${searchVO.searchCnd == '0'}">selected="selected"</c:if> >제목</option>
		   <option value="1" <c:if test="${searchVO.searchCnd == '1'}">selected="selected"</c:if> >내용</option>
		   <c:if test="${anonymous != 'true'}">
		   <option value="2" <c:if test="${searchVO.searchCnd == '2'}">selected="selected"</c:if> >작성자</option>
		   </c:if>
	</select>
  </td>
  <td width="35%">
    <input class="form-control" name="searchWrd" type="text" value='<c:out value="${searchVO.searchWrd}"/>' maxlength="35" onkeypress="press(event);" title="검색어 입력">
  </td>
  <th width="10%">
   <table border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td class="button" nowrap><input type="submit" value="<spring:message code="button.inquire" />" onclick="fn_egov_select_noticeList('1'); return false;" class="btn btn-primary" ></td>
	  <td>&nbsp;&nbsp;&nbsp;</td>
      <c:if test="${brdMstrVO.authFlag == 'Y'}">
	      <td class="button" nowrap><a href="<c:url value='/cop/bbs${prefix}/addBoardArticle.do'/>" onClick="javascript:fn_egov_addNotice(); return false;" class="btn btn-danger"><spring:message code="button.create" /></a></td>
      </c:if>
    </tr>
   </table>
  </th>
 </tr>
 </table>
 </form>

<table class="table" summary="번호, 제목, 게시시작일, 게시종료일, 작성자, 작성일, 조회수   입니다">
 <thead>
  <tr>
    <!-- th class="title" width="3%" nowrap><input type="checkbox" name="all_check" class="check2"></th-->
    <th scope="col" class="listTitle" width="10%" nowrap>번호</th>
    <th scope="col" class="listTitle" width="44%" nowrap>제목</th>
   	<c:if test="${brdMstrVO.bbsAttrbCode == 'BBSA01'}">
	    <th scope="col" class="listTitle" width="20%" nowrap>게시시작일</th>
	    <th scope="col" class="listTitle" width="20%" nowrap>게시종료일</th>
   	</c:if>
   	<c:if test="${anonymous != 'true'}">
    	<th scope="col" class="listTitle" width="20%" nowrap>작성자</th>
    </c:if>
    <th scope="col" class="listTitle" width="15%" nowrap>작성일</th>
    <th scope="col" class="listTitle" width="8%" nowrap>조회수</th>
  </tr>
 </thead>

 <tbody>
 	<form name="submitParam" method="post">
	 	<input type="hidden" name="bbsId"  />
		<input type="hidden" name="nttId"  />
 	</form>
	 <c:forEach var="result" items="${resultList}" varStatus="status">
	  <tr>
	    <!--td class="lt_text3" nowrap><input type="checkbox" name="check1" class="check2"></td-->
	    <td class="listCenter" nowrap><c:out value="${(searchVO.pageIndex-1) * searchVO.pageSize + status.count}"/></td>
	    <td class="listLeft" nowrap>
	    	<c:choose>
	    		<c:when test="${result.isExpired=='Y' || result.useAt == 'N'}">
			    	<c:if test="${result.replyLc!=0}">
			    		<c:forEach begin="0" end="${result.replyLc}" step="1">
			    			&nbsp;
			    		</c:forEach>
			    		<img src="<c:url value='/images/egovframework/com/cmm/icon/reply_arrow.gif'/>" alt="reply arrow">
			    	</c:if>
	    			<c:out value="${result.nttSj}" />
	    		</c:when>
	    		<c:otherwise>
		    		<form name="subForm" method="post" action="<c:url value='/cop/bbs${prefix}/selectBoardArticle.do'/>">
						<input type="hidden" name="bbsTyCode" value="<c:out value='${brdMstrVO.bbsTyCode}'/>" />
						<input type="hidden" name="bbsAttrbCode" value="<c:out value='${brdMstrVO.bbsAttrbCode}'/>" />
						<input type="hidden" name="authFlag" value="<c:out value='${brdMstrVO.authFlag}'/>" />
						<input name="pageIndex" type="hidden" value="<c:out value='${searchVO.pageIndex}'/>"/>
				    	<c:if test="${result.replyLc!=0}">
				    		<c:forEach begin="0" end="${result.replyLc}" step="1">
				    			&nbsp;
				    		</c:forEach>
				    		<img src="<c:url value='/images/egovframework/com/cmm/icon/reply_arrow.gif'/>" alt="reply arrow">
				    	</c:if>
			    		<span class="link">
			    			<a href="#"  onclick="fn_egov_inqire_notice('${result.nttId}', '${result.bbsId }');"><c:out value="${result.nttSj}"/></a>
			    		</span>
			    	</form>
	    		</c:otherwise>
	    	</c:choose>
	    </td>
    	<c:if test="${brdMstrVO.bbsAttrbCode == 'BBSA01'}">
		    <td class="listCenter" nowrap><c:out value="${result.ntceBgnde}"/></td>
		    <td class="listCenter" nowrap><c:out value="${result.ntceEndde}"/></td>
    	</c:if>
    	<c:if test="${anonymous != 'true'}">
	    	<td class="listCenter" nowrap><c:out value="${result.frstRegisterNm}"/></td>
	    </c:if>
	    <td class="listCenter" nowrap><c:out value="${result.frstRegisterPnttm}"/></td>
	    <td class="listCenter" nowrap><c:out value="${result.inqireCo}"/></td>
	  </tr>
	 </c:forEach>
	 <c:if test="${fn:length(resultList) == 0}">
	  <tr>
    	<c:choose>
    		<c:when test="${brdMstrVO.bbsAttrbCode == 'BBSA01'}">
    			<td class="listCenter" colspan="7" ><spring:message code="common.nodata.msg" /></td>
    		</c:when>
    		<c:otherwise>
    			<c:choose>
    				<c:when test="${anonymous == 'true'}">
		    			<td class="listCenter" colspan="4" ><spring:message code="common.nodata.msg" /></td>
		    		</c:when>
		    		<c:otherwise>
		    			<td class="listCenter" colspan="5" ><spring:message code="common.nodata.msg" /></td>
		    		</c:otherwise>
		    	</c:choose>
    		</c:otherwise>
    	</c:choose>
 		  </tr>
	 </c:if>
 </tbody>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="10"></td>
  </tr>
</table>

<div align="center">
	<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="fn_egov_select_noticeList" />
</div>

</div>

</section>

