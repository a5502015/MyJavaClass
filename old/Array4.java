class Array4{
  public static void main(String[] args) {
    int arr[] = new int []{1,5,7,9,3,0,2};
    int i,max = -1;
    for(i=0;i<arr.length;i++){
      if(arr[i]>max)
        max = arr[i];
    }
    System.out.println("MAX = " + max);
  }

}
