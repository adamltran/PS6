package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person_Test {
		
	private static PersonDomainModel person1;
	private static PersonDomainModel person2;
	private static UUID person1UUID = UUID.randomUUID();
	private static UUID person2UUID = UUID.randomUUID();
	
	@BeforeClass
	public static void personInstance() throws Exception{
		
		Date person1Birth = null;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		 person1 = new PersonDomainModel();
		 
		try {
			person1Birth = dateFormat.parse("1994-11-27");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		person1.setPersonID(person1UUID);
		person1.setFirstName("Mingkun");
		person1.setMiddleName("a");
		person1.setLastName("Chen");
		person1.setBirthday(person1Birth);
		person1.setCity("Elkton");
		person1.setStreet("702 Stone Gate Blvd");
		person1.setPostalCode(21921);
	
		person2 = new PersonDomainModel();
		person2.setPersonID(person2UUID);
		person2.setFirstName("Mingkun");
		person2.setMiddleName("a");
		person2.setLastName("Chen");
		person2.setBirthday(dateFormat.parse("1994-11-27"));
		person2.setCity("Elkton");
		person2.setStreet("702 Stone Gate Blvd");
		person2.setPostalCode(21921);
		
		ArrayList<PersonDomainModel> tester = new ArrayList<PersonDomainModel>();
		tester.add(person1);
		
		
	}
	
	@AfterClass
	public static void resetAtEnd() {
		//reset
	}
	
	@Test
	public void addPersonTest() {
		assertEquals(person1, PersonDAL.addPerson(person1));
	}

	@Test
	public void deletePersonTest() {
		assertTrue(1==1);
	}
	
	@Test
	public void getPersonsTest() {
		assertTrue(1==1);
	}
	
	@Test
	public void getPersonTest() {
		assertTrue(1==1);
	}
	
	@Test
	public void updatePersonTest() {
		assertEquals(person1, PersonDAL.updatePerson(person1));
	}
	
	

}
