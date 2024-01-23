public class SimpleInterstCalculator implements simpleInterstCalc {

    private float principle;
    private float time;

    public void setTime(float time) {
        this.time = time;
    }

    private float Rate;

    public void setRate(float rate) {
        Rate = rate;
    }

    public void setPrinciple(float principle) {
        this.principle = principle;
    }

    public SimpleInterstCalculator(float principle, float time, float Rate) {
        this.time = time;
        this.principle=principle;
        this.Rate=Rate;
    }


    public float calculatesi() {
        return (principle*time*Rate)/100;
    }



}
