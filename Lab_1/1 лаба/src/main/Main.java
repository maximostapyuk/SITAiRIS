package main;

import com.company.*;

public class Main {

    public static void main(String[] args) {
        RoadTrain RoadTrain = new RoadTrain();
        Ambulance Ambulance = new Ambulance();

        RoadTrain.countNumber1(4, 5);
        Ambulance.countNumber3(2, 5);
        MersedesSprinter MersedesSprinter = new MersedesSprinter();
        MersedesSprinter.countNumber8(4, 5);


        CurtainsiderTruck curtainsiderTruck = new CurtainsiderTruck();
        curtainsiderTruck.countNumber2(1,2);


    }
}

