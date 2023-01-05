package com.SpringJdbc;


import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable
{
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt)
	{
		this.jt = jt;
	}

	public void createTable1()
	{
		jt.execute("create table test(sno bigint(10), sname varchar(10))");
		// execute() returns void
		System.out.println("table created");
	}
}