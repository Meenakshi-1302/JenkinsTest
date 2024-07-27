package com.sm.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {
	 private static DatabaseConnection dbConnection;
	 
	    @BeforeAll
	    public static void init() {
	        dbConnection = new DatabaseConnection(); // Initialize the connection
	        dbConnection.connect(); // Connect to the database
	    }
	 
	    @AfterAll
	    public static void cleanUp() {
	        dbConnection.disconnect(); // Disconnect from the database
	    }
	 
	    @Test
	    public void testConnectionEstablished() {
	        assertTrue(dbConnection.isConnected(), "Database should be connected.");
	    }
	 
	    @Test
	    public void testAnotherDatabaseFunction() {
	        // Placeholder for another test
	        assertTrue(dbConnection.isConnected(), "Database should still be connected.");
	    }

	

}
