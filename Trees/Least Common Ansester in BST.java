import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;       
    public TreeNode(int key)
        {
        val = key;
        left = null;
        right = null;
       }
}
class BST{
    private TreeNode root;
    public BST()
        {
        root = null;
        }
 static TreeNode LCA(TreeNode root, int n1, int n2)
        {
         
                if (root == null)return null;
                if (root.val > n1  &&  root.val > n2)  return LCA(root.left, n1, n2);
                if (root.val < n1  &&  root.val < n2)    return LCA(root.right, n1, n2);
                return root;
        }
 //Diff Way
// public TreeNode LCA(TreeNode root, int p, int q) 
//         {
//       int a =Math.min(p,q);
//       int b= Math.max(p,q);
//       return helper(root,a,b);       
//     }
//  public  TreeNode helper(TreeNode root,int l,int h)
//   {
//     if(root == null) return root;
//     if(root.val < l) return helper(root.right,l,h);
//     if(root.val > h) return helper(root.left,l,h);
//     return root;
//   }
 }
public class Main
{
 public   static Scanner sc = new Scanner(System.in);
        
        public static TreeNode buildBST(){
                
                Queue<TreeNode> q = new LinkedList<>();
                int h = sc.nextInt();
                TreeNode root = null;
                    if(h != -1)
                    {
                        root = new TreeNode(h);
                        q.add(root);
                    }
                 
                TreeNode mainRoot = root;
                 
                while(!q.isEmpty()) 
                {
                        TreeNode currRoot = q.peek(); 
                            q.remove();
                 
                        int left = sc.nextInt();
                        int right = sc.nextInt(); 
                        if(left != -1) 
                        {
                            currRoot.left = new TreeNode(left);
                            q.add(currRoot.left);
                        }
                        if(right != -1) 
                        {
                            currRoot.right = new TreeNode(right);
                            q.add(currRoot.right);
                        }
                }
                return mainRoot;
        }
    public static void main(String[] args)
        { 
            BST  tree  = new BST();
           int T = sc.nextInt();
                while(T -- > 0)
                {
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        
                        TreeNode root = buildBST();
                        TreeNode temp = tree.LCA(root, a, b);
                        if(temp != null)
                                System.out.print(temp.val);
                        else
                                System.out.print(-1);
                        System.out.println();
                    }
        }
}
