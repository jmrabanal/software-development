public class Main {
    public static void main (String [] args){

        Triangle t1 = new Triangle();
        t1.base = 10.0;
        t1.height = 10.0;
        System.out.println("Area of the Triangle is: " + t1.areaOfTriangle());

        Pyramid p1 = new Pyramid();
        p1.base = 10.0;
        p1.height = 10.0;
        System.out.println("Area of the Pyramid is: "+p1.areaOfPyramid());
    }
}
