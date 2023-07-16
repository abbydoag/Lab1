public class ItemDataJ {
    public Object originalValue;
    public ItemDataJ (Object originalValue){
        this.originalValue= originalValue;
    }

    public String getType(){
        if (originalValue instanceof String){
            return "cadena";
        }
        else if (originalValue instanceof Integer){
            return "entero";
        }
        else if (originalValue instanceof Boolean){
            return "booleano";
        }
        else{
            return null;
        }
    }

    public String getInfo(){
        if (originalValue instanceof String){
            String strings = (String)originalValue;
            return "L"+strings.length();
        }

        else if (originalValue instanceof Integer){
            Integer num = (Integer) originalValue;
            if (num%10==0){
                return "M10";
            }
            else if (num%5==0){
                return "M5";
            }
            if (num%2==0){
                return "M2";
            }
            else{
                return null;
            }
        }
        else if(originalValue instanceof Boolean){
            Boolean b = (Boolean) originalValue;
            if (b==true){
                return "Verdadero";
            }
            else{
                return "Falso";
            }
        }
        else{
            return null;
        }
    }
}
