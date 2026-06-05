
public class Main {
    public static void main(String[] args) {

        int[] arr = { 10, 24, 36, 47, 51 }; //创建数组

        int insertNum= 30;
        int index = -1;

        //遍历 arr数组， 如果发现 insertNum <=arr[i] , 说明i就是要插入的位置
        //使用index保留 index=i
        //遍历完成仍然没有发现insertNum <=arr[i],则说明 index= arr.length
        for(int i=0;i<arr.length ;i++){
            if(insertNum <=arr[i]){
                index = i;
                break;
            }
        }

        if(index==1){             //说明还没有找到位置
            index=arr.length;

        }

        System.out.println("应该添加到位置："+ index);
        //接下来完成扩容
        int[] arrNew = new int[arr.length + 1]; //创建新数组，长度为 arr.length+1
        //将arr的元素拷贝到arrNew ，并且跳过index位置



        //这个位置的逻辑是，当i !=index的时候，先拷贝数组 并且再j++使其跳过当前插入位置，否则插入数字
        for (int i= 0 , j=0;i< arrNew.length; i ++){
            arrNew[i]=arr[j];
            j++;
            if (i !=index){
                arrNew[i]=arr[j];
                j++;
            }else {  // i这个位置是要插入的 数字
                arrNew[i]=insertNum;

            }
        }
        arr=arrNew;

        System.out.println("插入后，arr的情况");
        for (int i = 0 ; i< arr.length ;i++){
            System.out.println(i"");
        }
    }
}