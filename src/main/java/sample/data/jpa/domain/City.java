//package sample.data.jpa.domain;
//
//import java.io.Serializable;
//
//@entity
//public class City implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue
//	private Long id;
//
//	@Column(nullable = false)
//	private String name;
//
//	@Column(nullable = false)
//	private String state;
//
//	@Column(nullable = false)
//	private String country;
//
//	@Column(nullable = false)
//	private String map;
//
//	protected City() {
//	}
//
//	public City(String name, String country) {
//		super();
//		this.name = name;
//		this.country = country;
//	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public String getState() {
//		return this.state;
//	}
//
//	public String getCountry() {
//		return this.country;
//	}
//
//	public String getMap() {
//		return this.map;
//	}
//
//	@Override
//	public String toString() {
//		return getName() + "," + getState() + "," + getCountry();
//	}
//	
//}