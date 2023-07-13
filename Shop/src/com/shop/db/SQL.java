package com.shop.db;

public class SQL {

	
	//CUSTOMER
	public static final String SELECT_CUSTOMER ="SELECT * FROM `Customer` WHERE custid =? ";
	public static final String INSERT_CUSTOMER ="INSERT INTO `CUSTOMER` set "
												+"custid =?,"
												+"name =?,"
												+"hp =?,"
												+"addr =?,"
												+"rdate =now()";
	

}
