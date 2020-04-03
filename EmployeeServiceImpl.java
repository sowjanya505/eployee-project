import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ahmadsolehin.SUSAHCRUDNIE.model.Employee;
import com.ahmadsolehin.SUSAHCRUDNIE.repository.EmployeeRepository;


public class EmployeeServiceImpl implements emp {
  
    private EmployeeRepository emp;
  
    public Iterable<Employee> findAll() {
        return emp.findAll();
    }

    public List<Employee> search(String q) {
        return emp.findByNameContaining(q);
    }

    public Employee findOne(int id) {
        return emp.findOne(id);
    }

    public void save(Employee contact) {
        emp.save(contact);
    }
 
    public void delete(int id) {
        emp.delete(id);
    }
}
