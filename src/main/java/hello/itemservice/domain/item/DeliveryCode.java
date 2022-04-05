package hello.itemservice.domain.item;

import lombok.*;

/**
 * FAST : 빠른 배송
 * NORMAL : 일반 배송
 * SLOW : 느린 배송
 */
@Data
@AllArgsConstructor
public class DeliveryCode {
    private final String code;
    private final String displayName;
}
