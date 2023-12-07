package org.example;

public class Main {
    public static void main(String[] args) {
        // 현실세계에 맞게 변경
        Computer computer = new Computer();
        computer.turnOn(); //복잡한 상호작용 이 안에 숨김

        // 풀어서 사용
        /*Power power = new Power();

        if(!power.checkElectric()){
            System.out.println("전력이 비정상");
            return;
        }
        Mainboard mainboard = new Mainboard();
        ReadOnlyMemory rom = mainboard.supply(power);

        Bios bios = rom.getBios();
        if(!bios.post()){
            System.out.println("장치가 불량임");
            return;
        }
        BootLoader bootLoader = bios.getBootLoader(rom);
        HardDiskDrive hdd = new HardDiskDrive();
        OperationSystem os = bootLoader.findOperationSystem(hdd);
        RandomAccessMemory ram = new RandomAccessMemory();
        os.bootStrap(ram);*/
    }
}