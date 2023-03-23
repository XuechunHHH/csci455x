import java.io.IOException;

/**
 This class reports illegal file format input.
 */
public class IllegalFormatException extends IOException
{
    public IllegalFormatException() {}
    public IllegalFormatException(String message)
    {
        super(message);
    }
}
