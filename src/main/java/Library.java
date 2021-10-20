package src.main.java;

import src.test.java.*;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;

public class Library {
	
	private final Collection<Member> members=new ArrayList<>();
	
	
	public Member registerMember(String name) {
		Member newMember=new Member(name);
		if(members.contains(newMember)) {
			throw new AlreadyMemberException();
		}
		members.add(newMember);
		
		return new Member(name);
		
	}
	
}
