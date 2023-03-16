package co.edu.campusucc.poo.domain;

public class ThreadExtends extends Thread{
    //Properties
    private int times;

    public void run()
    {
        System.out.println("Thread Started Running...on UCC University");
        System.out.println("Random Times: "+times);
        try {
            printTimes();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //Defined Behavior
    public void printTimes() throws Exception{
        int timesCount = 0;
        while (timesCount<=times) {
            System.out.print("-");
            timesCount++;
            Thread.sleep(50);
        }
        System.out.println("> OK");
    }

    //Getters and Setters
    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
}