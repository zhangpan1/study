package com.centaline.day0306.factorymethod;

import com.centaline.day0306.ICourse;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.Log4jLoggerFactory;

/**
 * Created by zhangpan on 2019/3/18.
 * 抽象类可以将一些公共处理逻辑 放在前面的方法上
 */
public abstract class AbStractFactory {
	public void preCreate(){
		//创建前的一些处理逻辑 放在 创建之前
	}
	abstract ICourse create();
	// 源码中的例子
	ILoggerFactory log = new  Log4jLoggerFactory();
}
