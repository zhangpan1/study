package com.centaline.day0306.factorymethod;

import com.centaline.day0306.ICourse;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangpan on 2019/3/18.
 * 工厂模式 和工厂方法模式
 * 不同的工厂负责不同的创建逻辑
 */
public class FactoryMethodTest {
	public static void main(String[] args) {
		ICourseFactory factory = new PythonCourseFactory();
		ICourse course = factory.create();
		course.record();
		// 源码中用到的设计模式
		LoggerFactory.getLogger("");
	}
}
