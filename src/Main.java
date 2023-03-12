public class Main {
    public static void main(String[] args) {

        Object object1 = new Object();
        object1.returnAvailableLiquidD(200,130);
        object1.drunkAmount(50);
        object1.liquidComparation();

    }
}


class Object {
    private int totalCapacity=200;
    private int availableLiquid=50;
    private boolean open;




    public boolean liquidComparation() {
        if (availableLiquid > totalCapacity) {
            return true;
        }
        return false;
    }

    public int returnAvailableLiquidD(int totalCapcity,int emptyCapacity) {
        int availableLiquid = totalCapcity- emptyCapacity;
        return availableLiquid;
    }

    public int emptyCapacity(int totalCapacity, int availableLiquid) {
        int emptyCapacity = totalCapacity - availableLiquid;

        return  emptyCapacity;

    }
    public boolean openBottle(){
        System.out.println("Bottle is opened");
        boolean openedBottele = true;
        return openedBottele;
    }
    public boolean closeBottle(){
        System.out.println("Bottle is closed");
        boolean closedBottle = false;
        return closedBottle;
    }
    public void drunkAmount(int specificDrunkAmountFromTheBottle){
        System.out.println("You drank from the bottle" + specificDrunkAmountFromTheBottle);

    }


}