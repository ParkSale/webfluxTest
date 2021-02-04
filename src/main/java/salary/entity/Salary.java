package salary.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * @author Seil Park
 */
@Getter @Setter
public class Salary {

    @Id
    private Long id;

    //private Occupation occupation;

    //private SalaryInfo salaryInfo;
    private int yearOne;

    private int yearTwo;

    private int yearThree;

    private int yearFour;

    private int yearFive;

    private int yearSix;

    private int yearSeven;

    private int yearEight;

    private int yearNine;

    private int yearTen;
}
