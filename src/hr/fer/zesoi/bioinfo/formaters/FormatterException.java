package hr.fer.zesoi.bioinfo.formaters;

/**
 * Exception type used to indicate a formatter specific exception
 * @author Najbolji bioInfo tim
 *
 */
public class FormatterException extends RuntimeException {

	public FormatterException(String string) {
		super(string);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
