/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        if(args.length != 1){
            usage();
            System.exit(0);
        }

        if(args[0].equals("plain")){
            TextBuilder builder = new TextBuilder();
            Director director = new Director(builder);
            director.construct();
            String result = builder.getResult();
            System.out.println(result);
        }else if(args[0].equals("html")){
            HTMLBuilder builder = new HTMLBuilder();
            Director director = new Director(builder);
            director.construct();
            String result = builder.getResult();
            System.out.println(result);
        }else {
            usage();
            System.exit(0);
        }
    }

    private static void usage(){
        System.out.println("Usage: java Main plain  编写纯文本文档");
        System.out.println("Usage: java Main html   编写HTML文档");
    }
}
