public class TypeCastingOps{
   public static void main(String[] args) {
       byte b;
       short s;
       int i;
       long l;
       b=5;
       s=b;
       i=s;
       l=i;
       System.out.println("S= "+s);
       System.out.println("B= "+b);
       System.out.println("L= "+l);
       System.out.println("I= "+i);
   }
}