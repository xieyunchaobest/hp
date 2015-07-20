package com.cattsoft.hp.component.domain;

import java.util.List;

import com.cattsoft.hp.vo.TUserSVO;
import com.cattsoft.pub.dao.DAOFactory;
import com.cattsoft.pub.exception.AppException;
import com.cattsoft.pub.exception.SysException;
import com.cattsoft.tm.component.dao.ITUserSDAO;

public class HpDOM {
	
	public String login(String reqStr) throws AppException, SysException {
		ITUserSDAO hpdao = (ITUserSDAO) DAOFactory.getDAO(ITUserSDAO.class);
		TUserSVO user=new TUserSVO();
		List userList=hpdao.findByVO(user);
		return null;
	}
}
