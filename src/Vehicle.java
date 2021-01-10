public class Vehicle {
    private String name ="大力神";//车名
    private int oil= 20;//油量
    private int loss=0;//车损度
    public Vehicle(){

    }//空方法
    public Vehicle(String name){
        this.name=name;
    }//构造方法，指定车名
    public String getname(){
        this.name=name;
    } //获取车名
    public int getOil(){
        return oil;
    }//获取油量
    public int getloss(){
        return loss;
    }//获取车损度
    public void addoil(){
        if(oil>40){//如果油箱的油大于40升
            oil=60;
            System.out.println("油箱已加满");
        }else{//小于就加油20升
            oil+=20;
        }
        System.out.println("加油完成");
    }
    public void drive(){
        if(oil<20){
            System.out.println("油量不足20升，需要加油!");
        }else{
            System.out.println("正在行驶");
            oil-=5;
            loss+=10;
        }
    }
}
