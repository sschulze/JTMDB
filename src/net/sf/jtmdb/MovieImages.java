package net.sf.jtmdb;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This class represents the images of a Movie. Contains posters and backdrops.
 * 
 * @author Savvas Dalkitsis
 */
public class MovieImages implements Serializable {

	private static final long serialVersionUID = -4389135150276440098L;

	public Set<MoviePoster> posters = new LinkedHashSet<MoviePoster>();
	public Set<MovieBackdrop> backdrops = new LinkedHashSet<MovieBackdrop>();

}
