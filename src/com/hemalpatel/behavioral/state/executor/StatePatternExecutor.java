package com.hemalpatel.behavioral.state.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.state.bean.Context;
import com.hemalpatel.behavioral.state.bean.State;
import com.hemalpatel.behavioral.state.bean.TvContext;
import com.hemalpatel.behavioral.state.bean.TvOffState;
import com.hemalpatel.behavioral.state.bean.TvOnState;

public class StatePatternExecutor implements BaseExecutor {

	@Override
	public void run() {
		printTitle();
		
		State tvOnState = new TvOnState();
		State tvOffState = new TvOffState();
		
		Context tvcontext = new TvContext(tvOnState);
		tvcontext.doAction();
		
		tvcontext.setState(tvOffState);
		tvcontext.doAction();
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- State Pattern\n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF State Pattern --");
		System.out.println("*********************************\n");
	}


}
