package com.jlkj.web.shopnew.exception;

import com.jlkj.web.shopnew.exception.ErrorObject;

/**
 * @author huxin
 * @Date 2017年6月13日 下午2:18:04
 */
public class Errors {

	public static class SystemError {
		public final static ErrorObject systemException = new ErrorObject("1000", "systemException", "系统异常");
		public final static ErrorObject dbException = new ErrorObject("1001", "dbException", "数据库异常");
	}

	/**
	 * 
	 * @Description 公共
	 * @author wzq
	 * @date 2017年11月6日 下午2:46:33
	 */
	public static class commonError {
		public final static ErrorObject resultEmptyError = new ErrorObject("2000", "resultEmptyError", "返回结果为空");
		public final static ErrorObject signError = new ErrorObject("2001", "signError", "签名验证异常");
		public final static ErrorObject paramEmptyError = new ErrorObject("2002", "paramEmptyError", "必要参数为空");
		public final static ErrorObject userNotLoginOrExpiredError = new ErrorObject("2003", "userNotLoginOrExpiredError", "用户未登录或已失效");
		public final static ErrorObject headerParamsEmptyException = new ErrorObject("2004", "headerParamsEmptyException", "请求头部数据异常");
		public final static ErrorObject platformParamCheckException = new ErrorObject("2005", "platformParamCheckException", "请求头部platform参数输入错误");
		public final static ErrorObject tokenNotExistException = new ErrorObject("2006", "tokenNotExistException", "token不存在或失效");
		public final static ErrorObject userNotLoginOrExpired = new ErrorObject("2007", "userNotLoginOrExpired", "用户未登录或已失效");
		public final static ErrorObject pwdException = new ErrorObject("2008", "pwdException", "登录密码为8-16位字母与数字，且至少包含一位数字和字母");
		public final static ErrorObject paramError = new ErrorObject("2009", "paramEmptyError", "参数错误");
		public final static ErrorObject llParamEmptyError = new ErrorObject("2010", "llParamEmptyError", "连连返回参数为空");

	}

	/**
	 * 
	 * @Description 登录
	 * @author wzq
	 * @date 2017年11月6日 下午2:46:40
	 */
	public static class AuthenticateError {
		public final static ErrorObject mobilePhoneEmptyError = new ErrorObject("3000", "mobilePhoneEmptyError", "手机号为空");
		public final static ErrorObject mobilePhoneFormatError = new ErrorObject("3001", "mobilePhoneFormatError", "手机号格式错误");
		public final static ErrorObject passWordEmptyError = new ErrorObject("3002", "passWordEmptyError", "密码为空");
		public final static ErrorObject accountEmptyError = new ErrorObject("3003", "accountEmptyError", "未获取到账户信息");
		public final static ErrorObject notCarBorrowerForbidLoginError = new ErrorObject("3004", "notCarBorrowerForbidLoginError", "非车贷借款人不可登录");
		public final static ErrorObject passWordError = new ErrorObject("3005", "passWordError", "密码错误");
		public final static ErrorObject userLockedError = new ErrorObject("3006", "userLockedError", "密码错误次数过多，账户已锁定");
		public final static ErrorObject notSupportUser = new ErrorObject("3007", "notSupportUser", "暂不支持该类型的用户");

	}

	/**
	 * 
	 * @Description 账户设置
	 * @author wzq
	 * @date 2017年11月6日 下午3:03:06
	 */
	public static class SettingsError {
		public final static ErrorObject userLockedError = new ErrorObject("4000", "userLockedError", "密码错误次数过多，账户已锁定");
		public final static ErrorObject primaryPwdErr = new ErrorObject("4001", "primaryPwdErr", "原密码错误");
		public final static ErrorObject bothPwdAreTheSame = new ErrorObject("4002", "bothPwdAreTheSame", "新密码不能和原密码相同");
		public final static ErrorObject NewPwdTheSameToPay = new ErrorObject("4003", "NewPwdTheSameToPay", "新密码不能和您的交易密码相同");

	}

	public static class SmsError {
		public final static ErrorObject smsSendFail = new ErrorObject("5000", "smsSendFail", "短信发送失败");
		public final static ErrorObject smsSendIntervalTooShort = new ErrorObject("5001", "smsSendIntervalTooShort", "发送次数过于频繁");
		public final static ErrorObject smsSendTimesTooMany = new ErrorObject("5002", "smsSendTimesTooMany", "发送次数过多，请稍后再试");
		public final static ErrorObject smsTemplateNotExist = new ErrorObject("5003", "smsTemplateNotExist", "短信发送模板不存在");
		public final static ErrorObject insertDataFail = new ErrorObject("5004", "insertDataFail", "短信内容插入数据库异常");
		public final static ErrorObject smsCodeRedisError = new ErrorObject("5005", "smsCodeRedisError", "redis中获取短信验证码失败");
		public final static ErrorObject smsCodeErrorLineUp = new ErrorObject("5006", "smsCodeErrorTooMany", "手机验证码错误次数已达上线，请重新获取");
		public final static ErrorObject smsCodeError = new ErrorObject("5007", "smsCodeError", "短信验证码输入错误");

	}

	/**
	 * 
	 * @Description 绑卡
	 * @author wzq
	 * @date 2017年11月6日 下午3:03:06
	 */
	public static class BindCardError {
		public final static ErrorObject payBankExistError = new ErrorObject("6000", "payBankExistError", "已经绑定银行卡");
		public final static ErrorObject payBankNoEmptyError = new ErrorObject("6001", "payBankNoEmptyError", "银行卡号为空");
		public final static ErrorObject payBankNotFindError = new ErrorObject("6002", "payBankNotFindError", "代扣银行卡不存在");
		public final static ErrorObject bindSignResultError = new ErrorObject("6003", "bindSignResultError", "绑卡签约失败");
		public final static ErrorObject orderNoEmptyError = new ErrorObject("6004", "orderNoEmptyError", "订单号为空");
		public final static ErrorObject payBankOrderNoNotFindError = new ErrorObject("6005", "payBankOrderNoNotFindError", "该绑卡订单不存在");
		public final static ErrorObject bindSignResultProcessingError = new ErrorObject("6006", "bindSignResultProcessingError", "绑卡签约处理中");

	}

	/**
	 * 
	 * @Description 代扣签约
	 * @author wzq
	 * @date 2017年11月6日 下午3:03:06
	 */
	public static class WithholdSignError {
		public final static ErrorObject unSignCarApplyNotFindError = new ErrorObject("7000", "unSignCarApplyNotFindError", "未签约申请单不存在");
		public final static ErrorObject carRepaymentPlansNotFindError = new ErrorObject("7001", "carRepaymentPlansNotFindError", "还款计划不存在");
		public final static ErrorObject notCarBorrowApplyError = new ErrorObject("7002", "notCarBorrowApplyError", "无申请单信息");
		public final static ErrorObject carApplyNotFindError = new ErrorObject("7003", "carApplyNotFindError", "申请单不存在");
		public final static ErrorObject carApplyNotInUnSignError = new ErrorObject("7004", "carApplyNotInUnSignError", "申请单处于非未签约状态");
		public final static ErrorObject applyNotEmptyError = new ErrorObject("7005", "applyNotEmptyError", "申请单号为空");
		public final static ErrorObject repayPlanNotFindError = new ErrorObject("7006", "repayPlanNotFindError", "还款计划不存在");
		public final static ErrorObject payBankNotFindError = new ErrorObject("7007", "payBankNotFindError", "代扣银行卡不存在");

	}

	/**
	 * 
	 * @Description 展期
	 * @author wzq
	 * @date 2017年11月6日 下午3:03:06
	 */
	public static class ExtendError {
		public final static ErrorObject signCarApplyNotFindError = new ErrorObject("8000", "signCarApplyNotFindError", "申请单不存在");
		public final static ErrorObject extendChangeApplyNotFindError = new ErrorObject("8001", "extendChangeApplyNotFindError", "展期申请不存在");
		public final static ErrorObject extendChangeApplyWaitDealExistError = new ErrorObject("8002", "extendChangeApplyWaitDealExistError", "展期申请待处理申请存在，请完成后重试");
		public final static ErrorObject extendPayLogNotFindError = new ErrorObject("8003", "extendPayLogNotFindError", "展期费用支付记录不存在");
		public final static ErrorObject extendPayLogNotInWaitPayError = new ErrorObject("8004", "extendPayLogNotInWaitPayError", "展期费用支付记录处于非待支付状态");
		public final static ErrorObject extendChangeApplyNotInWaitPayError = new ErrorObject("8005", "extendChangeApplyNotInWaitPayError", "展期申请处于非待支付状态");
		public final static ErrorObject extendPayError = new ErrorObject("8006", "extendPayError", "展期费用支付失败");
		public final static ErrorObject extendPayResultProcessingError = new ErrorObject("8007", "extendPayResultProcessingError", "展期费用支付处理中");
		public final static ErrorObject carApplyNotFindError = new ErrorObject("8008", "carApplyNotFindError", "申请单不存在");
		public final static ErrorObject carApplyNotInSignError = new ErrorObject("8009", "carApplyNotInSignError", "申请单处于非签约状态");
		public final static ErrorObject applyNotEmptyError = new ErrorObject("8010", "applyNotEmptyError", "申请单号为空");
		public final static ErrorObject extendPayLogNotInWaitPayOrProcessingError = new ErrorObject("8011", "extendPayLogNotInWaitPayOrProcessingError", "展期费用支付记录处于非待支付/处理中状态");
		public final static ErrorObject extendChangeApplyNotInWaitPayOrProcessingError = new ErrorObject("8012", "extendChangeApplyNotInWaitPayOrProcessingError",
				"展期申请处于非待支付/处理中状态");
		public final static ErrorObject repayPlanNotFindError = new ErrorObject("8013", "repayPlanNotFindError", "还款计划不存在");
		public final static ErrorObject payBankNotFindError = new ErrorObject("8014", "payBankNotFindError", "代扣银行卡不存在");
		public final static ErrorObject carExtApplyNotFindError = new ErrorObject("8015", "carExtApplyNotFindError", "展期申请单不存在");
		public final static ErrorObject carApplyNotInExtendWaitPayError = new ErrorObject("8016", "carApplyNotInExtendWaitPayError", "申请单处于非展期待支付状态");
		public final static ErrorObject notExtendError = new ErrorObject("8017", "notExtendError", "非展期业务");
		public final static ErrorObject canNotApplyExtendDayLimitError = new ErrorObject("8018", "canNotApplyExtendDayLimitError", "申请单最后还款日3天内不可申请展期");

	}

	/**
	 * 
	 * @Description 提前还款
	 * @author wzq
	 * @date 2017年11月6日 下午3:03:06
	 */
	public static class PrePayError {
		public final static ErrorObject signCarApplyNotFindError = new ErrorObject("9000", "signCarApplyNotFindError", "签约申请单不存在");
		public final static ErrorObject prePayChangeApplyNotFindError = new ErrorObject("9001", "prePayChangeApplyNotFindError", "提前还款申请不存在");
		public final static ErrorObject prePayChangeApplyWaitDealExistError = new ErrorObject("9002", "prePayChangeApplyWaitDealExistError", "提前还款申请待处理申请存在，请完成后重试");
		public final static ErrorObject prePayPayLogNotFindError = new ErrorObject("9003", "prePayPayLogNotFindError", "提前还款本息支付记录不存在");
		public final static ErrorObject prePayPayLogNotInWaitPayError = new ErrorObject("9004", "prePayPayLogNotInWaitPayError", "提前还款本息支付记录处于非待支付状态");
		public final static ErrorObject prePayChangeApplyNotInWaitPayError = new ErrorObject("9005", "prePayChangeApplyNotInWaitPayError", "提前还款申请处于非待支付状态");
		public final static ErrorObject prePayPayError = new ErrorObject("9006", "prePayPayError", "提前还款本息支付失败");
		public final static ErrorObject prePayPayResultProcessingError = new ErrorObject("9007", "prePayPayResultProcessingError", "提前还款本息支付处理中");
		public final static ErrorObject carApplyNotFindError = new ErrorObject("9008", "carApplyNotFindError", "申请单不存在");
		public final static ErrorObject carApplyNotInSignError = new ErrorObject("9009", "carApplyNotInSignError", "申请单处于非签约状态");
		public final static ErrorObject applyNotEmptyError = new ErrorObject("9010", "applyNotEmptyError", "申请单号为空");
		public final static ErrorObject prePayPayLogNotInWaitPayOrProcessingError = new ErrorObject("9011", "prePayPayLogNotInWaitPayOrProcessingError", "提前还款本息支付记录处于非待支付/处理中状态");
		public final static ErrorObject prePayChangeApplyNotInWaitPayOrProcessingError = new ErrorObject("9012", "prePayChangeApplyNotInWaitPayOrProcessingError",
				"提前还款申请处于非待支付/处理中状态");
		public final static ErrorObject payBankNotFindError = new ErrorObject("9013", "payBankNotFindError", "代扣银行卡不存在");
		public final static ErrorObject carApplyNotInPrePayWaitPayError = new ErrorObject("9014", "carApplyNotInPrePayWaitPayError", "申请单处于非提前还款待支付状态");
		public final static ErrorObject repayPlanNotFindError = new ErrorObject("9015", "repayPlanNotFindError", "还款计划不存在");
		public final static ErrorObject notPrePayError = new ErrorObject("9016", "notPrePayError", "非提前还款业务");
		public final static ErrorObject canNotApplyPrePayDayLimitError = new ErrorObject("9017", "canNotApplyPrePayDayLimitError", "申请单最后还款日3天内不可申请提前还款");

	}

	/**
	 * 
	 * @Description 银行卡定期扣款
	 * @author wzq
	 * @date 2017年11月6日 下午3:03:06
	 */
	public static class BankRepayError {
		public final static ErrorObject bankRepayPlanPayLogNotFindError = new ErrorObject("10000", "bankRepayPlanPayLogNotFindError", "银行卡定期扣款支付记录不存在");
		public final static ErrorObject bankRepayPlanPayLogNotInProcessingError = new ErrorObject("10001", "bankRepayPlanPayLogNotInProcessingError", "银行卡定期扣款支付记录处于非处理中状态");
		public final static ErrorObject repayPlanNotFindError = new ErrorObject("10002", "repayPlanNotFindError", "还款计划不存在");
		public final static ErrorObject applyNotFindError = new ErrorObject("10003", "applyNotFindError", "申请单不存在");
		public final static ErrorObject repayPlanNotInNoRepayError = new ErrorObject("10004", "repayPlanNotInNoRepayError", "该还款计划处于非未还款状态");
		public final static ErrorObject bankRepayPlanPayLogNotInWaitPayError = new ErrorObject("10005", "bankRepayPlanPayLogNotInWaitPayError", "银行卡定期扣款支付记录处于非待支付状态");

	}

	/**
	 * 
	 * @Description 版本
	 * @author wzq
	 * @date 2017年8月18日 下午1:54:46
	 */
	public static class VersionError {
		public final static ErrorObject versionNumberIsEmpty = new ErrorObject("c085", "versionNumberIsEmpty", "版本号为空");
		public final static ErrorObject versionNumberIsNotExist = new ErrorObject("c086", "versionNumberIsNotExist", "该版本号不存在");
		public final static ErrorObject noVersionError = new ErrorObject("c087", "noVersionError", "无版本信息");

	}
}
