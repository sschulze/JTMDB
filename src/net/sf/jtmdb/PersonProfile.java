package net.sf.jtmdb;

import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import net.sf.jtmdb.Log.Verbosity;

/**
 * This class represents a Person profile picture.
 * 
 * @author Savvas Dalkitsis
 */
public class PersonProfile implements Serializable {

	private static final long serialVersionUID = 2834303760310177549L;

	/**
	 * This enumeration provides different sizes for the profile image.
	 * 
	 * @author Savvas Dalkitsis
	 */
	public enum Size {
		THUMB, PROFILE, ORIGINAL
	}

	/**
	 * The urls for the different sizes of the profile image.
	 */
	private Map<Size, URL> urls = new HashMap<Size, URL>();

	/**
	 * The ID of the profile image.
	 */
	private String ID;

	/**
	 * Constructs a new PersonProfile.
	 * 
	 * @param ID
	 *            The ID of the profile image.
	 */
	public PersonProfile(String ID) {
		this.ID = ID;
		Log.log("Creating PersonProfile object with id: " + ID,
				Verbosity.VERBOSE);
	}

	/**
	 * Constructs a new PersonProfile.
	 * 
	 * @param urls
	 *            The urls of the different sizes of the profile image.
	 * @param ID
	 *            The ID of the profile image.
	 */
	public PersonProfile(Map<Size, URL> urls, String ID) {
		this(ID);
		if (urls != null) {
			this.urls.putAll(urls);
		}
	}

	/**
	 * Returns the Url of the profile image for the specified size if it exists,
	 * otherwise null.
	 * 
	 * @param size
	 *            The size of the profile image.
	 * @return The Url of the profile image for the specified size if it exists,
	 *         otherwise null.
	 */
	public URL getImage(Size size) {
		return urls.get(size);
	}

	/**
	 * Sets the image Url for the provided size.
	 * 
	 * @param size
	 *            The size of the profile image.
	 * @param url
	 *            The Url of the profile image for the specified size.
	 */
	public void setImage(Size size, URL url) {
		urls.put(size, url);
	}

	/**
	 * The profile image ID.
	 * 
	 * @return The profile image ID.
	 */
	public String getID() {
		return ID;
	}

	/**
	 * Returns the Url of the smallest available size.
	 * 
	 * @return The Url of the smallest available size.
	 */
	public URL getSmallestImage() {
		URL url = getImage(Size.THUMB);
		if (url == null) {
			url = getImage(Size.PROFILE);
		}
		if (url == null) {
			url = getImage(Size.ORIGINAL);
		}
		return url;
	}

	/**
	 * Returns the Url of the largest available size.
	 * 
	 * @return The Url of the largest available size.
	 */
	public URL getLargestImage() {
		URL url = getImage(Size.ORIGINAL);
		if (url == null) {
			url = getImage(Size.PROFILE);
		}
		if (url == null) {
			url = getImage(Size.THUMB);
		}
		return url;
	}

}
