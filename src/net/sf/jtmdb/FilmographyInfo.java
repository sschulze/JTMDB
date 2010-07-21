package net.sf.jtmdb;

import java.io.Serializable;
import java.net.URL;

import net.sf.jtmdb.Log.Verbosity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class represents an entry in the filmography list of a Person.
 * 
 * @author Savvas Dalkitsis
 */
public class FilmographyInfo implements Serializable {

	private static final long serialVersionUID = -5177289761054959833L;

	/**
	 * The name of the Movie.
	 */
	private String name;
	/**
	 * The name of the character in the Movie.
	 */
	private String characterName;
	/**
	 * The url of the Movie.
	 */
	private URL url;
	/**
	 * The ID of the Movie.
	 */
	private int ID;
	/**
	 * The ID of the cast.
	 */
	private int castID;
	/**
	 * The job description in the Movie.
	 */
	private String job;
	/**
	 * The department of the job for the Movie.
	 */
	private String department;
	/**
	 * The json string that created this FilmographyInfo object.
	 */
	private String jsonOrigin;

	/**
	 * Creates a new FilmographyInfo object.
	 * 
	 * @param name
	 *            The name of the Movie.
	 * @param characterName
	 *            The name of the character in the Movie.
	 * @param url
	 *            The url of the Movie.
	 * @param ID
	 *            The ID of the Movie.
	 * @param castID
	 *            The ID of the cast.
	 * @param job
	 *            The job description in the Movie.
	 * @param department
	 *            The department of the job for the Movie.
	 * @param jsonOrigin
	 *            The json string that created this FilmographyInfo object.
	 */
	public FilmographyInfo(String name, String characterName, URL url, int ID,
			int castID, String job, String department, String jsonOrigin) {
		Log.log("Creating FilmographyInfo object with url: "
				+ ((url == null) ? "NULL" : url.toString())
				+ ",character name: " + characterName + ", job: " + job
				+ "id: " + ID + ", castID: " + castID + ", department: "
				+ department + " and name: " + name, Verbosity.VERBOSE);
		this.jsonOrigin = jsonOrigin;
		setName(name);
		setCharacterName(characterName);
		setUrl(url);
		setID(ID);
		setCastID(castID);
		setJob(job);
		setDepartment(department);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof FilmographyInfo) {
			if (((FilmographyInfo) obj).getCastID() == getCastID()
					&& ((FilmographyInfo) obj).getID() == getID()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// We will use the algorithm used in the hash code
		// calculation for the Point2D class;
		int x = getID();
		int y = getCastID();
		long bits = java.lang.Double.doubleToLongBits(x);
		bits ^= java.lang.Double.doubleToLongBits(y) * 31;
		return (((int) bits) ^ ((int) (bits >> 32)));
	}

	/**
	 * The json string that created this FilmographyInfo object.
	 * 
	 * @return The json string that created this FilmographyInfo object.
	 */
	public String getJsonOrigin() {
		return jsonOrigin;
	}

	/**
	 * The prettyprinted json string that created this FilmographyInfo object.
	 * 
	 * @param indentFactor
	 *            The number of spaces to add to each level of indentation.
	 * @return The json string that created this FilmographyInfo object.
	 */
	public String getJsonOrigin(int indentFactor) {
		try {
			return new JSONObject(jsonOrigin).toString(indentFactor);
		} catch (JSONException e) {
			Log.log(e, Verbosity.ERROR);
			return null;
		}
	}

	/**
	 * The name of the Movie.
	 * 
	 * @return The name of the Movie.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the Movie.
	 * 
	 * @param name
	 *            The name of the Movie.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The name of the character in the Movie.
	 * 
	 * @return The name of the character in the Movie.
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * Sets the name of the character in the Movie.
	 * 
	 * @param characterName
	 *            The name of the character in the Movie.
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	/**
	 * The url of the Movie.
	 * 
	 * @return The url of the Movie.
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * Sets the url of the Movie.
	 * 
	 * @param url
	 *            The url of the Movie.
	 */
	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * The ID of the Movie.
	 * 
	 * @return The ID of the Movie.
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Sets the ID of the Movie.
	 * 
	 * @param iD
	 *            The ID of the Movie.
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * The ID of the cast.
	 * 
	 * @return The ID of the cast.
	 */
	public int getCastID() {
		return castID;
	}

	/**
	 * Sets the ID of the cast.
	 * 
	 * @param castID
	 *            The ID of the cast.
	 */
	public void setCastID(int castID) {
		this.castID = castID;
	}

	/**
	 * The job description in the Movie.
	 * 
	 * @return The job description in the Movie.
	 */
	public String getJob() {
		return job;
	}

	/**
	 * Sets the job description in the Movie.
	 * 
	 * @param job
	 *            The job description in the Movie.
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * Sets the department of the job for the Movie.
	 * 
	 * @param department
	 *            The department of the job for the Movie.
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * The department of the job for the Movie. for the Movieof the cast.
	 */
	public String getDepartment() {
		return department;
	}

}
