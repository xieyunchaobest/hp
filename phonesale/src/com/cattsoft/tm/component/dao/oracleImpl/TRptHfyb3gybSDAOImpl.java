package com.cattsoft.tm.component.dao.oracleImpl;import java.sql.Connection;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.SQLException;import java.util.List;import java.util.ArrayList;import org.apache.log4j.Logger;import com.cattsoft.pub.connection.ConnectionFactory;import com.cattsoft.tm.component.dao.ITRptHfyb3gybSDAO;import com.cattsoft.tm.vo.TRptHfyb3gybSVO;import com.cattsoft.pub.util.JdbcUtil;import com.cattsoft.pub.dao.Sql;import com.cattsoft.pub.exception.AppException;import com.cattsoft.pub.exception.SysException;import com.cattsoft.pub.vo.GenericVO;import com.cattsoft.pub.util.StringUtil; /**   * 方法TRptHfyb3gybSDAOImpl   * <p>Company: 大唐软件</p>   * @author ：白小亮。   * @version 1.1  2007-9-23  */public class TRptHfyb3gybSDAOImpl implements ITRptHfyb3gybSDAO{    private static Logger log = Logger.getLogger(TRptHfyb3gybSDAOImpl.class);    private static final String UNABLE_STS = "P";  /**   * 增加。   * @return String  */ public void add(GenericVO vo)throws AppException, SysException {         if (vo== null) {         throw new AppException("100001", "缺少DAO操作对象！");        }     TRptHfyb3gybSVO tRptHfyb3gyb=(TRptHfyb3gybSVO) vo;      Connection conn = null;      PreparedStatement ps = null;Sql sql = new Sql("INSERT INTO T_RPT_HFYB_3GYB(CREATE_DATE,CZYHS_BY,CZYHS_HBZZL,CZYHS_SY,DYCZSR_BY,DYCZSR_HBZZL,DYCZSR_SY,DYFZ_BY,DYFZ_HBZZL,DYFZ_SY,OPEN_DATE,RB_QY,YW)");sql.append(" VALUES (:createDate,:czyhsBy,:czyhsHbzzl,:czyhsSy,:dyczsrBy,:dyczsrHbzzl,:dyczsrSy,:dyfzBy,:dyfzHbzzl,:dyfzSy,:openDate,:rbQy,:yw)");      try {           conn = ConnectionFactory.getConnection();           ps = conn.prepareStatement(sql.getSql());   if (tRptHfyb3gyb.getCreateDate() == null) {      sql.setNullDate("createDate");     } else {    sql.setTimestamp("createDate", tRptHfyb3gyb.getCreateDate());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getCzyhsBy())) {      sql.setNullLong("czyhsBy");     } else {    sql.setLong("czyhsBy", tRptHfyb3gyb.getCzyhsBy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getCzyhsHbzzl())) {      sql.setNullLong("czyhsHbzzl");     } else {    sql.setLong("czyhsHbzzl", tRptHfyb3gyb.getCzyhsHbzzl());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getCzyhsSy())) {      sql.setNullLong("czyhsSy");     } else {    sql.setLong("czyhsSy", tRptHfyb3gyb.getCzyhsSy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyczsrBy())) {      sql.setNullLong("dyczsrBy");     } else {    sql.setLong("dyczsrBy", tRptHfyb3gyb.getDyczsrBy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyczsrHbzzl())) {      sql.setNullLong("dyczsrHbzzl");     } else {    sql.setLong("dyczsrHbzzl", tRptHfyb3gyb.getDyczsrHbzzl());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyczsrSy())) {      sql.setNullLong("dyczsrSy");     } else {    sql.setLong("dyczsrSy", tRptHfyb3gyb.getDyczsrSy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyfzBy())) {      sql.setNullLong("dyfzBy");     } else {    sql.setLong("dyfzBy", tRptHfyb3gyb.getDyfzBy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyfzHbzzl())) {      sql.setNullLong("dyfzHbzzl");     } else {    sql.setLong("dyfzHbzzl", tRptHfyb3gyb.getDyfzHbzzl());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyfzSy())) {      sql.setNullLong("dyfzSy");     } else {    sql.setLong("dyfzSy", tRptHfyb3gyb.getDyfzSy());    }    if (tRptHfyb3gyb.getOpenDate() == null) {      sql.setNullDate("openDate");     } else {    sql.setTimestamp("openDate", tRptHfyb3gyb.getOpenDate());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getRbQy())) {      sql.setNullString("rbQy");     } else {    sql.setString("rbQy", tRptHfyb3gyb.getRbQy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getYw())) {      sql.setNullString("yw");     } else {    sql.setString("yw", tRptHfyb3gyb.getYw());    }            sql.fillParams(ps);           sql.log(this.getClass());           ps.executeUpdate();          } catch (SQLException se) {           throw new SysException("100003", "JDBC操作异常！", se);           } finally {                    JdbcUtil.close(ps);           }  } /**   * 主键查询的SQL。   * @return String ： 主键查询的SQL。  */ public GenericVO findByPK(GenericVO vo)throws AppException, SysException {         if (vo== null) {         throw new AppException("100001", "缺少DAO操作对象！");        }     TRptHfyb3gybSVO tRptHfyb3gyb=(TRptHfyb3gybSVO) vo;       Sql sql = new Sql("SELECT CREATE_DATE,CZYHS_BY,CZYHS_HBZZL,CZYHS_SY,DYCZSR_BY,DYCZSR_HBZZL,DYCZSR_SY,DYFZ_BY,DYFZ_HBZZL,DYFZ_SY,OPEN_DATE,RB_QY,YW FROM T_RPT_HFYB_3GYB WHERE 1=1  ");      Connection conn = null;      PreparedStatement ps = null;      ResultSet rs = null;      tRptHfyb3gyb =null;      try {           conn = ConnectionFactory.getConnection();           ps = conn.prepareStatement(sql.getSql());           sql.fillParams(ps);           sql.log(this.getClass());           rs = ps.executeQuery();            while (rs.next()) {           tRptHfyb3gyb = new TRptHfyb3gybSVO();           tRptHfyb3gyb.setCreateDate(rs.getTimestamp("CREATE_DATE"));           tRptHfyb3gyb.setCzyhsBy(rs.getString("CZYHS_BY"));           tRptHfyb3gyb.setCzyhsHbzzl(rs.getString("CZYHS_HBZZL"));           tRptHfyb3gyb.setCzyhsSy(rs.getString("CZYHS_SY"));           tRptHfyb3gyb.setDyczsrBy(rs.getString("DYCZSR_BY"));           tRptHfyb3gyb.setDyczsrHbzzl(rs.getString("DYCZSR_HBZZL"));           tRptHfyb3gyb.setDyczsrSy(rs.getString("DYCZSR_SY"));           tRptHfyb3gyb.setDyfzBy(rs.getString("DYFZ_BY"));           tRptHfyb3gyb.setDyfzHbzzl(rs.getString("DYFZ_HBZZL"));           tRptHfyb3gyb.setDyfzSy(rs.getString("DYFZ_SY"));           tRptHfyb3gyb.setOpenDate(rs.getTimestamp("OPEN_DATE"));           tRptHfyb3gyb.setRbQy(rs.getString("RB_QY"));           tRptHfyb3gyb.setYw(rs.getString("YW"));                 }           } catch (SQLException se) {             throw new SysException("100003", "JDBC操作异常！", se);                      } finally {                    JdbcUtil.close(rs,ps);           }           return tRptHfyb3gyb;         } /**   * 批量查询的SQL。   * @return String ： 批量查询的SQL。  */ public List findByVO(GenericVO vo) throws AppException, SysException{         if (vo== null) {         throw new AppException("100001", "缺少DAO操作对象！");        }       TRptHfyb3gybSVO tRptHfyb3gyb=(TRptHfyb3gybSVO) vo;          List res = new ArrayList();          Connection conn = null;          PreparedStatement ps = null;          ResultSet rs = null;          Sql sql = new Sql("SELECT CREATE_DATE,CZYHS_BY,CZYHS_HBZZL,CZYHS_SY,DYCZSR_BY,DYCZSR_HBZZL,DYCZSR_SY,DYFZ_BY,DYFZ_HBZZL,DYFZ_SY,OPEN_DATE,RB_QY,YW FROM T_RPT_HFYB_3GYB WHERE 1=1 ");     try {if (tRptHfyb3gyb.getFlagCreateDate() == 1) {      if (tRptHfyb3gyb.getCreateDate() == null) {             sql.append(" and CREATE_DATE is null ");          }      else{             sql.append(" and CREATE_DATE=:createDate");             sql.setTimestamp("createDate", tRptHfyb3gyb.getCreateDate());          }   } if (tRptHfyb3gyb.getFlagCzyhsBy() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getCzyhsBy())) {             sql.append(" and CZYHS_BY is null ");          }      else{             sql.append(" and CZYHS_BY=:czyhsBy");             sql.setLong("czyhsBy", tRptHfyb3gyb.getCzyhsBy());          }   } if (tRptHfyb3gyb.getFlagCzyhsHbzzl() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getCzyhsHbzzl())) {             sql.append(" and CZYHS_HBZZL is null ");          }      else{             sql.append(" and CZYHS_HBZZL=:czyhsHbzzl");             sql.setLong("czyhsHbzzl", tRptHfyb3gyb.getCzyhsHbzzl());          }   } if (tRptHfyb3gyb.getFlagCzyhsSy() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getCzyhsSy())) {             sql.append(" and CZYHS_SY is null ");          }      else{             sql.append(" and CZYHS_SY=:czyhsSy");             sql.setLong("czyhsSy", tRptHfyb3gyb.getCzyhsSy());          }   } if (tRptHfyb3gyb.getFlagDyczsrBy() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getDyczsrBy())) {             sql.append(" and DYCZSR_BY is null ");          }      else{             sql.append(" and DYCZSR_BY=:dyczsrBy");             sql.setLong("dyczsrBy", tRptHfyb3gyb.getDyczsrBy());          }   } if (tRptHfyb3gyb.getFlagDyczsrHbzzl() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getDyczsrHbzzl())) {             sql.append(" and DYCZSR_HBZZL is null ");          }      else{             sql.append(" and DYCZSR_HBZZL=:dyczsrHbzzl");             sql.setLong("dyczsrHbzzl", tRptHfyb3gyb.getDyczsrHbzzl());          }   } if (tRptHfyb3gyb.getFlagDyczsrSy() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getDyczsrSy())) {             sql.append(" and DYCZSR_SY is null ");          }      else{             sql.append(" and DYCZSR_SY=:dyczsrSy");             sql.setLong("dyczsrSy", tRptHfyb3gyb.getDyczsrSy());          }   } if (tRptHfyb3gyb.getFlagDyfzBy() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getDyfzBy())) {             sql.append(" and DYFZ_BY is null ");          }      else{             sql.append(" and DYFZ_BY=:dyfzBy");             sql.setLong("dyfzBy", tRptHfyb3gyb.getDyfzBy());          }   } if (tRptHfyb3gyb.getFlagDyfzHbzzl() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getDyfzHbzzl())) {             sql.append(" and DYFZ_HBZZL is null ");          }      else{             sql.append(" and DYFZ_HBZZL=:dyfzHbzzl");             sql.setLong("dyfzHbzzl", tRptHfyb3gyb.getDyfzHbzzl());          }   } if (tRptHfyb3gyb.getFlagDyfzSy() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getDyfzSy())) {             sql.append(" and DYFZ_SY is null ");          }      else{             sql.append(" and DYFZ_SY=:dyfzSy");             sql.setLong("dyfzSy", tRptHfyb3gyb.getDyfzSy());          }   } if (tRptHfyb3gyb.getFlagOpenDate() == 1) {      if (tRptHfyb3gyb.getOpenDate() == null) {             sql.append(" and OPEN_DATE is null ");          }      else{             sql.append(" and OPEN_DATE=:openDate");             sql.setTimestamp("openDate", tRptHfyb3gyb.getOpenDate());          }   } if (tRptHfyb3gyb.getFlagRbQy() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getRbQy())) {             sql.append(" and RB_QY is null ");          }      else{             sql.append(" and RB_QY=:rbQy");             sql.setString("rbQy", tRptHfyb3gyb.getRbQy());          }   } if (tRptHfyb3gyb.getFlagYw() == 1) {      if (StringUtil.isBlank(tRptHfyb3gyb.getYw())) {             sql.append(" and YW is null ");          }      else{             sql.append(" and YW=:yw");             sql.setString("yw", tRptHfyb3gyb.getYw());          }   }            conn = ConnectionFactory.getConnection();           ps = conn.prepareStatement(sql.getSql());           ps = sql.fillParams(ps);           sql.log(this.getClass());           rs = ps.executeQuery();                    while (rs.next()) {           tRptHfyb3gyb = new TRptHfyb3gybSVO();           tRptHfyb3gyb.setCreateDate(rs.getTimestamp("CREATE_DATE"));           tRptHfyb3gyb.setCzyhsBy(rs.getString("CZYHS_BY"));           tRptHfyb3gyb.setCzyhsHbzzl(rs.getString("CZYHS_HBZZL"));           tRptHfyb3gyb.setCzyhsSy(rs.getString("CZYHS_SY"));           tRptHfyb3gyb.setDyczsrBy(rs.getString("DYCZSR_BY"));           tRptHfyb3gyb.setDyczsrHbzzl(rs.getString("DYCZSR_HBZZL"));           tRptHfyb3gyb.setDyczsrSy(rs.getString("DYCZSR_SY"));           tRptHfyb3gyb.setDyfzBy(rs.getString("DYFZ_BY"));           tRptHfyb3gyb.setDyfzHbzzl(rs.getString("DYFZ_HBZZL"));           tRptHfyb3gyb.setDyfzSy(rs.getString("DYFZ_SY"));           tRptHfyb3gyb.setOpenDate(rs.getTimestamp("OPEN_DATE"));           tRptHfyb3gyb.setRbQy(rs.getString("RB_QY"));           tRptHfyb3gyb.setYw(rs.getString("YW"));               res.add(tRptHfyb3gyb);                            }          } catch (SQLException se) {           throw new SysException("100003", "JDBC操作异常！", se);            } finally {                JdbcUtil.close(rs,ps);               }                         if(0 == res.size()) res = null;          return res;   } /**   * 更新的SQL。   * @return String ： 更新的SQL。  */ public void update(GenericVO vo)throws AppException, SysException {         if (vo== null) {         throw new AppException("100001", "缺少DAO操作对象！");        }       TRptHfyb3gybSVO tRptHfyb3gyb=(TRptHfyb3gybSVO) vo;          Connection conn = null;          PreparedStatement ps = null;          Sql sql = new Sql("UPDATE T_RPT_HFYB_3GYB SET ");     try {if (tRptHfyb3gyb.getFlagCreateDate() == 1) {sql.append("CREATE_DATE=:createDate,"); sql.setTimestamp("createDate", tRptHfyb3gyb.getCreateDate()); } if (tRptHfyb3gyb.getFlagCzyhsBy() == 1) {sql.append("CZYHS_BY=:czyhsBy,");sql.setLong("czyhsBy", tRptHfyb3gyb.getCzyhsBy()); } if (tRptHfyb3gyb.getFlagCzyhsHbzzl() == 1) {sql.append("CZYHS_HBZZL=:czyhsHbzzl,");sql.setLong("czyhsHbzzl", tRptHfyb3gyb.getCzyhsHbzzl()); } if (tRptHfyb3gyb.getFlagCzyhsSy() == 1) {sql.append("CZYHS_SY=:czyhsSy,");sql.setLong("czyhsSy", tRptHfyb3gyb.getCzyhsSy()); } if (tRptHfyb3gyb.getFlagDyczsrBy() == 1) {sql.append("DYCZSR_BY=:dyczsrBy,");sql.setLong("dyczsrBy", tRptHfyb3gyb.getDyczsrBy()); } if (tRptHfyb3gyb.getFlagDyczsrHbzzl() == 1) {sql.append("DYCZSR_HBZZL=:dyczsrHbzzl,");sql.setLong("dyczsrHbzzl", tRptHfyb3gyb.getDyczsrHbzzl()); } if (tRptHfyb3gyb.getFlagDyczsrSy() == 1) {sql.append("DYCZSR_SY=:dyczsrSy,");sql.setLong("dyczsrSy", tRptHfyb3gyb.getDyczsrSy()); } if (tRptHfyb3gyb.getFlagDyfzBy() == 1) {sql.append("DYFZ_BY=:dyfzBy,");sql.setLong("dyfzBy", tRptHfyb3gyb.getDyfzBy()); } if (tRptHfyb3gyb.getFlagDyfzHbzzl() == 1) {sql.append("DYFZ_HBZZL=:dyfzHbzzl,");sql.setLong("dyfzHbzzl", tRptHfyb3gyb.getDyfzHbzzl()); } if (tRptHfyb3gyb.getFlagDyfzSy() == 1) {sql.append("DYFZ_SY=:dyfzSy,");sql.setLong("dyfzSy", tRptHfyb3gyb.getDyfzSy()); } if (tRptHfyb3gyb.getFlagOpenDate() == 1) {sql.append("OPEN_DATE=:openDate,"); sql.setTimestamp("openDate", tRptHfyb3gyb.getOpenDate()); } if (tRptHfyb3gyb.getFlagRbQy() == 1) {sql.append("RB_QY=:rbQy,"); sql.setString("rbQy", tRptHfyb3gyb.getRbQy()); } if (tRptHfyb3gyb.getFlagYw() == 1) {sql.append("YW=:yw,"); sql.setString("yw", tRptHfyb3gyb.getYw()); }            	sql.removeSuffix(1); sql.append(" WHERE 1=1 ");           conn = ConnectionFactory.getConnection();           ps = conn.prepareStatement(sql.getSql());           ps = sql.fillParams(ps);           sql.log(this.getClass());           ps.executeUpdate();                    } catch (SQLException se) {           throw new SysException("100003", "JDBC操作异常！", se);            } finally {                JdbcUtil.close(ps);               }                  } /**   * 批量增加记录。   * @return String ： 批量增加的SQL。  */ public void addBat(List list)throws AppException, SysException {     if (list == null) {     throw new AppException("100001", "缺少DAO操作对象！");           }          Connection conn = null;          PreparedStatement ps = null;Sql sql = new Sql("INSERT INTO T_RPT_HFYB_3GYB(CREATE_DATE,CZYHS_BY,CZYHS_HBZZL,CZYHS_SY,DYCZSR_BY,DYCZSR_HBZZL,DYCZSR_SY,DYFZ_BY,DYFZ_HBZZL,DYFZ_SY,OPEN_DATE,RB_QY,YW)");sql.append(" VALUES (:createDate,:czyhsBy,:czyhsHbzzl,:czyhsSy,:dyczsrBy,:dyczsrHbzzl,:dyczsrSy,:dyfzBy,:dyfzHbzzl,:dyfzSy,:openDate,:rbQy,:yw)");      try {           conn = ConnectionFactory.getConnection();           ps = conn.prepareStatement(sql.getSql());    for(int i=0;i<list.size();i++){       TRptHfyb3gybSVO tRptHfyb3gyb=(TRptHfyb3gybSVO) list.get(i);         if (tRptHfyb3gyb== null) {         throw new AppException("100001", "缺少DAO操作对象！");       }   if (tRptHfyb3gyb.getCreateDate() == null) {      sql.setNullDate("createDate");     } else {    sql.setTimestamp("createDate", tRptHfyb3gyb.getCreateDate());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getCzyhsBy())) {      sql.setNullLong("czyhsBy");     } else {    sql.setLong("czyhsBy", tRptHfyb3gyb.getCzyhsBy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getCzyhsHbzzl())) {      sql.setNullLong("czyhsHbzzl");     } else {    sql.setLong("czyhsHbzzl", tRptHfyb3gyb.getCzyhsHbzzl());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getCzyhsSy())) {      sql.setNullLong("czyhsSy");     } else {    sql.setLong("czyhsSy", tRptHfyb3gyb.getCzyhsSy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyczsrBy())) {      sql.setNullLong("dyczsrBy");     } else {    sql.setLong("dyczsrBy", tRptHfyb3gyb.getDyczsrBy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyczsrHbzzl())) {      sql.setNullLong("dyczsrHbzzl");     } else {    sql.setLong("dyczsrHbzzl", tRptHfyb3gyb.getDyczsrHbzzl());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyczsrSy())) {      sql.setNullLong("dyczsrSy");     } else {    sql.setLong("dyczsrSy", tRptHfyb3gyb.getDyczsrSy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyfzBy())) {      sql.setNullLong("dyfzBy");     } else {    sql.setLong("dyfzBy", tRptHfyb3gyb.getDyfzBy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyfzHbzzl())) {      sql.setNullLong("dyfzHbzzl");     } else {    sql.setLong("dyfzHbzzl", tRptHfyb3gyb.getDyfzHbzzl());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getDyfzSy())) {      sql.setNullLong("dyfzSy");     } else {    sql.setLong("dyfzSy", tRptHfyb3gyb.getDyfzSy());    }    if (tRptHfyb3gyb.getOpenDate() == null) {      sql.setNullDate("openDate");     } else {    sql.setTimestamp("openDate", tRptHfyb3gyb.getOpenDate());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getRbQy())) {      sql.setNullString("rbQy");     } else {    sql.setString("rbQy", tRptHfyb3gyb.getRbQy());    }       if (StringUtil.isBlank(tRptHfyb3gyb.getYw())) {      sql.setNullString("yw");     } else {    sql.setString("yw", tRptHfyb3gyb.getYw());    }            sql.fillParams(ps);           sql.log(this.getClass());           sql.clearParameters();           ps.addBatch();           }                  ps.executeBatch();          } catch (SQLException se) {           throw new SysException("100003", "JDBC操作异常！", se);           } finally {                    JdbcUtil.close(ps);           }  } /**   * 根据传入参数删除一条或者一批记录。   * @return String ： 删除的SQL。  */ public void delete(GenericVO vo)throws AppException, SysException {         if (vo== null) {         throw new AppException("100001", "缺少DAO操作对象！");        }     TRptHfyb3gybSVO tRptHfyb3gyb=(TRptHfyb3gybSVO) vo;          Connection conn = null;          PreparedStatement ps = null;       Sql sql = new Sql("DELETE FROM T_RPT_HFYB_3GYB WHERE 1=1  ");      try {           conn = ConnectionFactory.getConnection();           ps = conn.prepareStatement(sql.getSql());           sql.fillParams(ps);           sql.log(this.getClass());           ps.executeUpdate();            } catch (SQLException se) {           throw new SysException("100003", "JDBC操作异常！", se);                      } finally {                    JdbcUtil.close(ps);           }         } /**   * 注销一条或者一批   * @return String ： 注销一条或者一批的SQL。  */ public void unable(GenericVO vo)throws AppException, SysException {     TRptHfyb3gybSVO tRptHfyb3gyb=(TRptHfyb3gybSVO) vo;       }}
