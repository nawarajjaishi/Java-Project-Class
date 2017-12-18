/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Charaters;

/**
 *
 * @author Jaction76
 */
public class Chardemo1 {
    
    
    String paragraph= "While announcing an electoral alliance on October 3, the two communist forces had said they would eventually become one to create a large communist centre in Nepal.\n" +                    
                        "The two parties’ move of forming the left alliance has worked well for them as they have together completed a clean sweep, winning 110 of the 165 House of Representatives seats under the direct election system.\n" +                    
                        "“Both the processes of government formation and party unity would move ahead simultaneously,” Dahal told reports in Chitwan where he had arrived on Monday to participate in a victory rally.\n" +                    
                        "The Maoist chairman won from Chitwan-3 with 48,276 votes defeating Rastriya Prajatantra Party’s Bikram Pandey who secured 38,935 votes. Dahal said he and UML Chairman KP Sharma Oli have agreed to assume executive roles in the party and the government “but are yet to finalise who will lead what”.\n" +                    
                        "The Maoist Centre chief, however, earlier during election campaigns had projected Oli as the Left’s candidate for the prime ministerial job.\n" +                    
                        "Party leaders say Oli would lead the government while Dahal would take the reins of the unified party.\n" +                    
                        "But there is some skepticism among some party leaders, who say things might not move forward as smoothly as they appear.\n" +                    
                        "The UML has two other senior leaders, Madhav Kumar Nepal and Jhala Nath Khanal, both former prime ministers, who are also likely to stake claim to party chairmanship.\n" +                    
                        "“Discussions for government formation and party unity will start soon,” said Maoist Centre leader Narayan Kaji Shrestha, one of the key persons who worked to bring the UML and his party together. Shrestha lost the election in Gorkha-2 where Naya Shakti Nepal’s Baburam Bhattarai, a former prime minister and former Maoist leader, defeated him.\n" +                    
                        "According to Dahal, [settling] ideological issues won’t be much of a problem. Tactical issues would be resolved through discussions, he said.\n" ;
    String lowerparagraph=paragraph.toLowerCase();
    int strlength=paragraph.length();
    char[] me= lowerparagraph.toCharArray();    
    int count=0,i=0,k=0;
    public void display(){        
        System.out.println("Total length of Paragraph is : "+ strlength);      
        
        for (i=0; i<strlength; ++i) {
            int count=0;            
            for(k=0;k<strlength;++k){
                
                if(k<i && me[i]==me[k]){
                    break;
                } 
                if(me[k]== me[i]) {
                  count++;   
                }
                 if (k==strlength-1) {
                   System.out.println("The letter '"+me[i]+"' is Repeat at : " +count+ " Times");
                }
                 
            }
            
            
        }
        
        }

    public static void main(String[] args) {
        Chardemo1 ch1=new Chardemo1();
        ch1.display();            
    }
}
