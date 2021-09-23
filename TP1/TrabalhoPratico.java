package trabalhopratico;

import java.util.Scanner;

/**
 * FATEC-PG ADS Tarde
 * @author Gustavo Oliveira Rocha
 */
public class TrabalhoPratico {
    
    public static void main(String[] args) {
        
        int nr_parti,nr_orcam,nr_hoteis,nr_seman;
        int custoMin = 0;
        int i,i2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o numero de Participantes: ");
        nr_parti = sc.nextInt();
        
        System.out.println("Entre com o Orçamento: ");
        nr_orcam = sc.nextInt();
        
        System.out.println("Entre com o numero de Hoteis possiveis: ");
        nr_hoteis = sc.nextInt();
        
        System.out.println("Entre com o numero de Semanas: ");
        nr_seman = sc.nextInt();
        
        int[] prec = new int[nr_hoteis];
        int[][] camas = new int[nr_hoteis][nr_seman];
        
        for(i = 0; i < nr_hoteis;i++)
        {
            System.out.println("Entre com o preco do Hotel: ");
            prec[i] = sc.nextInt();
            
            for(i2 = 0; i2 < nr_seman;i2++)
            {
                System.out.println("Entre com o numero de camas disponiveis na Semana "+(i2+1)+": ");
                camas[i][i2] =  sc.nextInt();
            }
        }
        
        for(i = 0; i < nr_hoteis;i++)
        {  
            for(i2 = 0; i2 < nr_hoteis;i2++)
            {
                if(camas[i][i2] >= nr_parti)
                {
                    custoMin = prec[i] * camas[i][i2];
                    if(prec[i] * camas[i][i2] < custoMin)
                        custoMin = prec[i] * camas[i][i2];
                }
            }
        }
        
        if(custoMin <= nr_orcam)
            System.out.println("Custo: R$" + custoMin);
        else
            System.out.println("Fique em casa.");
           
    }
    
}
