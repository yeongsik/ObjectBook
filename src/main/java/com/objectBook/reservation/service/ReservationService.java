package com.objectBook.reservation.service;

import com.objectBook.reservation.entity.Screen;
import com.objectBook.reservation.repository.ScreenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ScreenRepository screenRepository;


    public void getReservationFeeInfo(Long screenId) {
        Screen screen = screenRepository.findById(screenId).orElseThrow(() -> new RuntimeException("없는 상영 정보입니다."));

        // 상영 정보에 따라서 Policy가 다르게 적용된다고 하면 Util 클래스에서 계산 or 서비스 클래스에서 계산

        // Entity 마다 할인정책에 다르다면

    }
}
