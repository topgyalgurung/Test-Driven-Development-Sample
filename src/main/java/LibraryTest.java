package src.test.java;

import static org.junit.Assert.*;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

import src.main.java.Library;

public class LibraryTest {
    @Test 
    //public void test(){
    public void shouldRegisterMembers() {
    	//given
    	Library library=new Library();
        //fail("Not yet implemented");
    	
    	//when
    	Member newMember=library.registerMember("Ted");
    	
    	//then check for member's name to be same
    	// assertThat(newMember.getName(), is(equalTo("Ted")));
    	//assertThat
    	MatcherAssert.assertThat(newMember.getName(),equalTo("Ted"));
    }
    
    @Test
    public void shouldNotRegisterAgainWhenAlreadyMember() {
    	Library lib=new Library();
    	lib.registerMember("Ted");
    	
    	try {
    		lib.registerMember("Ted"); //when we register again, should fail
    		fail("should not have registered Ted twice")
    	}catch(AlreadyMemberException e) {
    		//success
    	}
    	
    }

    
}
