package java.lang;



public class TestLang {
    public static void main(String[] args) {
        int [] arrA={1,2,3,4,5,6,7,8,9};
        int [] arrB={1,2,3,4,5,6,7,8,9};
        System.arraycopy(arrA,3,arrB,4,6);
        for(int i=0;i<arrB.length;i++){
            System.out.println(arrB[i]);
        }
    }
}
