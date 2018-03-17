class Insertion_Sort {
    //function to sort array using insertion sort
    void sort(int A[])
    {
        int n = A.length;
        for (int j=1; j<n; ++j)
        {
            int key = A[j];
            // insert A[j] into the sorted sequence A[1..j-1]
            int i = j - 1;
            while (i >=0 && A[i] >key) // 错了很多次 发现时 J 后少写了一个 = ， 浪费了我很多时间，注意循环处的变化
            {
                A[i + 1] = A[i] ;
                i = i -1 ;
//测试是否需要多余的步骤 没有多余步骤 j = j -1是向前循环比较；
            }
            A[i+1]= key;//int key 初始化后是否跟随？ 在公式下 每次都需要跟随； 这一步是将较小数向前赋值
        }

    }
    static void printArray(int A[])
    {
        int n = A.length;//写在外面是否不用两次声明
        for (int i=0; i<n; ++i)
             /*1、首先，单独拿出来说++i和i++，意思都是一样的，
             就是i=i+1。2、如果当做运算符来说，就是a=i++或者a=++i这样的形式。
             情况就不一样了。先说a=i++，这个运算的意思是先把i的值赋予a，
             然后在执行i=i+1；而a=++i，这个的意思是先执行i=i+1，
             然后在把i的值赋予a；举个例子来说，如果一开始i=4。
             那么执行a=i++这条语句之后，a=4，i=5；那么执行a=++i这条语句之后，
             i=5，a=5；同理，i--和--i的用法也是一样的。
              */
            System.out.print(A[i] + " ");
            System.out.println();

    }

    public static void main(String args[])
    {
        int A[] = {15, 11, 13, 5, 6};
        Insertion_Sort  ob = new Insertion_Sort();
        ob.sort(A);
        printArray(A);
    }
}