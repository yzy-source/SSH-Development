package com.chinasoft.app.interceptor;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.app.action.MessageAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MessageInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		String username=(String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(username==null)
		{
			MessageAction action=(MessageAction) arg0.getAction();
			action.addActionError("权限不足，请登陆后评论");
			return "fail";
		}else   
			return arg0.invoke();
	    }
	}
