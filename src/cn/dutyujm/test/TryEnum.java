package cn.dutyujm.test;

public enum TryEnum {
    RED("sss",1),
    BLUE("ssss",2),
    YELLOW("sssss",3),
    GREEN("SSS",4);

    private String message;
    private int value;

    TryEnum(String message, int value) {
        this.message = message;
        this.value = value;
    }

    public static String getName(int index){
        for(TryEnum item : TryEnum.values()){
            if (item.getValue()==index){
                return item.message;
            }
        }
        return "false";
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

