package com.manageplantfrom.entity;

import java.util.Date;

/**
 * 臨時離開原因javabean
 * @author wuhaifei
 * @d2016年11月8日
 */
public class Temporary_Leave {
	
	private int Temporary_Leave_Id;
	private String Suspect_ID;//档案编号
	private Date TempLeave_Time;//临时离开时间 1
	private String TempLeave_Reason;//临时离开原因 2
	private Date Return_Time;//返回时间 3
	private int Staff_ID;//办案民警 4
	private int Room_ID;//信息登记房间 5
	
	
	public int getTemporary_Leave_Id() {
		return Temporary_Leave_Id;
	}
	public void setTemporary_Leave_Id(int temporary_Leave_Id) {
		Temporary_Leave_Id = temporary_Leave_Id;
	}
	public String getSuspect_ID() {
		return Suspect_ID;
	}
	public void setSuspect_ID(String suspect_ID) {
		Suspect_ID = suspect_ID;
	}
	public Date getTempLeave_Time() {
		return TempLeave_Time;
	}
	public void setTempLeave_Time(Date tempLeave_Time) {
		TempLeave_Time = tempLeave_Time;
	}
	public String getTempLeave_Reason() {
		return TempLeave_Reason;
	}
	public void setTempLeave_Reason(String tempLeave_Reason) {
		TempLeave_Reason = tempLeave_Reason;
	}
	public Date getReturn_Time() {
		return Return_Time;
	}
	public void setReturn_Time(Date return_Time) {
		Return_Time = return_Time;
	}
	public int getStaff_ID() {
		return Staff_ID;
	}
	public void setStaff_ID(int staff_ID) {
		Staff_ID = staff_ID;
	}
	public int getRoom_ID() {
		return Room_ID;
	}
	public void setRoom_ID(int room_ID) {
		Room_ID = room_ID;
	}
	
	@Override
	public String toString() {//重写toString方法
		return this.Suspect_ID+" "+this.TempLeave_Reason;
	}
}
