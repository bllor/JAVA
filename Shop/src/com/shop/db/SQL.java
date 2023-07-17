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
	
	
	

	public static final String INSERT_ORDER="INSERT INTO `Order` SET"
											+" OrderId=?,"
											+" OrderProduct=? ,"
											+" OrderCount = ?,"
											+" OrderDate= NOW()";
			
	
	public static final String SELECT_ORDERS = "SELECT"
												+" a.*, "
												+"b.name, "
												+"c.prodName"
												+" from `order` as a "
												+" join `customer` as b on a.orderid = b.custid"
												+" join `product` as c on a.orderproduct = c.prodNo"
												+" where `orderId`=?";


	
	public static final String SELECT_PRODUCTS="SELECT * FROM `Product` WHERE `stock`>'0'";
	public static final String SELECT_PRODUCT ="SELECT * FROM `PRODUCT` WHERE `prodNo`=?"; 
	public static final String UPDATE_PRODUCTS_STOCK ="UPDATE `product` set `STOCK` = `STOCK` - ? "
														+"WHERE `prodNo`=?";



}
