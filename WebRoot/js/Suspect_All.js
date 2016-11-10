$(function(){
	
	//设置嫌疑人表格中的信息
	$(".Message td:first").css({"width":"30%","height":"5%"});
	//设置所有input标签的属性样式
	$(".Message tr td :input").css({"width":"18%","color":"#080808","text-align":" center",
	"font-family":"微软雅黑","font-size":"large","border":"hidden","background":"#fff"});
	//设置最后一个input标签的属性样式
	$(".Message tr td :input").last().css({"width":"80%","text-align":"left"});
    //	设置信息表中家庭住址样式
	$(".Message textarea").css({"width":"100%","margin-top":"-5%","margin-left": "7%"});
//	设置人员联系表的样式
	$("#people_Mes tr").find("td:eq(0)").css("color","#389AC7");
	
	
	//检查情况样式表
	$(".checked_state textarea").css({"width":"100%","margin":"0px","height":"180px"});
	$(".checked_state input[type=checkbox]").css({"width":"20px","margin-top":"0%"});

	// 设置随身财物检查情况
	$(".woods_check tr:first").css({"background":"#0070c0","color":"#ffffff"});
	$(".woods_check tr").find("td:first").css("width","5%");
	$(".woods_check input").css("width","88%");
	
//	设置办案区活动记录
	$(".active_check tr:first").css({"background":"#0070c0","color":"#ffffff"});

	$(".active_check tr").find("td:eq(0)").css("width","5%");
//	设置input标签
	$(".active_check input").css("height","36px");

	$(".active_check input:gt(3)").css("width","70%");
	$(".active_check input:lt(2)").css("width","40%");
	
	
//	设置离开办案区登记样式
	$(".transient_Leave tr:first").css({"background":"#0070c0","color":"#ffffff"});

	$(".transient_Leave input").css({"width":"30%","height":"34px"});

	$(".transient_Leave input:eq(1)").css({"width":"76%","height":"34px"});
	
	$(".final_Leave tr:first").css({"background":"#0070c0","color":"#ffffff"});
	$(".final_Leave tr").find("td:eq(0)").css({"width":"30%","text-align":"right"});
	$(".final_Leave input").css("height","34px");
	$(".final_Leave input[type='checkbox']").css("height","10px");

//	设置date,time 的样式
	$(".final_Leave tr:eq(1) td:eq(0) input").css({"width":"50%","border":"1px solid #f8f8f8"});
	
	$(".final_Leave tr:gt(3) input").css({"width":"100%","border":"1px solid #f8f8f8"});
});