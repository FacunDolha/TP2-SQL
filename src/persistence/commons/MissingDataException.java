package persistence.commons;

public class MissingDataException extends RuntimeException {
	
	private static final long serialVersionUID = 8596662869548856819L;

	public MissingDataException(Exception e) {
		super(e);
	}

}

