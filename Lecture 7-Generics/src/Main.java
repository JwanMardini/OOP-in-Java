public class Main {
    public static void main(String[] args) {
        MyTest<String, Integer> mt = new MyTest<>();
        mt.setTType("Hej");
        mt.setDType(59);
        System.out.println(mt.getTType()+"\n"+mt.getDType());



    }


    public int findSmallest (int a, int b){
        if(a < b){
            return a;
        }else {
            return b;
        }
    }

    public boolean isEqual (int a, int b){
        if(a == b){
            return true;
        }else {
            return false;
        }
    }
    public boolean isInt (Object a){
        if (a instanceof Integer){
            return true;
        }else {
            return false;
        }
    }




}