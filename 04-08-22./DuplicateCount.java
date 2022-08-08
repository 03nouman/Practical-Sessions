class DuplicateCount
{

    public static void main(String[] args) 
    {
        int [] arr = new int [] {1, 2, 3, 7, 4, 1,7 ,8, 3};   
        int Count=0;

          System.out.println("Duplicate elements in array: ");  

          for(int i = 0; i < arr.length; i++)
          {  
              for(int j = i + 1; j < arr.length; j++) 
              {  
                  if(arr[i] == arr[j])  
                  {
                      System.out.println(arr[j]); 
                        Count++; 
                  }
              }  
          }  
          System.out.println("count of repeated values "+Count);


    }

}