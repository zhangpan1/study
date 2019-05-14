package com.centaline.day0306.simplefactory;

import com.centaline.day0306.ICourse;

/**
 * Created by zhangpan on 2019/3/13.
 * 简单工厂模式
 */
public class CourseFactory {
	/*public ICourse create(String name){
		if("java".equals(name)){
			return new JavaCourse();
		} else {
			return null;
		}
	}*/
	/*public ICourse course (String className){
		try {
			if (!(null == className) || "".equals(className)){
				return (ICourse) Class.forName(className).newInstance();
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}*/
	public ICourse create(Class clazz){
		try {
			if (!(null == clazz) ){
				return (ICourse)clazz.newInstance();
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
