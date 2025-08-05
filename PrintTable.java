public class PrintTable {
    static void table(int num, int i) {
        if (i == 0) {
            return;
        }
        table(num, i - 1);
        System.out.println("" + num + "*" + i + "=" + num * i);
    }

    static String printTable(int num, int i) {
        if (i == 0) {
            String str="";
            return str;
        }
        String str = printTable(num, i - 1);
        str += num + "*" + i + "=" + num * i+"\n";
        return str;
    }
    static String printT(int num,int i){
        if(i==11){
            return "";
        }
        String r1=printT(num, i+1);
        return num+"*"+i+"="+num*i+"\n"+r1;
    }

    public static void main(String[] args) {
        // table(5, 10);
        
        //System.out.println(printTable(5, 10));
        System.out.println(printT(5, 1));

    }
}
