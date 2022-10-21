public class GenericBinary {
    class Node<K extends Comparable<K>> implements Comparable<Node<K>> {
        @Override
        public int compareTo(Node<K> o) {
            return 0;
        }
    }

    class KeyValueNode<K extends Comparable<K>, V> extends Node<K> {
    }

    class BinaryTree<K extends Comparable<K>> {

        Node<K> root;
    }

    class KeyValueBinaryTree<K extends Comparable<K>, V> {

        KeyValueNode<K, V> root;
    }
}
