package net.sf.jtmdb;

import java.io.Serializable;
import java.net.URL;

/**
 * This class represents an entry in the cast list of a Movie. It contains info
 * about a member of cast and its ID is the same ID with that of the Person in
 * the cast.
 * 
 * @author Savvas Dalkitsis
 */
public class CastInfo implements Serializable {

	private static final long serialVersionUID = 8623103045084363150L;
	
	/**
	 * The Url of the cast.
	 */
	private URL url;
	/**
	 * The name of the cast.
	 */
	private String name;
	/**
	 * The name of the character of the cast.
	 */
	private String characterName;
	/**
	 * The job description of the cast.
	 */
	private String job;
	/**
	 * The ID of the cast.
	 */
	private int ID;
	/**
	 * The thumbnail Url of the cast.
	 */
	private URL thumb;
	/**
	 * The department of the job of the cast.
	 */
	private String department;

	/**
	 * Constructs a new CastInfo object.
	 * 
	 * @param url
	 *            The Url of the cast.
	 * @param name
	 *            The name of the cast.
	 * @param characterName
	 *            The name of the character of the cast.
	 * @param job
	 *            The job description of the cast.
	 * @param ID
	 *            The ID of the cast.
	 * @param thumb
	 *            The thumbnail Url of the cast.
	 * @param department
	 *            The department of the job of the cast.
	 */
	public CastInfo(URL url, String name, String characterName, String job,
			int ID, URL thumb, String department) {
		setUrl(url);
		setName(name);
		setCharacterName(characterName);
		setJob(job);
		setID(ID);
		setThumb(thumb);
		setDepartment(department);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof CastInfo) {
			if (((CastInfo) obj).getID() == getID()) {
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
	 * The Url of the cast.
	 * 
	 * @return The Url of the cast.
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * Sets the Url of the cast.
	 * 
	 * @param url
	 *            The Url of the cast.
	 */
	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * The name of the cast.
	 * 
	 * @return The name of the cast.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the cast.
	 * 
	 * @param name
	 *            The name of the cast.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The name of the character of the cast.
	 * 
	 * @return The name of the character of the cast.
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * Sets the name of the character of the cast.
	 * 
	 * @param characterName
	 *            The name of the character of the cast.
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	/**
	 * The job description of the cast.
	 * 
	 * @return The job description of the cast.
	 */
	public String getJob() {
		return job;
	}

	/**
	 * Sets the job description of the cast.
	 * 
	 * @param job
	 *            The job description of the cast.
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * The ID of the cast. Is the same ID with that of the Person in the cast.
	 * 
	 * @return The ID of the cast.
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Sets the ID of the cast.
	 * 
	 * @param iD
	 *            The ID of the cast.
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * The thumbnail Url of the cast.
	 * 
	 * @return The thumbnail Url of the cast.
	 */
	public URL getThumb() {
		return thumb;
	}

	/**
	 * Sets the thumbnail Url of the cast.
	 * 
	 * @param thumb
	 *            The thumbnail Url of the cast.
	 */
	public void setThumb(URL thumb) {
		this.thumb = thumb;
	}

	/**
	 * Sets the department of the job of the cast.
	 * 
	 * @param department
	 *            The department of the job of the cast.
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * The department of the job of the cast.
	 * 
	 * @return The department of the job of the cast.
	 */
	public String getDepartment() {
		return department;
	}

}
