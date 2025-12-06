package reflection.info;



//	Interview Answer (Short & Precise)
//	Question: Why do we need a default (no-arg) constructor in a JPA entity?
//	
//	Answer:
//	In JPA/Hibernate, the default constructor is required because the framework uses reflection to 
//	instantiate entity objects when fetching data from the database. JPA needs to create an object 
//	without knowing the values beforehand, and then it populates the fields using reflection or setters. 
//	The constructor can be public or protected. Without it, JPA cannot create entity instances and 
//	you’ll get runtime errors like:

class Player {
	private Integer playerId;
	private String playerName;
	private Integer playerAge;
	private String location;

	public Player(Integer playerId, String playerName, Integer playerAge, String location) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.location = location;
	}
	
	public Player() {}
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", location=" + location + "]";
	}
}

public class WhyDefaultCons {
	public static void main(String[] args) {
		try {
			
			new Player(101, "sham", 20, "Hyd");
//			Class<?> cls = Class.forName("reflection.info.Player");
//			Object obj = cls.getDeclaredConstructor().newInstance();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
