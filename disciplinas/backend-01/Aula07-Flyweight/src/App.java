public class App {
    public static void main(String[] args) {

        ComputerFactory computerFactory = new ComputerFactory();

        Computer computerMac1 = computerFactory.getComputer(8, 500);
        Computer computerWindows1 = computerFactory.getComputer(16, 128);
        Computer computerMac2 = computerFactory.getComputer(16, 1000);
        Computer computerWindows2 = computerFactory.getComputer(32, 2000);
        Computer computerMac3 = computerFactory.getComputer(8, 500);

        System.out.println(computerMac1.toString());
        System.out.println(computerWindows1.toString());
        System.out.println(computerMac2.toString());
        System.out.println(computerWindows2.toString());
        System.out.println(computerMac3.toString());


    }
}
