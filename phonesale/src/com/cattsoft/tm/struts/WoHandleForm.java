/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.cattsoft.tm.struts;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

import com.cattsoft.gh.vo.SoFaultExtMVO;
import com.cattsoft.gh.vo.SoFaultMVO;
import com.cattsoft.pub.exception.AppException;
import com.cattsoft.pub.exception.SysException;
import com.cattsoft.pub.util.DateUtil;
import com.cattsoft.pub.util.StringArrayUtil;
import com.cattsoft.sp.vo.SoAddrMVO;
import com.cattsoft.sp.vo.SoAttachSVO;
import com.cattsoft.sp.vo.SoCustMVO;
import com.cattsoft.sp.vo.SoSVO;
import com.cattsoft.tm.vo.AdvQueryMVO;
import com.cattsoft.tm.vo.SimpleQueryMVO;
import com.cattsoft.tm.vo.WoExtInfoMVO;
import com.cattsoft.tm.vo.WoMVO;
import com.cattsoft.tm.vo.WoSVO;

/**
 * 作者： 白小亮 公司： CATTSoft 时间： 2007.5.17 类/接口描述：高级查询条件实体类/简单查询条件实体类
 */
public class WoHandleForm extends ActionForm {
	private static final long serialVersionUID = -8774167762860412374L; 
	private String mainWoStr  ;
	//高级查询条件vo
	private AdvQueryMVO advQueryVo = new AdvQueryMVO();
	private WoMVO woMVO = new WoMVO();
	private SoSVO soSVO = new SoSVO();
	private SoAddrMVO soAddrMVO = new SoAddrMVO();
	private SoCustMVO soCustMVO = new SoCustMVO();
	private List soResList = new ArrayList();
	private SoFaultMVO soFaultMVO = new SoFaultMVO();
	private List faultReasonList;
	private List failReasonList;
	private List staffList;
	private String remark;
	private List repairWayList;
	private String repairWay;
	private String faultReasonId;
	private List workAreaList;
	private String staffId;
	private List resPrptyList;
	private String specPrptyIdAry[];
	private String specPrptyValueAry[];
	//简单查询条件vo
	private SimpleQueryMVO simpleQueryVo = new SimpleQueryMVO();
	//附件上传
	private SoAttachSVO woAttachSVO = new SoAttachSVO();
	//工单SVO
	private WoSVO woSVo = new WoSVO();
	//tab页标识
	private String pageCode;
	private String pageCodeId;//Tab Id
	
	
	//查询类型：0简单查询；1高级查询
	private int queryType;
	//回单类型 ：失败回单；正常回单
	private String returnType;

	public static final int SIMPLE_QUERY = 0;

	public static final int ADVANCE_QUERY = 1;
	
	//快捷查询 add by zhaodan 2009-7-29
	public static final int QUICK_QUERY = 2;
	//本地网下拉列表
	private List localNetList;
	//服务区下拉列表
	private List areaList;
	//施工方式下来列表
	private List workModeList;
	//订单标识
	private String soNbr;
	private String soSeq;
	//异常原因下拉列表
	private List failReasonIdList;
	//超期原因下拉列表
	private List overtimeIdList;
	//工区对应员工下拉列表
	private List workAreaStaffList;
	//维护区对应员工下拉列表
	private List maintAreaStaffList;
	//回单方式 retByCurrent（取当前session用户）、retByWorkAreaStaff(指定的工区用户)、retByMaintAreaStaff(指定的维护区用户)
	private String retBy;
	//指定的工区对应员工
	private String workAreaStaffId;
	//指定的维护区对应员工
	private String maintAreaStaffId;
	
	private String canChangeWoStaff;
	
	private String stepWoStaffConfig;
	//备注
	private String remarks;
	//异常原因标识
	private String failReasonId;
	//超期原因标识
	private String overtimeId;
	//排序列下拉列表
	private List tabList;
	//排序列表取值
	private String culmName;

	private List staffMembetList;

	private String staffName;

	// 预约时间
	private Date bookDate;
	
	//本地网
	private String localNetId ;
	
	//服务区
	private String areaId;

	// 工区列表
	private List workAreas;

	// 当前工区的值
	private String workAreaId;
	
	// 当前工区的值
	private String workAreaName;
	
	//选中的工单数组
	private String woNbrAry[]; 
	
	private String soNbrStr;
	
	private String staffStr;
	//选中的资源数组
	private String resAry[];
	
	//可选择的资源环节数组
	private String stepAry[];
 
	private List maintAreaList;
	
	private String maintAreaId;
	
	private String servDeptId;
	
	// 当前页码
	private String pageNo;
	
	
	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getServDeptId() {
		return servDeptId;
	}

	public void setServDeptId(String servDeptId) {
		this.servDeptId = servDeptId;
	}

	public String getServDeptName() {
		return servDeptName;
	}

	public void setServDeptName(String servDeptName) {
		this.servDeptName = servDeptName;
	}

	private String servDeptName;
	
	private List servDeptList;
	
	public List getServDeptList() {
		return servDeptList;
	}

	public void setServDeptList(List servDeptList) {
		this.servDeptList = servDeptList;
	}
	
	private String woNbr  ;
	
	private String maintAreaName;
	
	private String workAreaTypeId;
	
	private String workAreaType;
	
	//是否显示附件上传
	private String soAttachFlag;
	
	//是否显示抄送按钮
	private String copyToButtonFlag;
 
	//可选的关联工单
	private String selectWoAry[];
	//已选的关联工单
	private String rltdWoNbrAry[];
	
	private String noMaintAreaWonbr;
	
	String notifyType = null;

	String notifyConfig = null;
	
	List notifyTypeList = null;

	List notifyConfigList = null;
	
	private String procNodeId;//异常回退人工指定结束节点
	
	private String routerMsg;//人工路由信息
	
	private String woDesignId;
	
	private String designRemarks;//资源连接录入信息
	
	//不允许正常回单的列表 add by zhaodan 2009-8-19
	private List woNotAllowList;
	
	//允许正常回单的列表 add by zhaodan 2009-8-20
	private List woAllowList;
	private String woAry[];
	
	private String delayFixCancelDate;  
	
	// add by Baixd 11/06/09  start...
	private SoFaultExtMVO soFaultExtMVO = new SoFaultExtMVO();	//障碍处理信息
	
	private String handleRate;	
	
	private Date workComplDate;	//施工完成时间
	
	private WoExtInfoMVO woExtInfoMVO = new WoExtInfoMVO(); //施工处理扩展信息
	
	private String sysConfigResChangeFlag; //资源变更标志
	
	private List metricUnitList; //时长单位列表
	
	private String filterWoFlag;
	
	private FormFile formfile;
	
	// add by liangyx
	private String woStaffName;
	private String processDesc;
	private String reworkDate;

	public String getWoStaffName() {
		return woStaffName;
	}

	public void setWoStaffName(String woStaffName) {
		this.woStaffName = woStaffName;
	}

	public String getProcessDesc() {
		return processDesc;
	}

	public void setProcessDesc(String processDesc) {
		this.processDesc = processDesc;
	}

	public String getReworkDate() {
		return reworkDate;
	}

	public void setReworkDate(String reworkDate) {
		this.reworkDate = reworkDate;
	}

	public FormFile getFormfile() {
		return formfile;
	}

	public void setFormfile(FormFile formfile) {
		this.formfile = formfile;
	}
		
	public String getHandleRate() {
		return handleRate;
	}

	public void setHandleRate(String handleRate) {
		this.handleRate = handleRate;
	}

	public SoFaultExtMVO getSoFaultExtMVO() {
		return soFaultExtMVO;
	}

	public void setSoFaultExtMVO(SoFaultExtMVO soFaultExtMVO) {
		this.soFaultExtMVO = soFaultExtMVO;
	}
	
	public String[] getWoAry() {
		return woAry;
	}

	public void setWoAry(String[] woAry) {
		this.woAry = woAry;
	}

	public String getProcNodeId() {
		return procNodeId;
	}

	public void setProcNodeId(String procNodeId) {
		this.procNodeId = procNodeId;
	}

	public String[] getStepAry() {
		return stepAry;
	}

	public void setStepAry(String[] stepAry) {
		this.stepAry = stepAry;
	}

	public String getWorkAreaId() {
		return workAreaId;
	}

	public void setWorkAreaId(String workAreaId) {
		this.workAreaId = workAreaId;
	}

	public List getWorkAreas() {
		return workAreas;
	}

	public void setWorkAreas(List workAreas) {
		this.workAreas = workAreas;
	}

	public String getbookDateStr() {
		return DateUtil.dateTime2Str(this.bookDate);
	}

	public void setbookDateStr(String bookDate) throws AppException, SysException {

		this.bookDate = DateUtil.str2DateTime(bookDate);
	}

	public void setbookDate(String bookDate) throws AppException, SysException {

		this.bookDate = DateUtil.str2DateTime(bookDate);
	}
	
	public String getWorkComplDateStr() {
		return DateUtil.dateTime2Str(this.workComplDate);
	}

	public void setWorkComplDateStr(String workComplDate) throws AppException, SysException {

		this.workComplDate = DateUtil.str2DateTime(workComplDate);
	}

	/**
	 * 设置表单条件默认值
	 * 
	 * @throws AppException
	 */
	public void setDefaultStsDate() throws AppException {
		Date now = DateUtil.getDBDate();
		Date startTime = DateUtil.getStartDateTime(now);
		this.getSimpleQueryVo().setStartRunStsDate(startTime);
		this.getSimpleQueryVo().setEndRunStsDate(now);
	}

	public WoSVO getWoSVo() {
		return woSVo;
	}

	public void setWoSVo(WoSVO woSVo) {
		this.woSVo = woSVo;
	}

	public AdvQueryMVO getAdvQueryVo() {
		return advQueryVo;
	}

	public void setAdvQueryVo(AdvQueryMVO advQueryVo) {
		this.advQueryVo = advQueryVo;
	}

	public String getPageCode() {
		return pageCode;
	}

	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}

	public int getQueryType() {
		return queryType;
	}

	public void setQueryType(int queryType) {
		this.queryType = queryType;
	}

	public SimpleQueryMVO getSimpleQueryVo() {
		return simpleQueryVo;
	}

	public void setSimpleQueryVo(SimpleQueryMVO simpleQueryVo) {
		this.simpleQueryVo = simpleQueryVo;
	}

	public List getAreaList() {
		return areaList;
	}

	public void setAreaList(List areaList) {
		this.areaList = areaList;
	}

	public List getLocalNetList() {
		return localNetList;
	}

	public void setLocalNetList(List localNetList) {
		this.localNetList = localNetList;
	}

	public String getFailReasonId() {
		return failReasonId;
	}

	public void setFailReasonId(String failReasonId) {
		this.failReasonId = failReasonId;
	}

	public List getFailReasonIdList() {
		return failReasonIdList;
	}

	public void setFailReasonIdList(List failReasonIdList) {
		this.failReasonIdList = failReasonIdList;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSoNbr() {
		return soNbr;
	}

	public void setSoNbr(String soNbr) {
		this.soNbr = soNbr;
	}

	public List getTabList() {
		return tabList;
	}

	public void setTabList(List tabList) {
		this.tabList = tabList;
	}

	public String getCulmName() {
		return culmName;
	}

	public void setCulmName(String culmName) {
		this.culmName = culmName;
	}

	public List getStaffMembetList() {
		return staffMembetList;
	}

	public void setStaffMembetList(List staffMembetList) {
		this.staffMembetList = staffMembetList;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Date getbookDate() {
		return bookDate;
	}

	public List getWorkModeList() {
		return workModeList;
	}

	public void setWorkModeList(List workModeList) {
		this.workModeList = workModeList;
	}

	public String[] getWoNbrAry() {
		return woNbrAry;
	}

	public void setWoNbrAry(String[] woNbrAry) {
		this.woNbrAry = woNbrAry;
	}
	
	public String getWoNbrAryStr() {
		return StringArrayUtil.toString(woNbrAry);
	}

	public void setWoNbrAryStr(String woNbrAryStr) {
		this.woNbrAry = StringArrayUtil.fetchStr(woNbrAryStr,",");
	}

	public String getSoNbrStr() {
		return soNbrStr;
	}

	public void setSoNbrStr(String soNbrStr) {
		this.soNbrStr = soNbrStr;
	}
	public String getStaffStr() {
		return staffStr;
	}

	public void setStaffStr(String staffStr) {
		this.staffStr = staffStr;
	}

	public String getOvertimeId() {
		return overtimeId;
	}

	public void setOvertimeId(String overtimeId) {
		this.overtimeId = overtimeId;
	}

	public List getOvertimeIdList() {
		return overtimeIdList;
	}

	public void setOvertimeIdList(List overtimeIdList) {
		this.overtimeIdList = overtimeIdList;
	}

	public List getWorkAreaStaffList() {
		return workAreaStaffList;
	}

	public void setWorkAreaStaffList(List workAreaStaffList) {
		this.workAreaStaffList = workAreaStaffList;
	}

	public List getMaintAreaStaffList() {
		return maintAreaStaffList;
	}

	public void setMaintAreaStaffList(List maintAreaStaffList) {
		this.maintAreaStaffList = maintAreaStaffList;
	}

	public String getRetBy() {
		return retBy;
	}

	public void setRetBy(String retBy) {
		this.retBy = retBy;
	}

	public String getWorkAreaStaffId() {
		return workAreaStaffId;
	}

	public void setWorkAreaStaffId(String workAreaStaffId) {
		this.workAreaStaffId = workAreaStaffId;
	}

	public String getMaintAreaStaffId() {
		return maintAreaStaffId;
	}

	public void setMaintAreaStaffId(String maintAreaStaffId) {
		this.maintAreaStaffId = maintAreaStaffId;
	}

	public String getCanChangeWoStaff() {
		return canChangeWoStaff;
	}

	public void setCanChangeWoStaff(String canChangeWoStaff) {
		this.canChangeWoStaff = canChangeWoStaff;
	}

	public String getStepWoStaffConfig() {
		return stepWoStaffConfig;
	}

	public void setStepWoStaffConfig(String stepWoStaffConfig) {
		this.stepWoStaffConfig = stepWoStaffConfig;
	}

	public String[] getResAry() {
		return resAry;
	}

	public void setResAry(String[] resAry) {
		this.resAry = resAry;
	}
 
	public List getMaintAreaList() {
		return maintAreaList;
	}

	public void setMaintAreaList(List maintAreaList) {
		this.maintAreaList = maintAreaList;
	}

	public String getMaintAreaId() {
		return maintAreaId;
	}

	public void setMaintAreaId(String maintAreaId) {
		this.maintAreaId = maintAreaId;
	}

	public String getWoNbr() {
		return woNbr;
	}

	public void setWoNbr(String woNbr) {
		this.woNbr = woNbr;
	}

	public String getMaintAreaName() {
		return maintAreaName;
	}

	public void setMaintAreaName(String maintAreaName) {
		this.maintAreaName = maintAreaName;
	}

	public String getWorkAreaTypeId() {
		return workAreaTypeId;
	}

	public void setWorkAreaTypeId(String workAreaTypeId) {
		this.workAreaTypeId = workAreaTypeId;
	}

	public String getWorkAreaType() {
		return workAreaType;
	}

	public void setWorkAreaType(String workAreaType) {
		this.workAreaType = workAreaType;
	}
 
	public String[] getRltdWoNbrAry() {
		return rltdWoNbrAry;
	}

	public void setRltdWoNbrAry(String[] rltdWoNbrAry) {
		this.rltdWoNbrAry = rltdWoNbrAry;
	}

	public String[] getSelectWoAry() {
		return selectWoAry;
	}

	public void setSelectWoAry(String[] selectWoAry) {
		this.selectWoAry = selectWoAry;
	}

	public String getNoMaintAreaWonbr() {
		return noMaintAreaWonbr;
	}

	public void setNoMaintAreaWonbr(String noMaintAreaWonbr) {
		this.noMaintAreaWonbr = noMaintAreaWonbr;
	}

	public SoAttachSVO getWoAttachSVO() {
		return woAttachSVO;
	}

	public void setWoAttachSVO(SoAttachSVO woAttachSVO) {
		this.woAttachSVO = woAttachSVO;
	}

	public String getWorkAreaName() {
		return workAreaName;
	}

	public void setWorkAreaName(String workAreaName) {
		this.workAreaName = workAreaName;
	}

	public String getSoAttachFlag() {
		return soAttachFlag;
	}

	public void setSoAttachFlag(String soAttachFlag) {
		this.soAttachFlag = soAttachFlag;
	}

	public String getCopyToButtonFlag() {
		return copyToButtonFlag;
	}

	public void setCopyToButtonFlag(String copyToButtonFlag) {
		this.copyToButtonFlag = copyToButtonFlag;
	}

	public String getSoSeq() {
		return soSeq;
	}

	public void setSoSeq(String soSeq) {
		this.soSeq = soSeq;
	}

	public String getMainWoStr() {
		return mainWoStr;
	}

	public void setMainWoStr(String mainWoStr) {
		this.mainWoStr = mainWoStr;
	}

	public String getNotifyType() {
		return notifyType;
	}

	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getNotifyConfig() {
		return notifyConfig;
	}

	public void setNotifyConfig(String notifyConfig) {
		this.notifyConfig = notifyConfig;
	}

	public List getNotifyTypeList() {
		return notifyTypeList;
	}

	public void setNotifyTypeList(List notifyTypeList) {
		this.notifyTypeList = notifyTypeList;
	}

	public List getNotifyConfigList() {
		return notifyConfigList;
	}

	public void setNotifyConfigList(List notifyConfigList) {
		this.notifyConfigList = notifyConfigList;
	}

	public String getRouterMsg() {
		return routerMsg;
	}

	public void setRouterMsg(String routerMsg) {
		this.routerMsg = routerMsg;
	}

	public String getWoDesignId() {
		return woDesignId;
	}

	public void setWoDesignId(String woDesignId) {
		this.woDesignId = woDesignId;
	}

	public String getDesignRemarks() {
		return designRemarks;
	}

	public void setDesignRemarks(String designRemarks) {
		this.designRemarks = designRemarks;
	}
 
	public List getWoNotAllowList() {
		return woNotAllowList;
	}

	public void setWoNotAllowList(List woNotAllowList) {
		this.woNotAllowList = woNotAllowList;
	}

	public List getWoAllowList() {
		return woAllowList;
	}

	public void setWoAllowList(List woAllowList) {
		this.woAllowList = woAllowList;
	}

	public String getDelayFixCancelDate() {
		return delayFixCancelDate;
	}

	public void setDelayFixCancelDate(String delayFixCancelDate) {
		this.delayFixCancelDate = delayFixCancelDate;
	}

	public String getPageCodeId() {
		return pageCodeId;
	}

	public void setPageCodeId(String pageCodeId) {
		this.pageCodeId = pageCodeId;
	}

	public WoExtInfoMVO getWoExtInfoMVO() {
		return woExtInfoMVO;
	}

	public void setWoExtInfoMVO(WoExtInfoMVO woExtInfoMVO) {
		this.woExtInfoMVO = woExtInfoMVO;
	}

	public String getSysConfigResChangeFlag() {
		return sysConfigResChangeFlag;
	}

	public void setSysConfigResChangeFlag(String sysConfigResChangeFlag) {
		this.sysConfigResChangeFlag = sysConfigResChangeFlag;
	}

	public List getMetricUnitList() {
		return metricUnitList;
	}

	public void setMetricUnitList(List metricUnitList) {
		this.metricUnitList = metricUnitList;
	}

	public String getFilterWoFlag() {
		return filterWoFlag;
	}

	public void setFilterWoFlag(String filterWoFlag) {
		this.filterWoFlag = filterWoFlag;
	}

	public String getLocalNetId() {
		return localNetId;
	}

	public void setLocalNetId(String localNetId) {
		this.localNetId = localNetId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public WoMVO getWoMVO() {
		return woMVO;
	}

	public void setWoMVO(WoMVO woMVO) {
		this.woMVO = woMVO;
	}

	public SoSVO getSoSVO() {
		return soSVO;
	}

	public void setSoSVO(SoSVO soSVO) {
		this.soSVO = soSVO;
	}

	public SoAddrMVO getSoAddrMVO() {
		return soAddrMVO;
	}

	public void setSoAddrMVO(SoAddrMVO soAddrMVO) {
		this.soAddrMVO = soAddrMVO;
	}

	public SoCustMVO getSoCustMVO() {
		return soCustMVO;
	}

	public void setSoCustMVO(SoCustMVO soCustMVO) {
		this.soCustMVO = soCustMVO;
	}

	public List getSoResList() {
		return soResList;
	}

	public void setSoResList(List soResList) {
		this.soResList = soResList;
	}

	public SoFaultMVO getSoFaultMVO() {
		return soFaultMVO;
	}

	public void setSoFaultMVO(SoFaultMVO soFaultMVO) {
		this.soFaultMVO = soFaultMVO;
	}

	public List getFaultReasonList() {
		return faultReasonList;
	}

	public void setFaultReasonList(List faultReasonList) {
		this.faultReasonList = faultReasonList;
	}

	public List getFailReasonList() {
		return failReasonList;
	}

	public void setFailReasonList(List failReasonList) {
		this.failReasonList = failReasonList;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List getRepairWayList() {
		return repairWayList;
	}

	public void setRepairWayList(List repairWayList) {
		this.repairWayList = repairWayList;
	}

	public String getRepairWay() {
		return repairWay;
	}

	public void setRepairWay(String repairWay) {
		this.repairWay = repairWay;
	}

	public String getFaultReasonId() {
		return faultReasonId;
	}

	public void setFaultReasonId(String faultReasonId) {
		this.faultReasonId = faultReasonId;
	}

	public List getWorkAreaList() {
		return workAreaList;
	}

	public void setWorkAreaList(List workAreaList) {
		this.workAreaList = workAreaList;
	}

	public List getStaffList() {
		return staffList;
	}

	public void setStaffList(List staffList) {
		this.staffList = staffList;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public List getResPrptyList() {
		return resPrptyList;
	}

	public void setResPrptyList(List resPrptyList) {
		this.resPrptyList = resPrptyList;
	}

	public String[] getSpecPrptyIdAry() {
		return specPrptyIdAry;
	}

	public void setSpecPrptyIdAry(String[] specPrptyIdAry) {
		this.specPrptyIdAry = specPrptyIdAry;
	}

	public String[] getSpecPrptyValueAry() {
		return specPrptyValueAry;
	}

	public void setSpecPrptyValueAry(String[] specPrptyValueAry) {
		this.specPrptyValueAry = specPrptyValueAry;
	}
	
}