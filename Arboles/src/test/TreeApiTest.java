package test;

import Ej13.TreeApi;
import bases.MyBinaryTree;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeApiTest {

    MyBinaryTree myBinaryTree1 = new MyBinaryTree("1");
    MyBinaryTree myBinaryTree2 = new MyBinaryTree("2");
    MyBinaryTree myBinaryTree3 = new MyBinaryTree("3", myBinaryTree1, myBinaryTree2);
    MyBinaryTree myBinaryTree4 = new MyBinaryTree("4");
    MyBinaryTree myBinaryTree5 = new MyBinaryTree("5", myBinaryTree3, myBinaryTree4);

    TreeApi treeApi = new TreeApi();

    @Test
    public void sizeTest (){
        assertEquals(1,treeApi.size(myBinaryTree1));
        assertEquals(1,treeApi.size(myBinaryTree2));
        assertEquals(3,treeApi.size(myBinaryTree3));
    }

    @Test
    public void hojasTest (){
        assertEquals(2,treeApi.nroDeHojas(myBinaryTree5));
    }

}