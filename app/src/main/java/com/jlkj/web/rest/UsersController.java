package com.jlkj.web.rest;

import com.jlkj.web.core.ResultCode;
import com.jlkj.web.core.StatusCode;
import com.jlkj.web.pojo.User;
import com.jlkj.web.service.IUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/payapi/3.0")
@RestController
public class UsersController extends BaseController {
	private static final Logger LOGGER = LogManager.getLogger(UsersController.class);
	/*@Autowired
	private SessionUtil sessionUtil;*/
	@Autowired
    private IUser userService;
	

	@RequestMapping("/getUser")
	public ResultCode getUser(){
	    User user = userService.selectByUserName("老吴");

	    return new ResultCode(StatusCode.SUCCESS,user);
    }



	@RequestMapping("/insertUser")
	@Transactional(rollbackFor = RuntimeException.class)
	public ResultCode insertUser(){
		User user = new User();
		user.setUserCode("12317567");
		user.setUserName("老吴1");
		userService.insert(user);
		if(true) {
			throw new RuntimeException("ERROR");
		}
		return new ResultCode(StatusCode.SUCCESS);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResultCode index(){

		return new ResultCode(StatusCode.SUCCESS);
	}
}