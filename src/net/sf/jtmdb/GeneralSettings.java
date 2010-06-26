package net.sf.jtmdb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * This class contains general settings for the library (the API key for
 * instance)
 * 
 * @author Savvas Dalkitsis
 */
public class GeneralSettings {

	/**
	 * The base url of all API calls.
	 */
	protected static final String BASE_URL = "http://api.themoviedb.org/2.1/";
	/**
	 * The url of the API method for getting Movie images.
	 */
	protected static final String MOVIE_GETIMAGES_URL = "Movie.getImages/";
	/**
	 * The url of the API method for searching for Movie.
	 */
	protected static final String MOVIE_SEARCH_URL = "Movie.search/";
	/**
	 * The url of the API method for getting Movie info.
	 */
	protected static final String MOVIE_GETINFO_URL = "Movie.getInfo/";
	/**
	 * The url of the API method for searching for Person.
	 */
	protected static final String PERSON_SEARCH_URL = "Person.search/";
	/**
	 * The url of the API method for getting Person info.
	 */
	protected static final String PERSON_GETINFO_URL = "Person.getInfo/";
	/**
	 * The url of the API mode used.
	 */
	protected static final String API_MODE_URL = "json/";
	/**
	 * The url of the home page of the movie database.
	 */
	protected static final String HOMEPAGE_URL = "http://www.themoviedb.org/";

	private GeneralSettings() {
	}

	/**
	 * The API key.
	 */
	private static String apiKey = "";
	/**
	 * The stream in which to output the log.
	 */
	private static PrintStream logStream = System.out;
	/**
	 * Denotes whether to output to the log.
	 */
	private static boolean logEnabled = false;
	/**
	 * The verbosity level of the log.
	 */
	private static Log.Verbosity logVerbosity = Log.Verbosity.VERBOSE;
	/**
	 * The language of the API.
	 */
	private static String APILanguage = "en";

	/**
	 * Returns the stored API key for the library. Used by search methods
	 * internally.
	 * 
	 * @return The stored API key for the library.
	 */
	public static String getApiKey() {
		return apiKey;
	}

	/**
	 * Sets the API key for the library. Used by search methods internally.
	 * 
	 * @param apiKey
	 *            The API key for the library.
	 */
	public static void setApiKey(String apiKey) {
		GeneralSettings.apiKey = apiKey;
	}

	/**
	 * Sets the output stream to use for the log.
	 * 
	 * @param logStream
	 *            The output stream to use for the log.
	 */
	public static void setLogStream(PrintStream logStream) {
		GeneralSettings.logStream = logStream;
	}

	/**
	 * Convenience method for setting the output stream to use for the log into
	 * a file.<br/>
	 * <br/>
	 * <strong>WARNING</strong>: This method opens a PrintStream to a file. It's
	 * up to the user to close the stream when he no longer needs it (by calling
	 * {@link #getLogStream()} and calling close() on it).
	 * 
	 * @param fileLog
	 *            The file to use as a log.
	 * @throws FileNotFoundException
	 */
	public static void setLogStream(File fileLog) throws FileNotFoundException {
		PrintStream fileStream = new PrintStream(fileLog);
		setLogStream(fileStream);
	}

	/**
	 * Returns the output stream used for the log. Default is System.out.
	 * 
	 * @return The output stream used for the log. Default is System.out.
	 */
	public static PrintStream getLogStream() {
		return logStream;
	}

	/**
	 * Sets whether to print to the log.
	 * 
	 * @param logEnabled
	 *            If true, text will be output to the log.
	 */
	public static void setLogEnabled(boolean logEnabled) {
		GeneralSettings.logEnabled = logEnabled;
	}

	/**
	 * If true, text will be output to the log. Default is false;
	 * 
	 * @return If true, text will be output to the log. Default is false;
	 */
	public static boolean isLogEnabled() {
		return (logEnabled && logStream != null);
	}

	/**
	 * Sets the verbosity level of the log.
	 * 
	 * @param logVerbosity
	 *            The verbosity level of the log.
	 */
	public static void setLogVerbosity(Log.Verbosity logVerbosity) {
		GeneralSettings.logVerbosity = logVerbosity;
	}

	/**
	 * The verbosity level of the log. Default is VERBOSE.
	 * 
	 * @return The verbosity level of the log. Default is VERBOSE.
	 */
	public static Log.Verbosity getLogVerbosity() {
		return logVerbosity;
	}

	/**
	 * Sets the language of the API.
	 * 
	 * @param APILanguage
	 *            The language of the API.
	 */
	public static void setAPILanguage(String APILanguage) {
		GeneralSettings.APILanguage = APILanguage;
	}

	/**
	 * The language of the API. Default is en.
	 * 
	 * @return The language of the API. Default is en.
	 */
	public static String getAPILanguage() {
		return APILanguage;
	}

}
