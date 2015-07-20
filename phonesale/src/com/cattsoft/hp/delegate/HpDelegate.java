package com.cattsoft.hp.delegate;

import java.sql.Connection;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cattsoft.hp.component.domain.HpDOM;
import com.cattsoft.pub.connection.ConnectionFactory;
import com.cattsoft.pub.exception.AppException;
import com.cattsoft.pub.exception.SysException;
import com.cattsoft.pub.util.StringUtil;
import com.cattsoft.tm.component.domain.ZSJFDOM;
import com.cattsoft.tm.vo.TRptJtbbQsfzrbSVO;


public class HpDelegate {
	private static Log log = LogFactory.getLog(HpDelegate.class);
	private static HpDelegate delegate = null;
	private HpDelegate() {

	}

	public static HpDelegate getDelegate() {
		if (delegate == null) {
			delegate = new HpDelegate();
		}
		return delegate;
	}	

	public String login(String reqParm) throws AppException,SysException{
		Connection conn = null;
		String returnValue = null;
		try {
			conn = ConnectionFactory.createConnection();
			conn.setAutoCommit(false);
			HpDOM dom=new HpDOM();
			returnValue=dom.login(reqParm);
			ConnectionFactory.commit();
		} catch (Exception e) { 
			e.printStackTrace();
			log.error("[IOM系统接口svcCallIOMByMosNative异常]" + e);
			try {
				ConnectionFactory.rollback();
				JSONObject ret = new JSONObject();
				ret.put("resultCode", 0);
				ret.put("resultInfo", e.getMessage());
				returnValue = StringUtil.getAppException4MOS(e.getMessage());
			} catch (Exception e1) {
				e1.printStackTrace();
				returnValue = StringUtil.getAppException4MOS(e.getMessage());
			}
		} finally {
			try {
				ConnectionFactory.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
				returnValue = StringUtil.getAppException4MOS(e.getMessage());
			}
		}
		return returnValue;
	}
	 
}

