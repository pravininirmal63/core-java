package validations;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import core.Employee;
import core.JobType;
import vehiclexceptions.InvalidVehicleExeption;
public class ValidateVehicle {
	public static Employee validateAllInputs(String name,double salary,String job,String joindate)
			throws IllegalArgumentException,DateTimeParseException,InvalidVehicleExeption
	{
		
		JobType jobs=validateJob(job);
		LocalDate dates=validateJoindate(joindate);
		
		return new Employee(name,salary,jobs,dates);
	}
	
	public static JobType validateJob(String job) throws IllegalArgumentException
	{
		JobType vjob=JobType.valueOf(job.toUpperCase());
		return vjob;
	}
	
	public static LocalDate validateJoindate(String joindate)throws DateTimeParseException,InvalidVehicleExeption
	{
		LocalDate date=LocalDate.parse(joindate);
		if(date.isAfter(LocalDate.now()))
		{
			throw new InvalidVehicleExeption("joining date must be before todays date");
		}
		return date;
	}
}
