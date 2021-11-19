package com.microservice.eurekaclient.apigateway.fliter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class MyZuulFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {

		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println(
				"REQUEST METHOD: " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());

		if (ctx.getRequest().getRequestURI().contains("customer")) {
			ctx.setResponseStatusCode(400);
			ctx.setResponseBody("Zuul is preventing");
			ctx.setSendZuulResponse(false);
		}

		return null;

	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
