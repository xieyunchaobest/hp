package com.cattsoft.tm.struts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.cattsoft.pub.exception.AppException;
import com.cattsoft.pub.exception.SysException;
import com.cattsoft.pub.util.StringUtil;
import com.cattsoft.tm.delegate.SMLoginDelegate;
import com.cattsoft.tm.delegate.ZSJFDelegate;
import com.cattsoft.tm.vo.TRptJtbbQsfzrbSVO;
import com.cattsoft.webpub.util.ReqUtil;

public class ZSJFAction extends DispatchAction{
	
	public ActionForward login(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String reqStr=getJSON(request);
		String res=ZSJFDelegate.getDelegate().login(reqStr);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
		
	}
	
	public ActionForward getLateVersion4MOS(ActionMapping actionMapping,
			ActionForm actionForm, HttpServletRequest req,
			HttpServletResponse rep) throws Exception {
		String requestJson = getJSON(req);
		JSONObject mosVersionJsonObject=new JSONObject();
	 	if(StringUtil.isBlank(requestJson)) {
	 		mosVersionJsonObject.put("whichApp", "ANDROID");
	 	}else{
	 		mosVersionJsonObject.put("whichApp", "IOS");
	 	}
		String mosVersionJson = ZSJFDelegate.getDelegate().getLateVersion4MOS(mosVersionJsonObject.toString());
		com.cattsoft.webpub.util.ReqUtil.write(rep, mosVersionJson);
		return null;
		
	}
	
	
	/**
	 * 重点关注之重点业务发展日报
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward zdgz4zdywrb(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().zdgz4zdywrb(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}
	
	
	/**
	 * 呼市日报之重点业务发展日报
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward hsrb4zdywfzrb(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsrb4zdywfzrb(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}
	
	
	
	/**
	 * 呼市日报之3G业务日报
	 */
	public ActionForward hsrb43gyw(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsrb43gyw(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}
	
	/**
	 * 2g业务日报
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward g2ywrb(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	return null;
	}
	
	/**
	 * 呼市日报之2G业务日报
	 */
	public ActionForward hsrb42gyw(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsrb42gyw(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}
	
	/**
	 * 呼市日报之宽带业务日报
	 */
	public ActionForward hsrb4kdyw(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsrb4kdyw(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	
	}
	
	/**
	 * 呼市日报之宽带业务日报
	 */
	public ActionForward hsrb42g3grh(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsrb42g3grh(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}
	
	/**
	 * 网格日报之重点业务揽装日报
	 */
	public ActionForward hsrb4zdywlz(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsrb4zdywlz(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	
	}
	
	/**
	 * 网格日报之客户经理揽装日报
	 */
	public ActionForward hsrb4khjllz(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsrb4khjllz(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}

	/**
	 * 集团日报之区级、市级业务发展日报
	 * @return
	 * @throws AppException
	 * @throws SysException
	 */
	public ActionForward jtrb4qsjywfzrb(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().jtrb4qsjywfzrb(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}
	
	/**
	 * 修改密码
	 * @return
	 * @throws AppException
	 * @throws SysException
	 */
	public ActionForward modifyPwd(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().modifyPwd(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	} 
	
	/**
	 * 集团日报之区级、市级业务发展日报
	 * 
	 * @return
	 * @throws AppException
	 * @throws SysException
	 */
	public ActionForward jtrb4hybywfzrb(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().jtrb4hybywfzrb(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}
	
	/**
	 * 渠道日报各网点业务发展日报
	 * @return
	 * @throws AppException
	 * @throws SysException
	 */
	public ActionForward qdrb4gwdywfzrb(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().qdrb4gwdywfzrb(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	
	}
	
	
	/**
	 * 呼市月报4关键指标月报
	 * 
	 * @return
	 * @throws AppException
	 * @throws SysException
	 */
	public ActionForward hsyb4gjzbyb(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsyb4gjzbyb(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}
	
	/**
	 * 呼市月报43G业务月报
	 * 
	 * @return
	 * @throws AppException
	 * @throws SysException
	 */
	public ActionForward hsyb43gywyb(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsyb43gywyb(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	}
	
	/**
	 * 呼市月报4宽带务月报
	 * 
	 * @return
	 * @throws AppException
	 * @throws SysException
	 */
	public ActionForward hsyb4kdyfzqk(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsyb4kdyfzqk(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
		return null;
	
	}
	
	
	/**
	 * 呼市日报4网格经理重点关注
	 * @return
	 * @throws AppException
	 * @throws SysException
	 */
	public ActionForward hsrb4wgjlzdgz(ActionMapping mapping,ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String reqParm=getJSON(request);
		String res=ZSJFDelegate.getDelegate().hsrb4wgjlzdgz(reqParm);
		com.cattsoft.webpub.util.ReqUtil.write(response, res);
		System.out.println("res======"+res);
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
