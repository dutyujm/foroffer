package cn.dutyujm.shejimoshi.mingling;



public class Client  {

    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();

        LightOn lightOn = new LightOn(lightReceiver);
        LightOff lightOff = new LightOff(lightReceiver);

        Controller controller = new Controller();

        controller.setOnCommands(0,lightOn,lightOff);

        controller.on(0);
        controller.off(0);
        controller.cancel();


    }
}
