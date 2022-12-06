package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderUpdated extends AbstractEvent {

    private Long id;
    private String foodid;
    private List<String> options;
    private String address;
    private String customerid;
    private String qty;
    private String orderId;

    public OrderUpdated(Order aggregate){
        super(aggregate);
    }
    public OrderUpdated(){
        super();
    }
}
