package cn.fzn.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fzn.ssm.pojo.User;

public interface UserMapper {

	int insert(User user);
	
	User selectByPrimaryKey(Integer id);
	
	List<User> selectList();
	
	int deleteByPrimaryKey(Integer id);

}
