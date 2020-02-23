package cn.dutyujm.shejimoshi.mingling;

public class LightOff implements Command {

    LightReceiver lightReceiver;

    public LightOff(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();

    }
}
