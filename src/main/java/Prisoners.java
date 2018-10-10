import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Ryan Alexander on 10/10/2018.
 */

/* create a class that represents prisoners table, containing all columns within that table
Use the rest of the slides to instruct you on how this should be done.
 */

@Entity
@Table(name ="prisoners")
public class Prisoners {
    @Id
    private int id;
    private String name;
    private int cell_number;
    private String alias;
    private Date date_in;
    private Date execution_date;
    private int final_meal;
}
