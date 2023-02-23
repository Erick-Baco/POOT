public class Main
{
    public static void main(String[] args)
    {
        System.out.println("");
        //length
        String s = "prueba de length";
        System.out.println("la longitud es: " + s.length() + " caracteres");

        //isEmpty()
        String s1 = "prueba is Empty";
        String s2 = "";
        boolean b1 = s1.isEmpty();
        boolean b2 = s2.isEmpty();

        System.out.println("cadena s1: " + b1);
        System.out.println("cadena s2: " + b2);

        //charAt
        String t = "char At";
        for (int i = 0; i < t.length(); i++)
        {
            char c = t.charAt(i);
            System.out.println(c);
        }
        //equals()
        var x = "Hola";
        var y = "Hola";
        if (x.equals(y))
            System.out.println("son iguales");

        //indexOf()
        int p1 = s.indexOf('h');
        int p2 = s.indexOf('d');
        System.out.println("ultima posición de h: " + p1 + " ultima posición de d: " + p2);

        //lastIndexOf()
        String last = "Hola como estas¿ bien¿";
        int l1 = last.indexOf("como");
        int l2 = last.lastIndexOf("bien¿");
        System.out.println("la primera posicion de como" + l1 + " la ultima posicion de bien¿" + l2);

        //upperCase()
        var may = last.toUpperCase();
        System.out.println("mayusculas: " + may);

        //toLowerCase()
        var min = last.toLowerCase();
        System.out.println("minusculas: " + min);

        //subString()
        String sub = last.substring(5,9);
        System.out.println("subcadena: " + sub);

        //conversion entre cadenas y números
        String con = "1234";
        int i = Integer.parseInt(con);
        String i1 =  Integer.toString(i);
        System.out.println(i + " " + i1);

        var con2 = "1234.56";
        double d = Double.parseDouble(con2);
        String i2 = Double.toString(d);
        System.out.println(d + " " + i2);

        //concatenar cadenas
        String u = con + con2;
        System.out.println(u);

        //invarianza
        u = "nueva u";
        System.out.println(u);

        //concatenar cadenas y caracteres
        StringBuilder sb = new StringBuilder();
        sb.append("hola, ");
        sb.append("chau");
        System.out.println(sb);

        // modificar los caracteres de una cadena
        StringBuilder sb2 = new StringBuilder("hola");
        sb2.setCharAt(2, 'x');
        System.out.println(sb2);
    }
}