package jpabook.jpashop.service.query;

import jpabook.jpashop.domain.OrderItem;
import lombok.Data;

@Data
public class OrderItemQueryDto {
    private String itemName;//상품 명
    private int orderPrice; //주문 가격
    private int count; //주문 수량

    public OrderItemQueryDto(OrderItem orderItem) {
        itemName=orderItem.getItem().getName();
        orderPrice=orderItem.getOrderPrice();
        count=orderItem.getCount();
    }
}