//package practise;
//
//public class MethodReference {
//    interface I3{
//        public void Demo();
//    }
//    public class A1{
//        private String name;
//        public A1(){
//            System.out.println("constructor of class A1() is called");
//        }
//        public A1(String n1){
//            name = n1;
//            System.out.println("A1 ("+name+")");
//        }
//
//        public void ABC(){
//            System.out.println("Hello from A() class instance ABC");
//        }
//
//        public static void xyz(){
//            System.out.println("Hello from A() class static method xyz()");
//        }
//
//        public String toString(){
//            System.out.println("Object of A class with name : "+name);
//            return "";
//        }
//
//        interface J1{
//            public A1 getObject(String s1);
//        }
//
//    }
//    public static void main(String[] args) {
////        I3 i3 = A1::xyz;
////        i3.Demo();
////        System.out.println();
////
////        i3 = new A1().ABC;
////
////        i3 = A1::new;
//
//    }
//}
