package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper{

	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	
	public int insertProduct(ProductVO vo) {
		return 0;
	}
	public ProductVO selectProduct(String prodNo) {
		ProductVO vo =null;
		try {
			
			conn=getConnection();
			psmt= conn.prepareStatement(prodNo);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return vo;
	}
	public List<ProductVO> selectProducts() {
		
		List<ProductVO> products = new ArrayList<>();
		
		try {
		conn = getConnection();
		stmt= conn.createStatement();
		rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
		while(rs.next()) {
			
			ProductVO vo = new ProductVO();
			vo.setProdNo(rs.getInt(1));  //컬럼명으로도 가져올 수 있다. rs.getInt(prodNo);
			vo.setProdName(rs.getString(2));
			vo.setStock(rs.getInt(3));
			vo.setPrice(rs.getInt(4));
			vo.setCompany(rs.getString(5));
			products.add(vo);
		}
		
		close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return products;
	}
	public void updateProductStock(int prodNo, int prodCount) {
		
		try {
			conn=getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCTS_STOCK);
			psmt.setInt(1, prodCount);
			psmt.setInt(2, prodNo);
			
			psmt.executeUpdate();
			close();
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public int deleteProduct(String prodNo) {
		return 0;
	}
	
}
