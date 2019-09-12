package com.jlkj.web.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 
 * @Description 基础Controller
 * @author wzq
 * @date 2017年6月15日 下午6:15:00
 */
public class BaseController {

	/**
	 * 
	 * @Title: getRequest
	 * @Description 取request
	 * @author wzq
	 * @date 2017年6月15日 下午6:15:07
	 * @param @return
	 * @return HttpServletRequest
	 */
	public HttpServletRequest getRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}

}
