package net.sf.jtmdb;

/**
 * This enumeration provides the responses from the server when using a POST
 * method.
 * 
 * @author Savvas Dalkitsis
 */
public enum ServerResponse {

	/**
	 * Success.
	 */
	SUCCESS("Success"),
	/**
	 * Invalid service - This service does not exist.
	 */
	INVALID_SERVICE("Invalid service - This service does not exist."),
	/**
	 * Authentication Failed - You do not have permissions to access the
	 * service.
	 */
	AUTHENTICATION_FAILED(
			"Authentication Failed - You do not have permissions to access the service."),
	/**
	 * Invalid format - This service doesn't exist in that format.
	 */
	INVALID_FORMAT(
			"Invalid format - This service doesn't exist in that format."),
	/**
	 * Invalid parameters - Your request is missing a required parameter.
	 */
	INVALID_PARAMETERS(
			"Invalid parameters - Your request is missing a required parameter."),
	/**
	 * Invalid pre-requisite id - The pre-requisite id is invalid or not found.
	 */
	INVALID_PREREQUISITE_ID(
			"Invalid pre-requisite id - The pre-requisite id is invalid or not found."),
	/**
	 * Invalid API key - You must be granted a valid key.
	 */
	INVALID_API_KEY("Invalid API key - You must be granted a valid key."),
	/**
	 * Duplicate entry - The data you tried to submit already exists.
	 */
	DUPLICATE_ENTRY(
			"Duplicate entry - The data you tried to submit already exists."),
	/**
	 * Service Offline - This service is temporarily offline. Try again later.
	 */
	SERVER_OFFLINE(
			"Service Offline - This service is temporarily offline. Try again later."),
	/**
	 * Suspended API key - Access to your account has been suspended, contact
	 * TMDb.
	 */
	SUSPENDED_API_KEY(
			"Suspended API key - Access to your account has been suspended, contact TMDb."),
	/**
	 * Internal error - Something went wrong. Contact TMDb.
	 */
	INTERNAL_ERROR("Internal error - Something went wrong. Contact TMDb."),
	/**
	 * There was an unidentified error.
	 */
	UNKNOWN_ERROR("There was an unidentified error.");

	/**
	 * The message of the response.
	 */
	private String message;

	/**
	 * The message of the response.
	 * 
	 * @return The message of the response.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Set the message of the response.
	 * 
	 * @param message
	 *            The message of the response.
	 */
	private void setMessage(String message) {
		this.message = message;
	}

	private ServerResponse(String message) {
		setMessage(message);
	}

	/**
	 * Returns the appropriate response for the specified ID.
	 * 
	 * @param id
	 *            The ID of the response.
	 * @return The appropriate response for the specified ID.
	 */
	protected static ServerResponse forID(int id) {
		ServerResponse response = null;
		switch (id) {
		case 1:
			response = SUCCESS;
			break;
		case 2:
			response = INVALID_SERVICE;
			break;
		case 3:
			response = AUTHENTICATION_FAILED;
			break;
		case 4:
			response = INVALID_FORMAT;
			break;
		case 5:
			response = INVALID_PARAMETERS;
			break;
		case 6:
			response = INVALID_PREREQUISITE_ID;
			break;
		case 7:
			response = INVALID_API_KEY;
			break;
		case 8:
			response = DUPLICATE_ENTRY;
			break;
		case 9:
			response = SERVER_OFFLINE;
			break;
		case 10:
			response = SUSPENDED_API_KEY;
			break;
		case 11:
			response = INTERNAL_ERROR;
			break;
		default:
			response = UNKNOWN_ERROR;
			break;
		}
		return response;
	}

}
