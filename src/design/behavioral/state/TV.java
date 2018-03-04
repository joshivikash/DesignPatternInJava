package design.behavioral.state;

/**
 * Here TV is the "Context", and "Volume" and "Power" are its "State", so the
 * behavior of Context changes depending upon its States
 * 
 * @author vikasjos
 *
 */
public class TV {
    int     volume;
    boolean power;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public String toString() {
        if (power) {
            if (volume == 0) {
                return "TV is mutted";
            } else if (volume > 80) {
                return "TV is making noise";
            }
            return "TV is ON";
        }
        return "TV is switched OFF";
    }
}
