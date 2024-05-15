public class Main {
    public static int mdc(int x, int y) {
        if(x>y){
            return mdc(x-y, y);
        } else if (x<y) {
            return mdc(y,x);
        }else{
            return x;
        }
    }
    public static int div(int x, int y) {
        if(x>y){
            return 1+div(x-y,y);
        } else if (x<y) {
            return 0;
        }else{
            return 1;
        }
    }
    public static int imprimeBinario(int dec) {
        if(dec <=0){
            return 0;
        }else {
            return dec % 2 + 10 * (imprimeBinario(dec / 2));
        }
    }
    public static int contaDigito(int K,int N) {
        int qnt = 0;
        if(N == 0) {
            return 0;
        } else if( N % 10 == K){
            qnt = 1;
        }
        return qnt + contaDigito(K , N /=10);
    }



    public static void main(String[] args) {
        System.out.println(div(6,3));
        System.out.println(contaDigito(2,72122302));
        System.out.println(imprimeBinario(20));
        System.out.println(mdc(20,2));
    }
}
