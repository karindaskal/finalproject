package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.student;

class teststudent {
	static student s;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s =new student("karin", 208511658, factorySubject.createFactory("computer science").createDepartment());
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetSubject() {
		s.getSubject("OOP");
	}

	@Test
	void testGetAverage() {
		fail("Not yet implemented");
	}

	@Test
	void testPrintgrade() {
		fail("Not yet implemented");
	}

}
