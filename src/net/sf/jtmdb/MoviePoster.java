package net.sf.jtmdb;

import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import net.sf.jtmdb.Log.Verbosity;

/**
 * This class represents a Movie Poster.
 * 
 * @author Savvas Dalkitsis
 */
public class MoviePoster implements Serializable {

	private static final long serialVersionUID = -929318281343773736L;

	/**
	 * This enumeration provides different sizes for the posters.
	 * 
	 * @author Savvas Dalkitsis
	 */
	public enum Size {
		THUMB, COVER, MID, ORIGINAL
	}

	/**
	 * The urls for the different sizes of the poster.
	 */
	private Map<Size, URL> urls = new HashMap<Size, URL>();

	/**
	 * The ID of the backdrop.
	 */
	private String ID;

	/**
	 * Constructs a new MoviePoster.
	 * 
	 * @param ID
	 *            The ID of the poster.
	 */
	public MoviePoster(String ID) {
		this.ID = ID;
		Log
				.log("Creating MoviePoster object with id: " + ID,
						Verbosity.VERBOSE);
	}

	/**
	 * Constructs a new MoviePoster.
	 * 
	 * @param urls
	 *            The urls of the different sizes of the poster.
	 * @param ID
	 *            The ID of the poster.
	 */
	public MoviePoster(Map<Size, URL> urls, String ID) {
		this(ID);
		if (urls != null) {
			this.urls.putAll(urls);
		}
	}

	/**
	 * Returns the Url of the poster for the specified size if it exists,
	 * otherwise null.
	 * 
	 * @param size
	 *            The size of the poster.
	 * @return The Url of the poster for the specified size if it exists,
	 *         otherwise null.
	 */
	public URL getImage(Size size) {
		return urls.get(size);
	}

	/**
	 * Sets the image Url for the provided size.
	 * 
	 * @param size
	 *            The size of the poster.
	 * @param url
	 *            The Url of the poster for the specified size.
	 */
	public void setImage(Size size, URL url) {
		urls.put(size, url);
	}

	/**
	 * The poster ID.
	 * 
	 * @return The poster ID.
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
		URL url = getImage(MoviePoster.Size.THUMB);
		if (url == null)
			url = getImage(MoviePoster.Size.COVER);
		if (url == null)
			url = getImage(MoviePoster.Size.MID);
		if (url == null)
			url = getImage(MoviePoster.Size.ORIGINAL);
		return url;
	}

	/**
	 * Returns the Url of the largest available size.
	 * 
	 * @return The Url of the largest available size.
	 */
	public URL getLargestImage() {
		URL url = getImage(MoviePoster.Size.ORIGINAL);
		if (url == null)
			url = getImage(MoviePoster.Size.MID);
		if (url == null)
			url = getImage(MoviePoster.Size.COVER);
		if (url == null)
			url = getImage(MoviePoster.Size.THUMB);
		return url;
	}

}
