public class CommonElements {
    public static void main(String args[]){
        int a1[] = {1,2,3,4,5,6};
        int a2[] = {5,6,7,8,9,10};
        int a3[] = {5,6,11,12,13,14};


        int temp[] = new int[a2.length];
        int count = 0;
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i] == a2[j]){
                    temp[count] = a1[i];
                    count++;
                }

            }
        }
        for(int z=0;z<a3.length;z++){
            for(int t=0;t<temp.length;t++){
                if(a3[z] == temp[t]){
                    System.out.println(a3[z]);
                }
            }
        }
    }
}
