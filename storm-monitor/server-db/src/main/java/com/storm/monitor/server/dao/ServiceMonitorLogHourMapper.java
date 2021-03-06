package com.storm.monitor.server.dao;

import com.storm.monitor.server.model.ServiceMonitorLog;
import com.storm.monitor.server.model.ServiceMonitorLogHour;
import com.storm.monitor.server.model.view.ServiceMonitorLogHourView;

import java.util.List;
import com.storm.monitor.core.common.BaseMapper;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

/**
 *
 * Title: 【服务监控小时汇总表】(对应POJO对象：ServiceMonitorLogHour)DAO接口类
 * Description: 服务监控小时汇总表Dao接口类
 * Copyriht: Copyright (c) 2017
 * Company: Storm Workshop
 * @author lixin
 * @version 1.0 Date: 2017-07-24 15:22
 *
 */
public interface ServiceMonitorLogHourMapper extends BaseMapper{
        /**
        * 新增一条记录
        * @param serviceMonitorLogHour 待插入的【ServiceMonitorLogHour】实体
        * @return insert操作影响的数据库条数
        * @throws Exception 
        */
	public int addServiceMonitorLogHour(ServiceMonitorLogHour serviceMonitorLogHour)  throws Exception;
    
    public int addServiceMonitorLogHourBySelect(@Param("logTime") Date logTime,@Param("logBeginTime") Date logBeginTime,@Param("logEndTime") Date logEndTime)  throws Exception;
	
        /**
        * 更新一条数据库记录（全部字段）
        * @param serviceMonitorLogHour 待更新的【ServiceMonitorLogHour】实体
        * @return update操作影响的数据库条数
        * @throws Exception 
        */
	public int updateServiceMonitorLogHour(ServiceMonitorLogHour serviceMonitorLogHour)  throws Exception;
	
        /**
        * 更新一条数据库记录（部分字段）
        * @param serviceMonitorLogHour 待更新的【ServiceMonitorLogHour】实体
        * @return update操作影响的数据库条数
        * @throws Exception 
        */
	public int updateServiceMonitorLogHourBySelective(ServiceMonitorLogHour serviceMonitorLogHour);

        /**
        * 删除一条数据库记录
        * @param serviceMonitorLogHour 待删除的【ServiceMonitorLogHour】实体
        * @return delete操作影响的数据库条数
        * @throws Exception 
        */
        public int deleteServiceMonitorLogHourById(java.util.Date  logTime) throws Exception;
	
        /**
         * 根据条件删除数据库记录
         * @param serviceMonitorLogHourView
         * @return
         * @throws Exception 
         */
        public int deleteServiceMonitorLogHourByCondition(ServiceMonitorLogHourView serviceMonitorLogHourView) throws Exception;

        /**
        * 返回查询操作的总数
        * @param serviceMonitorLogHour serviceMonitorLogHourView 查询操作的条件
        * @return 符合查询条件的记录总数
        * @throws Exception 
        */
	public int queryServiceMonitorLogHourByCount(ServiceMonitorLogHourView serviceMonitorLogHourView)throws Exception;
	
        /**
        * 返回查询操作的结果
        * @param serviceMonitorLogHour serviceMonitorLogHourView 查询操作的条件
        * @return 符合查询条件的记录
        * @throws Exception 
        */
	public List<ServiceMonitorLogHour> queryServiceMonitorLogHourByPage(ServiceMonitorLogHourView serviceMonitorLogHourView) throws Exception;
    
    /**
     * 根据SQL查询
     * @param sql
     * @return
     * @throws Exception 
     */
    public List<ServiceMonitorLogHour> queryServiceMonitorLogHourBySQL(@Param("sql") String sql) throws Exception;

        /**
        * 根据主键查询记录
        * @param id  主键ID
        * @return 一条数据库记录
        * @throws Exception 
        */
	public ServiceMonitorLogHour queryServiceMonitorLogHourById(Object id) throws Exception;

    
}