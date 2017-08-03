public class EmissionController {
    private Car car;
    
    public EmissionController(Car car) {
        this.car = car;
    }
    
    public void setEmissions() {
        Motor motor = car.getMotor();
        
        if(CheatDevice.testCycleDetected()) {
            //Car seems to be passing an emission test. Let's play nice for once.
            motor.setNOx(170); //set NOx emissions to 170mg/km
            motor.setCO2(130); //set CO2 emissions to 130g/km
            motor.setNoise(75); //set noise to 75dB. Sooo boring. Total disaster.
        } else {
            motor.setNOx(2400); //set NOx emissions to 2400mg/km and people still think it's smoking that gives them cancer. LOL.
            motor.setCO2(190); //set CO2 emissions to 190g/km. Look at me. Do I look like a Prius?
            motor.setNoise(90); //set noise to 90dB, our customers want to wake up their neighbours, otherwise they would ride a bike.
        }
    }  
}
