package model;


import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import model.StudentsList;
import model.student;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

class TestStudentList {
	
	static StudentsList l;

	@BeforeAll
	public static void setUp() {
		 l =  StudentsList.getMySingleton();
		List<List<student>> booksData = l.readDataFromFile(); 
	}

	@Test
	public void testAddAndWriteToFile() {
		
		
		  l.addAndWriteToFile("drafting",208511668,90,"design");
		
		assertTrue("When adding new grade it should true", l.addAndWriteToFile("drafting",208511668,90,"design"));
		assertFalse("When adding not corect student return false", l.addAndWriteToFile("drafting",208511659,90,"design"));
		assertFalse("When adding not corect grade return false", l.addAndWriteToFile("drafting",208511668,200,"design"));
	
	}

	
	 @Test void testIsStudent() { 
	

		 assertTrue("when student is exist return true",l.isStudent(208511659, "lilach"));
		 assertFalse("when student isnot exist return flase",l.isStudent(1, "k"));
		 }
	 
	 @Test void testGetStudent() { 
		
		 assertEquals("return a specific student", 208511659, l.getStudent(208511659, "lilach").getId());
		 assertNull("the student is not exist return null", l.getStudent(111111111, "karin"));
	 } 
	 
}

