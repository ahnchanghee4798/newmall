package mall.external;

import lombok.Data;
import java.util.Date;
@Data
public class Order {

    private Long id;
    private String foodid;
    private Object options;
    private String address;
    private String customerid;
    private String qty;
    private String orderId;
}


