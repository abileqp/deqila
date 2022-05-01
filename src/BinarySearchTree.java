public class BinarySearchTree {
  void insert(int data) {
   struct node *tempNode = (struct node*) malloc(sizeof(struct node));
   struct node *current;
   struct node *parent;

   tempNode->data = data;
   tempNode->leftChild = NULL;
   tempNode->rightChild = NULL;

   if(root == NULL) {
      root = tempNode;
   } else {
      current = root;
      parent = NULL;

      while(1) {                
         parent = current;
			
         if(data < parent->data) {
            current = current->leftChild;
				
            if(current == NULL) {
               parent->leftChild = tempNode;
               return;
            }
         } 
         else {
            current = current->rightChild;

            if(current == NULL) {
               parent->rightChild = tempNode;
               return;
            }
         }
      }            
   }
}  
}
