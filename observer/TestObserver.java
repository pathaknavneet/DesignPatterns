package com.navneet.designpatterns;

public class TestObserver {

	public static void main(String[] args) {
		//create subject
		SubjectTest sub1=new SubjectTest();
		
		//create observers
		Observer obj1=new ObserverTest("obj1");
		Observer obj2=new ObserverTest("obj2");
		Observer obj3=new ObserverTest("obj3");
		
		// register observers
		sub1.register(obj1);
		sub1.register(obj2);
		sub1.register(obj3);
		
		//attach observers to subject 
		obj1.setSubject(sub1);
		obj2.setSubject(sub1);
		obj3.setSubject(sub1);
		
		obj1.update();
		
		sub1.postMessage("hello world how are you");
		
		
		
	}
}
