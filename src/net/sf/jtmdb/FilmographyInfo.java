package net.sf.jtmdb;

import java.io.Serializable;
import java.net.URL;

import net.sf.jtmdb.Log.Verbosity;

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
	 * The job description in the Movie.
	 */
	private String job;
	/**
	 * The department of the job for the Movie.
	 */
	private String department;

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
	 * @param job
	 *            The job description in the Movie.
	 * @param department
	 *            The department of the job for the Movie.
	 */
	public FilmographyInfo(String name, String characterName, URL url, int ID,
			String job, String department) {
		Log.log("Creating FilmographyInfo object with url: "
				+ ((url == null) ? "NULL" : url.toString())
				+ ",character name: " + characterName + ", job: " + job
				+ "id: " + ID + ", department: " + department + " and name: "
				+ name, Verbosity.VERBOSE);
		setName(name);
		setCharacterName(characterName);
		setUrl(url);
		setID(ID);
		setJob(job);
		setDepartment(department);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof FilmographyInfo) {
			if (((FilmographyInfo) obj).getID() == getID()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return getID();
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
