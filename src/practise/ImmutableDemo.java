package practise;

public class ImmutableDemo{
        public static void main(String[] args) {
            EmpCloningImmutable e1 = new EmpCloningImmutable(34,102,"Prajwal");
            EmpCloningImmutable e2 = new EmpCloningImmutable(35,103,"John");
            EmpCloningImmutable e3 = new EmpCloningImmutable(36,104,"Doe");
            EmpCloningImmutable e4 = new EmpCloningImmutable();
            EmpCloningImmutable e5 = e1.clone();

            System.out.println(e1);
            System.out.println(e2);
            System.out.println(e3);
            System.out.println(e4);
            System.out.println(e5);

            System.out.println(e1.hashCode());
            System.out.println(e2.hashCode());
            System.out.println(e3.hashCode());
            System.out.println(e4.hashCode());
            System.out.println(e5.hashCode());

        }
    }
