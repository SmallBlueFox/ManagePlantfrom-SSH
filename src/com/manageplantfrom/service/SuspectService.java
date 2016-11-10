package com.manageplantfrom.service;

import java.util.List;

import com.manageplantfrom.base.DaoSupport;
import com.manageplantfrom.entity.PHCSMP_Band;
import com.manageplantfrom.entity.PHCSMP_Dic_Action_Cause;
import com.manageplantfrom.entity.PHCSMP_Dic_IdentifyCard_Type;
import com.manageplantfrom.entity.PHCSMP_Suspect;

/**
 * 登录犯罪嫌疑人信息的service
 * @author wuhaifei
 * @d2016年8月14日
 */
public interface SuspectService extends DaoSupport<PHCSMP_Suspect> {
	/**
	 * 保存嫌疑人信息到数据库
	 * @param model
	 */
	void saveSuspectInfor(PHCSMP_Suspect model);
	
	/**
	 * 根据房间号与手环编号查找嫌疑人信息
	 * @param roomId
	 * @param bandId
	 * @return
	 */
	PHCSMP_Suspect findInfroByActiveCodeAndBandID(int roomId, int bandId);
	
	/**
	 * 查出所有的手环信息，用于用户注册
	 * @return
	 */
	List<PHCSMP_Band> findAllBundInfor();

	/**
	 * 根据激活码查找嫌疑人信息
	 * @param roomId 房间号
	 * @return 嫌疑人的实体类信息
	 */
	PHCSMP_Suspect findInfroByActiveCode(int roomId);
	/**
	 * 根据手环id更新activeCode
	 * @param bandId 手环id
	 * @param roomId 房间号
	 * @return 
	 */
	int updateSuspectInforByBandId(int bandId, int roomId);

	/**
	 * 查找数据库中的所有身份证类型的数据
	 * @return 所有身份证类型的数据
	 */
	List<PHCSMP_Dic_IdentifyCard_Type> findAllIdentifyCardType();

	/**
	 * 查詢數據庫的所有案由數據
	 * @return
	 */
	List<PHCSMP_Dic_Action_Cause> findAllSuspectCause();

	/**
	 * 根据手环ID查找用户信息
	 * @param bandId
	 * @return
	 */
	PHCSMP_Suspect selectPersonInforByBandID(int bandId);

}
