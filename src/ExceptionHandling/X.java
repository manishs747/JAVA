package ExceptionHandling;

public class X 
{  
    public static void main(String [] args) 
    {
        try 
        {
            badMethod();  
            System.out.print("A"); 
        }  
      /*  catch (Throwable ex) //this let the code run as throwable is super class of ERROR
        {
            System.out.print("B");  
        } */
        
        catch (RuntimeException ex) /* Line 10 *///ERRRO AS RuntimeException is not supper class of error
        { 
            System.out.println("B"); 
        } 
        catch (Exception ex) /* Line 10 *///ERRRO AS RuntimeException is not supper class of error
        { 
            System.out.println("exception"); 
        } 
        finally 
        {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() throws Exception 
    {
        throw new Exception(); /* Line 22 */
    } 
}
