public class enumclass {
    enum Color{
        //枚举类本类抽象方法，在本类实现

        RED{
            public String getCode() {

                return "RED";
            }
        },GREEN{
            public String getCode() {

                return "GREEN";
            }
        },BLUE{
            public String getCode() {

                return "BLUE";
            }
        };
        public abstract String getCode();
    }
    public static void main(String[] args) {
        Color c=Color.BLUE;
        for(Color co:Color.values()){
            Color c1=Color.valueOf(co.getCode());



        }
    }
}
