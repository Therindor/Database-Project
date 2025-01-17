package daointerfaces01917;

/**
 * DALException is a userdefined Exception that handles SQLExceptions, etc.
 */
public class DALException extends Exception
{
	private static final long serialVersionUID = -5490114628089339322L;
	public DALException(String message) { super(message); }    
	public DALException(Exception e) { super(e); }
}
