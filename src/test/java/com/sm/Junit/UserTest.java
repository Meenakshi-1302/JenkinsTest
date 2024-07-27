package com.sm.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	 private User user;
	 
	    @BeforeEach
	    public void setUp() {
	        user = new User("John Doe");
	    }
	 
	    @Test
	    public void testUserIsNotNull() {
	        // Check that the user object is not null
	        assertNotNull(user, "User should not be null");
	    }
	 
	    @Test
	    public void testUserNameIsNotNull() {
	        // Check that the user's name is not null
	        assertNotNull(user.getName(), "User name should not be null");
	    }
	 
	    @Test
	    public void testNullUser() {
	        User nullUser = null;
	        // Check that nullUser is null
	        assertNull(nullUser, "nullUser should be null");
	    }
	 
	    @Test
	    public void testSameUserReference() {
	        User anotherUserReference = user;
	        // Check that anotherUserReference refers to the same object as user
	        assertSame(user, anotherUserReference, "Both references should point to the same object");
	    }

	

}
