class TreeNode<T extends Number>{
    T data;
    TreeNode<T> leftChild; // null
    TreeNode<T> rightChild; // null
    TreeNode(T data){
        this.data = data;
    }
}
class TreeOperations{
    TreeNode<Integer> root; // null
    void insert(){
        root = insertHelper(10, root);
        root = insertHelper(50, root);
        root = insertHelper(5, root);
        root = insertHelper(23, root);
        root = insertHelper(70, root);
        root = insertHelper(1, root);
        root = insertHelper(3, root);
        printing(root);
        System.out.println(search(root, 123)?"Found":"not Found");
    }
    void minMax(TreeNode<Integer> currentNode, 
    int min, int max){

    }
    boolean search(TreeNode<Integer> currentNode, int searchElement){
        // Base case
        if(currentNode == null){
            return false;
        }
        if(currentNode.data == searchElement){
            return true;
        }
        // true if found
        // false if not found
        if(searchElement<currentNode.data){
            return search(currentNode.leftChild, searchElement);
        }
        else{
        // if(searchElement>currentNode.data){
            return search(currentNode.rightChild, searchElement);
        }
    }
    void printing(TreeNode<Integer> currentNode){
        if(currentNode != null){
            printing(currentNode.leftChild);
            System.out.println(currentNode.data);
            printing(currentNode.rightChild);
        }
    }
    TreeNode<Integer> insertHelper(Integer data, TreeNode<Integer> currentNode){
        // Base Case 
        if(currentNode == null){
            currentNode = new TreeNode<Integer>(data);
            return currentNode;
        }
        // Small problem
        if(data<currentNode.data){
            currentNode.leftChild = insertHelper(data, currentNode.leftChild);
        }
        else if(data>currentNode.data){
            currentNode.rightChild = insertHelper(data, currentNode.rightChild);
        }
        return currentNode;

    }
}

class BSTDemo{
    public static void main(String[] args) {
        TreeOperations opr = new TreeOperations();
        opr.insert();
       
    }
}