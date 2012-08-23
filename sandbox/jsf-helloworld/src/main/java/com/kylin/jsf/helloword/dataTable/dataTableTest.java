package com.kylin.jsf.helloword.dataTable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class dataTableTest {

	private List<User> lists = new ArrayList<User>();
	
	public dataTableTest() {
		for(int i = 0 ; i < 10 ; i ++) {
			User user = new User();
			user.setUser("User-" + i);
			user.setPass("********");
			user.setName("Kylin Soong");
			user.setDatetime(new Date());
			lists.add(user);
		}
	}

	@Produces
	@Named
	public List<User> getLists() {
		return lists;
	}
}
