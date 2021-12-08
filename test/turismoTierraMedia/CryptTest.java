package turismoTierraMedia;

import org.junit.Assert;
import org.junit.Test;

import utils.Crypt;

public class CryptTest {
	String password = "prueba";
	String passwordIncorrecto = "pruebe";

	@Test
	public void testHash() {
		Object hashed = Crypt.hash(password);
		Assert.assertFalse(hashed.equals(password));
	}

	@Test
	public void testMatch() {
		Assert.assertTrue(Crypt.match(password, Crypt.hash(password)));
		Assert.assertFalse(Crypt.match(passwordIncorrecto, Crypt.hash(password)));
	}
	
	@Test
	public void testPasswordUser1() {
		String pass = "eowyn";
		Object hashed = Crypt.hash(pass);
		Assert.assertFalse(hashed.equals(pass));
		
		System.out.println(hashed);
	}
	
	@Test
	public void testPasswordUser2() {
		String pass = "gandalf";
		Object hashed = Crypt.hash(pass);
		Assert.assertFalse(hashed.equals(pass));
		
		System.out.println(hashed);
	}
	
	@Test
	public void testPasswordUser3() {
		String pass = "sam";
		Object hashed = Crypt.hash(pass);
		Assert.assertFalse(hashed.equals(pass));
		
		System.out.println(hashed);
	}
	
	@Test
	public void testPasswordUser4() {
		String pass = "galadriel";
		Object hashed = Crypt.hash(pass);
		Assert.assertFalse(hashed.equals(pass));
		
		System.out.println(hashed);
	}
	
	@Test
	public void testPasswordUser5() {
		String pass = "saruman";
		Object hashed = Crypt.hash(pass);
		Assert.assertFalse(hashed.equals(pass));
		
		System.out.println(hashed);
	}
	
	@Test
	public void testPasswordUser6() {
		String pass = "gollum";
		Object hashed = Crypt.hash(pass);
		Assert.assertFalse(hashed.equals(pass));
		
		System.out.println(hashed);
	}

	@Test
	public void testPassworAdmin() {
		String pass = "ale";
		Object hashed = Crypt.hash(pass);
		Assert.assertFalse(hashed.equals(pass));
		
		System.out.println(hashed);
	}
	


}
