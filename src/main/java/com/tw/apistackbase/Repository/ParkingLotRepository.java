package com.tw.apistackbase.Repository;

import com.tw.apistackbase.modules.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingLotRepository extends JpaRepository<ParkingLot, Integer> {
     
}
