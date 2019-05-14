package com.centaline.day0306.factorymethod;

import com.centaline.day0306.ICourse;

/**
 * Created by zhangpan on 2019/3/18.
 * 一种工厂规范
 * 不干活
 */
public interface ICourseFactory {
	ICourse create();
}
