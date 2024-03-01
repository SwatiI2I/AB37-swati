package selenumprog;
import org.testng.annotations.Test;

public class Grouptetsing 
{
@Test(groups= {"smok"})
public void add()
{
	System.out.println("Add");
}
@Test
public void sub()
{
	System.out.println("sub");
}
@Test(groups= {"smok"})
public void mult()
{
	System.out.println("mult");
}
@Test
public void div()
{
	System.out.println("div");
}
@Test
public void mod()
{
	System.out.println("mod");
}
}
