package com.centaline.day0306.factorymethod;

import com.centaline.day0306.ICourse;
import com.centaline.day0306.PythonCourse;

/**
 * Created by zhangpan on 2019/3/18.
 */
public class PythonCourseFactory implements ICourseFactory{
	public ICourse create() {
		return new PythonCourse();
	}
}
