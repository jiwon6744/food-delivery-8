package fooddelivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class Preference {

    private Long id;
    private Long foodId;
    private Integer count;
}


