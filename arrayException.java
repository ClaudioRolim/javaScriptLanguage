import javax.swing.JOptionPane;
import java.lang.NumberFormatException;

public class switchCase 
{
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Exception handling with java switch-case");
				
		String[] dayWeek = {"Day of the week does not exist. Try again...", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		try
		{
			int day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day of the week: "));
				if(day == 0 || day < 0 || day > 7)
				{
					System.out.printf("%s", dayWeek[0]);
					System.out.println("\n");
					System.exit(0);
				}
				switch(1)
				{
					case 1:
					{
						System.out.printf("Day of the week: %s", dayWeek[day]);
						break;
					}
					case 2:
					{
						System.out.printf("Day of the week: %s", dayWeek[day]);
						break;
					}
					case 3:
					{
						System.out.printf("Day of the week: %s", dayWeek[day]);
						break;
					}
					case 4:
					{
						System.out.printf("Day of the week: %s", dayWeek[day]);
						break;
					}
					case 5:
					{
						System.out.printf("Day of the week: %s", dayWeek[day]);
						break;
					}
					case 6:
					{
						System.out.printf("Day of the week: %s", dayWeek[day]);
						break;
					}
					case 7:
					{
						System.out.printf("Day of the week: %s", dayWeek[day]);
						break;
					}
				}
				System.out.println("\n");
				System.exit(0);
		}
		catch(NumberFormatException e)
		{
			System.out.println("This format is not allowed.\n");		
		}
	}
}
