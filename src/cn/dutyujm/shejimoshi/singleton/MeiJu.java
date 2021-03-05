package cn.dutyujm.shejimoshi.singleton;

import cn.dutyujm.multithread.t2.M;

public class MeiJu {
    public enum I {
        INSTANCE;
        private MeiJu instance;
        I() {
            instance = new MeiJu();
        }
        public I getInstance(){
            return this;
        }
    }
    public enum SomeThing {
        INSTANCE;
        private MeiJu instance;

        SomeThing() {
            instance = new MeiJu();
        }

        public SomeThing getInstance() {
            return this;
        }

    }

    private MeiJu() {
    }
    public SomeThing getIns() {
        return SomeThing.INSTANCE.getInstance();
    }

    public static void main(String[] args) {
        MeiJu m1 = new MeiJu();
        MeiJu m2 = new MeiJu();
        System.out.println(m1.getIns()==m2.getIns());
    }
}
