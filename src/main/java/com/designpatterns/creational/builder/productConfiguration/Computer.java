package com.designpatterns.creational.builder.productConfiguration;

public class Computer {

    private final String cpu;
    private final int ram;
    private final int storage;
    private final boolean hasGpu;
    private final boolean hasBluetooth;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGpu = builder.hasGpu;
        this.hasBluetooth = builder.hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram + "GB" +
                ", storage=" + storage + "GB" +
                ", gpu=" + hasGpu +
                ", bluetooth=" + hasBluetooth +
                '}';
    }

    // ---------- BUILDER ----------
    public static class Builder {

        // Required parameters
        private final String cpu;
        private final int ram;

        // Optional parameters
        private int storage = 0;
        private boolean hasGpu = false;
        private boolean hasBluetooth = false;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(boolean value) {
            this.hasGpu = value;
            return this;
        }

        public Builder bluetooth(boolean value) {
            this.hasBluetooth = value;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
