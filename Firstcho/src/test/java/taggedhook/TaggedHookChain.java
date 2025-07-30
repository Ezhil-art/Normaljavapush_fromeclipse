package taggedhook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHookChain {
	
	
	@Before ("@First")
	public void tag1() {
		System.out.println("tag1");
	}
	
	@After ("@First")
   public void tag2() {
		System.out.println("tag2");
	}
	
	@Before ("@Second")
	public void tag3() {
		System.out.println("tag1");
	}
	
	@After ("@Second")
   public void tag4() {
		System.out.println("tag2");
	}
	@Before ("@Third")
	public void tag5() {
		System.out.println("tag1");
	}
	
	@After ("@Third")
   public void tag6() {
		System.out.println("tag2");
	}
	@Before ("@Fourth")
	public void tag7() {
		System.out.println("tag1");
	}
	
	@After ("@Fourth")
   public void tag8() {
		System.out.println("tag2");
	}
	   
   
}


