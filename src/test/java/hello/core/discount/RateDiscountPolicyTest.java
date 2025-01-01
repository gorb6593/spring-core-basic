package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 10% 할인 적용")
    void vip10Percent() {
        Member member = new Member(1L, "memberVIP", Grade.VIP);

        int discount = discountPolicy.discount(member, 20000);

        assertEquals(2000, discount);
    }

    @Test
    @DisplayName("VIP가 아니면 10% 할인 미적용")
    void vip10Percent2() {
        Member member = new Member(2L, "memberVIP", Grade.BASIC);

        int discount = discountPolicy.discount(member, 20000);

        assertEquals(0, discount);
    }
}