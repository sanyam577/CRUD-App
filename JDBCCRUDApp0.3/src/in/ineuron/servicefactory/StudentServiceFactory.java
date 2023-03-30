package in.ineuron.servicefactory;

import in.ineuron.service.IStudentService;

import in.ineuron.service.StudentServiceImpl;

//Abstraction logic of implementation
public class StudentServiceFactory {

	//make constructor private to avoid object creation
	private StudentServiceFactory() {}
	
	public static IStudentService studentService = null;
	
	public static IStudentService getStudentService() {
		if(studentService == null) {
			studentService =  new StudentServiceImpl(); 
		}
		return studentService;
	}
	
	}
	
	

