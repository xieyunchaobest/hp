package com.cattsoft.sm.component.dao;

import java.util.HashSet;

import com.cattsoft.pub.dao.ISDAO;
import com.cattsoft.pub.exception.AppException;
import com.cattsoft.pub.exception.SysException;
import com.cattsoft.pub.util.PagInfo;
import com.cattsoft.pub.util.PagView;
import com.cattsoft.pub.vo.GenericVO;


public interface IWorkAreaSDAO extends ISDAO {
    public PagView findByPage(GenericVO vo, PagInfo pagInfo) throws AppException, SysException;

    public PagView findBySet(HashSet set, PagInfo pagInfo) throws Exception;
}