class Node{
    int data;
    Node left;
    Node right;
}

class Bst{
    Node tree;
    void createTree(Node tree){
        tree=null;
    }
    Node insertElement(Node tree, int val){
        Node ptr, nodeptr, parentptr;
        ptr=new Node();
        ptr.data=val;
        ptr.left=null;
        ptr.right=null;
        if(tree==null){
            tree=ptr;
            tree.left=null;
            tree.right=null;
        }
        else
        {
            parentptr=null;
            nodeptr=tree;
            while(nodeptr!=null){
                parentptr=nodeptr;
                if(val<nodeptr.data){
                    nodeptr=nodeptr.left;
                }else{
                    nodeptr=nodeptr.right;
                }
            }
            if(val<parentptr.data)
                parentptr.left=ptr;
            else
                parentptr.right=ptr;
        }
        return tree;
    }

    void preorderTraversal(Node tree){
        if(tree!=null){
            System.out.println(tree.data);
            preorderTraversal(tree.left);
            preorderTraversal(tree.right);
        }
    }

    void inorderTraversal(Node tree){
        if(tree!=null){        
            inorderTraversal(tree.left);
            System.out.println(tree.data);
            inorderTraversal(tree.right);
        }
    }

    void postorderTraversal(Node tree){
        if(tree!=null){        
            postorderTraversal(tree.left);
            postorderTraversal(tree.right);
            System.out.println(tree.data);    
        }
    }

    Node deleteElement(Node tree, int val){
        Node cur, parent, suc=null, psuc, ptr;
        if(tree==null){
            System.out.println("The tree is empty");
            return tree;
        }
        parent=tree;
        cur=tree.left;
        while(cur!=null && val!= cur.data){
            parent=cur;
            cur=(val<cur.data)? cur.left:cur.right;
        }
        if(cur==null){
            System.out.println("The value to be deleted is not present in the tree");
        }
        if(cur.left==null){
            ptr=cur.right;
        }else if(cur.right==null){
            ptr=cur.left;
        }
        else{
            psuc=cur;
            cur=cur.left;
            while(suc.left!=null){
                psuc=suc;
                suc=suc.left;
            }
            if(cur==psuc){
                suc.left=cur.right;
            }
            else{
                suc.left=cur.left;
                psuc.left=suc.right;
                suc.right=cur.right;
            }
            ptr=suc;
        }
        if(parent.left==cur)
            parent.left=ptr;
        else
            parent.right=ptr;
        return tree;
    }
}