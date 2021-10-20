package src.main.java;
public class Member{
	private final String name;
	
	public Member(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((name==null)?0:name.hashCode());
		return result;
	}
	@Override
	
	
	
}