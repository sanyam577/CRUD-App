
package in.ineuron.dao;

import in.ineuron.dto.Student;

public interface IStudentDao {
	//operations to be implemented
       public String addStudent(Student student);
       
       public Student searchStudent(Integer id);
       
       public String updateStudent(Student student );
        
       public String deleteStudent(Integer id);
}


