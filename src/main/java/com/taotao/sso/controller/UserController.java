package com.taotao.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.utils.TaotaoResult;
import com.taotao.pojo.TbUser;
import com.taotao.sso.service.UserService;

/**
 * 用户处理Controller
 * @author Administrator
 *
 */

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/check/{param}/{type}")
	@ResponseBody
	public TaotaoResult checkUserDate(
			@PathVariable String param,
			@PathVariable int type){
		TaotaoResult result = userService.checkDate(param, type);
		return result;
	}
	
	@RequestMapping(value="/user/register",method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult register(TbUser user){
		TaotaoResult result = userService.register(user);
		return result;
	}
	

}
