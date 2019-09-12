package com.jlkj.web.shopnew.exception;

import com.jlkj.web.shopnew.exception.BussinessException;
import com.jlkj.web.shopnew.exception.ErrorObject;

public class PwdException extends BussinessException {
	public PwdException(ErrorObject error ) {
		super(error);

	}
}
