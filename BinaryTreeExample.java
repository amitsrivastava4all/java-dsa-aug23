import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Binary Tree Node We have created...
class BinaryTree<T>{
    T data;
    // default value of left and right is null
    BinaryTree<T> left; // left child (Reference)
    BinaryTree<T> right; // right child (Reference)
    BinaryTree(T data){
        this.data = data;
        // optional 
        this.left = this.right = null;
    }
}
class BinaryTreeOperations{
    String currentNodeName = "root";
    BinaryTree<Integer> insertion(){
        System.out.println("Enter the Data for "+currentNodeName);
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        if(data == -1){
            // No Data i want 
            return null;
        }
        // Prepare a New Node
        BinaryTree<Integer> newNode = new BinaryTree<>(data);
        // Next element move to the left of the binary tree
        currentNodeName = "left";
        newNode.left = insertion(); // Call Recursively for Left Node
        // BackTrack
        currentNodeName = "right";
        newNode.right = insertion(); // Call Recursively for Right Node
        currentNodeName = "root";
        return newNode;

    }
    void print(BinaryTree<Integer> rootNode){
        // Base Case
        if(rootNode==null){
            return ; 
        }
        String output = "";
        output+= rootNode.data+" => ";
        if(rootNode.left!=null){
            output+="L: "+rootNode.left.data+" , ";
        }
        if(rootNode.right!=null){
            output+="R: "+rootNode.right.data+ ", ";
        }
        System.out.println(output);
        // Behind the scene (Prepare the Stack)
        // Depth Traversal (Depth First Traversal) (DFT)
       print(rootNode.left); // Recursively call move to the left
       print(rootNode.right); // Recursively call move to the Right
    }
    // Root, Left, Right
    void preOrder(BinaryTree<Integer> rootNode){
        // Base Case
        if(rootNode==null){
            return ; 
        }
        System.out.println(rootNode.data);
        
        preOrder(rootNode.left);
        preOrder(rootNode.right);
    }
    // Left, Root, Right
    void inOrder(BinaryTree<Integer> rootNode){
        // Base Case
        if(rootNode==null){
            return ; 
        }
        
        inOrder(rootNode.left);
        System.out.println(rootNode.data);
        inOrder(rootNode.right);
    }
    // Left , Right , Root
    void postOrder(BinaryTree<Integer> rootNode){
         // Base Case
         if(rootNode==null){
            return ; 
        }
       
        postOrder(rootNode.left);
        postOrder(rootNode.right);
        System.out.println(rootNode.data);
    }
    void preOrderIterative(BinaryTree<Integer> root){
        
    }
    void levelOrder(BinaryTree<Integer> root){
        // Queue store node
        Queue<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTree<Integer> node = queue.poll();
            System.out.println(node.data);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }

    }
    void levelWisePrintOrder(BinaryTree<Integer> root){
        // Queue store node
        Queue<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        int level  = 0;

        while(!queue.isEmpty()){
            int queueSize = queue.size(); // Current Size
            String result = "";
            for(int i = 1;i <=queueSize; i++){
                BinaryTree<Integer> node = queue.poll();
                result = result + " "+node.data;
                //System.out.print("Level "+level + " " +node.data);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            
            System.out.println("Level "+level+" : "+result );
            level++;
           
        }

    }
    public static void main(String[] args) {
        BinaryTreeOperations opr = new BinaryTreeOperations();
        BinaryTree<Integer> rootNode = opr.insertion();
        //opr.print(rootNode);
       // opr.levelOrder(rootNode);
       opr.levelWisePrintOrder(rootNode);
       
    }
}