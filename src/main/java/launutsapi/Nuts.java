package launutsapi;

import java.util.ArrayList;

public class Nuts {

	private String nuts_id;
	private String nuts_name;
	private String geometry_type;
	private String nuts_level;
	private ArrayList<String[]> coordinates;
	private ArrayList<String[]> inner_rings;
	private String msg = "Query was not successful";
	
	public Nuts(String nuts_id, String nuts_name, String geometry_type, String nuts_level, ArrayList<String[]> coordinates,
			ArrayList<String[]> inner_rings, String msg) {
		super();
		this.nuts_id = nuts_id;
		this.nuts_name = nuts_name;
		this.geometry_type = geometry_type;
		this.nuts_level = nuts_level;
		this.coordinates = coordinates;
		this.inner_rings = inner_rings;
		this.msg = msg;
	}
	
	public Nuts(String text) {
		this.msg = text;
	}
	
	public Nuts() {
		
	}

	public String getNutsid() {
		return nuts_id;
	}

	public void setNutsId(String nuts_id) {
		this.nuts_id = nuts_id;
	}

	public String getNutsName() {
		return nuts_name;
	}

	public void setNutsName(String nuts_name) {
		this.nuts_name = nuts_name;
	}

	public String getGeometryType() {
		return geometry_type;
	}

	public void setGeometryType(String geometry_type) {
		this.geometry_type = geometry_type;
	}

	public String getNutsLevel() {
		return nuts_level;
	}

	public void setNutsLevel(String nuts_level) {
		this.nuts_level = nuts_level;
	}

	public ArrayList<String[]> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(ArrayList<String[]> coordinates) {
		this.coordinates = coordinates;
	}

	public ArrayList<String[]> getInnerRings() {
		return inner_rings;
	}

	public void setInnerRings(ArrayList<String[]> inner_rings) {
		this.inner_rings = inner_rings;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	
	
}