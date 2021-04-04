package Trees;

public interface BinaryTree<T>
{
	public boolean isEmpty();
	public T getRoot();
	public BinaryTree<T> getLeft();
	public BinaryTree<T> getRight();
}