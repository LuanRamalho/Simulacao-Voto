package simulaçãovoto;
import java.util.*;


public class SimulaçãoVoto 
{
    Scanner ler = new Scanner(System.in);
    
    int i;
    
    float votoBolsonaro;
    float votoHaddad;
    
    float TotalVotoBolsonaro = 0;
    float TotalVotoHaddad = 0;
    
    float percBolsonaro;
    float percHaddad;
    
    float VotosTotais;
            
    void votos()
    {
        i = 1;
        while(i!=0)
        {
            
            System.out.println("Digite a quantidade de votos para Jair Bolsonaro: ");
            votoBolsonaro = ler.nextFloat();
            
            System.out.println("");
            
            System.out.println("Digite a quantidade de votos para Fernando Haddad: ");
            votoHaddad = ler.nextFloat();
            
            System.out.println("");
            
            TotalVotoBolsonaro = TotalVotoBolsonaro + votoBolsonaro;     
            TotalVotoHaddad = TotalVotoHaddad + votoHaddad;
            VotosTotais = TotalVotoBolsonaro + TotalVotoHaddad;                                         
            percBolsonaro = (TotalVotoBolsonaro / VotosTotais) * 100;
            percHaddad = (TotalVotoHaddad / VotosTotais) * 100;
            
            System.out.printf("Total de votos de Jair Bolsonaro: %.0f", TotalVotoBolsonaro); System.out.printf("   Porcentagem: %.2f",percBolsonaro); System.out.println();
            System.out.printf("Total de votos de Fernado Haddad: %.0f", TotalVotoHaddad); System.out.printf("   Porcentagem: %.2f",percHaddad); System.out.println();
            System.out.printf("Votos Totais: %.0f",VotosTotais);

            System.out.println("");
            System.out.println("");

            
            System.out.println("Digite 1 para continuar ou 0 para sair.");
            i = ler.nextInt();
            
            System.out.println("");
            System.out.println("");
        }    
        
        
        System.out.printf("Total de votos de Jair Bolsonaro: %.0f", TotalVotoBolsonaro); System.out.printf("   Porcentagem: %.2f",percBolsonaro); System.out.println();
        System.out.printf("Total de votos de Fernado Haddad: %.0f", TotalVotoHaddad); System.out.printf("   Porcentagem: %.2f",percHaddad); System.out.println();
        System.out.printf("Votos Totais: %.0f",VotosTotais);
 
    }
    
      
    public static void main(String[] args) 
    {
       SimulaçãoVoto s = new SimulaçãoVoto();
       s.votos();
        
    }

    
}
