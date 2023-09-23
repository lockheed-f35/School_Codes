public class SquareRootException extends RuntimeException
{
   public SquareRootException()
   {
      super("Attempted square root of a negative number.");
   } // end default constructor
 
   public SquareRootException(String message)
   {
      super(message);
   } // end constructor
} // end SquareRootException
