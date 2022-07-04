package projciscato;

public class ProjCiscato {

    private String codigo;
    
    public ProjCiscato(String S){
        this.codigo = S;
    }
    public ProjCiscato(){
        this.codigo = "";
    }
    
    public String criptografia_CEASAR(){
        StringBuilder S = new StringBuilder(codigo);
        for(int i=0;i<S.length();i++){
                char c = S.charAt(i);
                int ascii =(int)c;
                if(ascii==32)
                    S.setCharAt(i, c);
                if((ascii>=65 && ascii<=90)){
                    c = (char)(ascii + 3);
                    if((int)c>90) {
                            ascii=(int)(c-91+65);
                            c=(char)ascii;
                    }
                    S.setCharAt(i, c);
                }
                if((ascii>=97 && ascii<=122)) {
                    c = (char)((ascii + 3));
                    if((int)c>122) {
                            ascii=(int)(c-123+97);
                            c=(char)ascii;
                    }
                    S.setCharAt(i, c);
                }
            }
        codigo = S.toString();
        return codigo;
    }
       
    public String descriptografa_CEASAR(){
        StringBuilder S = new StringBuilder(codigo);
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            int ascii =(int)c;
            if(ascii==32)
                S.setCharAt(i, c);
            if((ascii>=65 && ascii<=90)){
                c = (char)(ascii - 3);
                if((int)c<65) {
                        ascii=(int)(c+90-64);
                        c=(char)ascii;
                }
                System.out.println((int)c);
                S.setCharAt(i, c);
            }
            if((ascii>=97 && ascii<=122)) {
                c = (char)((ascii - 3));
                if((int)c<97) {
                        ascii=(int)(c+122-96);
                        c=(char)ascii;
                }
                S.setCharAt(i, c);
            }
        }
       codigo = S.toString();
       return codigo;
    }
    
    public String criptografia_ROT13(){
        StringBuilder S = new StringBuilder(codigo);
        for(int i=0;i<S.length();i++){
                char c = S.charAt(i);
                int ascii =(int)c;
                if(ascii==32)
                    S.setCharAt(i, c);
                if((ascii>=65 && ascii<=90)){
                    c = (char)(ascii + 13);
                    if((int)c>90) {
                            ascii=(int)(c-91+65);
                            c=(char)ascii;
                    }
                    S.setCharAt(i, c);
                }
                if((ascii>=97 && ascii<=122)) {
                    c = (char)((ascii + 13));
                    if((int)c>122) {
                            ascii=(int)(c-123+97);
                            c=(char)ascii;
                    }
                    S.setCharAt(i, c);
                }
            }
        codigo = S.toString();
        return codigo;
    }
    
    public String descriptografa_ROT13(){
        StringBuilder S = new StringBuilder(codigo);
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            int ascii =(int)c;
            if(ascii==32)
                S.setCharAt(i, c);
            if((ascii>=65 && ascii<=90)){
                c = (char)(ascii - 13);
                if((int)c<65) {
                        ascii=(int)(c+90-64);
                        c=(char)ascii;
                }
                System.out.println((int)c);
                S.setCharAt(i, c);
            }
            if((ascii>=97 && ascii<=122)) {
                c = (char)((ascii - 13));
                if((int)c<97) {
                        ascii=(int)(c+122-96);
                        c=(char)ascii;
                }
                S.setCharAt(i, c);
            }
        }
       codigo = S.toString();
       return codigo;
    } 
}
