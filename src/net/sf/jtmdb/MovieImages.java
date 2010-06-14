package net.sf.jtmdb;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * This class represents the images of a Movie. Contains posters and backdrops.
 * 
 * @author Savvas Dalkitsis
 */
public class MovieImages implements Serializable {

	private static final long serialVersionUID = -4389135150276440098L;

	public Set<MoviePoster> posters = new HashSet<MoviePoster>();
	public Set<MovieBackdrop> backdrops = new HashSet<MovieBackdrop>();

}
