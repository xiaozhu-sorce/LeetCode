public class CALLBACK{
    public static void main(String[]args){
        Manager m =new Manager();
        m.arrangework();
    }
}

interface CallBack{
    void OnWorkFinish();
}

class Manager{
    private Worker worker =new Worker();//或者public Manager（）{ worker = new Worker();}
    public void arrangework(){
        System.out.println("主管安排工作了");
        worker.onWork(new CallBack(){
            @Override
            public void OnWorkFinish(){
                System.out.println("加工资");
            }
        });

    }
}

class Worker{
    public void onWork(CallBack callBack){
        System.out.println("我正在工作。");
        System.out.println("我完成工作了。");
        callBack.OnWorkFinish();
    }
}