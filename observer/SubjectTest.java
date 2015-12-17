package com.navneet.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class SubjectTest implements Subject {

	public List<Observer> observerList=null;
	public String message=null;
	private boolean changed;
	private final Object Mutex=new Object();
	
	 public SubjectTest() {
		this.observerList=new ArrayList<>();
	}
	@Override
	public void register(Observer obj) {
		// add the observer here if it is not already added
		if(obj==null) throw new NullPointerException("Null Observer");
		synchronized (Mutex) {
			if(!observerList.contains(obj)){
				observerList.add(obj);
			}
		}
		

	}

	@Override
	public void unregister(Observer obj) {
		// remove the observer here from the list if he is unregistering
		// from the events of the subject

			synchronized (Mutex) {
				observerList.remove(obj);
			}
			

		
	}

	@Override
	public void notifyObservers() {
		// here call the getNotification () method on all observers
		List<Observer> observersLocal=null;
		synchronized (Mutex) {
			if(!changed){
				return;
			}
				observersLocal=new ArrayList<>(this.observerList);
				this.changed=false;
			}
		for(Observer obj:observersLocal){
			obj.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
	}

}
