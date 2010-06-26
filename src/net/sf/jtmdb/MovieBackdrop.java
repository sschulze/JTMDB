package net.sf.jtmdb;

import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import net.sf.jtmdb.Log.Verbosity;

/**
 * This class represents a Movie Backdrop.
 * 
 * @author Savvas Dalkitsis
 */
public class MovieBackdrop implements Serializable {

	private static final long serialVersionUID = 8742803628070811496L;

	/**
	 * This enumeration provides different sizes for the backdrops.
	 * 
	 * @author Savvas Dalkitsis
	 */
	public enum Size {
		THUMB, POSTER, ORIGINAL
	}

	/**
	 * The urls for the different sizes of the backdrop.
	 */
	private Map<Size, URL> urls = new HashMap<Size, URL>();

	/**
	 * The ID of the backdrop.
	 */
	private String ID;

	/**
	 * Constructs a new MovieBackdrop.
	 * 
	 * @param ID
	 *            The ID of the backdrop.
	 */
	public MovieBackdrop(String ID) {
		this.ID = ID;
		Log.log("Creating MovieBackdrop object with id: " + ID,
				Verbosity.VERBOSE);
	}

	/**
	 * Constructs a new MovieBackdrop.
	 * 
	 * @param urls
	 *            The urls of the different sizes of the backdrop.
	 * @param ID
	 *            The ID of the backdrop.
	 */
	public MovieBackdrop(Map<Size, URL> urls, String ID) {
		this(ID);
		if (urls != null) {
			this.urls.putAll(urls);
		}
	}

	/**
	 * Returns the Url of the backdrop for the specified size if it exists,
	 * otherwise null.
	 * 
	 * @param size
	 *            The size of the backdrop.
	 * @return The Url of the backdrop for the specified size if it exists,
	 *         otherwise null.
	 */
	public URL getImage(Size size) {
		return urls.get(size);
	}

	/**
	 * Sets the image Url for the provided size.
	 * 
	 * @param size
	 *            The size of the backdrop.
	 * @param url
	 *            The Url of the backdrop for the specified size.
	 */
	public void setImage(Size size, URL url) {
		urls.put(size, url);
	}

	/**
	 * The backdrop ID.
	 * 
	 * @return The backdrop ID.
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
		URL url = getImage(MovieBackdrop.Size.THUMB);
		if (url == null)
			url = getImage(MovieBackdrop.Size.POSTER);
		if (url == null)
			url = getImage(MovieBackdrop.Size.ORIGINAL);
		return url;
	}

	/**
	 * Returns the Url of the largest available size.
	 * 
	 * @return The Url of the largest available size.
	 */
	public URL getLargestImage() {
		URL url = getImage(MovieBackdrop.Size.ORIGINAL);
		if (url == null)
			url = getImage(MovieBackdrop.Size.POSTER);
		if (url == null)
			url = getImage(MovieBackdrop.Size.THUMB);
		return url;
	}

}
