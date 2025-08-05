public class BinaryToDecimal {
    static void binaryToDecimal(int num, int decimal, int count) {
        if (num == 0) {
            System.out.println("Decimal: " + decimal);
            return;
        }
        if (num % 10 == 0) {
            count++;
        } else {
            decimal += Math.pow(2, count);
            count++;
        }
        binaryToDecimal(num / 10, decimal, count);
    }
    static int binaryToDeci(int num){
        int count=0;
        return binaryToDeci(num,count);
    }
    static int binaryToDeci(int num,int count){
        if(num==0){
            return 0;
        }
        int newd=0;
        if(num%10!=0){
            newd+=(int)(Math.pow(2,count));
        }
        return newd+binaryToDeci(num/10,count+1);
    }

    public static void main(String[] args) {
        System.out.println();
        binaryToDecimal(1111, 0, 0);
        System.out.println(binaryToDeci(1111));
    }

}
