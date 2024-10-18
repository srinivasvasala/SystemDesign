package design_patterns.Builder;

public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private String gpu;

    public Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.gpu = builder.gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    public static class ComputerBuilder{
        private String cpu;
        private String ram;
        private String hdd;
        private String gpu;

        public ComputerBuilder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }
        public ComputerBuilder setHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }
        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public Computer build() {
            return new Computer(this);

        }

    }

    public static void main(String[] args) {

        Computer computer = new ComputerBuilder("AMD RYZEN 5", "16 GB")
                .setHdd("1 TB")
                .setGpu("NVIDIA GTX 1050")
                .build();
        System.out.println(computer);
    }

}
