package com.jlkj.web.shopnew.exception;

import com.jlkj.web.shopnew.exception.BussinessException;
import com.jlkj.web.shopnew.exception.ErrorObject;

public class VersionUpPayManageInterfaceException extends BussinessException {
	public VersionUpPayManageInterfaceException(ErrorObject error ) {
		super(error);
	}
}
