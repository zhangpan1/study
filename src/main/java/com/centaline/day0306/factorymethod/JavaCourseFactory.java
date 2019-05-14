package com.centaline.day0306.factorymethod;

import com.centaline.day0306.ICourse;
import com.centaline.day0306.JavaCourse;

/**
 * Created by zhangpan on 2019/3/18.
 * 单一职责原则
 */
public class JavaCourseFactory implements ICourseFactory {
	public ICourse create() {
		return new JavaCourse();
	}
}
