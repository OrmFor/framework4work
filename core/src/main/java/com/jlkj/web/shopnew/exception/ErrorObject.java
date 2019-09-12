package com.jlkj.web.shopnew.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * @author jiangjingjing
 * @date 2017 上午11:49:57
 */
@Getter
@Setter
@AllArgsConstructor
public class ErrorObject implements Serializable{
	
	private String code ;
	
	private String name ;
	
	private String message ; 
	
}
