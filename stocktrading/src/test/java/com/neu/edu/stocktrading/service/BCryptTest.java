package com.neu.edu.stocktrading.service;

//import org.junit.Assert;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.util.Assert;

import java.util.function.Supplier;

public class BCryptTest {
	
	@Test
	public void generateEncryptedPasswordTest() 
	{
		String actualEncryptedPass = BCrypt.hashpw("Pass@123", BCrypt.gensalt());
		Assert.isTrue(BCrypt.checkpw("Pass@123", actualEncryptedPass), new Supplier<String>() {
			@Override
			public String get() {
				return null;
			}
		});
	}
}