package sub05;

public class SQL {

	public final static String  INSERT_USER = "INSERT INTO `USER3` VALUES (?,?,?,?)";
	
	public final static String SELECT_USERS ="SELECT * FROM `USER3`";
	
	public final static String SELECT_USER = "SELECT* FROM `USER3` WHERE `uid`=?";
	
	public final static String UPDATE_USER = "UPDATE `USER3` SET "
												+ "name =?, "
												+ "hp=?, "
												+ "age=? "
												+ "where uid=?";
											
	
	public final static String DELETE_USER="DELETE FROM `USER3`"
											+"WHERE `uid`=?";
}
