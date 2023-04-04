class MAKEBIGNUM
{
    int n=5126;
    String s=n+"";
    int[] arr=new int[s.length()];
    for(int i=0;i<arr.length();i++)
    {
        int rem =n%10;
        arr[i]=rem;
        n=n/10;
    }
    for(int i=0;i<arr.length();i++)
    {
        for(int j=i+1;j<arr.length();j++)

{
    if(arr[i]<arr[j])
{
    int temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;

}}    }
int num=0;
for(int ele:arr)
{
    num=(num*10)+ele;
}
System.out.println(num);

}