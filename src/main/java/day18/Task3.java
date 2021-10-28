package day18;
//Вам необходимо создать двоичное дерево поиска, изображенное на картинке выше.
//
//Для этого создайте класс “Узел” (англ. Node), объекты которого будут содержать само значение узла
// и поля-ссылки на два других узла (левый и правый сын).
//Затем, создайте корневой (англ. root) узел (со значением 20).
//После этого, необходимо реализовать метод, который будет добавлять новые узлы в ваше дерево.
//Этот метод должен принимать в качестве аргументов добавляемое значение и ссылку на корень дерева.
// Проходясь по дереву, он должен вставлять новый узел в правильное место дерева.
//
//Когда двоичное дерево, изображенное выше, будет создано, необходимо используя рекурсию вывести в
// консоль все числа из этого двоичного дерева поиска в отсортированном виде. Ваше рекурсивное решение
// должно работать для любого корректного двоичного дерева поиска. Этот алгоритм называется “обход в глубину”
// (иногда называют “поиск в глубину”).
//Ваш рекурсивный метод (пусть он будет называться dfs) должен в качестве единственного аргумента принимать
// ссылку на корень дерева (root).
//
//Вызов: dfs(root);
//Вывод в консоль: 5 8 11 14 15 16 18 20 22 23 24 27 150
public class Task3 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(20);
        tree.add(5);
        tree.add(27);
        tree.add(18);
        tree.add(11);
        tree.add(14);
        tree.add(23);
        tree.add(15);
        tree.add(16);
        tree.add(150);
        tree.add(22);
        tree.add(8);
        tree.add(24);
        tree.dfs(tree.root);
    }
}
class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

 class Tree {
     Node root;
     private Node addNode(Node current, int value) {
         if (current == null) {
             return new Node(value);
         }

         if (value < current.value) {
             current.left = addNode(current.left, value);
         } else if (value > current.value) {
             current.right = addNode(current.right, value);
         } else {
             return current;
         }

         return current;
     }
     public void add(int value) {
         root = addNode(root, value);
     }
     public void dfs(Node node) {
         if (node != null) {
             dfs(node.left);
             System.out.print(" " + node.value);
             dfs(node.right);
         }
     }

 }
