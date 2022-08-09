public class Main {

    public static void main(String[] args) {
//        // Instances
//
//        // myFavoriteOakTree is an instance of the tree class using the Tree constructor
//        Tree myFavoriteOakTree = new Tree(
//                25,
//                5,
//                TreeType.OAK
//        );
//
//        Tree myFavoriteMapleTree = new Tree(90,
//                30,
//                TreeType.MAPLE
//        );
//
//        myFavoriteOakTree.announceTallTree();
//
//        myFavoriteMapleTree.announceTallTree();
//
//        // System.out.println(Tree.TRUNK_COLOR);
//
//        // This calls the static method from the Tree Class
//        Tree.announceTree();

//Employee instance
        Employee twoYearsEmployed = new Employee(
                "Mary",
                25,
                75000,
                "Chicago",
                3
        );

        Employee oneYearEmployed = new Employee(
                "Sam",
                22,
                60000,
                "LA",
                1
        );

        twoYearsEmployed.raiseSalary();

        System.out.println(twoYearsEmployed.salary);
        System.out.println(oneYearEmployed.salary);
    }
}
