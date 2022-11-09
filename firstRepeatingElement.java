public class firstRepeatingElement {
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,5,2};

        boolean flag = false;
        for(int i=0;i<a.length;i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    flag = true;
                    break;
                }
            }
            if(flag == true) {
                break;
            }
        }

    }
}
