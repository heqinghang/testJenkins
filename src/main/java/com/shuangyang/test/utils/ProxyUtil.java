package com.shuangyang.test.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyUtil {
	


	public static  void main(String[] args) {
	
	
		//System.out.println(test.getClass().getName());
		try {
			Class clazz = Class.forName("com.shuangyang.test.utils.Test");
			Object obj = clazz.newInstance();
			Method appendMethod = clazz.getDeclaredMethod("setName", String.class);
			appendMethod.invoke(obj, "张三");
			
			Method appendMethod1 = clazz.getDeclaredMethod("getName", null);
			appendMethod1.invoke(obj, null);
			 
			//StringBuffer sb = (StringBuffer) clazz.newInstance();
			//System.out.println(sb.getClass().getName());
			//sb.append("test");
			//System.out.println(sb.toString());
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 

	} 

}
