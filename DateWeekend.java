import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateWeekend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d = LocalDate.now().minusDays(1);
		
		DayOfWeek sd = null;
		
		if(d.getDayOfWeek() == DayOfWeek.SATURDAY)
		{
			d = LocalDate.now().minusDays(2);
		}
		
		else if(d.getDayOfWeek() == DayOfWeek.SUNDAY)
		{
			d = LocalDate.now().minusDays(3);
		}

		System.out.println(d);
	}

}
