package org.example.lab6;

public class TV extends ElectricalDevice {

    TV(int power, boolean isActive, int electricMagneticPower) {
        super(power, isActive, electricMagneticPower);
    }

    @Override
    public String toString() {
        return "TV " +
                "power=" + this.getPower() +
                ", isActive=" + this.isActive() +
                ", electricMagneticPower=" + this.getElectricMagneticPower();
    }
}
