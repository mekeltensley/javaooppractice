import java.awt.*;

public class Tree {
    // Attributes with double data type
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    // This variable creates a tree trunk color that can
    // be applied to all tree trunk instances
    // this is known as a static attribute
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    Tree(double heightFt,
    double trunkDiameterInches,
    TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }
    }

    //Static Method / behaviors
    // Do not rely on any instance methods or attributes
    //They only rely on class members
    // If treeType wanted to be used, this method would have to
    // be changed to a non-static method
    // TRUNK_COLOR can be added because it's a static attribute

    static void announceTree() {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }
}
