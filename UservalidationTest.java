package JunitTest;

    import org.junit.Assert;
    import org.junit.Test;
	import java.util.Arrays;
	import java.util.Collection;
	 
	import org.junit.Test;
	import org.junit.Before;

	import org.junit.runners.Parameterized;
	import org.junit.runners.Parameterized.Parameters;

import JunitMain.user_validation;

import org.junit.runner.RunWith;
	import static org.junit.Assert.assertEquals;

	public class user_validationTest {	
	@Test
	public void firstnameTest() {
		user_validation ur = new user_validation();
		boolean string = ur.firstname();
		Assert.assertEquals(true, string);
	}

	@Test
	public void lastnameTest() {
		boolean string = user_validation.lastname();
		Assert.assertEquals(true, string);
	}
	
	@Test
    	public void emailTest(){
    	boolean emailid = user_validation.email("abc+100@gmail.com");
    	Assert.assertEquals(true, emailid);
    }

	@Test
   	 public void mobilenumberTest(){
		boolean mobileno = user_validation.mobilenumber();
    	Assert.assertEquals(true,mobileno);
    }
	@Test
  	public void rule1Test(){
		boolean passwordchar= user_validation.Rule1();
  	Assert.assertEquals(true, passwordchar);
  }
	@Test
  	public void rule2Test(){
		boolean passworduppercase= user_validation.Rule2();
  	Assert.assertEquals(true, passworduppercase);
  }
	@Test
  	public void rule3Test(){
		boolean number= user_validation.Rule3();
  	Assert.assertEquals(true, number);
  }
	
	@Test
  	public void rule4Test(){
		boolean specialcharacter= user_validation.Rule4();
  	Assert.assertEquals(true, specialcharacter);
  }


	
}
