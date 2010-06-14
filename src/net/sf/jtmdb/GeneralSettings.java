package net.sf.jtmdb;

/**
 * This class contains general settings for the library (the API key for
 * instance)
 * 
 * @author Savvas Dalkitsis
 */
public class GeneralSettings {

	private GeneralSettings() {
	}

	/**
	 * The API key.
	 */
	private static String apiKey = "";

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

}
