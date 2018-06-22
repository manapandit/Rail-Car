package edu.neu.csye6200.train;

import java.util.Observable;
import java.util.Observer;

public class EventSubscriber implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("ES recieved on update from" + arg0);
		System.out.println("                  message:" + arg1);
	}

}
