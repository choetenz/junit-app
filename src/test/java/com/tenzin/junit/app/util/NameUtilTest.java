package com.tenzin.junit.app.util;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.tenzin.junit.app.test.Account;
import com.tenzin.junit.app.test.Billing;

public class NameUtilTest {

	private NameUtil nameUtil = new NameUtil();
	
	@Test
	@Category({Account.class, Billing.class})
	public void testGetFormattedNameNull() {
		//fail("Not yet implemented");
		String result = nameUtil.getFormattedName(null, null);
		assertEquals("", result);
		
	}
	
	@Test
	@Category({Account.class})
	public void testGetFormattedName() {
		//fail("Not yet implemented");
		String result = nameUtil.getFormattedName("John", "Mathew");
		//assertEquals("John Mathew", result);
		
		//assertThat(result, either(containsString("Mercy")).or(containsString("Dsouza")));
		assertThat(result, containsString("John Mathew"));
		//assertThat(result, both(containsString("John")).and(containsString("Mathew")));
		//assertThat(result, allOf(containsString("John"),(containsString("Dsouza"))));
		//assertThat(result, anyOf(containsString("John"),(containsString("Dsouza"))));
	}
	
	@Test
	@Category({Billing.class})
	public void testGetFormattedNameFirstName() {
		//fail("Not yet implemented");
		String result = nameUtil.getFormattedName("John", null);
		assertEquals("John", result);
	}
	
	@Test
	public void testGetFormattedNameLastName() {
		//fail("Not yet implemented");
		String result = nameUtil.getFormattedName( null, "John");
		assertEquals("John", result);
	}
	
	@Test
	public void testGetFormattedNameTrim() {
		//fail("Not yet implemented");
		String result = nameUtil.getFormattedName("  John", "Mathew  ");
		assertEquals("John Mathew", result);
	} 

}
