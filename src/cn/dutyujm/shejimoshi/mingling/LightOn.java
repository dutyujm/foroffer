package cn.dutyujm.shejimoshi.mingling;

public class LightOn implements Command {

    LightReceiver lightReceiver;

    public LightOn(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void excute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
