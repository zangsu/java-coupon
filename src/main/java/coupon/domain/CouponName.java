package coupon.domain;

import jakarta.persistence.Embeddable;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
public class CouponName {
    private static final int MAX_LENGTH = 30;

    private String name;

    public CouponName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("쿠폰 이름은 필수값입니다.");
        }
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("쿠폰 이름은 %d 자 이하여야 합니다.".formatted(MAX_LENGTH));
        }
        this.name = name;
    }
}
