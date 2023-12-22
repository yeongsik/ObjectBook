package com.objectBook.reservation.controller;

import com.objectBook.reservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping("/screens/{screenId}")
    public ResponseEntity<Void> getReservationFeeInfo(Long screenId) {
        reservationService.getReservationFeeInfo(screenId);

        return ResponseEntity.ok().build();
    }
}
