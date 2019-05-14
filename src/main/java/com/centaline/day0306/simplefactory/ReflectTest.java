package com.centaline.day0306.simplefactory;

/**
 * Created by zhangpan on 2019/3/14.
 * 反射机制：java反射
 */
public class ReflectTest {
	public static void main(String[] args) {
		// java中可以通过三种方法获取类的字节码（Class）对象
		// * 通过Object类中的getClass方法，想要用这种方法必须用明确具体的类 并更改且创建该类的对象
		// * 所有数据类型都具备一个静态的属性.class来获取对应的Class对象。但是还是要明确到类，然后才能调用类中的静态成员。
		// * 只要通过给定类的字符串名称就可以获取该类的字节码对象，这样做扩展性更强。通过Class.forName（）方法完成，必须要指定类的全限定名
		//   由于前两种方法都是在知道该类的情况下获取该类的字节码对象，因此不会有异常，但是Class.forName()方法如果写错类的路径会报ClassNotFountException
		CourseFactory courseFactory = new CourseFactory();
		// 方法一
		Class<?> class1 = courseFactory.getClass();
		// 方法二
		Class<?> class2 = CourseFactory.class;
		// 方法三
		try{
			Class<?> class3 = Class.forName("CourseFactory");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
