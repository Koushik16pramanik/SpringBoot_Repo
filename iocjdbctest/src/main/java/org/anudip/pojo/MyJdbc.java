package org.anudip.pojo;

import org.springframework.jdbc.core.JdbcTemplate;

public class MyJdbc {

	private JdbcTemplate jt;

	public MyJdbc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyJdbc(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public String toString() {
		return "MyJdbc [jt=" + jt + "]";
	}

	public void createTable() {
		jt.execute("create table pallabi(sid number(3) primary key, sname varchar(22))");

		System.out.println("table created check in oracle.....");
	}

}
