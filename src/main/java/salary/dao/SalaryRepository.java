package salary.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import salary.entity.Salary;


/**
 * @author Seil Park
 */
public interface SalaryRepository extends ReactiveCrudRepository<Salary, Long> {

}
