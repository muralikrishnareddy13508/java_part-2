public class abstraction {
    public static void main(String[] args){

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes can't be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)


        Circle circle = new Circle(5.3);
        Triangle triangle = new Triangle(6.3, 3.7);
        Rectangle rectangle = new Rectangle(9.3, 7.5);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
