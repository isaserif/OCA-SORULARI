package OCASorularİ;

public class StringManipulations {
    public static void main(String[] args) {
    //Aşağıdaki code bloğunda 10. satıra aşağıdaki
    //seçeneklerden hangiisi eklenirse konsolde "Equal" yazdırır.

  String str1="Java";
  String str2=new String("java");
  //10. satır
        str1.toLowerCase();                     //küçük harflere dönüştürür
        if (str2.equals(str1.toLowerCase())){
                                                //stringlerde eşittir "equals" ile yapılır.
                                                //str1 toLowerCase ile küçük harflere dönüştürüldüğü için true döner ve
                                                // "Equal" body si devreye girer.

            System.out.println("Equal");
        }else{
            System.out.println("Not Equals");
        }








}}
