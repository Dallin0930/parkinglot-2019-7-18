package com.tw.apistackbase;

import com.tw.apistackbase.Repository.ParkingLotRepository;
import com.tw.apistackbase.modules.ParkingLot;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ParkingLotRepositoryTest  {
    @Autowired
    ParkingLotRepository parkingLotRepository;

    @Before
    public void setUp() {
        List<ParkingLot> parkingLots =new ArrayList<>();
        ParkingLot caseOne=new ParkingLot("parkingLotA",200,"yuHuQu");
        ParkingLot caseTwo=new ParkingLot("parkingLotB",300,"yueTangQu");
        ParkingLot caseThree=new ParkingLot("parkingLotC",260,"renMinLu");
        parkingLots.add(caseOne);
        parkingLots.add(caseTwo);
        parkingLots.add(caseThree);
        parkingLotRepository.saveAll(parkingLots);
    }

    @Test
    public void should_return_CaseList_when_add_Case() {
        List<ParkingLot> parkingLots = parkingLotRepository.findAll();
        System.out.println(parkingLots);
    }
}
