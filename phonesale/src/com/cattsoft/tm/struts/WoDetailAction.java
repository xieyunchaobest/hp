 /*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.cattsoft.tm.struts;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; 
import java.util.Calendar;
import java.util.List;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.alibaba.fastjson.JSON;
import com.cattsoft.pub.util.StringUtil;
import com.cattsoft.tm.delegate.WoDetailDelegate;
import com.cattsoft.tm.vo.WoHandleMVO;
import com.cattsoft.webpub.util.ReqUtil;

/** 
 * MyEclipse Struts
 * Creation date: 06-18-2007
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class WoDetailAction extends DispatchAction {
	/*
	 * Generated Methods
	 */
	private static final Logger log = Logger.getLogger(WoDetailAction.class);
	/**
	 * 初始化查询设置的默认值
	 * @param mapping
	 * @param actionForm
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 

	/**
	 * android 工单处理的日志功能
	 */
	public ActionForward woHandleInfo4MOS(ActionMapping mapping, ActionForm actionForm,  
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		JSONObject requestJsonObject=JSONObject.fromObject(ReqUtil.getRequestStr(request));
		JSONObject LogJsonObject=new JSONObject();
		if (requestJsonObject != null && !StringUtil.isBlank(requestJsonObject.getString("woNbr"))) {
			LogJsonObject.put("woNbr", requestJsonObject.getString("woNbr"));
		}
		log.debug("开始进入查询方法");
		String woNbr = LogJsonObject.get("woNbr").toString();
		String qryFlag = null;
		
		List woHandleList = new ArrayList();
		WoHandleMVO woHandleVo = new WoHandleMVO();
		
		if(StringUtil.isBlank(woNbr))
			woNbr="";
		
		
		woHandleVo.setWoNbr(woNbr);
		woHandleVo.setQryFlag(qryFlag);
		
		String responseJson=WoDetailDelegate.getDelegate().getWoHandleInfo(requestJsonObject.toString());
		
        //String responseJson = JSON.toJSONString(woHandleList);
		
		if("[]".equals(responseJson)||StringUtil.isBlank(responseJson)) {

			responseJson=StringUtil.getAppException4MOS("没有日志记录！");
		}
		if (responseJson!=null) {
			ReqUtil.write(response, responseJson.toString());
		}
		
		return null;
	}
	
	/**
	 * 获得从客户端传入的json字符串
	 * @param request
	 * @return
	 * @throws IOException
	 */
	private String getJSON(HttpServletRequest request) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(ServletInputStream) request.getInputStream(), "UTF-8"));
		StringBuffer sb = new StringBuffer("");
		String temp;
		while ((temp = br.readLine()) != null) {
			sb.append(temp);
		}
		br.close();
		return sb.toString();
	}
}