package net.sf.jtmdb;

import java.net.URL;

/**
 * This class represents a movie Genre.
 * 
 * @author Savvas Dalkitsis
 */
public class Genre {

	/**
	 * The url of the Genre.
	 */
	private URL url;
	/**
	 * The name of the Genre.
	 */
	private String name;

	/**
	 * Constructs a Genre with the given URL and name.
	 * 
	 * @param url
	 *            The URL of the Genre.
	 * @param name
	 *            The name of the Genre.
	 */
	public Genre(URL url, String name) {
		setUrl(url);
		setName(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof Genre) {
			return ((Genre) obj).getName().equals(getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return getName().hashCode();
	}

	/**
	 * The URL of the Genre.
	 * 
	 * @return The URL of the Genre.
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * Sets the URL of the Genre.
	 * 
	 * @param url
	 *            The URL of the Genre.
	 */
	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * The name of the Genre.
	 * 
	 * @return The name of the Genre.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the Genre.
	 * 
	 * @param name
	 *            The name of the Genre.
	 */
	public void setName(String name) {
		this.name = name;
	}

}
