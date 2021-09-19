package demo05;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        USB usb = new Mouse();
        computer.useDevice(usb);

        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        computer.powerOff();
    }
}
