package stocks;

public class UnknownStock extends RuntimeException {

	private static final long serialVersionUID = -1494071598338804012L;

	// public UnknownStock() {
	// }

	public UnknownStock(String message) {
		super(message);
	}

	// public UnknownStock(Throwable cause) {
	// super(cause);
	// }

	// public UnknownStock(String message, Throwable cause) {
	// super(message, cause);
	// }

}
