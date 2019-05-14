package com.centaline.day0306.simplefactory;



import com.centaline.day0306.ICourse;
import com.centaline.day0306.JavaCourse;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

/**
 * Created by zhangpan on 2019/3/13.
 * 测试类
 */
public class SimpleFactory {
	public static void main(String[] args) {
		ICourse iCourse = new CourseFactory().create(JavaCourse.class);
		iCourse.record();

		// 源码中用到的设计模式
		Calendar.getInstance();
		LoggerFactory.getLogger("root");
	}
}
