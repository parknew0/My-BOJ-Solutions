import java.io.*;
import java.util.*;

class BinaryTreeNode {
    String value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(String value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void setLeft (BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right)
    {
        this.right = right;
    }

    public BinaryTreeNode getLeft()
    {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return value;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        /* 트리 초기화 시작 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, BinaryTreeNode> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split(" ");
            BinaryTreeNode root;

            if (map.get(tokens[0]) != null) root = map.get(tokens[0]);
            else {
                root = new BinaryTreeNode(tokens[0]);
                map.put(tokens[0], root);
            }

            if (!tokens[1].equals(".")) {
                BinaryTreeNode left;
                if (map.get(tokens[1]) != null) left = map.get(tokens[1]);
                else {
                    left = new BinaryTreeNode(tokens[1]);
                    map.put(tokens[1], left);
                }

                root.setLeft(left);

            }

            if (!tokens[2].equals(".")) {
                BinaryTreeNode right;
                if (map.get(tokens[2]) != null) right = map.get(tokens[2]);
                else {
                    right = new BinaryTreeNode(tokens[2]);
                    map.put(tokens[2], right);
                }
                root.setRight(right);
            }
        }

        /* 트리 초기화 끝 */

        preOrder(map.get("A"));
        System.out.println();
        inOrder(map.get("A"));
        System.out.println();
        postOrder(map.get("A"));
    }

    public static void preOrder(BinaryTreeNode root)
    {
        if (root == null) return;
        System.out.print(root);
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public static void inOrder(BinaryTreeNode root) {
        if (root == null) return;

        inOrder(root.getLeft());
        System.out.print(root);
        inOrder(root.getRight());
    }

    public static void postOrder(BinaryTreeNode root)
    {
        if (root == null) return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root);
    }

}
