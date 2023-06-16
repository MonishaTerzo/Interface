public class Try {

    public static void main(String[] args) {
        show();
    }
        public  static void show(){
        greeting(new Interface() {
            @Override
            public void main(int l) {
                System.out.println("hi..........");
            }
        }) ; }
        public  static void greeting(Interface simple){
            simple.main(60);
    }

}
