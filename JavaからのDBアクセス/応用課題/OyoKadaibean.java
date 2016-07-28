package org.camp;

public class OyoKadaibean {
	private String id;
	private String name;
	private String nedan;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNedan() {
		return nedan;
	}
	public void setNedan(String nedan) {
		this.nedan = nedan;
	}

	public OyoKadaibean(String id ,String name ,String nedan){
		this.id =id;
		this.name = name ;
		this.nedan = nedan ;
	}

}
