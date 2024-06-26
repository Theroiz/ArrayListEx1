import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String args[]) {
        
        ArrayList<Integer> nms = new ArrayList<>();
        nms.add(1);
        nms.add(2);
        nms.add(3);
        nms.add(4);
        nms.add(5);
        nms.add(6);
        int contagem = 1;
        for(int i = 0;i < nms.size();i++)
        {
            if(nms.get(i)%2 == 0)
            {
                nms.remove(i);
            }
        }
        for(Integer leitura : nms)
        {
            System.out.println(leitura);
        }
        
        
        
         
    }
}
