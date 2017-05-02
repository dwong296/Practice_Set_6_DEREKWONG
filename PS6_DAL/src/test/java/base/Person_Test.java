package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {
	
private static PersonDomainModel per1 = new PersonDomainModel();
	private static UUID perUUID1 = UUID.randomUUID();
	private static  LocalDate perbirth = LocalDate.of(1998, 10, 11);
	private static PersonDomainModel per2 = new PersonDomainModel();
	private static UUID perUUID2 = UUID.randomUUID();
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		per1 = new PersonDomainModel();
		per1.setFirstName("Derek");
		per1.setLastName("Wong");
		per1.setBirthday(perbirth);
		per1.setCity("F");
		per1.setPostalCode(19717);
		per1.setStreet("20 Ray Street");
		per1.setPersonID(perUUID1);
		
		per2 = new PersonDomainModel();
		per2.setFirstName("Darryl");
		per2.setLastName("Wang");
		per2.setBirthday(perbirth);
		per2.setCity("G");
		per2.setPostalCode(18911);
		per2.setStreet("30 Ray Street");
		per2.setPersonID(perUUID2);
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		per1=null;
		per2=null;
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testadd() throws Exception {
		PersonDomainModel per1 = new PersonDomainModel();
		PersonDAL.addPerson(per1);
	}

	@Test
	public void testget() throws Exception{
		PersonDAL.addPerson(per1);
		String LastName = per1.getLastName();
		assertEquals("Wong",LastName);
	}
	
	@Test
	public void testupdate() throws Exception{
		PersonDAL.addPerson(per2);
		per2.setFirstName("Wizzler");
		
		PersonDAL.updatePerson(per2);
	}
	
	@Test
	public void TestDeletePerson() throws Exception{
		PersonDAL.addPerson(per1);
		PersonDAL.deletePerson(per1.getPersonID());

}
}
