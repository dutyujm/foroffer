package cn.dutyujm.shejimoshi.mingling;

public class Controller {

    private Command[] onCommands ;
    private Command[] offCommands ;

    Command undoCommand;
    //构造器

    public Controller() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        for (int i = 0; i < 5 ; i++) {
            this.offCommands[i] = new Empty();
            this.onCommands[i] = new Empty();
        }
    }

    public void setOnCommands(int no,Command onCommand,Command offCommand) {
        this.offCommands[no] = offCommand;
        this.onCommands[no] = onCommand;
    }

    public void on(int no) {
        this.onCommands[no].excute();
        undoCommand = onCommands[no];
    }

    public void off(int no) {
        this.offCommands[no].excute();
        undoCommand = offCommands[no];
    }

    public void cancel() {
        undoCommand.undo();
    }
}
