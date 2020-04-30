package cn.fzn.ssm.service;

import java.util.List;

import cn.fzn.ssm.pojo.User;

public interface UserService {
	
	int insert(User user);
	
	User selectByPrimaryKey(Integer id);
	
	List<User> selectList();
	
	int deleteByPrimaryKey(Integer id);
}
