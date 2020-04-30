package cn.fzn.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.fzn.ssm.pojo.User;
import cn.fzn.ssm.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String selectList(Model m) {
		List<User> list = userService.selectList();
		m.addAttribute("users", list);
		return "forward:/index.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer userId) {
		userService.deleteByPrimaryKey(userId);
		return "redirect:/list.do";
	}
}
