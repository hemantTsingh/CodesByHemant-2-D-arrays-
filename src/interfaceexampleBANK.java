public class interfaceexampleBANK{
    public static void main(String[] args){
        bank m =new SBI();
        bank s =new PNB();
        bank k =new OB();
        
        System.out.println(m.rateOfInterest());
        System.out.println(s.rateOfInterest());
        System.out.println(k.rateOfInterest());
    
     }
    }
interface bank{
    float rateOfInterest();
}

class SBI implements bank{
    public float rateOfInterest(){
        return 9.8f;

    }
}

class PNB implements bank{
    public float rateOfInterest(){
        return 8.3f;
        
    }
}

class OB implements bank{
    public float rateOfInterest(){
        return 8.5f;
        
    }
}