package org.fkit.mapperProvider;

import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import org.fkit.domain.User;

public class UserDynaSqlProvider {
	// 动态插入
	public String insertUser(User user){
		
		return new SQL(){
			{
				INSERT_INTO("user");
				
				
				if(user.getLoginname() != null && !user.getLoginname().equals("")){
					VALUES("loginname", "#{loginname}");
				}
				if(user.getUsername() != null && !user.getUsername().equals("")){
					VALUES("username", "#{username}");
				}
				if(user.getPassword() != null && !user.getPassword().equals("")){
					VALUES("password", "#{password}");
				}
				if(user.getPhone() != null && !user.getPhone().equals("")){
					VALUES("phone", "#{phone}");
				}
				if(user.getAddress() != null && !user.getAddress().equals("")){
					VALUES("address", "#{address}");
				}
			}
		}.toString();
	}
	// 动态更新
		public String updateUser(User user){
			
			return new SQL(){
				{
					UPDATE("user");
					
					if(user.getLoginname() != null){
						SET(" loginname = #{loginname} ");
					}
					if(user.getUsername() != null){
						SET(" username = #{username} ");
					}
					if(user.getPassword()!= null){
						SET(" password = #{password} ");
					}
					if(user.getPhone()!= null){
						SET(" phone = #{phone} ");
					}
					if(user.getAddress()!= null){
						SET(" address = #{address} ");
					}
					//if(user.getStatus()!= null){
						//SET(" status = #{status} ");
					//}
					//if(user.getCreateDate()!= null){
						//SET(" create_date = #{createDate} ");
					//}
					WHERE(" user_id = #{user_id} ");
				}
			}.toString();
		}
}
