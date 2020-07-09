package model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.addGrade;

class TestAddGrade {
	
	static addGrade l;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		l= new addGrade();
		
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
	void testAddgrade() {
		boolean b=l.addgrade("OOP", "computer science", 208511659, 90);
		assertFalse("when",b);
	}

}
;