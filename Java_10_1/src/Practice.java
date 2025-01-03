// Practice
// 아래 Device 추상 클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device {
    UsbPort1(int id) {
        this.deviceId = id;
    }

    void deviceInfo () {
        System.out.println("id = " + this.deviceId);
    }

    @Override
    void connect() {
        System.out.println("연결");
    }

    @Override
    void disconnect() {
        System.out.println("연결 끊김");
    }

    @Override
    void send() {
        System.out.println("데이터 전송");
    }

    @Override
    void receive() {
        System.out.println("데이터 수신");
    }
}

// WiFi 클래스
class WiFi extends Device {
    public WiFi (int id) {
        this.deviceId = id;
    }

    @Override
    void deviceInfo() {
        
    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}


public class Practice {

    public static void main(String[] args) {
        // Test code
        UsbPort1 usb1 = new UsbPort1(1);
//        WiFi wifi = new WiFi(0);
    }

}
