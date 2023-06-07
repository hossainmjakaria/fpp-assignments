package lesson05.Problem05;

import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;

        Computer other = (Computer) otherObject;

        return manufacturer.equals(other.manufacturer) && processor.equals(other.processor) && ramSize == other.ramSize && processorSpeed == other.processorSpeed;
    }


    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }

    @Override
    public String toString() {
        return "Computer [" + "Manufacturer: " + manufacturer + ", Processor: " + processor + ", Ram Size:" + ramSize + ", Processor Speed:" + processorSpeed + "]";
    }
}