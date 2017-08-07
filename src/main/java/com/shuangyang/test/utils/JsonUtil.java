package com.shuangyang.test.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mysql.fabric.xmlrpc.base.Array;
import com.shuangyang.test.bean.User;

public class JsonUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, User> map = new HashMap<String,User>();
		map.put("user1", new User("1", "张三", 20));
		map.put("user2", new User("2", "李四", 21));
		map.put("user3", new User("3", "王五", 22));
		
		List<Object> list = new ArrayList<>();
		list.add(new User("5", "李五", 25));
		list.add(new User("6","李六",30));
		list.add(100);
		list.add(200);
		
		JSONObject json = new JSONObject();
		json.put("key1", new User("4", "何六", 26));
		json.put("key2_map", map);
		json.put("list", list);
		String json2str = json.toJSONString();
		System.out.println(json2str);
		
	}
}
